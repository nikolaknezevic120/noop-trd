package zadatak_3_2.datamanipulation;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class BaseDataSource implements DataSource {

    @Override
    public void writeData(String data, File file) {
        System.out.println("writing data");

        try {
            Files.writeString(file.toPath(), data, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong with file saving");
        }
    }

    @Override
    public String readData(File file) {
        System.out.println("Reading data from file");

        try {
            return Files.readString(file.toPath());
        } catch (IOException e) {
            throw new RuntimeException("Something went wrong with file reading");
        }
    }
}