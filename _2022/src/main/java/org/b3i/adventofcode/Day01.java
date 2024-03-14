package org.b3i.adventofcode;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Integer.parseInt;

public class Day01 extends Day {
    @Override
    int solve1(String input) {
        int maxCal = 0;
        int currElfTotal = 0;

        for (String row : input.split("\n")) {
            if (row.matches("-?\\d+")) {
                currElfTotal += parseInt(row);
                if (currElfTotal > maxCal)
                    maxCal = currElfTotal;
            } else
                currElfTotal = 0;
        }
        return maxCal;
    }

    @Override
    int solve2(String input) {
        ArrayList<Integer> maxCal = new ArrayList<>();
        int currElfTotal = 0;
        for (String row : input.split("\n")) {
            if (row.matches("-?\\d+")) {
                currElfTotal += parseInt(row);
            } else {
                maxCal.add(currElfTotal);
                currElfTotal = 0;
            }
        }
        maxCal.add(currElfTotal);

        Collections.sort(maxCal);
        Collections.reverse(maxCal);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += maxCal.get(i);
        }
        return sum;
    }
}