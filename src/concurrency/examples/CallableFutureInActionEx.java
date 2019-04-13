package concurrency.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureInActionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService exService = Executors.newSingleThreadExecutor();
		UploadData uploadData = new UploadData();
		try {
			Future<Marks5> future = exService.submit(uploadData);
			System.out.println("Uploaded Data : " + future.get());
		} catch (InterruptedException e) {
			e.getMessage();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class UploadData implements Callable<Marks5> {

	@Override
	public Marks5 call() throws Exception {
		// TODO Auto-generated method stub
		return new Marks5("Math", 98);
	}
	
}

class Marks5 {
	private String subName;
	private int marks;

	Marks5(String subName, int marks) {
		this.subName = subName;
		this.marks = marks;
	}
	
	public String toString() {
		return "Subject : " + subName + ", Marks : " + marks;
	}
}
