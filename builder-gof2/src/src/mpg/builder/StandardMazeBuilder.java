package mpg.builder;

import mpg.builder.maze.Direction;
import mpg.builder.maze.Door;
import mpg.builder.maze.Maze;
import mpg.builder.maze.Room;
import mpg.builder.maze.Wall;

public class StandardMazeBuilder extends MazeBuilder{

	private Maze maze;


	@Override
	public void buildRoom(int roomNumber) {
		if(maze.getRoom(roomNumber) != null){
			Room room = new Room(roomNumber);
			
			room.setSide(Direction.NORTH, new Wall());
			room.setSide(Direction.SOUTH, new Wall());
			room.setSide(Direction.EAST, new Wall());
			room.setSide(Direction.WEST, new Wall());
			
			maze.addRoom(room);
		}
	}

	
	@Override
	public void buildDoor(int roomNumber1, int roomNumber2) {
		Room room1 = maze.getRoom(roomNumber1);
		Room room2 = maze.getRoom(roomNumber2);
		
		Door door = new Door(room1, room2);
		room1.setSide(findCommonWall(room1, room2), door);
		room1.setSide(findCommonWall(room2, room1), door);
	}
	
	
	private Direction findCommonWall(Room room1, Room room2) {
		return Direction.EAST;
	}
	
	
	@Override
	public void buildMaze() {
		maze = new Maze();
	}
	
	
	@Override
	public Maze getMaze() {
		return maze;
	}

}
