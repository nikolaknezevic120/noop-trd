package zadatak_3_2.datamanipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlProvider implements DataProvider {

    @Override
    public String provideDataFromSource(String source) {
        try {
            URL url = new URL(source);
            System.out.println("fetching data from source");

            URLConnection conn = url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));

            String inputLine;
            StringBuilder text = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                text.append(inputLine);
            }
            br.close();
            System.out.println(text);
            return text.toString();
        } catch (Exception e) {
            throw new RuntimeException("Invalid url, or failed to open connection");
        }
    }
}
