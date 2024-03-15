package org.b3i.adventofcode;

import java.util.Arrays;

public class Day02 extends Day {
    @Override
    int solve1(String input) {
        int score = 0;
        for (String round : input.split("\n")) {
            switch (round) {
                case "A X": // rock - rock 4
                    score += 4;
                    break;
                case "A Y": // rock - paper 8
                    score += 8;
                    break;
                case "A Z": // rock - scissors 3
                    score += 3;
                    break;
                case "B X": // paper - rock 1
                    score += 1;
                    break;
                case "B Y": // paper - paper 5
                    score += 5;
                    break;
                case "B Z": // paper - scissors 9
                    score += 9;
                    break;
                case "C X": // scissors - rock 7
                    score += 7;
                    break;
                case "C Y": // scissors - paper 2
                    score += 2;
                    break;
                case "C Z": // scissors - scissors 6
                    score += 6;
                    break;
            }
        }
        return score;
    }

    @Override
    int solve2(String input) {
        int score = 0;
        for (String round : input.split("\n")) {
            switch (round) {
                case "A X": // lose 0 + scissor 3
                    score += 3;
                    break;
                case "A Y": // draw 3 + rock 1
                    score += 4;
                    break;
                case "A Z": // win 6 + paper 2
                    score += 8;
                    break;
                case "B X": // lose 0 + rock 1
                    score += 1;
                    break;
                case "B Y": // draw 3 + paper 2
                    score += 5;
                    break;
                case "B Z": // win 6 + scissors 3
                    score += 9;
                    break;
                case "C X": // lose 0 + paper 2
                    score += 2;
                    break;
                case "C Y": // draw 3 + scissors 3
                    score += 6;
                    break;
                case "C Z": // win 6 + rock 1
                    score += 7;
                    break;
            }
        }
        return score;
    }
}