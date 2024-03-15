package org.b3i.adventofcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day03 extends Day {
    @Override
    int solve1(String input) {
        int sum = 0;
        for (String rucksack : input.split("\n")) {
            String comp1 = rucksack.substring(0, rucksack.length() / 2);
            String comp2 = rucksack.substring(rucksack.length() / 2);

            for (int i = 0; i < comp1.length(); i++) {
                char c = comp1.charAt(i);
                if (comp2.matches(String.valueOf("[a-zA-Z]*" + comp1.charAt(i) + "[a-zA-Z]*"))) {
                    if ((int) c >= 97 && (int) c <= 122) // lowercase
                        sum += (int) c - 96;
                    else if ((int) c >= 65 && (int) c <= 90) // uppercase
                        sum += (int) c - 38;
                    break;
                }
            }
        }
        return sum;
    }

    @Override
    int solve2(String input) {
        int sum = 0;
        String[] rucksacks = input.split("\n");
        for (int i = 0; i < rucksacks.length; i += 3) {
            sum += findCommonItem(rucksacks[i], rucksacks[i + 1], rucksacks[i + 2]);
        }
        return sum;
    }

    private int findCommonItem(String a, String b, String c) {
        Set<Character> set1 = convertStringToSetOfChars(a);
        Set<Character> set2 = convertStringToSetOfChars(b);
        Set<Character> set3 = convertStringToSetOfChars(c);

        set1.retainAll(set2);
        set1.retainAll(set3);

        char commonItem = set1.iterator().next();
        int p = (int) commonItem;
        if (p >= 97 && p <= 122) // lowercase
            return p - 96;
        else if (p >= 65 && p <= 90) // uppercase
            return p - 38;
        else return -1;
    }

    private Set<Character> convertStringToSetOfChars(String string) {
        Set<Character> set = new HashSet<>();
        for (char ch : string.toCharArray()) {
            set.add(ch);
        }
        return set;
    }
}