package org.b3i.adventofcode;

import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class Day04 extends Day{
    @Override
    int solve1(String input) {
        int sum = 0;
        for (String row : input.split("\n")) {
            int a = parseInt(row.split(",")[0].split("-")[0]);
            int b = parseInt(row.split(",")[0].split("-")[1]);
            int c = parseInt(row.split(",")[1].split("-")[0]);
            int d = parseInt(row.split(",")[1].split("-")[1]);
            if (a <= c && b >= d
                    || c <= a && d >= b)
                sum++;
        }
        return sum;
    }

    @Override
    int solve2(String input) {
        int sum = 0;
        for (String row : input.split("\n")) {
            int a = parseInt(row.split(",")[0].split("-")[0]);
            int b = parseInt(row.split(",")[0].split("-")[1]);
            int c = parseInt(row.split(",")[1].split("-")[0]);
            int d = parseInt(row.split(",")[1].split("-")[1]);
            if (a <= c && b >= c
                    || a <= d && b >= d
                    || a >= c && b <= d
                    || c >= a && d <= b)
                sum++;
        }
        return sum;
    }
}
/*
..a..b..
....c...d

..a..b..
.....c...d

......a..b..
...c..d.....

.....a...b..
.c.....d

....a....b...
...c.......d




 */