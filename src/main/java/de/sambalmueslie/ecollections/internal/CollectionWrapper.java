package de.sambalmueslie.ecollections.internal;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import de.sambalmueslie.ecollections.ECollection;
import de.sambalmueslie.ecollections.EStream;

/**
 * The wrapper for a {@link List} to create a {@link ECollection}.
 *
 * @param <E>
 *            element type
 */
class CollectionWrapper<E> implements ECollection<E> {

	/**
	 * Constructor.
	 *
	 * @param collection
	 *            {@link #collection}
	 */
	public CollectionWrapper(Collection<E> collection) {
		this.collection = collection;
	}

	@Override
	public boolean add(E e) {
		return collection.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return collection.addAll(c);
	}

	@Override
	public void clear() {
		collection.clear();
	}

	@Override
	public boolean contains(Object o) {
		return collection.contains(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return collection.containsAll(c);
	}

	@Override
	public EStream<E> distinct() {
		return stream().distinct();
	}

	@Override
	public EStream<E> filter(Predicate<? super E> predicate) {
		return stream().filter(predicate);
	}

	@Override
	public <R> EStream<R> flatMap(Function<? super E, ? extends Stream<? extends R>> mapper) {
		return stream().flatMap(mapper);
	}

	@Override
	public boolean isEmpty() {
		return collection.isEmpty();
	}

	@Override
	public Iterator<E> iterator() {
		return collection.iterator();
	}

	@Override
	public EStream<E> limit(long maxSize) {
		return stream().limit(maxSize);
	}

	@Override
	public <R> EStream<R> map(Function<? super E, ? extends R> mapper) {
		return new StreamWrapper<>(collection.stream().map(mapper));
	}

	@Override
	public EStream<E> parallelStream() {
		return new StreamWrapper<>(collection.parallelStream());
	}

	@Override
	public EStream<E> peek(Consumer<? super E> action) {
		return stream().peek(action);
	}

	@Override
	public boolean remove(Object o) {
		return collection.remove(o);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return collection.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return collection.retainAll(c);
	}

	@Override
	public int size() {
		return collection.size();
	}

	@Override
	public EStream<E> skip(long n) {
		return stream().skip(n);
	}

	@Override
	public EStream<E> sorted() {
		return stream().sorted();
	}

	@Override
	public EStream<E> sorted(Comparator<? super E> comparator) {
		return stream().sorted(comparator);
	}

	@Override
	public Spliterator<E> spliterator() {
		return collection.spliterator();
	}

	@Override
	public EStream<E> stream() {
		return new StreamWrapper<>(collection.stream());
	}

	@Override
	public Object[] toArray() {
		return collection.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return collection.toArray(a);
	}

	/** the {@link Collection}. */
	private final Collection<E> collection;

}
