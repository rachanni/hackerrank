package hackerrank;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadingFileUsingScanner {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scn=new Scanner(new File("C:\\Users\\ws_htu571\\eclipse-workspace\\hackerrank\\src\\hackerrank/sample1.txt"));
		
		while(scn.hasNext()) {
			
			System.out.println(scn.nextLine());
		}
		
		scn.close();
	}
}
