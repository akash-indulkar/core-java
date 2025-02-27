package InputOutput;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {
	public static void main(String[] args) {
		FileInputStream FIS = null;
		Properties p = null;
		try {
			FIS = new FileInputStream("./src/InputOutput/Resources/application.properties");
			p = new Properties();
			p.load(FIS);
			String name = p.getProperty("name");
			String pass = p.getProperty("password");
			System.out.println(name.equals("Akash") && pass.equals("akashpassword"));
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {				
				FIS.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
