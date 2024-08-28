import java.util.Scanner;

public class scanner_class {

	public static void main(String[] args) {
         Scanner n = new Scanner(System.in);
         System.out.println("Enter name: ");
         String name = n.nextLine();
         System.out.println("Enter roll no: ");
         String rollno = n.nextLine();
         System.out.println("Enter department: ");
         String department = n.nextLine();
         System.out.println(name);
         System.out.println(rollno);
         System.out.println(department);

	}

}