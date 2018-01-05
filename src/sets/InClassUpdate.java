package sets;

import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.PriorityQueue;

public class InClassUpdate {
	
	public static void main(String[] args) {
		
		String[] fam = {"Davy", "Zara", "Adam", "Megan", "Claire"};
		List<String> family = Arrays.asList(fam);
		
		Queue<String> famQ = new PriorityQueue<>(family);
		System.out.println(famQ.toString());
		
		
		while (!famQ.isEmpty()) {
			System.out.println("Dequeue... ");
			System.out.println(famQ.remove());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
