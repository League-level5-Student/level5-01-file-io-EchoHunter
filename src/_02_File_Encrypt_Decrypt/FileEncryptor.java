package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
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
		Boolean noQuit = true;
		do {
		System.out.println("Input the information you would like encrypted, or type QUIT to exit this menu");
		String input = sc.next();
		if (input.equals("QUIT")) {
			noQuit = false;
		} else {
			noQuit = true;
			try {
				FileWriter wr = new FileWriter("src/_02_File_Encrypt_Decrypt/Encrypted.txt");
				
				wr.write("\n" + EncryptString(input));
				wr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		}while(noQuit);
	}
	private String EncryptString(String input) {
		// TODO Auto-generated method stub
		StringBuilder encrypt = new StringBuilder(input);
		for (int i = 0; i < encrypt.length(); i++) {
			encrypt.setCharAt(i, (char) (encrypt.charAt(i)+4));	
		}
		return encrypt.toString();
	}
	
}
