package chapter02_adapter.practice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            f.readFromFile("src\\main\\java\\adapter\\practice\\file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("src\\main\\java\\adapter\\practice\\new_file.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
