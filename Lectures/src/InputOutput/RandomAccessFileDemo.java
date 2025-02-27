package InputOutput;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) {
		File consoleBackup = null;
		RandomAccessFile RAF = null; //Used to access a file randomly from any pointer
		BufferedOutputStream BOS = null;
		try {
			consoleBackup = new File("./src/InputOutput/Resources/ConsoleBackup.txt");
			RAF = new RandomAccessFile(consoleBackup, "rw");
			BOS = new BufferedOutputStream(System.out);
			RAF.seek(6); //To manipulate file pointer at desired point
			int i = 0;
			while((i = RAF.read()) != -1) {
				BOS.write(i);
				BOS.flush();
			}
			System.out.println();
//			Read the file in reverse order
			i = (int) RAF.length()-1;
			for( ; i>=0; i--) {
				RAF.seek(i);
				BOS.write(RAF.read());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				RAF.close();
				BOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
