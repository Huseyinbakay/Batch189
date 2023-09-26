package day26;

import java.util.stream.IntStream;

public class Lambda03 {



   /* Distinct  :Tekrarsız
    Reduce    :Çoklu datanın teke indirilmesi(azaltılması)
    Sorted     :Küçükten büyüğe sıralar.
      RevoredOrder :Tersten sıralama yapar yani;büyükten küçüğe
    Collect     :Topla demek.
    Comparator  :Karşılaştırır ve sıralar(renkleri,uzunlukları)
    RemoveIf    :Belli kurala uyuyorsa sil demek.
            IntStream   :Tüm integerları stream formatında verir.Tam sayılardan oluşan aralık verir.
            Range       :Başlangıç dahil, bitiş hariç
    RangeClosed :Çoku teke redution yapmak. Seçim yapmak.
    LongSream   :Uzunlukları verir.
    GetAsInt    :Int gibi demek.
:pray:
            4

*/


    public static void main(String[] args) {

        System.out.println(getSumFromSevenToSeventy());


        System.out.println(getMultiFromThreeToNine());


        System.out.println(getFactorial(-5));

        System.out.println(getDSumOfEvensBetweenToInteger(3, 9));

    }


    public static int getSumFromSevenToSeventy(){

      return   IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();

    }


    //5)3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.


    public static int getMultiFromThreeToNine(){


        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }



    public static int getMultiFromThreeToNine2(){


        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }

    //6)Size verilen sayinin faktoryelini hesaplayan kodu yaziniz.



 public static int getFactorial(int x){

        if (x==0){

            return 1;

        } else if (x<0) {
            System.out.println("Factorial negative sayılarla çalışmaz");
            return -1;
        }

     return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();


 }



public static int getDSumOfEvensBetweenToInteger(int a,int b){

if (a>b){

    int temp=a;
    a=b;
    b=temp;

}
        return IntStream.

                range(a+1,b).

                filter(Utils::isNumberEven).

                sum();


}

}
