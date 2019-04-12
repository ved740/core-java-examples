package concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exService = Executors.newFixedThreadPool(3);
		int tasksCount = 2;
		for (int i = 0; i<tasksCount; i ++) {
			Task task = new Task(i);
			exService.execute(task);
		}
		exService.shutdown();
		while(!exService.isTerminated()) {}
		System.out.println("Execution finished");
	}

}

class Task implements Runnable {
	private int counter;
	
	Task(int counter) {
		this.counter = counter;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		incrementCtr();
		System.out.println("Value of counter : " + counter);
		
	}
	
	private void incrementCtr() {
		counter += 1;
	}
	
}
