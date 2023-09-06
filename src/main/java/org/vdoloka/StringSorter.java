package org.vdoloka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {
        List<String> stringStartsWithExceptionChar = new ArrayList<>();
        List<String> otherStrings = new ArrayList<>();

        for (String str : unsortedStrings) {
            if (str.startsWith(exceptionChar)) {
                stringStartsWithExceptionChar.add(str);
            } else {
                otherStrings.add(str);
            }
        }

        Collections.sort(otherStrings);
        stringStartsWithExceptionChar.sort(Collections.reverseOrder());
        otherStrings.addAll(stringStartsWithExceptionChar);

        return otherStrings;
    }
}