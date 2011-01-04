package mpg.composite.gof;

public interface Graphic { // Component

	public void draw();
	
	// "We have emphasized transparency over safety in this pattern"
	public void add(Graphic graphic);
}
