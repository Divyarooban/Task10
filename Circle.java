package task10;

public class Circle {
	
	int radius;	
	public Circle() { 				//default Constructor with no arguments
		this.radius= radius;
		
		}
	public Circle(int radius) {		//Constructor with arguments
		this.radius=radius;
	}
	public int getrad() {
		return radius;
	}
	
	public void setrad(int r) {
		this.radius=r;
	}
	public double calcircumference() {
		double circumference=2*3.14*radius;
		return circumference;
		
	}

	public static void main(String[] args) {
		
		Circle c1=new Circle();    //Constructor with no arguments
		c1.setrad(7);
		System.out.println("Circle1 radius:"+c1.getrad());
		System.out.println("The Circumference of the circle1:"+c1.calcircumference());
		
		Circle c2=new Circle(4);   //Constructor with arguments
		System.out.println("Circle2 radius:"+c2.getrad());
		System.out.println("The Circumference of the circle2:"+c2.calcircumference());

	}

}
