package zadatak_3_2.datamanipulation.decorator;

import zadatak_3_2.datamanipulation.DataSource;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncoderDataSource extends DataSourceDecorator {

    public EncoderDataSource(DataSource dataSource){
       super(dataSource);
    }

    public void writeData(String data, File file) {
        System.out.println("Performing encoding");
        System.out.println("Data before encoding");
        System.out.println(data);

        byte[] encodedByes = Base64.getEncoder().encode(data.getBytes(StandardCharsets.UTF_8));

        System.out.println("Data after encoding");
        String encodedString = new String(encodedByes);
        System.out.println(encodedString);
        dataSource.writeData(encodedString, file);
    }

    public String readData(File file) {
        String data = dataSource.readData(file);
        System.out.println("Performing decoding");
        System.out.println("Data before decoding");
        System.out.println(data);

        byte[] decodedByes = Base64.getDecoder().decode(data.getBytes(StandardCharsets.UTF_8));

        String original = new String(decodedByes);
        System.out.println("Data after decoding");
        System.out.println(original);
        return original;
    }
}