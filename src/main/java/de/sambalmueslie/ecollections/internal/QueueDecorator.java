package de.sambalmueslie.ecollections.internal;

import java.util.Queue;

import de.sambalmueslie.ecollections.EQueue;

/**
 * The decorator for a {@link Queue} to create a {@link EQueue}.
 *
 * @param <E>
 *            element type
 */
class QueueDecorator<E> extends CollectionDecorator<E> implements EQueue<E> {
	/**
	 * Constructor.
	 *
	 * @param queue
	 *            {@link #queue}
	 */
	QueueDecorator(Queue<E> queue) {
		super(queue);
	}

	@Override
	public E element() {
		return queue.element();
	}

	@Override
	public boolean offer(E e) {
		return queue.offer(e);
	}

	@Override
	public E peek() {
		return queue.peek();
	}

	@Override
	public E poll() {
		return queue.poll();
	}

	@Override
	public E remove() {
		return queue.remove();
	}

	/** the {@link Queue}. */
	private Queue<E> queue;
}
