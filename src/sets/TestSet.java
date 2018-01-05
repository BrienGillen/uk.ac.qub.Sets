package sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		
		String[] colours = {"red", "white", "blue", "green", "grey", "orange", "tan", "white", "cyan", "peach", "grey", "orange" };
		List<String> list = Arrays.asList(colours);
		System.out.println(list.toString());
		
		printNonDuplicates(list);
	}
	
	public static void printNonDuplicates(Collection<String> values) {
		Set<String> set = new HashSet<String>(values);
		System.out.println("Non duplicates are : ");
		System.out.println(set.toString());
	}

}
