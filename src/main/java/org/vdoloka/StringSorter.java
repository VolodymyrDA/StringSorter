package org.vdoloka;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StringSorter {
    public List<String> sortStrings(List<String> unsortedStrings, String exceptionChar) {

        return Stream.concat(unsortedStrings.stream()
                                .filter(str -> !str.startsWith(exceptionChar))
                                .sorted()
                        ,
                        unsortedStrings.stream()
                                .filter(str -> str.startsWith(exceptionChar))
                                .sorted(Collections.reverseOrder())
                )
                .toList();
    }
}