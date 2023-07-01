package tasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator+"Users"+separator+"mark"+separator+"Desktop"+separator+"Prime_Source"+separator+"Test.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){ ///reading the file example #1
            System.out.println(scanner.nextLine());
        }

        scanner.close();
        System.out.println();
        //example #2

        String path2 = separator+"Users"+separator+"mark"+separator+"Desktop"+separator+"Prime_Source"+separator+"Test2.txt";
        File file2 = new File(path2);
        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        int counter = 0;
        int[] myNumbers = new int[3];
        String[] numbers = line.split(" ");
        for(String number : numbers){
            myNumbers[counter++] = Integer.parseInt(number);

        }

        System.out.println(Arrays.toString(myNumbers));
        scanner2.close();



        //
    }


}
