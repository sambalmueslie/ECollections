package de.sambalmueslie.ecollections.internal;

import java.util.Map;

import de.sambalmueslie.ecollections.ECollection;
import de.sambalmueslie.ecollections.EMap;
import de.sambalmueslie.ecollections.ESet;

/**
 * The decorator for a {@link Map} to create a {@link EMap}.
 *
 * @param <K>
 *            key type
 * @param <V>
 *            value type
 */
class MapDecorator<K, V> implements EMap<K, V> {

	/**
	 * Constructor.
	 *
	 * @param map
	 *            {@link #map}
	 */
	MapDecorator(Map<K, V> map) {
		this.map = map;
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return map.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return map.containsValue(value);
	}

	@Override
	public ESet<Entry<K, V>> entrySet() {
		return new SetDecorator<>(map.entrySet());
	}

	@Override
	public V get(Object key) {
		return map.get(key);
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public ESet<K> keySet() {
		return new SetDecorator<>(map.keySet());
	}

	@Override
	public V put(K key, V value) {
		return map.put(key, value);
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		map.putAll(m);
	}

	@Override
	public V remove(Object key) {
		return map.remove(key);
	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public ECollection<V> values() {
		return new CollectionDecorator<>(map.values());
	}

	/** the {@link Map}. */
	private final Map<K, V> map;

}
