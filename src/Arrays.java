import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for(int i = 0;i<numbers.length; i++){
            numbers[i]=i*10;
            System.out.println(numbers[i]);
        }
        int[] array2 = {1,2,3};
        int sum=0;
        for(int x:array2){
            sum=sum+x;
        }
        System.out.println("Sum is "+sum);
        System.out.println(array2[2]);
        String[] strings = new String[3];
        for(String string:strings){
            System.out.println(string);
        }
        //Multidimensional Arrays
        int[][] matrie = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(matrie[2][2]);
        for(int i=0;i<matrie.length; i++){
            for(int j=0;j< matrie.length;j++){
                System.out.println(matrie[i][j]+" ");
            }
        }

        String[][] strings_multi = new String[2][3];
        strings_multi[0][1]="hello";
        System.out.println(strings_multi[0][1]);
    }

}
