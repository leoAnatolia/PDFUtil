package com.ozgur.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PDFDownloader {
	
	
	public static boolean download(String _url,String destDirectory, String destinationFilename){
		
		boolean downloadSuccessful = false;
		try{
		URL url = new URL(_url);
		InputStream in = url.openStream();
		
		
		createDownloadDirectory(destDirectory);
		
		
		Path p = Paths.get(destDirectory+"/"+destinationFilename);
		
		Files.copy(in, p, StandardCopyOption.REPLACE_EXISTING);
		in.close();
		
		downloadSuccessful = true;
		
		}catch(IOException ioe){
			
		}
		
		
		return downloadSuccessful;
	}

	private static void createDownloadDirectory(String directory) {
		File file = new File(directory);
		
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("Directory:"+directory+" is created!");
            } else {
                System.out.println("Failed to create directory:"+directory);
            }
        }
	}

}
