package concurrency.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UploadResult extends Thread {
	@Override
	public void run() {
		//code for uploading result
		System.out.println("Upload Successful");
	}
}

public class Test {
	public static void main (String[] args){
		ExecutorService exService = Executors.newFixedThreadPool(5); //1
		UploadResult uploadRunnable1 = new UploadResult();
		UploadResult uploadRunnable2 = new UploadResult();
		exService.execute(uploadRunnable1);
		exService.execute(uploadRunnable2);
		exService.shutdown();
	}

}
