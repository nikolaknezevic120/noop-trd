package zadatak_3_2;

import zadatak_3_2.datamanipulation.*;

public class App {

	public static void main(String[] args) {

	    DataManipulationCLS dataManipulationCLS = new DataManipulationCLS();
	    
    	AppClient appClient = new AppClient();
	    
    	/*
	     * URL provider
	     * */
	    System.out.println("Url provider");
        
	    dataManipulationCLS.setDataProvider(new UrlProvider());
        dataManipulationCLS.normalData(appClient.fromUrlSource, appClient.fromUrlTxt);
   	    dataManipulationCLS.compressedData(appClient.fromUrlSource, appClient.compressedPath);
   	    dataManipulationCLS.encryptedData(appClient.fromUrlSource, appClient.encodedPath);
   	    dataManipulationCLS.encryptedAndCompressedData(appClient.fromUrlSource, appClient.compressedEncodedPath);	    

	    System.out.println("\n============================================\n");

	    /*
	     * File Data Provider
	     * */
	    System.out.println("File Data Provider");

	    dataManipulationCLS.setDataProvider(new FileDataProvider());
	    dataManipulationCLS.normalData(appClient.fromFileSource, appClient.fromFileTxt);
	    dataManipulationCLS.compressedData(appClient.fromFileSource, appClient.compressedPath);
	    dataManipulationCLS.encryptedData(appClient.fromFileSource, appClient.encodedPath);
	    dataManipulationCLS.encryptedAndCompressedData(appClient.fromFileSource, appClient.compressedEncodedPath);
	    
	}
}
