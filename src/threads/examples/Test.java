package threads.examples;



public class Test extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}

	public static void main(String args[]) {
		UploadResult1 obj = new UploadResult1("test");
		obj.setPriority(7);// 1
		obj.start();// 2
		obj.setDaemon(true);// 3
	}
}
