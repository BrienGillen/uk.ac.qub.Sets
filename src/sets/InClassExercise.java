package sets;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InClassExercise {

	public static void main(String[] args) {
		
		String[] fam = {"Davy", "Zara", "Adam", "Megan", "Claire"};
		List<String> family = Arrays.asList(fam);
		
		Queue<String> famQ = new LinkedList<>(family);
		
		while (!famQ.isEmpty()) {
			System.out.println("Dequeue... ");
			System.out.println(famQ.remove());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
