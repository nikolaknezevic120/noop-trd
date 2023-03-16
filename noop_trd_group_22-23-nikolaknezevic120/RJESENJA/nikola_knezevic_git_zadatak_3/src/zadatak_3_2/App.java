package zadatak_3_2;

import zadatak_3_2.datamanipulation.*;

public class App {

	public static void main(String[] args) {

	    DataManipulationCLS dataManipulationCLS = new DataManipulationCLS();
	    
    	String fromUrlSource = ("https://www.google.com");
    	String fromFileSource = "zadatak_3_2/resources/initTxtFile.txt";
    	
    	String encodedPath = "zadatak_3_2/resources/encoded.txt";
    	String compressedPath = "zadatak_3_2/resources/compressed.txt";
    	String compressedEncodedPath = "zadatak_3_2/resources/compressed-encoded.txt";
    	
    	String fromUrlTxt = "zadatak_3_2/resources/fromUrlTxt.txt";
    	String fromFileTxt = "zadatak_3_2/resources/fromDataTxt.txt";
	    
    	/*
	     * URL provider
	     * */
	    System.out.println("Url provider");
        
	    dataManipulationCLS.setDataProvider(new UrlProvider());
        dataManipulationCLS.normalData(fromUrlSource, fromUrlTxt);
   	    dataManipulationCLS.compressedData(fromUrlSource, compressedPath);
   	    dataManipulationCLS.encryptedData(fromUrlSource, encodedPath);
   	    dataManipulationCLS.encryptedAndCompressedData(fromUrlSource,compressedEncodedPath);	    

	    System.out.println("\n============================================\n");

	    /*
	     * File Data Provider
	     * */
	    System.out.println("File Data Provider");

	    dataManipulationCLS.setDataProvider(new FileDataProvider());
	    dataManipulationCLS.normalData(fromFileSource, fromFileTxt);
	    dataManipulationCLS.compressedData(fromFileSource, compressedPath);
	    dataManipulationCLS.encryptedData(fromFileSource, encodedPath);
	    dataManipulationCLS.encryptedAndCompressedData(fromFileSource, compressedEncodedPath);
	    
	}
}
