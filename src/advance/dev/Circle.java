package advance.dev;

public class Circle extends Shape {

	private double r;
	
	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(r, 2) * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [toString()=" + super.toString() + "]";
	}

}
