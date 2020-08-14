import java.io.*;
import java.util.Scanner;

public class UserString {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		String inputStr ="";

		FileWriter fw = new FileWriter("inputString.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		while (!(inputStr.equalsIgnoreCase("Done"))) {
			System.out.print("Enter string: " );
			inputStr = scan.next(); 
			
			if(inputStr.equalsIgnoreCase("Done"))
				outFile.close();
			else {
				outFile.print(inputStr);
				outFile.println();		
			}
		}
		System.out.println("File has been created.");
		scan.close();
	}

}