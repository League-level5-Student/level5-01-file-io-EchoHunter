package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Scanner;

public class FileDecryptor {
	/*
	 * Decryption is the process of taking encoded or encrypted text or other data
	 * and converting it back into text that you or the computer can read and understand.
	 *
	 * The shift cipher is decrypted by using using the key and shifting back up,
	 * at the end of our encryption example we had our alphabet as:
	 *
	 * e f g h i j k l m n o p q r s t u v w x y z a b c d
	 *
	 * If we shift it back up by 4 based on the key we used the alphabet is decrypted:
	 *
	 * a b c d e f g h i j k l m n o p q r s t u v w x y z
	 *
	 * "Lipps Asvph" returns to "Hello World"
	 * 
	 * Create a program that opens the file created by FileEncryptor and decrypts
	 * the message, then display it to the user in a JOptionPane.
	 */
	Scanner sc = new Scanner(System.in);
	public void run() {
		System.out.println("input the line you would like to decrypt");
		String s = sc.nextLine();
		int lineNum = Integer.parseInt(s);
		try {
			BufferedReader bf = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/Encrypted.txt"));
			for (int i = 0; i <= lineNum; i++) {
				if(i==lineNum) {
				System.out.println(DecryptString(bf.readLine()));
				}else {
					bf.readLine();
				}
			}
		}catch(Exception e) {
			System.out.println("Error: The line you have requested does not exist or could not be found");
		}
	}
	private String DecryptString(String input) {
		// TODO Auto-generated method stub
		StringBuilder decrypt = new StringBuilder(input);
		for (int i = 0; i < decrypt.length(); i++) {
			decrypt.setCharAt(i, (char) (decrypt.charAt(i) - 4));
		}
		return decrypt.toString();
	}
}

