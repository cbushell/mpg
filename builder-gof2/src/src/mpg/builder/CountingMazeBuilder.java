package mpg.builder;


public class CountingMazeBuilder extends MazeBuilder{

	private int rooms = 0;

	private int doors = 0;
	
	
	public void buildDoor(int room1, int room2) {
		doors++;
	}

	
	public void buildRoom(int room) {
		rooms++;
	}
	
	
	public int getNumberOfRooms(){
		return rooms;
	}

	
	public int getNumberOfDoors(){
		return doors;
	}


	@Override
	public void buildMaze() {
		// TODO Auto-generated method stub
		
	}
	
}
