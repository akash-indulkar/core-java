package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFileDemo {
	public static void main(String[] args) {
		FileInputStream FIS = null; //Used to read from a file
		FileOutputStream FOS = null; //Used to write into a file
		try {
			FIS = new FileInputStream(".//src//InputOutput//Resources//Source.txt");
			FOS = new FileOutputStream(".//src//InputOutput//Resources//Destination.txt");
			int i = 0;
			while((i = FIS.read()) != -1) {
				FOS.write(i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {				
				FIS.close();
				FOS.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
