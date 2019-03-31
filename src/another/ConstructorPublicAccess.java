package another;

public class ConstructorPublicAccess {
	
	public ConstructorPublicAccess(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
