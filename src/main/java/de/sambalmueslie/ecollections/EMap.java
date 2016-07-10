package de.sambalmueslie.ecollections;

import java.util.Map;

public interface EMap<K, V> extends Map<K, V> {

	@Override
	ESet<Entry<K, V>> entrySet();

	@Override
	ESet<K> keySet();

	@Override
	ECollection<V> values();
}
