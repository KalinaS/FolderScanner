package folderscanner.searcher;

import java.io.File;

public class FileSearcher {

	public static void searchFile(File[] files, String name) {
		
		if (files != null) {
			for (File file : files) {

				if (file.getName().equals(name) && file.getName() != null) {
					System.out.println("File exists. Path: " + file.getParent());
				} else {
					if (file.isDirectory()) {
						searchFile(file.listFiles(), name);
					}
				}
			}
		}
	}
}