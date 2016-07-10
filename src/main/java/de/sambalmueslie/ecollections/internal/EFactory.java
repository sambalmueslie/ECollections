package de.sambalmueslie.ecollections.internal;

import java.util.List;
import java.util.Set;

import de.sambalmueslie.ecollections.EList;
import de.sambalmueslie.ecollections.ESet;

/**
 * The factory for the decorators.
 */
public class EFactory {

	/**
	 * Decorate a {@link List} to get an {@link EList}.
	 *
	 * @param list
	 *            the list
	 * @return the {@link EList}
	 */
	public static <T> EList<T> decorate(List<T> list) {
		return new ListDecorator<>(list);
	}

	/**
	 * Decorate a {@link Set} to get an {@link ESet}.
	 *
	 * @param set
	 *            the set
	 * @return the {@link ESet}
	 */
	public static <T> ESet<T> decorate(Set<T> set) {
		return new SetDecorator<>(set);
	}

}
