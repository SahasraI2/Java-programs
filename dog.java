package sahasra;

public class dog {
	String name;
	String colour;
	public dog(String x , String y) {
		name=x;
		colour=y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog myobj1 = new dog("rottie","pink");
		System.out.println(myobj1.name);
		System.out.println(myobj1.colour);

	}

}
