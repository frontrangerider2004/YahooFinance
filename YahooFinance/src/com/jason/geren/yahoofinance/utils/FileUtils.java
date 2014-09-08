package com.jason.geren.yahoofinance.utils;

import java.io.File;
import java.io.IOException;


public class FileUtils {
	private static final String FILENAME_SEPARATOR = "_";
	private static final String FILE_EXTENSION_SEPARATOR = ".";
	private StringBuilder fileStringBuilder;
		
	/**
	 * 
	 * @param relativeDirPath
	 * @param filename
	 * @return a String containing the time-stamped filename with extension
	 * and relative path.
	 */
	private String buildFilename(String relativeDirPath, String filename, String fileExtension) {
		fileStringBuilder = new StringBuilder();
		
		String timeStamp = String.valueOf(System.currentTimeMillis());
		fileStringBuilder.append(relativeDirPath);
		fileStringBuilder.append(filename);
		fileStringBuilder.append(FILENAME_SEPARATOR);
		fileStringBuilder.append(timeStamp);
		fileStringBuilder.append(FILE_EXTENSION_SEPARATOR);
		fileStringBuilder.append(fileExtension);
		
		System.out.println("buildFilename(): fileFullname=" + fileStringBuilder.toString());
		return fileStringBuilder.toString();
	}
	
	/**
	 * createDirectory()
	 * @param directory
	 * @return TRUE if the directory was created successfully or 
	 * already exists.
	 */
	private Boolean createDirectory(File directory) {
		if(directory == null) {
			System.out.println("createDirectory(): Unable to create directory: null was provided.");
			return false;
		}
		
		if(!directory.canWrite()) {
			System.out.println("createDirectory(): Unable to create directory: " + directory.getName());
			return false;
		}
		
		if(!directory.exists()) {
			return directory.mkdirs();
		}
		
		System.out.println("createDirectory(): successfully created directory or directory exists: " + directory.getName());
		return true;
	}
	
	/**
	 * createFile()
	 * @param file
	 * @return TRUE if the containing directory and file were successfully created
	 */
	public Boolean createFile(File file) {
		if(file == null) {
			System.out.println("createFile(): Unable to create file: null was provided.");
			return false;
		}
		
		if(createDirectory(new File(file.getParent()))) {
			try {
				return file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("createFile(): Unable to create file for unknown reason.");
		return false;
	}
	
	/**
	 * createFile()
	 * @param dirName
	 * @param filename
	 * @param extension - the filetype extension to use. The "." dot will be appended 
	 * automatically.
	 * @return TRUE if the containing directory and file were successfully created
	 */
	public File createFile(String dirName, String filename, String extension) {
		if(dirName == null || filename == null) {
			System.out.println("createFile(): Unable to create file: null value provided.");
			return null;
		}
		
		//Fix the extension supplied if given with a dot
		if(extension.startsWith(FILE_EXTENSION_SEPARATOR)) {
			extension = extension.substring(1);
		}
		
		//Create the file object that we will return if successful
		File file = new File(buildFilename(dirName, filename, extension));
		
		if(createDirectory(new File(file.getParent()))) {
			try {
				if(file.createNewFile()) {
					return file;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("createFile(): Unable to create file for unknown reason.");
		return null;
	}
} // End Class
