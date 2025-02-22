package InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo {
	public static void main(String[] args) {
		FileInputStream FIS = null; //Used to read from a file
		FileOutputStream FOS = null; //Used to write into a file
		File fl = null; //to get the file properties
		File consoleBackup = null;
		BufferedInputStream BIS = null; //used for buffered operations
		BufferedOutputStream BOS = null;
		try {
			fl = new File("./src/InputOutput/Resources/Source.txt");
			System.out.println(fl.length());
			System.out.println(fl.canRead());
			System.out.println(fl.canWrite());
			System.out.println(fl.getAbsolutePath());
//			FIS = new FileInputStream(".//src//InputOutput//Resources//Source.txt");
			FIS = new FileInputStream(fl); //we can use File object into constructor also to read or write
			FOS = new FileOutputStream(".//src//InputOutput//Resources//Destination.txt");
			int i = 0;
			while((i = FIS.read()) != -1) {
				FOS.write(i);
			}
			consoleBackup = new File("./src/InputOutput/Resources/ConsoleBackup.txt");
			FOS = new FileOutputStream(consoleBackup);
			BIS = new BufferedInputStream(System.in);
			BOS = new BufferedOutputStream(FOS);
//			BOS = new BufferedOutputStream(System.out); //To print on console
			while((i = BIS.read()) != -1) {
				BOS.write(i);
				BOS.flush();
			}
		}catch(IOException e) { //forced exception
			e.printStackTrace();
		}finally {
			try {
				FIS.close();
				FOS.close();
				BIS.close();
				BOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
