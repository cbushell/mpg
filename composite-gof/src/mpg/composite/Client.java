package mpg.composite;

public class Client {

	public static void main(String[] args) {
		Graphic line = new Line();
		Graphic rectangle = new Rectangle();
		Graphic picture = new Picture();
		
		// Recursive composition
		picture.add(line);
		picture.add(rectangle);
		
		// Client can treat primitives and containers in the same way
		line.draw();
		rectangle.draw();
		picture.draw();
	}
}
