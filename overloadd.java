public class Overloadd {
	public String student(String name) {
    	return name;
    }
    public String student(String name,String dep) {
    	return name  +  dep;
    }
    public String student(String name,int roll_no) {
      return name  +   roll_no;
    } 	

	public static void main(String[] args) {
		Overloadd sc = new Overloadd();
		System.out.println(sc.student("Sahasra"));
		System.out.println(sc.student("Sahasra" , "CSE"));
		System.out.println(sc.student("Sahasra" , 24));
	}

}