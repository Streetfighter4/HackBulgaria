package hack.bulgaria.java.week06.map;

public class Map<K, V> implements MapInterface<K, V>{
	BucketInterface<K, V>[] buckets;
	private double loadFactor;
	private int size;
	
	public Map() {
		size = 8;
		loadFactor = 5;
		buckets = new LinkedBucket[size];
	}
	private int calculateBucketIndex(K key) {
		return key.hashCode() %  size;
	}
	@Override
	public void put(K key, V value) {
		if (isHalfFull()) {
			resize(true);
		}
		int bucketIndex = calculateBucketIndex(key);
		buckets[bucketIndex].add(key, value);
	}

	@Override
	public V get(K key) {
		int bucketIndex = calculateBucketIndex(key);
		return buckets[bucketIndex].get(key);
	}

	@Override
	public void remove(K key) {
		int bucketIndex = calculateBucketIndex(key);
		buckets[bucketIndex].remove(key);
		if (isHalfEmpty()) {
			resize(false);
		}
	}

	@Override
	public boolean constainKey(K key) {
		return (get(key) != null);
	}
	
	private int getRatioNonEmpty() {
		int i = 0;
		for (BucketInterface<K, V> bucketInterface : buckets) {
			if (bucketInterface.size() > 0) {
				i++;
			}
		}
		return i/size;
	}
	
	private boolean isHalfFull() {
		return getRatioNonEmpty() >= 0.75;
	}
	
	private boolean isHalfEmpty() {
		return getRatioNonEmpty() <= 0.25;
	}
	
	private void resize(boolean command) {
		if (command) {
			size *= 2;
			BucketInterface<K, V>[] newList = new LinkedBucket[size];
			BucketInterface<K, V>[] oldList = this.buckets;
			buckets = newList;
			for (BucketInterface<K, V> bucket : oldList) {
				//bucket
			}
			
		} else {
			
		}
	}
	
	/*
	 * 1. Create new LinkedBucket[size*2]
	 * 2. oldList = this.list
	 * 3. list = newList
	 * 
	 * 4. For each element in oldList -> call put()
	 * */
	
}
