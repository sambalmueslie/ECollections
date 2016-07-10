/**
 *
 */
package de.sambalmueslie.ecollections.internal;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import de.sambalmueslie.ecollections.EStream;

/**
 * The decorator for the {@link EStream}.
 *
 * @param <T>
 *            the element type
 */
class StreamDecorator<T> implements EStream<T> {

	/**
	 * Constructor.
	 *
	 * @param stream
	 *            {@link #stream}
	 */
	StreamDecorator(Stream<T> stream) {
		this.stream = stream;
	}

	@Override
	public boolean allMatch(Predicate<? super T> predicate) {
		return stream.allMatch(predicate);
	}

	@Override
	public boolean anyMatch(Predicate<? super T> predicate) {
		return stream.anyMatch(predicate);
	}

	@Override
	public void close() {
		stream.close();
	}

	@Override
	public <R, A> R collect(Collector<? super T, A, R> collector) {
		return stream.collect(collector);
	}

	@Override
	public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner) {
		return stream.collect(supplier, accumulator, combiner);
	}

	@Override
	public long count() {
		return stream.count();
	}

	@Override
	public EStream<T> distinct() {
		return new StreamDecorator<>(stream.distinct());
	}

	@Override
	public EStream<T> filter(Predicate<? super T> predicate) {
		return new StreamDecorator<>(stream.filter(predicate));
	}

	@Override
	public Optional<T> findAny() {
		return stream.findAny();
	}

	@Override
	public Optional<T> findFirst() {
		return stream.findFirst();
	}

	@Override
	public <R> EStream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper) {
		return new StreamDecorator<>(stream.flatMap(mapper));
	}

	@Override
	public DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper) {
		return stream.flatMapToDouble(mapper);
	}

	@Override
	public IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper) {
		return stream.flatMapToInt(mapper);
	}

	@Override
	public LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper) {
		return stream.flatMapToLong(mapper);
	}

	@Override
	public void forEach(Consumer<? super T> action) {
		stream.forEach(action);
	}

	@Override
	public void forEachOrdered(Consumer<? super T> action) {
		stream.forEachOrdered(action);
	}

	@Override
	public boolean isParallel() {
		return stream.isParallel();
	}

	@Override
	public Iterator<T> iterator() {
		return stream.iterator();
	}

	@Override
	public EStream<T> limit(long maxSize) {
		return new StreamDecorator<>(stream.limit(maxSize));
	}

	@Override
	public <R> EStream<R> map(Function<? super T, ? extends R> mapper) {
		return new StreamDecorator<>(stream.map(mapper));
	}

	@Override
	public DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) {
		return stream.mapToDouble(mapper);
	}

	@Override
	public IntStream mapToInt(ToIntFunction<? super T> mapper) {
		return stream.mapToInt(mapper);
	}

	@Override
	public LongStream mapToLong(ToLongFunction<? super T> mapper) {
		return stream.mapToLong(mapper);
	}

	@Override
	public Optional<T> max(Comparator<? super T> comparator) {
		return stream.max(comparator);
	}

	@Override
	public Optional<T> min(Comparator<? super T> comparator) {
		return stream.min(comparator);
	}

	@Override
	public boolean noneMatch(Predicate<? super T> predicate) {
		return stream.noneMatch(predicate);
	}

	@Override
	public EStream<T> onClose(Runnable closeHandler) {
		return new StreamDecorator<>(stream.onClose(closeHandler));
	}

	@Override
	public EStream<T> parallel() {
		return new StreamDecorator<>(stream.parallel());
	}

	@Override
	public EStream<T> peek(Consumer<? super T> action) {
		return new StreamDecorator<>(stream.peek(action));
	}

	@Override
	public Optional<T> reduce(BinaryOperator<T> accumulator) {
		return stream.reduce(accumulator);
	}

	@Override
	public T reduce(T identity, BinaryOperator<T> accumulator) {
		return stream.reduce(identity, accumulator);
	}

	@Override
	public <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner) {
		return stream.reduce(identity, accumulator, combiner);
	}

	@Override
	public EStream<T> sequential() {
		return new StreamDecorator<>(stream.sequential());
	}

	@Override
	public EStream<T> skip(long n) {
		return new StreamDecorator<>(stream.skip(n));
	}

	@Override
	public EStream<T> sorted() {
		return new StreamDecorator<>(stream.sorted());
	}

	@Override
	public EStream<T> sorted(Comparator<? super T> comparator) {
		return new StreamDecorator<>(stream.sorted(comparator));
	}

	@Override
	public Spliterator<T> spliterator() {
		return stream.spliterator();
	}

	@Override
	public Object[] toArray() {
		return stream.toArray();
	}

	@Override
	public <A> A[] toArray(IntFunction<A[]> generator) {
		return stream.toArray(generator);
	}

	@Override
	public List<T> toList() {
		return stream.collect(Collectors.toList());
	}

	@Override
	public Set<T> toSet() {
		return stream.collect(Collectors.toSet());
	}

	@Override
	public EStream<T> unordered() {
		return new StreamDecorator<>(stream);
	}

	/** the {@link Stream}. */
	private final Stream<T> stream;

}
