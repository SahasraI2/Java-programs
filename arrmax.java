package practiceprograms;

public class arrmax {

	public static void main(String[] args) {
		int [] arr = {15,9,666,24,769,45,4,1524};
		int max=0;
		int min=0;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println("the maximum element in the array is:" + max);


	}

}
