package InputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToConsoleDemo {
	public static void main(String[] args) {
		File consoleBackup = null;
		FileInputStream FIS = null;
		BufferedOutputStream BOS = null;
		try {
			consoleBackup = new File("./src/InputOutput/Resources/ConsoleBackup.txt");
			FIS = new FileInputStream(consoleBackup);
			BOS = new BufferedOutputStream(System.out);
			int i = 0;
			while((i = FIS.read()) != -1) {
				BOS.write(i);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				FIS.close();
				BOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
