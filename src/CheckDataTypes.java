
public class CheckDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check undefined
//		int a;
//		System.out.println("a : " + a);
		
//		float fV = 1.5f;
//		System.out.println("fv : " + fV);
		
//		Object obj = null;
//		obj = new Object();
//		System.out.println("obj : " + obj);
		
//		check default values
		AllDataTypesClass adtcObj = new AllDataTypesClass();
		System.out.println("default value for char " + adtcObj.getChV());
		System.out.println("default value for byte " + adtcObj.getByV());
		System.out.println("default value for short " + adtcObj.getShV());
		System.out.println("default value for int " + adtcObj.getInV());
		System.out.println("default value for long " + adtcObj.getLoV());
		System.out.println("default value for float " + adtcObj.getFlV());
		System.out.println("default value for double " + adtcObj.getDoV());
		System.out.println("default value for boolean " + adtcObj.isBoV());
		System.out.println("default value for object " + adtcObj.getObV());
	}

}
