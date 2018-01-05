package maps;

import java.util.Map;
import java.util.HashMap;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<Integer, String> students = new HashMap<>();
		
		students.put(40104050, "Brien Gillen");
		students.put(101010, "Jimmy Old");
		
		//adding a new key?
		students.put(101010, "Jimmy Young");
		
		//retrieve values from keys
		for(Integer key : students.keySet()){
			System.out.println(key + " : " + students.get(key));
		}
		
		//value based on a key
		if(students.containsKey(40104050)){
			System.out.println("Student is : " + students.get(40104050));
		}
		
	}

}
