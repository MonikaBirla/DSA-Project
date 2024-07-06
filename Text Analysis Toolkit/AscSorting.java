package com.mycompany.mapprojectexample;

import java.util.Comparator;
import java.util.TreeMap;

public class AscSorting implements Comparator<String>{

TreeMap<String, Integer> map = new TreeMap<>();
    
    public AscSorting(TreeMap<String, Integer> map){
        this.map = map;
    }

    @Override
    public int compare(String o1, String o2) {
        int value1 = map.get(o1);
        int value2 = map.get(o2);
    if(value1<value2){
        return -1;
    }
    else{
        return 1;
    }
    }    
}
