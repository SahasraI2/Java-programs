package practiceprograms;

public class arrmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {15,9,666,24,769,45,4,1524};
		int min=0;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		System.out.println("the minimum element in the array is:" + min);

	}

}
