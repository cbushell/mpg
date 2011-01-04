package mpg.composite;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Graphic{ // Composite
	
	private List<Graphic> graphics = new ArrayList<Graphic>();
	
	
	public void add(Graphic graphic) {
		graphics.add(graphic);
	}

	public void draw() {
		for(Graphic graphic : graphics){
			graphic.draw();
		}
	}

}
