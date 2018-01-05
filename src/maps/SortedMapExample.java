package maps;

import java.util.Map;
import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {
		
		//Create a tree map
		Map<Integer, String> mySortedMap = new TreeMap<Integer, String>();
		//add keys and values
		mySortedMap.put(4, "four");
		mySortedMap.put(1, "one");
		mySortedMap.put(3, "three");
		mySortedMap.put(2, "two");

		//get the keyset and output the values
		for(Integer key : mySortedMap.keySet()){
			System.out.printf("%10d%10s \n", key, mySortedMap.get(key));
		}
		
	}

}
