package practiceprograms;
import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int count=0;
		if(n==2) {
			System.out.println("it is prime number");
		}
		else {
			for(int i=1;i<=n;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println("The number is prime");
			}
			else {
				System.out.println("The number is not prime");
			}
		}
		
		

	}

}
