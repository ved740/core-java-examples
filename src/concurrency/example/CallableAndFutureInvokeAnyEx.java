package concurrency.examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.List;
import java.util.ArrayList;


public class CallableAndFutureInvokeAnyEx {
	public static void main (String[] args){
		ExecutorService exService = Executors.newSingleThreadExecutor();//1
		UploadResultCall uploadRunnable1 = new UploadResultCall(10);
		UploadResultCall uploadRunnable2 = new UploadResultCall(11);
		List<UploadResultCall> tasks = new ArrayList<>();
		tasks.add(uploadRunnable1);//2
		tasks.add(uploadRunnable2);//3
		try {
			exService.invokeAny(tasks); //4
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		exService.shutdown();
	}

}

class UploadResultCall implements Callable<Boolean> {
	private int threadNo;
	public UploadResultCall(int number) {
		threadNo = number;
	}
	public Boolean call() throws Exception {
		Boolean retValue = processResult();
		if (retValue){
			System.out.println("Upload Successful!"); 
		}else{
			System.out.println("Upload failed!");
		}
		return retValue;
	}
	private Boolean processResult(){
		//dummy implementation for processing
		try{
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		//dummy implementation for return value
		if(threadNo % 2 ==0 )
			return Boolean.TRUE;
		else
			return Boolean.FALSE;
	}
}
