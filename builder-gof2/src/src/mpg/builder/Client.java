package mpg.builder;

import mpg.builder.maze.Maze;

public class Client {

	public static void main(String args[]) {

		// Without builder
		MazeGameV1 mazeGameV1 = new MazeGameV1();
		Maze maze = mazeGameV1.createMaze();

		
		
		// Using builder
		StandardMazeBuilder standardMazeBuilder = new StandardMazeBuilder();

		MazeGameV2 standardMazeGame = new MazeGameV2();
		Maze standardMaze = standardMazeGame.createMaze(standardMazeBuilder);

		
		
		CountingMazeBuilder countingMazeBuilder = new CountingMazeBuilder();

		MazeGameV2 countingMazeGame = new MazeGameV2();
		Maze countingMaze = countingMazeGame.createMaze(countingMazeBuilder);

		System.out.printf(	"Maze has %d rooms, and %d door(s)",
							countingMazeBuilder.getNumberOfRooms(), 
							countingMazeBuilder.getNumberOfDoors());
	}
}
