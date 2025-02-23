package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream FIS = null;
		ObjectInputStream OIS = null;
		try {
			FIS = new FileInputStream("./src/serialization/Resources/serial.txt");
			OIS = new ObjectInputStream(FIS); //It is used to read java serializable object to from a stream
			Account acc = (Account)OIS.readObject();
			System.out.println(acc);
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			try {
				FIS.close();
				OIS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
