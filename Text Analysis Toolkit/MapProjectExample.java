 package com.mycompany.mapprojectexample;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapProjectExample {

    public static void main(String[] args) throws FileNotFoundException {

        String inputString = FileOperation.getInputContent("C:\\Users\\Hp\\Desktop\\files\\input List.txt");
        System.out.println(inputString);

        System.out.println("remove special symbols=====================");
        inputString = DataCleanning.removeSymbols(inputString);
        System.out.println(inputString);

        System.out.println("remove stop words==========================");
        inputString = DataCleanning.removeStopWords(inputString);
        System.out.println(inputString);

        System.out.println("word list=============================");
        ArrayList<String> wordList = User.getWordList(inputString);
        User.printWordList(wordList);

        System.out.println("unique word list=======================");
        TreeSet<String> uniqueWordList = User.getUniqueWordList(wordList);
        User.printUniqueWordList(uniqueWordList);

        System.out.println("word count========================");
        TreeMap<String, Integer> wordCount = User.getWordCount(wordList, uniqueWordList);
        User.printWordCount(wordCount);

        
        System.out.println("Asceding word List=========================");
        TreeMap<String, Integer> ascWordList = User.getAscWordList(wordCount);
        User.printAscWordList(ascWordList);

        System.out.println("Descding word List=========================");
        TreeMap<String, Integer> dscWordList = User.getDscWordList(wordCount);
        User.printAscWordList(dscWordList);
        
        System.out.println("top5 word List===================================");
        Map<String, Integer> top5 = User.getTop5wordList(wordCount);
        User.printTBWordList(top5);
        
        System.out.println("top 10 word List================================");
        Map<String, Integer> top10 = User.getTop10WordList(wordCount);
        User.printTBWordList(top10);
        
        System.out.println("bottom 5 word list=============================");
        Map<String, Integer> bottom5 = User.getBottom5WordList(wordCount);
        User.printTBWordList(bottom5);
        
        System.out.println("bottom 10 word list=============================");
        Map<String, Integer> bottom10 = User.getBottom10WordList(wordCount);
        User.printTBWordList(bottom10);
        
        System.out.println("character count==================");
        TreeMap<Character, Integer> charCount = User.getCharCount(uniqueWordList);
        User.printCharCount(charCount);
        
        System.out.println("Ascending char list===============================");
        Map<Character, Integer> ascCharList = User.getAscCharCount(charCount);
        User.printADcharCount(ascCharList);
        
        System.out.println("Dscending char list===============================");
        Map<Character, Integer> dscCharList = User.getDscCharCount(charCount);
        User.printADcharCount(dscCharList);
        
        System.out.println("top 5 char List===================================");
        Map<Character, Integer> top5Char = User.getTop5CharList(charCount);
        User.printADcharCount(top5Char);
        
        System.out.println("top 10 char List===================================");
        Map<Character, Integer> top10Char = User.getTop10CharList(charCount);
        User.printADcharCount(top10Char);
        
        System.out.println("bottom 5 char List===================================");
        Map<Character, Integer> bottom5Char = User.getBottom5CharList(charCount);
        User.printADcharCount(bottom5Char);
        
        System.out.println("bottom 10 char List===================================");
        Map<Character, Integer> bottom10Char = User.getBottom10CharList(charCount);
        User.printADcharCount(bottom10Char);
    }
}
