package com.vaddi.java.test.allmainclasses;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestAllMainClasses {

	public static void main(String[] args) {
		String folderName = "C:\\Raghava\\Workspace\\TestJava\\src\\com\\java\\allmainclasses";

		Path folderPath = Paths.get(folderName);
		try (DirectoryStream<Path>  stream = Files.newDirectoryStream(folderPath))  {
        	for(Path path : stream) {
        		if(Files.isRegularFile(path)) {
        			System.out.println("File: "+ path.getFileName());
        			String file = path.getFileName().toString().replace(".java", "");
        	            try {
        	            	file = "com.java.allmainclasses."+file;
        	            	System.out.println("-------------------------------------------------------------------------------------");
        	            	System.out.println("Class Name ::" + file);
        	                Class<?> clazz = Class.forName(file);
        	                clazz.getMethod("main", String[].class).invoke(null, (Object) new String[]{});
        	            } catch (Exception e) {
        	                System.out.println("Could not run main method for " + file + ": " + e);
        	            }
        		} else if(Files.isDirectory(path)) {
        			System.out.println("Directory: "+ path.getFileName());
        		}
        	}
        } catch (IOException | DirectoryIteratorException e) {
        	System.err.println("Error reading directory: " + e.getMessage());
        }
	}
}
