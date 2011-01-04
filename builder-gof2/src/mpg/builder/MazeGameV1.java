package mpg.builder;

import mpg.builder.maze.Direction;
import mpg.builder.maze.Door;
import mpg.builder.maze.Maze;
import mpg.builder.maze.Room;
import mpg.builder.maze.Wall;

/*
  		------------------
  		|		|		 |
  		|	r1	d	r2   |
  		|		|   	 |
  		------------------
 */
public class MazeGameV1 {

	public Maze createMaze(){
		Maze maze = new Maze();
		
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		
		Door door = new Door(room1, room2);
		
		room1.setSide(Direction.NORTH, new Wall());
		room1.setSide(Direction.SOUTH, new Wall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.WEST, new Wall());
		maze.addRoom(room1);
		
		room2.setSide(Direction.NORTH, new Wall());
		room2.setSide(Direction.SOUTH, new Wall());
		room2.setSide(Direction.EAST, new Wall());
		room2.setSide(Direction.WEST, door);
		maze.addRoom(room2);
		
		return maze;
	}
	
}
