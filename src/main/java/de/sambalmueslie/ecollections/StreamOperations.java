package de.sambalmueslie.ecollections;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * The stream operations, a copy of all Methods of {@link Stream} which returns a {@link Stream} object.
 *
 * @param <T>
 *            the stream element tye
 */
public interface StreamOperations<T> {
	/**
	 * {@link Stream#distinct()}.
	 */
	EStream<T> distinct();

	/**
	 * {@link Stream#filter(Predicate)}.
	 */
	EStream<T> filter(Predicate<? super T> predicate);

	/**
	 * {@link Stream#flatMap(Function)}.
	 */
	<R> EStream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

	/**
	 * {@link Stream#limit(long)}.
	 */
	EStream<T> limit(long maxSize);

	/**
	 * {@link Stream#map(Function)}.
	 */
	<R> EStream<R> map(Function<? super T, ? extends R> mapper);

	/**
	 * {@link Stream#peek(Consumer)}.
	 */
	EStream<T> peek(Consumer<? super T> action);

	/**
	 * {@link Stream#skip(long)}.
	 */
	EStream<T> skip(long n);

	/**
	 * {@link Stream#sorted()}.
	 */
	EStream<T> sorted();

	/**
	 * {@link Stream#sorted(Comparator)}.
	 */
	EStream<T> sorted(Comparator<? super T> comparator);
}
