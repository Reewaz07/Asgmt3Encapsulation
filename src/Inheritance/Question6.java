package Inheritance;

class Shape{
	public void print1() {
		System.out.println("This is a shape");
	}
}
	class Rectengle extends Shape{
		public void print2() {
			System.out.println("This is a rectangular shape");
		}
	}
		class Squar extends Rectengle{
			public void print3() {
				System.out.println("Square is a rectangle ");
			}
		}
	

	class Circle extends Shape{
		public void print4() {
			System.out.println("This is a circular shape");
		}
	}
public class Question6 {
	
	public static void main(String[] args) {
		Squar sqr= new Squar();
		sqr.print1();//for calling shape
		sqr.print3();//for calling rectangle
		
		Circle crcl= new Circle();
		crcl.print4();
		
		
		
	}

}
