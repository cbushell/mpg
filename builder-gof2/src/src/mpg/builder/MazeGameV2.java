package mpg.builder;

import mpg.builder.maze.Maze;

public class MazeGameV2 {

	public Maze createMaze(MazeBuilder builder){
		builder.buildMaze();
		
		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
		
		return builder.getMaze();
	}
}
