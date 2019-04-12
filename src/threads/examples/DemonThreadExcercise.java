package threads.examples;

import java.lang.Thread;

public class DemonThreadExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread demon = new ThreadD();
		demon.setPriority(Thread.MAX_PRIORITY);
		demon.setDaemon(true);
		demon.start();
	}

}

class ThreadD extends Thread {
	
	public void run() {
		System.out.println("Hi, I'm Demon Thread");
	}
	
}
