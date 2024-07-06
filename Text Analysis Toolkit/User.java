package com.mycompany.mapprojectexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class User {

    public static ArrayList<String> getWordList(String inputString) {
        ArrayList<String> list = new ArrayList<>();
        String str[] = inputString.split(" ");
        for (String s : str) {
            list.add(s);
        }
        return list;
    }

    public static void printWordList(ArrayList<String> wordList) {
        for (String string : wordList) {
            System.out.println(string);
        }
    }

    public static TreeSet<String> getUniqueWordList(ArrayList<String> inputString) {
        return new TreeSet<String>(inputString);
    }

    public static void printUniqueWordList(TreeSet<String> uniqueList) {
        for (String s : uniqueList) {
            System.out.println(s);
        }
    }

    public static TreeMap<String, Integer> getWordCount(ArrayList<String> wordList, TreeSet<String> uniqueList) {
        TreeMap<String, Integer> map = new TreeMap<>();
        for (String st : uniqueList) {
            int count = Collections.frequency(wordList, st);
            map.put(st, count);

        }
        return map;
    }

    public static void printWordCount(TreeMap<String, Integer> input) {
        for (Map.Entry m : input.entrySet()) {
            System.out.println(m);
        }
    }

    

    public static TreeMap<String, Integer> getAscWordList(TreeMap<String, Integer> wordCount) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.putAll(wordCount);

        Comparator<String> sorting = new AscSorting(map);
        TreeMap<String, Integer> sortedMap = new TreeMap<>(sorting);
        sortedMap.putAll(map);

        return sortedMap;
    }
    public static void printAscWordList(TreeMap<String, Integer> sortedMap){
        for(Map.Entry string : sortedMap.entrySet()){
            System.out.println(string);
        }
    }
        public static TreeMap<String, Integer> getDscWordList(TreeMap<String, Integer> wordCount){
            TreeMap<String, Integer> map = new TreeMap<>();
            map.putAll(wordCount);
            Comparator<String> sorting = new DscSorting(map);
            TreeMap<String, Integer> sortedMap = new TreeMap<>(sorting);
            sortedMap.putAll(map);
            return sortedMap;
        }
        
        public static Map<String, Integer> getTop5wordList(TreeMap<String, Integer> wordCount){
            Map<String, Integer> newWordCount = getDscWordList(wordCount);
            Map<String, Integer> top5 = new LinkedHashMap<>();
            
            int index = 0;
            Set<Entry<String, Integer>> en = newWordCount.entrySet();
            Iterator<Entry<String, Integer>> it = en.iterator();
            while(index<5){
                Entry<String, Integer> entry = it.next();
                top5.put(entry.getKey(), entry.getValue());
                index++;
            }
            return top5;
        }
        
        public static void printTBWordList(Map<String, Integer> top5){
            for(Map.Entry map : top5.entrySet()){
                System.out.println(map.getKey()+" "+ map.getValue());
            }
        }
        
        public static Map<String, Integer> getTop10WordList(TreeMap<String, Integer> wordCount){
            Map<String, Integer> newWordCount = getDscWordList(wordCount);
            Map<String, Integer> top10 = new LinkedHashMap<>();
            int index = 0;
            
            Set<Entry<String, Integer>> en = newWordCount.entrySet();
            Iterator<Entry<String, Integer>> it = en.iterator();
            while(index<10){
                Entry<String, Integer> entry = it.next();
                top10.put(entry.getKey(), entry.getValue());
                index++;
            }
            return top10;
        }
        
        public static Map<String, Integer> getBottom5WordList(TreeMap<String, Integer> wordCount){
            Map<String, Integer> newWordList = getAscWordList(wordCount);
            Map<String, Integer> bottom5 = new LinkedHashMap<>();
            
            int index = 0;
            Set<Entry<String, Integer>> en = newWordList.entrySet();
            Iterator<Entry<String, Integer>> it = en.iterator();
            while(index<5){
                Entry<String, Integer> entry = it.next();
                bottom5.put(entry.getKey(), entry.getValue());
                index++;
            }
            return bottom5;
        }
            public static Map<String, Integer> getBottom10WordList(TreeMap<String, Integer> wordCount){
            Map<String, Integer> newWordList = getAscWordList(wordCount);
            Map<String, Integer> bottom10 = new LinkedHashMap<>();
            
            int index = 0;
            Set<Entry<String, Integer>> en = newWordList.entrySet();
            Iterator<Entry<String, Integer>> it = en.iterator();
            while(index<10){
                Entry<String, Integer> entry = it.next();
                bottom10.put(entry.getKey(), entry.getValue());
                index++;
            }
            return bottom10;
        }
            
            public static TreeMap<Character, Integer> getCharCount(TreeSet<String> uniqueList) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String string = " ";
        for (String s : uniqueList) {
            string = string + s + " ";
        }

        char charList[] = string.toCharArray();

        ArrayList<Character> list = new ArrayList<>();
        for (char c : charList) {
            list.add(c);
        }
        TreeSet<Character> set = new TreeSet<>(list);

        for (char ch : set) {
            int count = Collections.frequency(list, ch);
            map.put(ch, count);
        }
        return map;
    }

    public static void printCharCount(TreeMap<Character, Integer> inputString) {
        for (Map.Entry m : inputString.entrySet()) {
            System.out.println(m);
        }
    }
    
    public static Map<Character, Integer> getAscCharCount(TreeMap<Character, Integer> charCount){
        TreeMap<Character, Integer> map = new TreeMap<>();
        map.putAll(charCount);
        
        Comparator<Character> sorting = new AscSortingCh(map);
        TreeMap<Character, Integer> sortedMap = new TreeMap<>(sorting);
        sortedMap.putAll(map);
        return sortedMap;
    }
    
    public static void printADcharCount(Map<Character, Integer> sortedMap){
        for(Map.Entry m: sortedMap.entrySet()){
            System.out.println(m.getKey() +" "+m.getValue());
        }
    }
    public static Map<Character, Integer> getDscCharCount(TreeMap<Character, Integer> charCount){
        TreeMap<Character, Integer> map = new TreeMap<>();
        map.putAll(charCount);
        
        Comparator<Character> sorting = new DscSortingCh(map);
        TreeMap<Character, Integer> sortedMap = new TreeMap<>(sorting);
        sortedMap.putAll(map);
        return sortedMap;
    }
    
    public static Map<Character, Integer> getTop5CharList(TreeMap<Character, Integer> charCount){
         Map<Character, Integer> newCharList = getDscCharCount(charCount);
         Map<Character, Integer> top5 = new LinkedHashMap<>();
         
         int index = 0;
         Set<Entry<Character, Integer>> en = newCharList.entrySet();
         Iterator<Entry<Character, Integer>> it = en.iterator();
         while(index<5){
             Entry<Character, Integer> entry = it.next();
             top5.put(entry.getKey(), entry.getValue());
             index++;
         }
         return top5; 
    }
    
    public static Map<Character, Integer> getTop10CharList(TreeMap<Character, Integer> charCount){
         Map<Character, Integer> newCharList = getDscCharCount(charCount);
         Map<Character, Integer> top10 = new LinkedHashMap<>();
         
         int index = 0;
         Set<Entry<Character, Integer>> en = newCharList.entrySet();
         Iterator<Entry<Character, Integer>> it = en.iterator();
         while(index<10){
             Entry<Character, Integer> entry = it.next();
             top10.put(entry.getKey(), entry.getValue());
             index++;
         }
         return top10; 
    }
    
     public static Map<Character, Integer> getBottom5CharList(TreeMap<Character, Integer> charCount){
         Map<Character, Integer> newCharList = getAscCharCount(charCount);
         Map<Character, Integer> bottom5 = new LinkedHashMap<>();
         
         int index = 0;
         Set<Entry<Character, Integer>> en = newCharList.entrySet();
         Iterator<Entry<Character, Integer>> it = en.iterator();
         while(index<5){
             Entry<Character, Integer> entry = it.next();
             bottom5.put(entry.getKey(), entry.getValue());
             index++;
         }
         return bottom5; 
    }
     
     public static Map<Character, Integer> getBottom10CharList(TreeMap<Character, Integer> charCount){
         Map<Character, Integer> newCharList = getAscCharCount(charCount);
         Map<Character, Integer> bottom10 = new LinkedHashMap();
         
         int index = 0;
         Set<Entry<Character, Integer>> en = newCharList.entrySet();
         Iterator<Entry<Character, Integer>> it = en.iterator();
         while(index<10){
             Entry<Character, Integer> entry = it.next();
             bottom10.put(entry.getKey(), entry.getValue());
             index++;
         }
         return bottom10; 
    }
}
    

