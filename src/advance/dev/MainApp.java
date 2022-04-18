package advance.dev;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainApp {

	public static void main(String[] args) {
		IShape shapeDAO = new ShapeDAO();
		List<Shape> shapes = new ArrayList<Shape>();
		readFromFile(shapes);
	}
	
	static void readFromFile(List<Shape> shapes) {
		try {
			FileInputStream fstream = new FileInputStream("input.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			
			String strLine;
		
			while((strLine = br.readLine()) != null) {
				if (strLine.startsWith("#circle")) {
					shapes.add(readCircle(br));
				}
				
				if (strLine.startsWith("#rectangle")) {
					shapes.add(readRectangle(br));
				}
				
				if (strLine.startsWith("#triangle")) {
					shapes.add(readTriangle(br));
				}
				System.out.println(strLine);
			}
		} catch (Exception e) {
			
		}
	}
	
	static Circle readCircle(BufferedReader br) throws NumberFormatException, IOException {
		double bk = Double.parseDouble(br.readLine());
		return new Circle(bk);
	}
	
	static Rectangle readRectangle(BufferedReader br) throws NumberFormatException, IOException {
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		return new Rectangle(a, b);
	}
	
	static Triangle readTriangle(BufferedReader br) throws NumberFormatException, IOException {
		double a = Double.parseDouble(br.readLine());
		double b = Double.parseDouble(br.readLine());
		double c = Double.parseDouble(br.readLine());
		return new Triangle(a, b, c);
	}
}
