package com.persistent.util;
import java.util.LinkedHashMap;
import java.util.Map;
public class LRU<T,V> extends LinkedHashMap<T,V> {
	private int capacity;
	public LRU(int capacity)
	{
		super(capacity,1f,true);
		this.capacity = capacity;
	}
	public boolean removeEldestEntry(Map.Entry<T,V> entry)
	{
		return size()>capacity;
	}
}
