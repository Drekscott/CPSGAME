import java.io.File;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {
	
	

	public static void main(String[] args) throws FileNotFoundException { 
		// Launch the application 
		Application.launch(args);
		
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Map loading stuff 
		File f = new File("level1"); 
		Map level1 = new Map(f); 
		level1.renderTextMap();
		
		
	}
	
	
	
	
}
