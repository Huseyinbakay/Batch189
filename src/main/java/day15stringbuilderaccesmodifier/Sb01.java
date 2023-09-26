package day15stringbuilderaccesmodifier;

public class Sb01 {
    public static void main(String[] args) {

        //StringBuilder clası da string üreten bir class
        //String class "immutable"(değiştirilemeyen) string üretir.
        //String mutable string üretiyor.
        //İmmutable demek değştirilemez olması demektir.
        //Mutable ise tersine değiştirilebilen stringlerdir.




        //İMMUTABLE

        String str ="java";

        String str1=str+"x";

        String str2=str1+"?";

        String a ="money";

        a=a+"more";//Yeni konteyner olustudu bunu da assing ettik.Burada referece yeni konteyner a ait.Eski a konteyner
                   //adressiz kaldı.Burada da java GARBAGE COLLECTER devreye girer ve eski adressiz konteyneri SİLER.



        //MUTABLE
        //StringBuilder kullanarak string olusturma


        StringBuilder sb1=new StringBuilder("Pyton");

        System.out.println(sb1.append("!"));

        sb1.append("12");
        System.out.println(sb1);



        StringBuilder sb2=new StringBuilder();

        System.out.println(sb2.length());

        System.out.println(sb2.capacity());

        sb2.append("java");

        System.out.println(sb2.length());

        System.out.println(sb2.capacity());

        sb2.append("xxxxxxxxxxxxxx");

        System.out.println(sb2.capacity());



        StringBuilder sb3=new StringBuilder(5);//Bak burada bana 5 koltuk ver dedim.Bu özellik StringBuilderde var.
                                                       //Ama String baştan 16vceriyourdu

    }
}
