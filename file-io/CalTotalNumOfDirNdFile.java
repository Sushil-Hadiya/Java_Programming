package random;

import java.io.File;

public class CalTotalNumOfDirNdFile {

	static void getFile(String dirPath) {
		File f = new File(dirPath);
		File[] files = f.listFiles();
		int file = 0;
		int dir = 0;
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile()) {
					file++;
				} else {
					dir++;
				}
				if (files[i].isDirectory()) {
					getFile(files[i].getAbsolutePath());
				}
			}
		}
		System.out.println(f.getAbsolutePath()+"-------->Total Dir is : "+dir +" and Files are : "+file);
	}

	public static void main(String[] args) {
		System.out.println("Total files and folder in each directory...");
		String path = "D:\\Sushil";
		getFile(path);
	}
}
