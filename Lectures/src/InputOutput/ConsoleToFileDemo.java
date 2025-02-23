package InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleToFileDemo {
	public static void main(String[] args) {
		File consoleBackup = null;
		FileOutputStream FOS = null;
		BufferedInputStream BIS = null; //used for buffered operations
		BufferedOutputStream BOS = null;
		try {
			consoleBackup = new File("./src/InputOutput/Resources/ConsoleBackup.txt");
			FOS = new FileOutputStream(consoleBackup);
			BIS = new BufferedInputStream(System.in);
			BOS = new BufferedOutputStream(FOS);
			int i = 0;
			while((i = BIS.read()) != -1) {
				BOS.write(i);
				BOS.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				FOS.close();
				BIS.close();
				BOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
