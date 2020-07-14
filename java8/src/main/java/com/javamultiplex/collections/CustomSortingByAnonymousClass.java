package com.javamultiplex.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Rohit Agarwal on 14/07/20 8:39 pm
 * @copyright www.javamultiplex.com
 */
public class CustomSortingByAnonymousClass {

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(0);
        list.add(30);
        System.out.println("Before Sorting");
        System.out.println(list);
        System.out.println("After ascending sort");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("After descending sort");
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                 if (o1>o2){
                     return -1;
                 }else if (o1<o2){
                     return +1;
                 }else{
                     return 0;
                 }
                 //shortcut
                 //return o1>o2?-1:(o1<o2)?+1:0;
            }
        });
        System.out.println(list);
    }
}
