package de.sambalmueslie.ecollections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Adhanced {@link Stream} interface.
 *
 * @param <T>
 *            element type
 */
public interface EStream<T> extends Stream<T>, StreamOperations<T> {
	public interface EBuilder<T> extends Stream.Builder<T> {
		@Override
		EStream<T> build();
	}

	@Override
	EStream<T> distinct();

	@Override
	EStream<T> filter(Predicate<? super T> predicate);

	@Override
	<R> EStream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

	@Override
	EStream<T> limit(long maxSize);

	@Override
	<R> EStream<R> map(Function<? super T, ? extends R> mapper);

	@Override
	EStream<T> onClose(Runnable closeHandler);

	@Override
	EStream<T> parallel();

	@Override
	EStream<T> peek(Consumer<? super T> action);

	@Override
	EStream<T> sequential();

	@Override
	EStream<T> skip(long n);

	@Override
	EStream<T> sorted();

	@Override
	EStream<T> sorted(Comparator<? super T> comparator);

	/**
	 * @return collect the stream to a {@link List}.
	 */
	List<T> toList();

	/**
	 * @return collect the stream to a {@link Set}.
	 */
	Set<T> toSet();

	@Override
	EStream<T> unordered();
}
