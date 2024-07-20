package com.mycompany.bs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class History {

    private static final String FILE_NAME = "C:\\Users\\Ram\\Desktop\\History.txt";
    private static History instance;
    private BufferedWriter writer;

    private History() {
        try {
            // Delete the existing file, if it exists
            Files.deleteIfExists(Paths.get(FILE_NAME));

            writer = new BufferedWriter(new FileWriter(FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized History getInstance() {
        if (instance == null) {
            instance = new History();
        }
        return instance;
    }

    public void writeTransaction(String transaction) {
        try {
            writer.write(transaction);
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeWriter() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
