package day15stringbuilderaccesmodifier;

public class Sb02 {
    public static void main(String[] args) {


       StringBuilder sb1=new StringBuilder("Java is easy");

        System.out.println(sb1);

        System.out.println(sb1.reverse());//    ysae si avaJ //

        System.out.println(sb1.deleteCharAt(3));  //ysa si avaJ


        System.out.println(sb1.delete(0, 5)); //  i avaJ



        sb1.replace(0,4,"xxx");
        System.out.println(sb1);



        sb1.insert(3,"777");
        System.out.println(sb1);

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Java is");

        int fark =sb1.compareTo(sb2);
        int fark1 =sb2.compareTo(sb3);
        System.out.println("fark = " + fark);
        System.out.println("fark1 = " + fark1);
        
        String donusenBuilder=sb2.toString().toUpperCase();

        System.out.println("donusenBuilder = " + donusenBuilder);


        StringBuilder newSb1=new StringBuilder(donusenBuilder);//donusenBuilder i tekrar StringBuilderre dönüştürdüm

        System.out.println("newSb1 = " + newSb1);

        //StringBulider nasil string e cevrilir?
        //toString() methodu StringBuilder i string e cevirir
        //String class da var olan ama StringBuilder class icinde var olamyan mesela split() methodu gibi
        //methodlara ihtyac duydugumuzda bu method sayesinde string class icindeki methodlari kullanabilirz
        String str = sb2.toString().toUpperCase();

        //String nasil StringBulider a cevrilir?


        StringBuffer strngBuff=new StringBuffer("Java");//StringBuffer oluşturduk.


   /*
        1) StringBuffer Java da string ureten bir diger classdir
            StringBuffer javanin string üretmek icin olusturdugu ilk classtir

        2) StringBuffer, StringBuilder a cok benzer, yani ikiside mutable string üretir
        3) StringBuffer "multi-thread" dir ama StringBuilder  "multi-thread" degildir.
        4) StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli calisir
        5) multi-thread yapilirken yapilan islemlerin siralamasi önem arzeder.
            Yapilan isleri mantikli bir siraya koymak "synchronization" olarak adlandirilir
            StringBuffer multi-thread oldugu icin ayni zamanda synchronized dir

                a) immutable string lazimsa : String class
                b) mutable string lazimsa : StringBuilder veya StringBuffer
                        i) StringBuilder i multi-thread gerekmezse kullaniriz
                        ii) StringBuffer i multi-thread gerekirse kullaniriz
         */
        //StringBuffer nasil olusturulur?
        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);





    }
}
