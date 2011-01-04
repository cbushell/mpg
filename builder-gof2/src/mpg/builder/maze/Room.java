package mpg.builder.maze;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {

	private int number;

	private Map<Direction, MapSite> sides = new HashMap<Direction, MapSite>();

	
	public Room(int number) {
		this.number = number;
	}

	
	public MapSite getSide(Direction direction) {
		return sides.get(direction);
	}

	
	public void setSide(Direction direction, MapSite mapsite) {
		sides.put(direction, mapsite);
	}

	
	public int getNumber() {
		return number;
	}

	
	public void enter() {
		// TODO Auto-generated method stub

	}

}
