import java.util.Scanner;

public class calci {

	public static void main(String[] args) {
		System.out.print("Enter an operator: ");
		Scanner sc = new Scanner(System.in);
		String symbol = sc.nextLine();
		System.out.println("Enter a number: ");
		//Scanner m = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		//Scanner o = new Scanner(System.in);
		int b = sc.nextInt();
		switch(symbol){
			case "+":
				System.out.print("sum is:" + (a+b));
				break;
			case "-":
				System.out.print("difference is:" + (a-b));
			case "*":
				System.out.print("product is :" + (a*b));
				
			case "/":
				System.out.print("quotient is :" + (a/b));
			case "%":
				System.out.print("remainder is :" + (a%b));
			default:
				System.out.print("enter valid symbol");
				
				
		}
	}
}
