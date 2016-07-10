package de.sambalmueslie.ecollections.internal;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import de.sambalmueslie.ecollections.EList;

/**
 * The decorator for a {@link List} to create a {@link EList}.
 *
 * @param <E>
 *            element type
 */
class ListDecorator<E> extends CollectionDecorator<E> implements EList<E> {

	/**
	 * Constructor.
	 *
	 * @param list
	 *            {@link #list}
	 */
	ListDecorator(List<E> list) {
		super(list);
		this.list = list;
	}

	@Override
	public void add(int index, E element) {
		list.add(index, element);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return list.addAll(index, c);
	}

	@Override
	public E get(int index) {
		return list.get(index);
	}

	@Override
	public int indexOf(Object o) {
		return list.indexOf(o);
	}

	@Override
	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return list.listIterator(index);
	}

	@Override
	public E remove(int index) {
		return list.remove(index);
	}

	@Override
	public E set(int index, E element) {
		return list.set(index, element);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}

	/** the wrapped {@link List}. */
	private final List<E> list;

}
