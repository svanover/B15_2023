package class19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWrite {
    public static void main(String[] args) throws IOException {;
        String path = "Files/Test.properties";

        Properties properties = new Properties();
        properties.setProperty("Pat", "Something Wrong");

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        properties.store(fileOutputStream, "Sarah talk to your aunt");



    }
}
