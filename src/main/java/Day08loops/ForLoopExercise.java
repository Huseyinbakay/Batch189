package Day08loops;

public class ForLoopExercise {
    public static void main(String[] args) {


        String c = "BİLGİ SAYAR";


        for (int i = c.length() - 1; i >= 0; i--) {


            char ch = c.charAt(i);


            System.out.print(ch);


        }

        System.out.println();

        boolean con = c.isBlank();

        System.out.println(con);


        String s = "34,678";

             String bolunmus=  s.split(",")[1];
             String bol678=bolunmus.substring(0);

        System.out.println(bol678);

       int x= Integer.valueOf(bol678);



        int b=0;



        for (int i = x; i >0 ; i=i/10) {

            b=b+i%10;


            System.out.println(b);







        }
        System.out.println();

         //7 den 9 a kadar sayılarım çarpımını veren kod yaz



        int a =1;

        for (int i = 7 ;      i <10   ; i++) {

            a=a*i;



        }
        System.out.println(a);


        System.out.println();


        //200 den 1000 e kadar olan çift sayıların toplamını yazdır


        int p =0;

        for (int i = 2; i <10; i++) {

            if (i%2==0){

                p=p+i;



        }

        }







        System.out.println(p);


        System.out.println();

        String r="458";

         int rPrimitive =Integer.valueOf(r);

        System.out.println(50+rPrimitive);




        }


    }















