
public interface Block extends GameObject {
	
	// For positioning in the game world 
	public void setVector(Vector o1); // Set a position vector 
	public Vector getVector(); 
	
	// Game functions 
	public boolean killsPlayer(); 
	public boolean isMoveable(); 
	public boolean isObsticle(); 
	
}
