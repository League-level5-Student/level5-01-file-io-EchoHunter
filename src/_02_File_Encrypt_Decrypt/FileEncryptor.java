package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileEncryptor {
	/*
	 * Encryption is the process of encoding a message or information
	 * in such a way that only authorized parties can access it and
	 * those who are not authorized cannot.
	 *
	 * A simple shift cipher works by shifting the letters of a message
	 * down based on a key. If our key is 4 then:
	 * 
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 * 
	 * becomes:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 * 
	 * "Hello World" changes to "Lipps Asvph"
	 *
	 * Create a program that takes a message and a key from the user.
	 * Use the key to shift each letter in the users input and save the final result to a file.
	 */
	Scanner sc = new Scanner(System.in);
	List<String> l = new ArrayList<String>();
	public void run() {
		try {
		BufferedReader bf = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/Encrypted.txt"));
		String line = bf.readLine();
		while(line != null){
			l.add(line);
			line = bf.readLine();
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}
