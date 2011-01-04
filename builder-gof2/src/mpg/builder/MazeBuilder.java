package mpg.builder;

import mpg.builder.maze.Maze;

public abstract class MazeBuilder {

	public Maze getMaze(){
		return null;
	}
	
	public abstract void buildMaze();
	
	public abstract void buildRoom(int room);
	
	public abstract void buildDoor(int room1, int room2);

}
