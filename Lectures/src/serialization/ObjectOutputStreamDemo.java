package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream FOS = null;
		ObjectOutputStream OOS = null;
		try {
			FOS = new FileOutputStream("./src/serialization/Resources/serial.txt");
			OOS = new ObjectOutputStream(FOS); //It is used to write java serializable object to a stream
			Account acc = new Account("Savings", 65984.64f);
			OOS.writeObject(acc);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				FOS.close();
				OOS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
