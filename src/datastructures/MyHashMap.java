package datastructures;

public class MyHashMap {
	
	int MAX_SIZE = 10;
	Entry bucket[] = new Entry[MAX_SIZE];
	
	public void put(String k, String v) {
		
		//get the hashcode on key
		int hash = Math.abs(k.hashCode()%MAX_SIZE);
		
		//create the node to add to the linked list
		Entry entry = new Entry(k, v);
		
		//insert the to the bucket at hash index
		if(bucket[hash]==null)
		{
			//no collision detected insert the node
			bucket[hash] = entry;
		}else {
			//collision detected we must place node at the end of the linked list
			Entry current = bucket[hash];
			while(current.next != null)
			{
				//check if key already exists
				if(entry.getKey().equalsIgnoreCase(current.getKey()))
				{
					//replace the key value with the new one
					current.setValue(entry.getValue());
					return;
				}
				current = current.next;
			}
			//when code gets to the current.next == null
			//insert new node
			current.next = entry;
		}		
		
	}
	

	public String get(String k)
	{
		//get the hash
		int hashCD = Math.abs(k.hashCode()% MAX_SIZE);
		
		//serach for key in linked list
		Entry e = bucket[hashCD];
		
		//Traverse linked list
		while ( e!= null)
		{
			if(e.getKey().equalsIgnoreCase(k))
			{
				return e.getValue();
			}
			e =e.next;
		}
		//not found return null
		return null;
	}
	
	
	
	class Entry{
		private String key;
		private String value;
		private Entry next;
		
		Entry(String k, String v)
		{
			this.key = k;
			this.value = v;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public Entry getNext() {
			return next;
		}

		public void setNext(Entry next) {
			this.next = next;
		}
		
		
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyHashMap map = new MyHashMap();
		
		map.put("soniya", "one");
		map.put("anup", "two");
		map.put("ved", "three");
		map.put("oreo", "four");
		
		System.out.println(map.get("anup"));
		

	}

}
