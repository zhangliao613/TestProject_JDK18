package io.nio.path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {

	 public static void main(String[] args) {
		try {
			Path projects = Paths.get("d:\\data", "projects");
			Path file = Paths.get("d:\\data", "projects\\a-project\\myfile.txt");
			Path currentDir = Paths.get(".");
			
			String path = "d:\\data\\projects\\a-project\\..\\another-project";
			Path parentDir2 = Paths.get(path);
			System.out.println(parentDir2.toAbsolutePath());
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }


}