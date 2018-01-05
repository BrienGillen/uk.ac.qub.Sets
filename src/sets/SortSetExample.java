package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortSetExample {
	
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		//Add elements
		set.add("Zidane");
		set.add("Messi");
		set.add("Pele");
		
		//natural order
		for (String name : set){
			System.out.println(name);
		}
		
		//Shows first and last
		System.out.println("First : " + set.first());
		System.out.println("Last : " + set.last());
		
		set.remove(set.last());
		
		for (String name : set) {
			System.out.println(name);
		}
	}

}
