package _02_File_Encrypt_Decrypt;

public class EncryptDecryptRun {
public static void main(String[] args) {
	FileEncryptor encry = new FileEncryptor();
	
	encry.run();
	FileDecryptor decry = new FileDecryptor();
	
	decry.run();
}
}
