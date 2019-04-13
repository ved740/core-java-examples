package concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnableThread = new RunnableThread1();
		
		ExecutorService exService = Executors.newSingleThreadExecutor();
		exService.execute(runnableThread);
		exService.shutdown();
	}

}

class RunnableThread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running !");
	}
	
}
