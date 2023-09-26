package day14constructorsdatetime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime01 {

    public static void main(String[] args) {

        LocalDate simdikiZaman = LocalDate.now();//Dinamik şekilde o anın tarihini verir


        System.out.println(simdikiZaman);


        int b = simdikiZaman.getMonthValue();
        System.out.println(b);

        System.out.println(simdikiZaman.getMonth());

        System.out.println(simdikiZaman.getDayOfMonth());
        System.out.println(simdikiZaman.getDayOfWeek());

        //ileri tarihe gidebilme

        System.out.println(simdikiZaman.plusYears(2050).plusMonths(8).plusDays(7));


      //geçmişe gidebilme


        System.out.println(simdikiZaman.minusDays(4).minusMonths(9).minusYears(5));


        //Spesifik bir tarih objesi oluşturma

        LocalDate dogumGunu1=LocalDate.of(1988,9,25);

        LocalDate dogumGunu2=LocalDate.of(1989,9,28);

        boolean r1=dogumGunu1.isAfter(dogumGunu2);

        System.out.println(r1);


       boolean r2= dogumGunu1.isBefore(dogumGunu2);
        System.out.println(r2);

        boolean r3=dogumGunu1.isEqual(dogumGunu2);

        System.out.println(r3);





        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input =new Scanner(System.in);

        System.out.println("Lütfen sırasıyla yıl ay gün giriniz");

        int yil= input.nextInt();
        int ay= input.nextInt();
        int gun= input.nextInt();



        LocalDate verilenTarih=LocalDate.of(yil,ay,gun);


        if (verilenTarih.isBefore(LocalDate.now())){

            System.out.println("önceye ait zaman");


        }else{

            System.out.println("sonraya ait zaman");
        }


        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.


        System.out.println("Lütfen sırasıyla yıl ay gün giriniz");

        int y=input.nextInt();
        int a=input.nextInt();
        int g=input.nextInt();
        LocalDate date=LocalDate.of(y,a,g);
        System.out.println(date.getDayOfWeek());







    }

}