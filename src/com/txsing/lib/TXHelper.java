package com.txsing.lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 * Created by v-xinti on 2/9/2017.
 */
public class TXHelper {

    public static String IterableObjToString(Iterable<?> iterableObj, String separator)
    throws NullPointerException{
        if(iterableObj == null || separator == null){
            throw new NullPointerException();
        }

        Iterator<?> iterator = iterableObj.iterator();
        String resultString = "";
        boolean isEmpty = true;
        while(iterator.hasNext()){
            isEmpty = false;
            resultString = resultString.concat(separator.concat(iterator.next().toString()));
        }

        return isEmpty ? resultString : resultString.substring(separator.length());
    }
}
