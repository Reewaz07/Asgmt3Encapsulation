package Question6;

public class Rectang extends Shape{
	public void print() {
		super.print();//yesle parent class ko method chinayo same method name xa vane
		System.out.println("this is  rectangullar shape");
	}
}

	class Square extends Rectang{
		public void print() {
			super.print();//yesle parent class ko method chinayo same method name xa vane
			System.out.println("Square is a rectangle");
		}
	}

