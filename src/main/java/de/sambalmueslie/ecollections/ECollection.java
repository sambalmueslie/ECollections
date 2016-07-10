package de.sambalmueslie.ecollections;

import java.util.Collection;

public interface ECollection<E> extends Collection<E>, StreamOperations<E> {
	@Override
	public EStream<E> parallelStream();

	@Override
	public EStream<E> stream();

}
