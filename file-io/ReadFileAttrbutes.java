package random;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;

public class ReadFileAttrbutes {

	static String getFileExtention(File file) {
		String fileName = file.getName();
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		} else {
			return "It's Directory :)";
		}
	}

	static void readFileAttr(String dir, String file) {
		Path path = FileSystems.getDefault().getPath(dir, file);
		BasicFileAttributeView basicView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
		try {
			System.out.println(basicView.readAttributes().lastAccessTime());
			System.out.println(basicView.readAttributes().creationTime());
			System.out.println(basicView.readAttributes().lastModifiedTime());
			System.out.println(basicView.readAttributes().size() / 1000 + "KB");
			System.out.println(basicView.readAttributes().isDirectory());
			System.out.println(basicView.readAttributes().isRegularFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter path of the file");
		String path = "C:\\Users\\lenovo\\Desktop";
		String file = "sql.txt";
		readFileAttr(path, file);
		File newFile = new File("C:\\Users\\lenovo\\Desktop\\sql.txt");
		String type = getFileExtention(newFile);
		System.out.println("File Type is ." + type);
	}
}
