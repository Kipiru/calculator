package javaMentor.testTask;

import javax.swing.event.AncestorEvent;
import java.util.HashMap;

public class AncientRomeCalculator {

    private static HashMap<String, Integer> romanToArabicMap = new HashMap<>();

    static {
        romanToArabicMap.put("I", 1);
        romanToArabicMap.put("II", 2);
        romanToArabicMap.put("III", 3);
        romanToArabicMap.put("IV", 4);
        romanToArabicMap.put("V", 5);
        romanToArabicMap.put("VI", 6);
        romanToArabicMap.put("VII", 7);
        romanToArabicMap.put("VIII", 8);
        romanToArabicMap.put("IX", 9);
        romanToArabicMap.put("X", 10);
    }

    private static HashMap<Integer, String> arabicToRomanMap = new HashMap<>();
    static {
        arabicToRomanMap.put(1, "I");
        arabicToRomanMap.put(2, "II");
        arabicToRomanMap.put(3, "III");
        arabicToRomanMap.put(4, "IV");
        arabicToRomanMap.put(5, "V");
        arabicToRomanMap.put(6, "VI");
        arabicToRomanMap.put(7, "VII");
        arabicToRomanMap.put(8, "VIII");
        arabicToRomanMap.put(9, "IX");
        arabicToRomanMap.put(10, "X");
    }


    static void calculate(String s1, String s2, String delimiter) throws Exception {
        Integer a;
        Integer b;
        int result;
        try {
            a = convert(s1, romanToArabicMap);
            b = convert(s2, romanToArabicMap);
        } catch (Exception e) {
            throw new Exception("Введенные данные не соответствуют условию задачи");
        }

        switch (delimiter) {
            case "\\+":
                result = a + b;
                break;
            case "\\-":
                result = a - b;
                break;
            case "\\*":
                result = a * b;
                break;
            case "\\/":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + delimiter);
        }



        if (result < 1) {
            throw new Exception("Римские числа не могут быть меньше 0");
        }
        reverseConvert(result);

    }


    private static Integer convert(String s, HashMap<String, Integer> map) throws Exception {
        if (map.get(s) == null){
            throw new Exception ("Введенные данные не соответствуют условию задачи");
        }
        return map.get(s);
    }


    private static void reverseConvert(int result) {
        String romanResult = "";
        if (result == 100) {
            romanResult = "C";
        } else if (result >= 50) {
            romanResult = "L";
            for(int i = 60; i <= result; i = i+10) {
                romanResult = romanResult + "X";
            }
            if(result%10 != 0) {
                romanResult = romanResult + arabicToRomanMap.get(result % 10);
            }
        } else if(result < 50 && result >= 10){
            for (int i = 0; i < result / 10; i++){
                romanResult = romanResult + "X";
            }
            if(result%10 != 0) {
                romanResult = romanResult + arabicToRomanMap.get(result % 10);
            }
        }
        else{
            romanResult = arabicToRomanMap.get(result%10);
        }
        System.out.println(romanResult);
    }

}
