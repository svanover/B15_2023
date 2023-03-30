package class19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/*
Task1:
    1) Create a file call it data.properties
    2) store some key value pairs like username=James
    password=pass123
    3) read the data from this file and print it on the console
 */
public class newProperty {
    public static void main(String[] args) throws IOException {

        String path = "Files/data.properties";

        Properties properties = new Properties();
        properties.setProperty("userName", "James");
        properties.setProperty("password", "pass123");

        FileOutputStream fileOutputStream = new FileOutputStream(path);

        properties.store(fileOutputStream, "new data");

        FileInputStream fileInputStream = new FileInputStream(path);

        properties.load(fileInputStream);
        System.out.println(properties.getProperty("userName"));
        System.out.println(properties.getProperty("password"));


    }
}
