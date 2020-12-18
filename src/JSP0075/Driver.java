/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSP0075;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LONG
 */
public class Driver {

    

    private static void getAllFileNameJavaInDirectory() {
        ArrayList<String> listFileName = new ArrayList<>();
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].getName().endsWith(".java")) {
                    listFileName.add(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
        System.out.println("Result " + listFileName.size() + " file!");
        for (int i = 0; i < listFileName.size(); i++) {
            System.out.println(listFileName.get(i));
        }
    }

    private static void getFileWithSizeGreaterThanInput() {
        System.out.print("Enter size: ");
        int size = Validation.checkInputInt();
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();

        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            File[] listFile = file.listFiles();
            for (int i = 0; i < listFile.length; i++) {
                if (listFile[i].isFile() && listFile[i].length() > size) {
                    System.out.println(listFile[i].getName());
                }
            }
        } else {
            System.out.println("Path doesn't exist");
            return;
        }
    }

    private static void appendContentToFile() throws IOException {
        System.out.print("Enter content: ");
        String content = Validation.checkInputString();
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(content);
            writer.close();
            System.out.println("Write done");
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    private static void countCharacter() throws FileNotFoundException, IOException {
        System.out.print("Enter path: ");
        String path = Validation.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            int count = 0;
            while (line != null) {
                String[] parts = line.split(" ");
                for (String w : parts) {
                    count++;
                }
                line = reader.readLine();
            }
            System.out.println("Total: " + count);
        } else {
            System.out.println("Path doesn't exist");
        }
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            int choice = Management.Menu();
            switch (choice) {
                case 1:
                    Validation.checkPath();
                    break;
                case 2:
                    getAllFileNameJavaInDirectory();
                    break;
                case 3:
                    getFileWithSizeGreaterThanInput();
                    break;
                case 4:
                    appendContentToFile();
                    break;
                case 5:
                    countCharacter();
                    break;
                case 6:
                    return;
            }
        }
    }
}
