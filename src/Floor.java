
public class Floor implements Block {

	
	Vector position; 
	
	public Floor() { 
		
	}
	
	// Set a floor position 
	public Floor( Vector position ) { 
		this.position = position; 
	}
	
	@Override
	public void setVector(Vector position) {
		this.position = position; 
	}

	@Override
	public Vector getVector() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public boolean killsPlayer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMoveable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isObsticle() {
		// Player can traverse floors 
		return false;
	}

}
