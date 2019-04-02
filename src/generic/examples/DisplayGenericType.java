package generic.examples;

public class DisplayGenericType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGeneric1<String> sg = new SimpleGeneric1<String>("Hello");
		sg.showObjectType();
	}

}

class SimpleGeneric1<T> {
	private T obj;
	
	SimpleGeneric1(T obj) {
		this.obj = obj;
	}
	
	
	public void showObjectType() {
		System.out.println("Object Type is " + obj.getClass().getName());
	}
}
