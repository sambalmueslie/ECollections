package de.sambalmueslie.ecollections.internal;

import java.util.Set;

import de.sambalmueslie.ecollections.ESet;

/**
 * The decorator for a {@link Set} to create a {@link ESet}.
 *
 * @param <E>
 *            element type
 */
class SetDecorator<E> extends CollectionDecorator<E> implements ESet<E> {
	/**
	 * Constructor.
	 *
	 * @param set
	 *            {@link #set}
	 */
	SetDecorator(Set<E> set) {
		super(set);
	}

}
