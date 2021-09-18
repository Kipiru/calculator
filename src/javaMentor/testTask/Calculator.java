package javaMentor.testTask;


import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        try {
            calculate(s.toUpperCase(Locale.ROOT));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void calculate(String s) throws Exception {
        StringBuilder sb = new StringBuilder(s.trim().replaceAll(" ","")) ;

        if (s.contains("+")){
            Operations.add(sb.toString());
        }
        else if(s.contains("-")){
            Operations.deduct(sb.toString());
        }
        else if(s.contains("*")){
            Operations.multiply(sb.toString());
        }
        else if(s.contains("/")){
            Operations.divide(sb.toString());
        }
        else{
            throw new Exception("Не выбрано действие ");
        }

    }
}
