package InputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class ConsoleToConsoleDemo {
	public static void main(String[] args) {
		BufferedInputStream BIS = null; //used for buffered operations
		BufferedOutputStream BOS = null;
		try {
			BIS = new BufferedInputStream(System.in);
			BOS = new BufferedOutputStream(System.out); //To print on console
			int i = 0;
			while((i = BIS.read()) != -1) {
				BOS.write(i);
				BOS.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				BIS.close();
				BOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
