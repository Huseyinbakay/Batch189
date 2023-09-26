package day10LoopsErays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz



        int ages [] = new int[6];

                ages [0]=25;
                ages [1]=40;
                ages [2]=8;
                ages [3]=12;
                ages [4]=32;
                ages [5]=11;

        System.out.println(Arrays.toString(ages));

        //sort metodu:arraydeki değerleri küçükten büyüğr sıralr sıralar
        //sort methodu     String ise de alfabetik sıralar



        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));

        System.out.println(ages[0]+ages[ages.length-1]);
                                 //ages[Sonuncu index]
    //2. yol

        int minimum =ages[0];


        for ( int  w  :ages
             ) {
            minimum =Math.min(minimum,w);




            System.out.println(minimum);


            int maximum=ages[0];

            maximum=Math.max(maximum,w);


            System.out.println(maximum+minimum);

        }







    }
}
