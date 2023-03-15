package zadatak_3_2.datamanipulation;

import java.io.File;

public interface DataSource {
    void writeData(String data, File file);
    String readData(File file);
}
