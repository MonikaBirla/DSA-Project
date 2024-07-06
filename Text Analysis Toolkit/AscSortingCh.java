package com.mycompany.mapprojectexample;

import java.util.Comparator;
import java.util.TreeMap;

public class AscSortingCh implements Comparator<Character>{
    
    TreeMap<Character, Integer> map = new TreeMap<>();
    
    public AscSortingCh(TreeMap<Character, Integer> map){
         this.map = map;
    }

    @Override
    public int compare(Character o1, Character o2) {
     int value1 = map.get(o1);
     int value2 = map.get(o2);
     if(value1<value2){
         return -1;
     }
     return 1;
    }
    
}
