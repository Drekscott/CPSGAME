/*   Create a basic wall block for the player to collide with */

public class Wall implements Block {

	
	Vector position = null; 
	boolean killsPlayer = false; 
	
	// Create a wall 
	public Wall(Vector position) { 
		this.position = position; 
	}
	
	
	@Override
	public void setVector(Vector position) {
		this.position = position; 	
	}

	// Get the vector of the block 
	@Override
	public Vector getVector() {
		return position;
	}

	// If the wall is an obstacle 
	@Override
	public boolean killsPlayer() {
		return killsPlayer; 
	}

	@Override
	public boolean isMoveable() {
		// TODO Auto-generated method stub
		return false; 
	}


	@Override
	public boolean isObsticle() {
		// Player cannot walk through walls... 
		return true;
	}

}
