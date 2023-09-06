package org.vdoloka;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StringSorterTest {

    @Test
    void testSortStrings() {
        List<String> unsortedStrings = Arrays.asList("apple", "banana", "grape", "avocado", "cherry");
        String exceptionChar = "a";
        List<String> expected = Arrays.asList("banana", "cherry", "grape", "avocado", "apple");
        StringSorter sorter = new StringSorter();

        List<String> sortedStrings = sorter.sortStrings(unsortedStrings, exceptionChar);

        assertThat(sortedStrings).isEqualTo(expected);
    }
}