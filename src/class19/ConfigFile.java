package class19;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigFile {
    public static void main(String[] args) throws IOException {
        String path = "Files/config.properties";

        FileInputStream fileInputStream = new FileInputStream(path);

        Properties properties = new Properties();

        properties.load(fileInputStream);
        System.out.println(properties.getProperty("browser"));

    }


}
