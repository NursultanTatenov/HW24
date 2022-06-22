package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer>set1=new HashSet<>(List.of(1,2,3,4,5,6,7));
        Set<Integer>set2=new HashSet<>(List.of(0,2,4,6,8,10));

        symmetricDifference(set1,set2).forEach(System.out::println);

    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){

        Set<Integer>differenceSet=new HashSet<>(set1);

        differenceSet.removeAll(set2);
        set2.removeAll(set1);
        differenceSet.addAll(set2);

        return differenceSet;
    }
}
