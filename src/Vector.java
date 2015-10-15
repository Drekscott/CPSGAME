// The vector class contains x and y positions for movement and placing objects 
public class Vector {
	
	// X and Y position 
	private int xpos; 
	private int ypos; 
	
	// Default constructor 
	public Vector() { 
		
	}
	
	// Vector constructor with parameters 
	public Vector(int xpos, int ypos) { 
		this.xpos = xpos; 
		this.ypos = ypos; 
	}
	
	
	// Get the position 
	public int getXpos() {
		return xpos; 
	}
	
	public int getYpos() { 
		return ypos; 
	}
	
	// Set position 
	public void setXPos(int xpos) { 
		this.xpos = xpos; 
	}
	
	public void setYPos(int ypos) { 
		this.ypos = ypos; 
	}
	
	// Add another vector 
	public Vector addVector(Vector o1) { 
		// Get the x and y coordinates of the other vector 
		int x2 = o1.getXpos(); int y2 = o1.getYpos(); 
		Vector newVector = new Vector( xpos + x2, ypos + y2); 
		// Return the new vector 
		return newVector; 
	}
	
	public String toString() { 
		String vectorInfo = String.format(" Vector( %d, %d ) ", xpos, ypos); 
		return vectorInfo; 
	}
	
	
	
}
