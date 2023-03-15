package zadatak_3_2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import zadatak_3_2.datamanipulation.*;

public class App {

	public static void main(String[] args) {

		Scanner userInputSc = new Scanner(System.in);

	    DataManipulationCLS dataManipulationCLS = new DataManipulationCLS();
	    /*
	     * URL provider
	     * */
	    System.out.println("Url provider");
	    
    	String fromUrlSource = ("https://www.google.com");
    	String fromFileSource = "zadatak_3_2/resources/initTxtFile.txt";
    	
    	String fromUrlTxt = "zadatak_3_2/resources/fromUrlTxt.txt";
    	String fromFileTxt = "zadatak_3_2/resources/fromDataTxt.txt";
	    
    	try {
            new URL(fromUrlSource);
            
            dataManipulationCLS.setDataProvider(new UrlProvider());
    	    dataManipulationCLS.normalData(fromUrlSource, fromUrlTxt);
    	    dataManipulationCLS.compressedData(fromUrlSource);
    	    dataManipulationCLS.encryptedData(fromUrlSource);
    	    dataManipulationCLS.encryptedAndCompressedData(fromUrlSource);
    	    
        } catch (MalformedURLException e) {
        	System.out.println("Invalid url");
        }
	    

	    System.out.println("\n============================================\n");

	    /*
	     * File Data Provider
	     * */
	    System.out.println("File Data Provider");

	    dataManipulationCLS.setDataProvider(new FileDataProvider());
	    dataManipulationCLS.normalData(fromFileSource, fromFileTxt);
	    dataManipulationCLS.compressedData(fromFileSource);
	    dataManipulationCLS.encryptedData(fromFileSource);
	    dataManipulationCLS.encryptedAndCompressedData(fromFileSource);
	    
	    userInputSc.close();

	}
}
