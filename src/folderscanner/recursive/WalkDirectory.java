package folderscanner.recursive;

import java.io.File;

public class WalkDirectory {
	
	public static void showFiles(File[] files) {
		
		for(File file : files){
			if(file.isDirectory()){
				System.out.println("Directory: " + file.getName());
				showFiles(file.listFiles());
			} else {
				System.out.println("File: " + file.getName());
			}
		}
		
	}
	
}
