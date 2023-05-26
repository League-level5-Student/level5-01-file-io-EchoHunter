package _01_File_Recorder;

import java.io.FileWriter;
import java.util.Scanner;

public class FileRecorder {
	// Create a program that takes a message from the user and saves it to a file.
	Scanner sc = new Scanner(System.in);
	Boolean noQuit = false;

	public void run() {
		do {
			System.out.println("Input the message you would like to store, or type QUIT to close the program");
			String input = sc.next();
			if (input.equals("QUIT")) {
				noQuit = false;
			} else {
				noQuit = true;
				try {
					FileWriter wr = new FileWriter("src/_01_File_Recorder/TxtStore.txt");
					wr.write("\n" + input);
					wr.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (noQuit);
	}
}
