package threads.examples;

public class ImplementsRunnable {
	
	public static void main(String[] args) {
		
		Runnable runnableThread = new UploadResult2();
		Thread uploadResult = new Thread(runnableThread);
		uploadResult.start();
		
	}
	
}

class UploadResult2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Yayy !! I am a thread, I implements runnanble interface");
	}

}
