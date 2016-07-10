package de.sambalmueslie.ecollections.internal;

import java.util.List;

import de.sambalmueslie.ecollections.EList;

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

}
