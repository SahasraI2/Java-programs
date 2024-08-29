package sahasra;
class computer{
	String brand="Apple ";
	String speed ="1524mbps";
	class processor{
		public void displayDetails() {
			System.out.println(brand);
			System.out.println(speed);

			}
	}
}

public class mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer myouter = new computer();
		computer.processor myinner = myouter.new processor();
		myinner.displayDetails();

	}

}