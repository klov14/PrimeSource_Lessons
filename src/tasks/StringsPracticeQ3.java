package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringsPracticeQ3 {
    public static void main(String[] args) {
        ex26_2();

    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word:");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void ex15() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word:");
        String word = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Count: " + count);
    }

    public static void ex16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word:");
        String word = scanner.nextLine();
        int sum = 0, sum1 = 0;
        int add = 0;
        for (int i = 0; i < word.length(); i++) {

            //method 1:
            Character.isDigit(word.charAt(i));
            if (word.charAt(i) >= 49 && word.charAt(i) <= 57) {
                add = word.charAt(i) - 48;
                sum1 = sum1 + add;
            }
            //method 2:
            if (word.charAt(i) == '1') {
                sum = sum + 1;
            } else if (word.charAt(i) == '2') {
                sum = sum + 2;
            } else if (word.charAt(i) == '3') {
                sum = sum + 3;
            } else if (word.charAt(i) == '4') {
                sum = sum + 4;
            } else if (word.charAt(i) == '5') {
                sum = sum + 5;
            } else if (word.charAt(i) == '6') {
                sum = sum + 6;
            } else if (word.charAt(i) == '7') {
                sum = sum + 7;
            } else if (word.charAt(i) == '8') {
                sum = sum + 8;
            } else if (word.charAt(i) == '9') {
                sum = sum + 9;
            }

        }
        System.out.printf("Sum is " + sum + " Sum1 is " + sum1);
    }

    public static String ex17() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your word:");
        String s1 = scanner1.nextLine();
        System.out.println("Type your second word:");
        String s2 = scanner2.nextLine();
        int number = s1.length(), i = 0;
        if (s1.length() == s2.length()) {
            while (i < number) {
                if (s1.charAt(i) == s2.charAt(number - 1 - i)) {
                    i++;
                } else {
                    return "No";
                }
            }
            return "Yes";

        } else {
            return "No";
        }
    }

    public static int ex21() {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Type your 1 number:");
        int n1 = scanner1.nextInt();
        System.out.println("Type your maths operations: ");
        String command = scanner2.nextLine();
        System.out.println("Type your 2 number:");
        int n2 = scanner3.nextInt();
        if (command.equals("*")) {
            return n1 * n2;
        } else if (command.equals("+")) {
            return n1 + n2;
        } else if (command.equals("-")) {
            return n1 - n2;
        } else if (command.equals("/")) {
            return n1 / n2;
        }
        return 0;
    }

    public static void ex23() { //replace all integers with zero
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word:");
        String word = scanner.nextLine();
        StringBuilder replaced = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isDigit(c)) {
                replaced.append("0");
            } else {
                replaced.append(c);
            }
        }
        System.out.println(replaced);
    }

        public static void ex26() { //output everything between <--->
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> answers = new ArrayList<>();
            System.out.println("Type your word:");
            String word = scanner.nextLine();
            int first=0,last=0;
            StringBuilder replaced = new StringBuilder();
            while(word.indexOf('<') != -1){
                first=word.indexOf("<");
                last=word.indexOf("<");
//                answers.add(word.substring(first+1, last));
                System.out.print(word.substring(first+1, last)+" ");
                word=word.substring(last+1);
            }
        }




        public static void ex26_2(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your sentence:");
            String word = scanner.nextLine();
            int first = 0, last = 0;
            ArrayList<String> myList = new ArrayList<>();
            while(word.indexOf('<')!= 1){
                first=word.indexOf("<");
                last = word.indexOf(">");
                System.out.println(word.substring(first+1,last));
                word = word.substring(last+1);
            }
    }



    }


