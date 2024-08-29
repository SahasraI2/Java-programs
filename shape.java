package sahasra;
import java.util.Scanner;
public class shape {
	 public void getArea() {
    	 int area = 2*3;
		 System.out.println(area);
    	   }

     class Rectangle extends shape{
    	 public void getArea() {
    		 Scanner sc = new Scanner(System.in);
    		 System.out.println("Enter length:");
    		 int l = sc.nextInt();
    		 System.out.println("Enter breadth:");
    		 int b = sc.nextInt();
        	 int area = l*b;
    		 System.out.println(area);
    		 sc.close();
        	}
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s1 = new shape();
		Rectangle r1 = s1.new Rectangle();
		r1.getArea();
	}
}

