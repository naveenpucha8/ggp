package ddejonge.ggp.tools;
import java.io.File;




public class SystemInfo {

	
	public enum Location {UNKNOWN, Z1, LAPTOP};
	
	public static Location currentLocation;
	
	public static String DROPBOX_FOLDER;
	public static String JAVA_PROJECTS_FOLDER;
	public static String NEGO_GAMES_FOLDER;
	public static String GAMES_FOLDER;
	
	public static String EXPERIMENTS_FOLDER; 
	
	static{
		
		String dropboxFolder_z1 = "C:\\Users\\Dave\\Dropbox\\";
		String dropboxFolder_laptop = "C:\\Users\\30044279\\Dropbox\\";
				
		
		if((new File(dropboxFolder_z1)).exists()){
			
			currentLocation = Location.Z1;
			
			DROPBOX_FOLDER = dropboxFolder_z1;
			JAVA_PROJECTS_FOLDER = DROPBOX_FOLDER + "java projects\\";
			NEGO_GAMES_FOLDER = JAVA_PROJECTS_FOLDER + "GGP_Negotiations\\negoGames\\";
			GAMES_FOLDER = null; //TODO: set this value.
			
			EXPERIMENTS_FOLDER = "C:\\Users\\30044279\\Experiments\\";
		
		}else if((new File(dropboxFolder_laptop)).exists()){
			
			currentLocation = Location.LAPTOP;
			
			DROPBOX_FOLDER = dropboxFolder_laptop;
			JAVA_PROJECTS_FOLDER = DROPBOX_FOLDER + "\\java projects\\";
			NEGO_GAMES_FOLDER = JAVA_PROJECTS_FOLDER + "GGP_Negotiations\\negoGames\\";
			GAMES_FOLDER = JAVA_PROJECTS_FOLDER + "GGP\\ggp-base-master\\games\\games\\";
			
			EXPERIMENTS_FOLDER = "C:\\Users\\30044279\\Experiments\\";
		
		}else{
			
			System.out.println("ERROR: working on an unknown computer");
			
			
		}
		

	}
	
	
	
	
	
}
