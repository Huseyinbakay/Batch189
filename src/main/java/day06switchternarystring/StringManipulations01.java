package day06switchternarystring;

public class StringManipulations01 {

    public static void main(String[] args) {


        String  s  =  "java is easy";

        //  s stringinde kaç karakter var


        int sLength = s.length();
        System.out.println(sLength);

        // s stringindeki ilk index ve son karakteri göster

         char  firstC= s.charAt(0);
          System.out.println(firstC);

        char  lastC  = s.charAt(s.length()-1);

        System.out.println(lastC);



        //Example 3: "s" String'indeki ilk 4 characteri aliniz.
        //substring(0, 4) ==> "0" yani ilk index dahil, "4" yani ikinci index haric dir. [0,4)



        String  s1    = s.substring(0,4);
        System.out.println(s1);



        String  s2   = s.substring(5,7);

        System.out.println(s2);


      String   s3    = s.substring(8,12);
        System.out.println(s3);


        //Example 7: "s" String'inin belli bir harfle baslayip baslamadigini kontrol ediniz.


          boolean  isStart = s.startsWith("java");
        System.out.println(isStart);


            boolean sEnd  =s.endsWith("easy");
        System.out.println(sEnd);






    }




}
