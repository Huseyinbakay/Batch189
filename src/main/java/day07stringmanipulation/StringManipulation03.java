package day07stringmanipulation;

public class StringManipulation03 {


    public static void main(String[] args) {


        //Example  Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht


       String s  ="mehmet";

  //lastindexof("m")





        String ss = "mehmet";
        //s.indexOf("m") ==>0   farkli ise tekrarli
        //s.lastIndexOf("m") ==>3

        //s.indexOf("e") ==>1
        //s.lastIndexOf("e") ==>4

        //s.indexOf("h") ==>2   ayni ise tekrarsiz
        //s.lastIndexOf("h") ==>2

        //s.indexOf("t") ==>5
        //s.lastIndexOf("t") ==>5


        if(s.indexOf("m") == ss.lastIndexOf("m")){
            System.out.print("m");
        }

        if(s.indexOf("e") == ss.lastIndexOf("e")){
            System.out.print("e");
        }

        if(s.indexOf("h") == ss.lastIndexOf("h")){
            System.out.print("h");
        }

        if(s.indexOf("t") == ss.lastIndexOf("t")){
            System.out.print("t");
        }


        //Example  Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789



     String cardNum  =  "1234 5676 8911 2369";

        String first= cardNum.substring(0,15).replaceAll("[0-9,]","*");
        String  end  = cardNum.substring(15);


        System.out.println(end);


    }




}
