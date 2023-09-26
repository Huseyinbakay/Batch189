package day09loops;

public class Forloops02 {


    public static void main(String[] args) {




//Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20




  double   num  = 28.587;

  String sNum =String.valueOf(num);


  String ondalik= sNum.split("[.]")[1];


   int  cevOndalik =Integer.valueOf(ondalik);


   int sum =0;


   for (int r=cevOndalik;r>0;r=r/10){

       sum=sum+r%10;

       System.out.println(sum);
   }









    }




}
