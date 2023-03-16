package zadatak_3_2.datamanipulation;

import zadatak_3_2.datamanipulation.decorator.*;
import java.io.File;
import java.util.Scanner;

public class DataManipulationCLS {

    private DataProvider dataProvider;

	Scanner fileNameSc = new Scanner(System.in);

    public void setDataProvider(DataProvider dataProvider) {
        this.dataProvider = dataProvider;
        
    }

    public void normalData(String source, String path) {
        File normal = new File(path);
        DataSource textDataSource = new BaseDataSource();
        textDataSource.writeData(dataProvider.provideDataFromSource(source), normal);
        String data = textDataSource.readData(normal);
        System.out.println("result without decorator => " + data);
    }

    public void encryptedData(String source, String encodedPath) {
        File encoded = new File(encodedPath);
        DataSource encryptedDataSource = new EncoderDataSource(new BaseDataSource());
        encryptedDataSource.writeData(dataProvider.provideDataFromSource(source), encoded);
        String data = encryptedDataSource.readData(encoded);
        System.out.println("result with encryption => " + data);
    }

    public void compressedData(String source, String compressedPath){
        File compressed = new File(compressedPath);
        DataSource compressedDataSource = new CompressorDataSource(new BaseDataSource());
        compressedDataSource.writeData(dataProvider.provideDataFromSource(source), compressed);
        String data = compressedDataSource.readData(compressed);
        System.out.println("result with compress => " + data);
    }

    public void encryptedAndCompressedData(String source, String compressedEncodedPath){
        File encryptedAndEncoded = new File(compressedEncodedPath);
        DataSource encryptedAndCompressedDataSource = new EncoderDataSource(new CompressorDataSource(new BaseDataSource()));
        encryptedAndCompressedDataSource.writeData(dataProvider.provideDataFromSource(source), encryptedAndEncoded);
        String data = encryptedAndCompressedDataSource.readData(encryptedAndEncoded);
        System.out.println("result with encryption and compress => " + data);
    }


}