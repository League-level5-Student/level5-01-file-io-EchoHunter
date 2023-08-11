package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;


public class CopyrightDistributor {
	public static void main(String[] args) {
	File source = new File("src");
	
	recursiveWriter(source.listFiles());
	}
	private static void recursiveWriter(File[] inputFile) {
		for (File newFile :inputFile) {
			if (newFile.listFiles()!= null) {
				recursiveWriter(newFile.listFiles());
			}else if(newFile.getPath().contains(".java")) {
				try {
					FileWriter fw = new FileWriter(newFile.getPath(),true);
					fw.write("\n//Copyright © 2023 Edwin Hunter");
					fw.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

//Copyright © 2023 Edwin Hunter