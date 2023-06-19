package tasks;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
//        ex1();
//ex2();
ex20();


    }

    public static void ex1() {
        int i=0;
        while(i<10){
            i++;
            System.out.println("Hello world");
        }
    }

    public static void ex2() {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your first number:");
        int number = scanner.nextInt();
        while(i<10){
            System.out.print(number+" ");
            i++;
        }
    }
    public static void ex3() {
        int i=0;
        Scanner scanner_for_word = new Scanner(System.in);
        System.out.println("Type how many times to print the word:");
        int number = scanner_for_word.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your word:");
        String word = scanner.nextLine();

        while(i<number){
            System.out.println(word);
            i++;
        }
    }

    public static void ex4() {
        int i=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number:");
        int number = scanner.nextInt();
        while(i<number+1){
            System.out.print(i+" ");
            i++;
        }
    }

    public static void ex5() {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();

        while(n<m+1) {
            System.out.print(n+" ");
            n++;
        }
    }
    public static void ex6() {
        int i=0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your number:");
        int number = scanner1.nextInt();

        while(i<number+1){
            if(i%2==0){
            System.out.print(i+" ");
            i++;}
            else{
                i++;
            }
        }
    }
    public static void ex7() {
        int i=0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your number:");
        int number = scanner1.nextInt();

        while(i<number+1){
            if(i%2==1){
                System.out.print(i+" ");
                i++;}
            else{
                i++;
            }
        }
    }

    public static void ex8() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();

        while(n<m+1) {
            if(n%2==0) {
                System.out.print(n+" ");
                n++;
            }
            else{
                n++;
            }
        }
    }

    public static void ex9() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();

        while(n<m+1) {
            if(n%2==1) {
                System.out.print(n+" ");
                n++;
            }
            else{
                n++;
            }
        }
    }

    public static void ex10() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();

        while(n<m+1) {
            if(n%3==0) {
                System.out.print(n+" ");
                n++;
            }
            else{
                n++;
            }
        }
    }


    public static void ex11() {
        int i=1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int number = scanner1.nextInt();
    while (i<number+1){
        if (number%i==0){
            System.out.print(i+" ");
            i++;
        }
        else {
            i++;
        }
    }
    }

    public static void ex12() {
        int i = 1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your number:");
        int number = scanner1.nextInt();
        while (number+1>i) {
            System.out.println(i+" "+i*i);
            i++;
        }
    }

    public static void ex13() {
        int i = 1;
        int sum=0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your number:");
        int number = scanner1.nextInt();
        while(i<=number){
            sum=i+sum;
            i++;
        }
        System.out.println(sum);
    }

    public static void ex14() {
        int sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();
        while(n<=m) {
            sum=n+sum;
            n++;
        }
        System.out.println(sum);
    }

    public static void ex15() {
        int sum = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();
        while(n<=m) {
            if(n%2==0){
                sum=n+sum;
                n++;
            }
            else{
                n++;
            }
        }
        System.out.println(sum);
    }

    public static void ex16() {
        int count = 0;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int n = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Type your second number:");
        int m = scanner2.nextInt();
        while(n<=m) {
            if(n%2==0){
                count++;
                n++;
            }
            else{
                n++;
            }
        }
        System.out.println(count);
    }

    public static void ex17(){
        int count=1;
        int sum=0;
        int k=1;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int number = scanner1.nextInt();
        while(count<=number){
            sum=k+sum;
            count++;
            k=k+2;
        }
        System.out.println(sum);
    }


    public static void ex18(){
        while(true){
        int count=1;
        int sum=0;
        int k=3;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your first number:");
        int number = scanner1.nextInt();
        while(count<=number){
            sum=k+sum;
            count++;
            k=k+3;
        }
        System.out.println(sum);
    }}

    public static void ex20(){
        int count = 0;

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type your number:");
        int number = scanner1.nextInt();
        while(number!=0){
            System.out.println("Type your number:");
            number = scanner1.nextInt();
            count++;
        }
        System.out.println(count);
    }
}


