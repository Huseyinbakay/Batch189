package Day08loops;

public class Forloops01 {


    public static void main(String[] args) {


    //ekrana 5 defa hi yazdır.


        for(int i =1;       i<26         ;i++){
            System.out.println("Hi......?");



        }






        for (int m  =1;  m<42; m++){

            System.out.println("41 kere maşallah....");
        }



     //11 den 14 e kadar yazdır



        for (int k =11; k<15; k++){
            System.out.println(k);
        }



        //Example  40'dan 23'e kadar tum cift tamsayilari ekrana yazdiran kodu yaziniz



       for(int  i =40;i>22;i--){

           if(i%2==0)
           System.out.println(i);
       }



        String a  ="Bugün hava çok sıcak";

      int b= a.indexOf("ç");

        for (int i = 0;         i < b+1;           i++) {


            System.out.println(a.charAt(i));

        }





        String sifre = "adDFG12qRRfS";

        String buyukSifre = sifre.replaceAll("[a-z]","");
        System.out.print("Büyük sifre=  "+buyukSifre);

        for (int i = 0; i <buyukSifre.length() ; i++) {

            System.out.println(buyukSifre.charAt(i));



            ;









        }

    }









}
