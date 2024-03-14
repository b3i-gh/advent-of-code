package org.b3i.adventofcode;
import java.io.*;


public class AOCSolver {


    public static void main(String[] args) throws IOException {
        String input = readInput(args);
        Day day = (Day) initDayObject(args[0]);
        System.out.println(day.solve1(input));
        System.out.println(day.solve2(input));
    }

    private static String readInput(String[] args) throws IOException {
        String day = args[0];
        boolean isTest = args.length == 2 && args[1].equals("test");
        StringBuffer input = new StringBuffer();

        File file = new File("src/main/resources/input/" + (isTest ? "test.txt" : day + ".txt"));
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            input.append(line + "\n");
        }
        br.close();
        return input.toString();
    }

    private static Object initDayObject(String dayNumber) {
        String className = "Day" + dayNumber;
        try {
            Class c = Class.forName("org.b3i.adventofcode." + className);
            return c.newInstance();
            // Now you have an instance of the appropriate Day class
            // You can use dayObject as needed
        } catch (ReflectiveOperationException e) {
            System.out.println("Error: Could not create instance for " + className);
            e.printStackTrace();
        }
        return null;
    }
}