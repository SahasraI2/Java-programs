package sahasra;
public class cat_constructor {
	String name;
	int age;
	public  cat_constructor(){
		name="Unknown";
		age=0;
	}
	public static void main(String[] args) {
		cat_constructor myobj = new cat_constructor();
		System.out.println(myobj.name);
		System.out.println(myobj.age);

	}

}
