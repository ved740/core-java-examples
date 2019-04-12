package threads.examples;

import java.util.concurrent.ThreadLocalRandom;

public class ExtendsThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UploadResult1 uploadThread1 = new UploadResult1("One");
		UploadResult1 uploadThread2 = new UploadResult1("Two");
		UploadResult1 uploadThread3 = new UploadResult1("Three");
		UploadResult1 uploadThread4 = new UploadResult1("Four");
		UploadResult1 uploadThread5 = new UploadResult1("Five");
		uploadThread1.start();
		uploadThread2.start();
		System.out.println(uploadThread1.getPriority());
		uploadThread3.start();
		uploadThread4.start();
		uploadThread5.start();

	}

}

class UploadResult1 extends Thread {
	private String name;
	
	UploadResult1(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2000));
			System.out.println("YAYYY !! I am from independent Thread " + name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
