package advance.dev;

import java.util.ArrayList;
import java.util.List;

public class ShapeDAO implements IShape {
	
	public List<Shape> shapes = new ArrayList<>();

	@Override
	public void input(Shape shape) {
		// TODO Auto-generated method stub
		shapes.add(shape);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
