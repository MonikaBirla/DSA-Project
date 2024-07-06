package com.mycompany.mapprojectexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileOperation {
public static String getInputContent(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        String str = "";
        while (sc.hasNext()) {
            str = str + sc.next() + " ";
        }
        return str;
    }

    public static ArrayList<Character> getSymbolContent(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);
        ArrayList<Character> list = new ArrayList<>();

        while (sc.hasNext()) {
            list.add(sc.next().charAt(0));
        }
        return list;
    }

    public static ArrayList<String> getStopWordsContent(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        ArrayList<String> stopWords = new ArrayList<>();
        while (sc.hasNext()) {
            stopWords.add(sc.next());
        }
        return stopWords;

    }        
}
