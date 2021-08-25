package day5assessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1ReadingFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("C:/Users/krupakumar.v/Desktop/SampleText.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}

}
