package threads.examples;

public class SynchronizationScenarioEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseSSE testCourse = new CourseSSE("Test", 2);
		Thread testThread1 = new RegisterThread(testCourse);
		Thread testThread2 = new RegisterThread(testCourse);
		Thread testThread3 = new RegisterThread(testCourse);
		Thread testThread4 = new RegisterThread(testCourse);
		testThread1.start();
		testThread2.start();
		testThread3.start();
		testThread4.start();
	}

}

class CourseSSE {
	String name;
	int noOfSeats;
	public CourseSSE(String name, int seats) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.noOfSeats = seats;
	}
	public synchronized void registerForCourse(int rollNo) {
		try {
			if(noOfSeats <= 0) {
				throw new Exception("Uhh Ohh ! No more seats available for this course");
			}
			System.out.println("Yayy !!! Booked Successfully");
			noOfSeats -= 1;
			System.out.println("No of seats available - " + noOfSeats);
		} catch (Exception e) {
			System.out.println("EXCEPTION ENCOUNTERED -> " + e.getMessage());
		}
	}
}

class RegisterThread extends Thread {
	CourseSSE c;
	public RegisterThread(CourseSSE c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	public void run() {
		c.registerForCourse(1);
	}
}
