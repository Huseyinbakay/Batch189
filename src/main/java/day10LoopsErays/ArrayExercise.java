package day10LoopsErays;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {

        //Example: Integer array olusturunuz, icine 8 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int sayilar [] = new int[8];

        sayilar [7]=7;
        sayilar [1]=42;
        sayilar [2]=25;
        sayilar [3]=32;
        sayilar [0]=78;
        sayilar [4]=18;
        sayilar [6]=8;
        sayilar [5]=12;


        System.out.println(Arrays.toString(sayilar));
        System.out.println();
        System.out.println(sayilar[0]+sayilar[sayilar.length-1]);

          int mini=sayilar[1];
          int maxi=sayilar[1];
        for (int w:sayilar
             ) {

            int  min=Math.min(mini,w);

            System.out.println(min);
            int maximum =Math.max(maxi,w);


            System.out.println(maximum);

        }



    }
}
