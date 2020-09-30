package com.example.java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String[] args) {
        Path sourceFile = Paths.get("files","plus.txt");
        Path targetFile = Paths.get("files","target.txt");

        try {
            Files.copy(sourceFile,targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("file copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
