package iooperations.examples;

public class AutoClosableImplEx {
	public static void main(String args[]) throws Exception {
		try (BasicResource is = new BasicResource()) {
			is.read();
		} catch(Exception e) {
			//code
		} finally {
			//code
		}
	}
}

class BasicResource implements AutoCloseable  {
	public int read(){
		//read implementation
		return 0;
	}
	
	public void close(){
		//close implementation
	}
}
