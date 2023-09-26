package day10LoopsErays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {


        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3



        //Kısa yoldan array


        int numbers []= {12, 3, -3, 5, 23};


        for (int      w  :  numbers
             ) {

           if (w<5)
            System.out.println(w);

        }

        System.out.println();

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz


       String names [] ={"A","B","T","K","S","K"};

   //binaryseach methodunu sort metodu kullanmadan kullanma.Sort sıralama yapar.ondan sonra binaryseach kullan.
        //aaradığın sey varsa binarysearch o aradığının indexini verir yani sırasını verir.

        Arrays.sort(names);

        int result =Arrays.binarySearch(names,"K");


        System.out.println(result);


        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        
        
        String böl [] =s.split(" ");
       
        int kelimesayi =böl.length;
        System.out.println(Arrays.toString(böl));

        System.out.println("kelimesayi = " + kelimesayi);

        System.out.println(Arrays.toString(böl));

        System.out.println();

        Scanner isim= new Scanner(System.in);
        System.out.println("Lütfen isminiz ve Soyisminizi giriniz");
        String ad=isim.next();

        System.out.println(ad);

    }
}
