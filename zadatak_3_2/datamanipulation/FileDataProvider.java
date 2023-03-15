package zadatak_3_2.datamanipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataProvider implements DataProvider {
    @Override
    public String provideDataFromSource(String source) {

        Path filePath = Path.of(source);
        if(filePath == null){
            throw new IllegalArgumentException("Invalid source provided");
        }
        try {
            return Files.readString(filePath);
        } catch (IOException e) {
            System.out.println("Cannot find file from source");
            System.exit(0);
            return null;
        }
    }
}