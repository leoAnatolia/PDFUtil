package com.ozgur.utils;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestPDFDownloader {
	
	
	@Test
	public void testDownload() throws Exception {
		
		
		String destDir = "./Downloads";
		String destFile = "dest1.pdf";
		
		String url = "https://www.avivasa.com.tr/i/Assets/pdf/455_GRUP_HAYAT_GRUPKAZA_TEDAVI_MASRAF_01012014.pdf";
		assertTrue(PDFDownloader.download(url, destDir,destFile));
		
		
	}

}
