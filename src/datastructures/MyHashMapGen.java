package datastructures;

public class MyHashMapGen<K, V> {

	int MAX_SIZE = 20;
	Entry buckets[] = new Entry[MAX_SIZE];
	
	public void put(K key, V value)
	{
		if(key == null)
		{
			return;
		}
		Entry newEntry = new Entry(key, value) ;
		int hashCD = hash(key);
		if(buckets[hashCD] ==  null)
		{
			buckets[hashCD] = newEntry; 
		}else {
			 
			Entry current = buckets[hashCD];
			
			while(current.next != null)
			{
				if(current.getKey().equals(newEntry.getKey()))
				{
					current.setValue(newEntry.getValue());
				}
				
				current = current.next;
			}
			current.next = newEntry;
		}		
		
	}
	
	public V get(K key) {
		
		if(key == null)
		{
			return null;
		}
		
		int hashCd=hash(key);
		
		Entry entry = buckets[hashCd];
		
		while(entry != null)
		{
			if(entry.getKey().equals(key))
			{
				return (V) entry.getValue();
			}
		}
		
		return null;
	}
	
	private int hash(K key)
	{
		return Math.abs(key.hashCode()%MAX_SIZE);
	}
	
	public void display()
	{
		for(int i=0; i<buckets.length; i++)
		{
			if(buckets[i] != null)
			{
				Entry e = buckets[i];
				System.out.println("Key ::"+e.getKey() + " Value ::"+e.getValue());
			}
		}
	}
	
	public boolean remove(K key)
	{
		int hashCD = hash(key);
		
		Entry e = buckets[hashCD];
		
		while(e != null)
		{
			if(e.getKey().equals(key))
			{
				buckets[hashCD] = null;
				return true;
			}
			e = e.next;
		}
		
		return false;		
	}
	
	public class Entry<K,V>
	{
		private K key;
		private V value;
		private Entry<K,V> next;
		
		public Entry(K k, V v)
		{
			this.key = k;
			this.value = v;
			
		}

		public K getKey() {
			return key;
		}

		public void setKey(K key) {
			this.key = key;
		}

		public V getValue() {
			return value;
		}

		public void setValue(V value) {
			this.value = value;
		}

		public Entry<K, V> getNext() {
			return next;
		}

		public void setNext(Entry<K, V> next) {
			this.next = next;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashMapGen<String, String> map = new MyHashMapGen<>();
		
		map.put("soniya", "one");
		map.put("doshi", "two");
		
		//System.out.println(map.get("doshi"));
		//map.display();
		
		MyHashMapGen<Integer, String> map2 = new MyHashMapGen<>();
		map2.put(1, "abc");
		map2.put(2, "xyz");
		
	//	System.out.println(map2.get(1));
		//map2.display();
		
		map2.remove(1);
		map2.display();

	}

}
