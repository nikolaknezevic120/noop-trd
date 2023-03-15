package zadatak_3_2.datamanipulation.decorator;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import zadatak_3_2.datamanipulation.DataSource;

public class CompressorDataSource extends DataSourceDecorator {

    private int compressSize;

    public CompressorDataSource(DataSource dataSource) {
        super(dataSource);
    }

    public void writeData(String data, File file) {
        System.out.println("Starting deflation");
        System.out.println("Data before deflation");
        System.out.println(data);

        byte[] output = new byte[1024];

        Deflater compressor = new Deflater(Deflater.DEFAULT_COMPRESSION);
        compressor.setInput(data.getBytes(StandardCharsets.UTF_8));
        compressor.finish();
        compressSize = compressor.deflate(output);
        compressor.end();

        System.out.println("compressed bytes => " + compressSize);

        String compressedString = Base64.getEncoder().encodeToString(output);

        System.out.println("Data after deflation");
        System.out.println(compressedString);

        dataSource.writeData(compressedString, file);
    }

    public String readData(File file) {
        String data = dataSource.readData(file);

        System.out.println("Starting inflation");
        System.out.println("Data before inflation");
        System.out.println(data);

        byte[] output = new byte[1024];

        Inflater decompressor = new Inflater();
        decompressor.setInput(Base64.getDecoder().decode(data.getBytes(StandardCharsets.UTF_8)), 0, compressSize);
        int resultLength;
        try {
            resultLength = decompressor.inflate(output);

        } catch (DataFormatException e) {
            throw new RuntimeException(e);
        }
        decompressor.end();
        String resultString = new String(output, 0, resultLength, StandardCharsets.UTF_8);

        System.out.println("Data after inflation");
        System.out.println(resultString);
        return resultString;
    }
}
