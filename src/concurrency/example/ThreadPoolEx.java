package concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exService = Executors.newFixedThreadPool(2);
		int noOfTasks = 5;
		for(int i=0; i<noOfTasks; i++) {
			Runnable runnableThread = new RunnableThread2("Task " + (i+1));
			exService.execute(runnableThread);
		}
		exService.shutdown();
		while(!exService.isTerminated()) {}
		System.out.println("Finished all !!!");

	}

}

class RunnableThread2 implements Runnable {
	private String taskName;

	public RunnableThread2(String string) {
		// TODO Auto-generated constructor stub
		this.taskName = string;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread Name - " + Thread.currentThread().getName() + ", TaskName - " + taskName + ": STARTED !");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Thread Name - " + Thread.currentThread().getName() + ", TaskName - " + taskName + ": ENDED !");
	}
	
}
