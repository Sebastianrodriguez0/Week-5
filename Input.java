import java.io.*;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) throws IOException {
		System.out.println("Maximum values");
		String myFile = "/Users/Sebastian/Documents/JavaProgramming/Github/Programming-Fundamentals/Lab 5/src/input.csv";
		File f = new File(myFile);
		Scanner fileScan = new Scanner(f);

		int counter = 1;
		while (fileScan.hasNext()) {

			int values = 0;
			String row = fileScan.nextLine();
			String[] rowArray;
			rowArray = row.split(",");

			for (int i = 0; i < rowArray.length; i++) {

				if (Integer.parseInt(rowArray[i]) > values)
					values = Integer.parseInt(rowArray[i]);
			}
			System.out.println("Row " + counter + ": " + values);
			counter++;
		}
		fileScan.close();
	}
}