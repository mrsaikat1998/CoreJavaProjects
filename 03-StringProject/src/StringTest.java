import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringTest {

	public static void main(String[] args) {
		//HashMap :->
			//not synchronized
			//only one null allow as a key but multiple null allow as value
			//implemented DS Hashtable
		
		//How to create HashMap Object
		//1.HashMap()----> Default Capacity 16 LoadFactor or Fill Ratio 0.75
		//2.HashMap(Map m)
		//3.HashMap(int initialCapacity)
		//4.HashMap(int initialCapacity, float loadFactor)
		
		//perform adding operations
		HashMap<Object,Object> hm=new HashMap<>();
		hm.put("A",1);
		hm.put("B",2);
		hm.put("C",3);
		hm.put("D",4);
		hm.put("E",5);
		hm.put(null,6);
		
		//performing counting operations
		System.out.println("Size = "+hm.size());
		
		//performing printing operations
		System.out.println(hm);
		
		//performing searching operations
		System.out.println(hm.containsKey("A"));
		System.out.println(hm.containsValue(3));
		
		//getting object if present
		if(hm.containsKey("B")) {
			System.out.println(hm.get("B"));
		}
		
		//getting all keys
		System.out.println(hm.keySet());//[null, A, B, C, D, E]
		
		//getting all values
		System.out.println(hm.values());
		
		//replacing 
		if(hm.containsKey(null))
		System.out.println(hm.put(null, 7));//6 because 6 replace by 7
		System.out.println(hm);
		
		//remove entry
		hm.remove(null);
		
		System.out.println(hm);
	}

}
