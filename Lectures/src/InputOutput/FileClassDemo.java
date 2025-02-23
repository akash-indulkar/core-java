package InputOutput;

import java.io.File;

public class FileClassDemo {
	public static void main(String[] args) {
		File fl = new File("./src/InputOutput/Resources/Source.txt");
		System.out.println(fl.length());
		System.out.println(fl.canRead());
		System.out.println(fl.canWrite());
		System.out.println(fl.getAbsolutePath());
	}
}
