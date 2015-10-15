import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Map {
	
	Scanner mapReader = null; 
	List<GameObject> map; 
	
	public Map(File mapFile) throws FileNotFoundException { 
		
		
		// Check if the map exists 
		if (mapFile.exists()) {
			try { 
				mapReader = new Scanner(mapFile); 
				map = readMap(mapReader); 
			} catch (FileNotFoundException e) { 
				System.out.println("Could not find map file"); 
			}
		}
	
	} // Map 
	
	// Private command to read the map 
	private List<GameObject> readMap(Scanner s) { 
		
		// Set the x and y scanners and create an arraylist for the map 
		int xpos = 0; 
		int ypos = 0; 
		
		List<GameObject> m = new ArrayList<GameObject>(); 
		
		while (s.hasNextLine()) { 
			
			
			String currentLine = s.next();
		    String LineArray[] = currentLine.split(",");
		    
		    for (int i = 0; i < LineArray.length; i++ ) { 
		    	Vector positionVector = new Vector(xpos, ypos); 
		    	xpos++; 
		    	// Create the map object
		    	if (LineArray[i].equals("w")) { 
		    		m.add(new Wall(positionVector)); 
		    	} else if (LineArray[i].equals("f")) { 
		    		m.add(new Floor(positionVector)); 
		    	} else if (LineArray[i].equals("n")) { 
		    		xpos = 0; 
		    		ypos++; 
		    	}
		    }
		}
		return m; 
	}
	// Render the map for testing purposes 
	public void renderTextMap() { 
		for (int i = 0; i < map.size(); i++) { 
			if ((i > 0) && (map.get(i-1).getVector().getYpos() < map.get(i).getVector().getYpos())) { 
				System.out.println(); 
			}
			System.out.print(map.get(i).getVector()); 
		}
	}
	
}
