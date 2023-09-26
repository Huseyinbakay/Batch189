package day10LoopsErays;

import java.util.Arrays;

public class BinarySearchExercise {
    public static void main(String[] args) {


        int [] a ={20,45,7,63,45,13};

        int min=a[2];
        int max=a[2];
        for (int w:a) {

            min=Math.min(min,w);
            max=Math.max(max,w);

        }
        System.out.println(max);
        System.out.println(min);
        System.out.println();
        System.out.println(max+min);

        int array []={12,60,45,32,8,79,36,85};

        Arrays.sort(array);

        for (int w:array
             ) {

           if(w>58)
            System.out.println(w);



        }


        String harf [] = {"T","R","K","G","S","F"};

Arrays.sort(harf);

        System.out.println(Arrays.toString(harf));

     int varMi=Arrays.binarySearch(harf,"J");
        System.out.println(varMi);


     int varMiE=Arrays.binarySearch(harf,"E");

        System.out.println("varMiE = " + varMiE);








    }
}
