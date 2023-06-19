
package tasks;

import java.util.Scanner;

public class Arrays_BitLab {
    public static void main(String[] args) {
//        System.out.println(ex1(7));
        ex30();
    }

    public static int ex1(int a) {
        int[] nums = {6, 19, 26, 9, 46, 8, 5, 65, 90, 25};
        return nums[a];
    }

    public static void ex2() {
        int[] array1 = {1, 2, 3, 4, 5, 67, 8, 77, 9, 10};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

    }

    public static void ex3() {
        int[] array1 = {1, 2, 3, 4, 5, 67, 8, 77, 9, 10};
        for (int i = 0; i < array1.length; i++) {
            System.out.println(i + " - " + array1[i]);
        }
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner.nextInt();

            array[i] = element;
        }
        System.out.print("Your array: ");

        for (int i = 0; i < number; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + " ");

            }
        }
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner.nextInt();
            array[i] = element;
        }
        System.out.print("Your array: ");
        int i = 0;
        while (i < number) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        }
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner.nextInt();
            array[i] = element;
        }
        int j = 0;
        while (j < number) {
            System.out.println(array[j] + " - " + Math.pow(array[j], 2));
            j++;
        }
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner.nextInt();
            array[i] = element;
        }
        int j = 0;
        while (j < number) {
            System.out.print(array[j] + " ");
            j += 2;
        }
    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner.nextInt();
            array[i] = element;
        }
        int j = 1;
        while (j < number) {
            System.out.print(array[j] + " ");
            j += 2;
        }
    }

    public static void ex9() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner1.nextInt();
            array[i] = element;
        }
        int j = 0;
        int count = 0;
        while (j < number) {
            if (array[j] > 0) {
                count++;
            }
            j++;
        }
        System.out.println(count);
    }

    public static void ex11() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner1.nextInt();
            array[i] = element;
        }
        int j = 0;
        int sum = 0;
        while (j < number) {
            if (array[j] > 0) {
                sum = sum + array[j];
            }
            j++;
        }

        System.out.println("Sum is: " + sum);
        System.out.println("Mean is: " + sum / number);
    }


    public static void ex12() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner1.nextInt();
            array[i] = element;
        }
        int j = 0;
        int sum = 0;
        while (j < number) {
            if (array[j] > 0 && j % 2 == 0) {
                sum = sum + array[j];
            }
            j++;
        }
        System.out.println(sum / number);
    }

    public static void ex13() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner1.nextInt();
            array[i] = element;
        }
        int count = 0;
        int j = 0;
        float sum = 0;
        while (j < number) {
            if (array[j] < 0) {
                sum = sum + array[j];
                count++;
            }
            j++;
        }
        float mean = sum / count;
        System.out.println(mean);
    }


    public static void ex30() {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Type how many elements in the array:");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Type you array element:");
            int element = scanner1.nextInt();
            array[i] = element;
        }

        boolean positive1 = false, negative1 = false, no = false, positive2 = false, negative2 = false;
        if (array[0] > 0) {//start with positive
            for (int k = 0; k < number; k += 2) {
                if (array[k] > 0) {
                    positive1 = true;
                } else {
                    no = true;
                    break;
                }
            }
            for (int k = 1; k < number; k += 2) {
                if (array[k] < 0) {
                    negative1 = true;
                } else {
                    no = true;
                    break;
                }
            }
            if (positive1 == true && negative1 && !no) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {//start with negative
            for (int k = 0; k < number; k += 2) {
                if (array[k] < 0) {
                    positive2 = true;
                } else {
                    no = true;
                    break;
                }
            }
            for (int k = 1; k < number; k += 2) {
                if (array[k] > 0) {
                    negative2 = true;
                } else {
                    no = true;
                    break;
                }
            }
            if (positive2 && negative2 && !no) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

        /*for(int i=0;i<number;i+=2){
            if(array[i]>0){
                positive1=true;
            }
            else if(array[i]<0){
                negative1=true;
            }
            else{
                no=true;
            }
           }
            for(int i=1;i<number;i+=2){
                if(array[i]>0){
                    positive2=true;
                }
                else if(array[i]<0){
                    negative2=true;
                }
                else{
                    no=true;
                }

            }
        if((positive1==negative2 && !no)
                || positive2==negative1 && !no) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }*/

    public static void ex27() {

    }
}




