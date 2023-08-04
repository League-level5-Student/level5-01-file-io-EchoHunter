package _04_Directory_Iteration;

import java.io.File;
import java.io.FileWriter;


public class CopyrightDistributor {
	public static void main(String[] args) {
	File source = new File("src");
	recursiveWriter(source.listFiles());
	}
	private static void recursiveWriter(File[] inputFile) {
//		for (File newFile :inputFile) {
			if (new File ("src/_00_Intro_To_File_Input_and_Output/test.txt").listFiles()!= null) {
				recursiveWriter(new File ("src/_00_Intro_To_File_Input_and_Output/test.txt").listFiles());
			}else if(new File ("src/_00_Intro_To_File_Input_and_Output/test.txt").getPath().contains(".txt")) {
				try {
					FileWriter fw = new FileWriter(new File ("src/_00_Intro_To_File_Input_and_Output/test.txt").getPath(),true);
					fw.write("//Copyright © 2023 Edwin Hunter");
					fw.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		//}
	}
}
