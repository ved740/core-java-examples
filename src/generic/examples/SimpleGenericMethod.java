package generic.examples;

public class SimpleGenericMethod {
	
	static <T> void display(T[] cities) {
		for(T city: cities) {
			System.out.println(city);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number num = new Number() {
			
			@Override
			public long longValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int intValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public float floatValue() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public double doubleValue() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		Number num1 = new Integer(12);
		System.out.println(num1.intValue());
		String[] cities = {"Mumbai", "Delhi", "Ranchi"};
		display(cities);
	}

}


