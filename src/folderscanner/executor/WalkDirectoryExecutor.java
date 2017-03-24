package folderscanner.executor;

import java.io.File;
import java.util.Scanner;

import folderscanner.recursive.WalkDirectory;
import folderscanner.searcher.FileSearcher;

public class WalkDirectoryExecutor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter path of the begining file: ");
		String path = input.nextLine();
		File[] files = new File(path).listFiles();

		String option = input.nextLine();

		if (option.equals("scan")) {

			WalkDirectory.showFiles(files);
			
		}
		
		if (option.equals("search")) {
			
			System.out.print("Enter name of file you want to find: ");
			String fileName = input.nextLine();
			FileSearcher.searchFile(files, fileName);
			
		}

	}

}
