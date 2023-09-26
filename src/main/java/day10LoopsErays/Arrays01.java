package day10LoopsErays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int a =7;
        //array oluşturma


       //to.String methodunu kullanmazsan sana sadece adres verir.Onun için
        //sout(Arrays.toString("         ")




        //Array e eleman ekleme


        String stdNames [] =new String[5];

        stdNames [2]="Ali";
        stdNames [1]="Zafer";
        stdNames [0] = "Fatma";
        stdNames [3] ="Hasan";
        stdNames [4] ="Hüseyin";

        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[3]);


        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.


        String cities [] =new String[5];

                cities [0]="Manisa";
                cities [1]="Ankara";
                cities [2]="Trabzon";
                cities [3]="İstanbul";
                cities [4]="Hatay";


              // 1.yol

        int total = 0;

        for (int i = 0; i < cities.length; i++) {

            total=total+cities[i].length();


        }

        System.out.println(total);

    //2.yol


        int sum =0;

        for(String each:cities){

            sum= sum+each.length();



        }




        System.out.println("each = " +sum);





    }

}
