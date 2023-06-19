package tasks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
//        System.out.println(sum(2, 3));
//        System.out.println(bigger(34,11));
//        System.out.println(between(24));
//        System.out.println(oddOrEven(1));
//        System.out.println(years(2021));
//        System.out.println(day());
//        System.out.println(addOne());
//        System.out.println(hundred());
//        System.out.println(smallest());
//        evenGreatest();
//        System.out.println(monthAndYear());
//        System.out.println(triangle());
//        System.out.println(wages(78,89,101));
//        System.out.println(tens());
//        System.out.println(sixAndTwenty(42));
//        System.out.println(ex18());
//        System.out.println(ex23());
        System.out.println(job());
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int bigger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String between(int a) {
        if (a > 10 & a < 20) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static String oddOrEven(int a) {
        if (a % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static String years(int a) {
        if (a == 2020) {
            return "Error";
        } else if (a <= 2019) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public static String day() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number:");
        int week = scanner.nextInt();
        if (week == 1) {
            return "Monday";
        } else if (week == 2) {
            return "Tuesday";
        } else if (week == 3) {
            return "Wednsday";
        } else if (week == 4) {
            return "Thurdsay";
        } else if (week == 5) {
            return "Friday";
        } else if (week == 6) {
            return "Saturday";
        } else if (week == 7) {
            return "Sunday";
        } else {
            return "none";
        }
    }

    public static int addOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number:");
        int a = scanner.nextInt();
        if (a < 100 & a > 0) {
            return a + 1;
        } else {
            return 0;
        }
    }

    public static String hundred() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();
        System.out.println("Type your second number:");
        int b = scanner.nextInt();
        if (a - b == 100 || b - a == 100) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static int largest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();
        System.out.println("Type your second number:");
        int b = scanner.nextInt();
        System.out.println("Type your third number:");
        int c = scanner.nextInt();
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int smallest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();
        System.out.println("Type your second number:");
        int b = scanner.nextInt();
        System.out.println("Type your third number:");
        int c = scanner.nextInt();
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void evenGreatest() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();
        System.out.println("Type your second number:");
        int b = scanner.nextInt();
        System.out.println("Type your third number:");
        int c = scanner.nextInt();
        System.out.println("Type your fourth number:");
        int d = scanner.nextInt();

        if (a % 2 == 0 && a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b % 2 == 0 && b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c % 2 == 0 && c > a && c > b && c > d) {
            System.out.println(c);
        } else if (d % 2 == 0 && d > a && d > b && d > c) {
            System.out.println(d);
        } else {
            System.out.println("Not found");
        }
    }

    public static String monthAndYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your month: ");
        int month = scanner.nextInt();
        System.out.println("Type your year: ");
        int year = scanner.nextInt();
        if (month < 13 && month > 0 && year > 1999) {
            return "Yes";
        } else {
            return ("No");
        }
    }

    public static String triangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();
        System.out.println("Type your second number:");
        int b = scanner.nextInt();
        System.out.println("Type your third number:");
        int c = scanner.nextInt();
        if (a * a + b * b == c * c) {
            return "Yes it is a triangle";
        } else {
            return "No it is not a triangle";
        }
    }

    public static int wages(int a, int b, int c) {
        int smallest = 0;
        int greatest = 0;
        if (a > b && a > c) {
            greatest = a;
        } else if (b > a && b > c) {
            greatest = b;
        } else if (c > a && c > b) {
            greatest = c;
        }

        if (a < b && a < c) {
            smallest = a;
        } else if (b < a && b < c) {
            smallest = b;
        } else if (c < a && c < b) {
            smallest = c;
        }
        return greatest - smallest;
    }

    public static String tens() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();
        System.out.println("Type your second number:");
        int b = scanner.nextInt();
        System.out.println("Type your third number:");
        int c = scanner.nextInt();

        if (a > 10 && a % 5 == 0 && b > 10 && b % 5 == 0 && c > 10 && c % 5 == 0) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public static int sixAndTwenty(int b) {
        if (b > 20) {
            return b / 6;
        } else {
            return b * 6;
        }
    }

    public static int ex18() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int a = scanner.nextInt();

        if (a < 0) {
            return a - 2;
        } else if (a == 0) {
            return 10;
        } else {
            return a + 1;
        }
    }


    public static String ex22() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first coordinate:");
        int a = scanner.nextInt();
        System.out.println("Type your second coordinate:");
        int b = scanner.nextInt();
        System.out.println("Type your opponents coordinate:");
        int c = scanner.nextInt();
        System.out.println("Type your opponents second coordinate:");
        int d = scanner.nextInt();
        if (a < 9 && b < 9 && c < 9 && d < 9 && (a == c || b == d)) {
            return "Yes rook can take it";
        } else {
            return "No, rook cant take it";
        }
    }

    public static double ex23() {
        final DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert amount in KZT:");
        double amount = scanner.nextDouble();
        Scanner currency = new Scanner(System.in);
        System.out.println("Choose an option from below");
        System.out.println("[1]USD]");
        System.out.println("[2]EUR]");
        System.out.println("[3]RUB]");
        int option = currency.nextInt();
        if (option == 1) {
            return Double.valueOf(df.format(amount / 420));
        } else if (option == 2) {
            return Double.valueOf(df.format(amount / 510));
        } else {
            return Double.valueOf(df.format(amount / 5.8));
        }

    }

    public static String job(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your branch:");
        System.out.println("1 - Science, 2 - Humanitarian subjects, 3 - Art, 4 - Sport:");
        int branch=scanner.nextInt();


        if (branch==1){
            System.out.println("You pressed science");
            System.out.println("Choose: 1 - Math, 2 - Physics:");
            int job=scanner.nextInt();
            if(job==1){
                return "Financier";
            }
            else if (job==2){
                return "Engineer";
            }
        }
        else if(branch==2){
            System.out.println("You pressed Humanitarian subjects");
            System.out.println("Choose: 1 - History, 2 - Foreign Languages:");
            int job=scanner.nextInt();
            if(job==1){
                return "Historic or Diplomat";
            }
            else if (job==2){
                return "Translator";
            }
        }
        else if(branch==3){
            System.out.println("You pressed Art");
            System.out.println("Choose: 1 - Drawing, 2 - Singing");
            int job=scanner.nextInt();
            if(job==1){
                return "Painter or Architect";
            }
            else if (job==2){
                return "Singer or Tamada";
            }
        }
        else if(branch==4){
            System.out.println("You pressed Sport");
            System.out.println("Choose: 1 - Team, 2 - Individual");
            int job=scanner.nextInt();
            if(job==1){
                return "Football";
            }
            else if (job==2){
                return "Box";
            }

        }
        else{
            return "None";
        }
        return null;
    }
}














