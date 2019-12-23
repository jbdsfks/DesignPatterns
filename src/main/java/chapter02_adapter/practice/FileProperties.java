package chapter02_adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO {

    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    public void writeToFile(String filename) throws IOException {
        String s = "written by FileProperties";
        store(new FileOutputStream(filename), s);
    }

    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    public String getValue(String key) {
        return getProperty(key);
    }
}
