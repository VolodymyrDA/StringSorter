package org.vdoloka;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringSorter sorter = new StringSorter();
        List<String> inputList = Arrays.asList("apple", "banana", "grape", "avocado", "cherry");
        String exceptionPrefix = "a";
        List<String> sortedList = sorter.sortStrings(inputList, exceptionPrefix);
        System.out.println(sortedList);
    }
}