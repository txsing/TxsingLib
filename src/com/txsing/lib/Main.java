package com.txsing.lib;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by v-xinti on 2/9/2017.
 */
public class Main {
    public static void main(String[] args){
        List<String> lst = new LinkedList<String>(){
            {add("tian"); add("Xing");}
        };
        String test = TXHelper.IterableObjToString(lst, null);
        System.out.println(test);
    }
}
