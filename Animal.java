package sahasra;

public class Animal {
	public void move() {
		System.out.println("I'm an Animal");
	}
	class Cheetah extends Animal{
		public void move() {
			System.out.println("I'm Cheetah,I'm the Fastest");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		Cheetah c1 = a1.new Cheetah();
		c1.move();
	}

}
