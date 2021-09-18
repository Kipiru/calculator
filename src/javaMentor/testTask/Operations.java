package javaMentor.testTask;

import java.util.regex.Pattern;

public class Operations {


    public static void add(String s) throws Exception {
        String delimiter = "\\+";
        String[] subString = delimit(s, delimiter);

        if (Pattern.matches("[1-9]|10", subString[0]) &&
                Pattern.matches("[1-9]|10", subString[1])) {
            Integer result = Integer.parseInt(subString[0]) + Integer.parseInt(subString[1]);
            String answer = "" + result;
            System.out.println(answer);
        } else {
            AncientRomeCalculator.calculate(subString[0], subString[1], delimiter);
        }

    }

    public static void deduct(String s) throws Exception {
        String delimiter = "\\-";
        String[] subString = delimit(s, delimiter);

        if (Pattern.matches("[1-9]|10", subString[0]) &&
                Pattern.matches("[1-9]|10", subString[1])) {
            Integer result = Integer.parseInt(subString[0]) - Integer.parseInt(subString[1]);
            String answer = "" + result;
            System.out.println(answer);
        } else {
            AncientRomeCalculator.calculate(subString[0], subString[1], delimiter);
        }

    }

    public static void multiply(String s) throws Exception {
        String delimiter = "\\*";
        String[] subString = delimit(s, delimiter);

        if (Pattern.matches("[1-9]|10", subString[0]) &&
                Pattern.matches("[1-9]|10", subString[1])) {
            Integer result = Integer.parseInt(subString[0]) * Integer.parseInt(subString[1]);
            String answer = "" + result;
            System.out.println(answer);
        } else {
            AncientRomeCalculator.calculate(subString[0], subString[1], delimiter);
        }

    }

    public static void divide(String s) throws Exception {
        String delimiter = "\\/";
        String[] subString = delimit(s, delimiter);

        if (Pattern.matches("[1-9]|10", subString[0]) &
                Pattern.matches("[1-9]|10", subString[1])) {
            Integer result = Integer.parseInt(subString[0]) / Integer.parseInt(subString[1]);
            String answer = "" + result;
            System.out.println(answer);
        } else {
            AncientRomeCalculator.calculate(subString[0], subString[1], delimiter);
        }

    }


    private static String[] delimit(String s, String delimiter) throws Exception {
        String[] subString = s.split(delimiter);
        if (subString.length != 2) {
            throw new Exception("Возможны операции только с двумя числами");
        }
        //  System.out.println("delimited");
        return subString;
    }





}
