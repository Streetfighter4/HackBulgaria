package hack.bulgaria.java.week06.map;

public interface BucketInterface<K, V>{
	public void add(K key, V value);
	public void remove(K key);
	public V get(K key);
	public int size();
}
