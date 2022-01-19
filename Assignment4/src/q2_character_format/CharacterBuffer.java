package q2_character_format;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class CharacterBuffer {
	
	//taking input from user and saving that in a file
	private static void writeToFile(File file) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			Scanner in = new Scanner(System.in)){
			String takeInput = ""; //taking input for the file
			System.out.println("Enter text to write to file");
			takeInput = in.nextLine();
			writer.write(takeInput);  //writing the data in the file
			
			System.out.println("Your file has been created!!");
			
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Sorry,Error Occured! Cannot write to File");
		}
	}
	
	
	//showing the content of the file in console
	private static String readFromFile(File file) {
		System.out.println("Reading from File");
		System.out.println("**********************************");
		String line = null;
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			//System.out.println("File Reading Complete");
		}catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Cannot read from File");
		}
		return line;
	}
	

	public static void main(String[] args) {
		
		File file = new File("char.txt");
		writeToFile(file);
		readFromFile(file);
		
	}
}
