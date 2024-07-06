package com.mycompany.mapprojectexample;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DataCleanning {
public static String removeSymbols(String inputString) throws FileNotFoundException {
        ArrayList<Character> inputList = new ArrayList<>();
        String string = inputString.toLowerCase();
        char inputChar[] = string.toCharArray();
        for (char ch : inputChar) {
            inputList.add(ch);
        }

        ArrayList<Character> SymbolList = FileOperation.getSymbolContent("C:\\Users\\Hp\\Desktop\\files\\special symbol.txt");
        inputList.removeAll(SymbolList);

        String stringInput = "";
        for (char c : inputList) {
            stringInput = stringInput + c;
        }
        return stringInput;
    }

    public static String removeStopWords(String inputString) throws FileNotFoundException {
        ArrayList<String> inputList = new ArrayList<>();
        String string = inputString.toLowerCase();

        String s[] = string.split(" ");

        for (String str : s) {
            inputList.add(str);
        }

        ArrayList<String> stopWords = FileOperation.getStopWordsContent("C:\\Users\\Hp\\Desktop\\files\\stop words.txt");
        inputList.removeAll(stopWords);

        String str = "";
        for (String st : inputList) {
            str = str + st + " ";
        }
        return str;
    }        
}
