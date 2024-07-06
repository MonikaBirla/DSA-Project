package com.mycompany.mapprojectexample;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class DscSortingCh implements Comparator<Character>{
    
    TreeMap<Character, Integer> map = new TreeMap<>();
    public DscSortingCh(TreeMap<Character, Integer> map){
        this.map = map;
    }

    @Override
    public int compare(Character o1, Character o2) {
        Integer value1 = map.get(o1);
        Integer value2 = map.get(o2);
        if(value1>value2){
            return -1;
        }
        else{
            return 1;
        }
    }
    
}
