package mpg.builder.maze;

public class Door implements MapSite{

	private Room room1;
	
	private Room room2;

	
	public Door(Room room1, Room room2){
		this.room1 = room1;
		this.room2 = room2;
	}
	
	
	public Room otherSideFrom(Room room){
		if(room.getNumber() == room1.getNumber()){
			return room1;
		}
		else if(room.getNumber() == room2.getNumber()){
			return room2;
		}
		
		return null;
	}
	
	
	public void enter() {
		// TODO Auto-generated method stub
		
	}

}
