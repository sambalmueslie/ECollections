package de.sambalmueslie.ecollections.internal;

import java.util.List;

import de.sambalmueslie.ecollections.EList;

public class EFactory {

	public static <T> EList<T> decorate(List<T> list) {
		return new ListWrapper<>(list);
	}

}
