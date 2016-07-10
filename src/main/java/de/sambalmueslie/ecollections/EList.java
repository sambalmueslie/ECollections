package de.sambalmueslie.ecollections;

import java.util.Arrays;
import java.util.List;

import de.sambalmueslie.ecollections.internal.EFactory;

public interface EList<E> extends ECollection<E>, List<E> {

	@SafeVarargs
	static <T> EList<T> list(T... elements) {
		return EFactory.decorate(Arrays.asList(elements));
	}

}
