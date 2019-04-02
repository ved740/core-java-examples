package generic.examples;

class Box<T> {
	   private T t;
	
	   public void set(T t) { this.t = t; }
	   public T get() { return t; }
	}
public class Test {
	
	public static void add(Box<? extends Number> input){
		System.out.println("OK");
	}
	
	public static void main(String args[])throws Exception{
		Box<Number> box = new Box<Number>();
		add(box);
		Box<Integer> box1 = new Box<Integer>(); 
		add(box1); //line 17
	
		
	}
}
