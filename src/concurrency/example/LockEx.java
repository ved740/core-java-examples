package concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exService = Executors.newFixedThreadPool(2);
		int tasksCount = 3;
		Lock lock = new ReentrantLock();
		UploadWithLock uploadWithLock = new UploadWithLock(lock);
		for(int i = 1; i <= tasksCount; i++) {
			
			exService.execute(uploadWithLock);
		}
		exService.shutdown();
		while(!exService.isTerminated()) {}
		System.out.println("EXECUTION OVER !!");
	}

}

class UploadWithLock implements Runnable {
	private int uploadCount;
	private Lock lock;
	
	public UploadWithLock(Lock lock) {
		// TODO Auto-generated constructor stub
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread name : " + Thread.currentThread().getName() + " STARTED");
		System.out.println("START Upload Count : " + uploadCount);
		try {
			
			lock.lock();
			Thread.sleep(2000);
			++uploadCount;
			
		} catch (InterruptedException e) {
			e.getMessage();
		} finally {
			lock.unlock();
		}	
		System.out.println("Thread name : " + Thread.currentThread().getName() + " ENDED");
		System.out.println("END Upload Count : " + uploadCount);
	}
	
}
