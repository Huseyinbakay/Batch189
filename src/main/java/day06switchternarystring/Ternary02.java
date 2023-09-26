package day06switchternarystring;

public class Ternary02 {
    public static void main(String[] args) {


        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz


        int  a   = -333;
             a=Math.abs(a);

        String result  =a>99 && a<1000 ? "Sayı üç basamaklıdır" : "Sayı üç basamaklı değildir";
        System.out.println(result);


        int  year   =  1780;

        String result4 = (year%100==0)   ? (year%400==0)  ? "Leap"  :"Noy leeap": year%4==0 ? "Leap": "Not Leap";

        System.out.println(result4);











    }
}
