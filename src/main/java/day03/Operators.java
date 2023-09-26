package day03;

public class Operators {

    public static void main(String[] args) {


        int kisiSayiyisi  =   10;

        int   paraMiktar  =  25;


        System.out.println(paraMiktar/kisiSayiyisi);



        int ogrenciSayisi  =   10;
        double ucretMiktari = 25;

        System.out.println(ucretMiktari/ogrenciSayisi);


        /*
        package day03wrapperconcatenationoperators;

         public class Operators {

    public static void main(String[] args) {
        /*
          1) +,-,*,/ islemleri javada matematikte kullanildigi gibi kullanilir
          Note 1 : java da bir tamsayiyi baska bir tamsayiya bolerseniz sonuc her zaman tamsayi olur
          Note 2 : Eger sonuc tamsayi degilse java sonucun ondalik kismini iptal ederek onu int e donusturur
          Note 3 : Bir matematiksel islemde farkli data tiplerini kullanirsaniz sonuc her zaman buyuk data tipinde olur
         */
        int kisiSayisi = 10;
        double paraMiktari = 25;
        System.out.println(paraMiktari / kisiSayisi);



        /*
        2) Java da "Logical Operators" AND ve OR islemler "Logical Operator" lardir

             CAY      AND     KAHVE     SONUC
            true      &&      false     false
            false     &&      true      false
            false     &&      false     false
            true      &&      true      true

            Note : AND (&&) isleminden true alabilmek icin her sey true olmalidir
            AND islemi perfectionist tir, bir tane bile false sonucu false yapar

            CAY       OR      KAHVE     SONUC
            true      ||      false     true
            false     ||      true      true
            false     ||      false     false
            true      ||      true      true*/

            /*Note :OR (||) isleminde bir tane true sonucu true yapmak icin yeterlidir
            OR isleminde sonucun false olabilmesi icin hersey false olmalidir */



        boolean first   =  3<5;

        boolean second   = 2+3!=5;

        boolean third  =  2+3*5>19;

        System.out.println(first||third);

        System.out.println(first&&third);


        byte  age= 13;

        int ageInt  =age;


        int weight  =313;



        int num =45;

        Integer wrapperNum = num;


        Byte  k  = 14;

        byte primitiveK = k;


        boolean kahve  = 12<12;
        boolean cay    = 15<17;

        System.out.println(kahve||cay);
        System.out.println(kahve&&cay);














        {

        }






































    }
}
