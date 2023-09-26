package day06switchternarystring;

import java.util.Scanner;

public class turnery1 {


    public static void main(String[] args) {


        // mutlak değeri hesapkayan kod yaz




        int   c   =  -4;


       int result   = c<0   ?   c*-1  : c;
        System.out.println(result);





//Example 2: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.



        int  a   = -7;
        int  b=     13;

        Object result2  =(a>0 && b>0) || (a<0 && b<0) ? a*b:"Sayılatrı çarpamıyorum";

        System.out.println(result2);


        Scanner input   = new Scanner(System.in);

        System.out.println("Lütfen bir yıl giriniz");

        short year   = input.nextShort();

        String artik    = (year%4 ==0) ? "Leap":"not Leap";
        System.out.println(artik);












    }







}
