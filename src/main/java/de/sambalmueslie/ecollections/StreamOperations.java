package de.sambalmueslie.ecollections;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface StreamOperations<T> {
	EStream<T> distinct();

	EStream<T> filter(Predicate<? super T> predicate);

	<R> EStream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);

	EStream<T> limit(long maxSize);

	<R> EStream<R> map(Function<? super T, ? extends R> mapper);

	EStream<T> peek(Consumer<? super T> action);

	EStream<T> skip(long n);

	EStream<T> sorted();

	EStream<T> sorted(Comparator<? super T> comparator);
}
