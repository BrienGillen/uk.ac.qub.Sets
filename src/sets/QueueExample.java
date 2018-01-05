package sets;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args){
		
		int time = 10;
		
		//create an implementation of a queue
		Queue<Integer> queue = new LinkedList<>();
		
		//populate the queue
		for (int i = time; i>=0; i--){
			queue.add(i);
		}
		
		System.out.println("Queue items : " + queue.toString());
		
		//remove each item and delay a second
		while(!queue.isEmpty()){
			System.out.println(queue.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
