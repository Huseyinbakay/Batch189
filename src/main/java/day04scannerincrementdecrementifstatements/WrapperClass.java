package day04scannerincrementdecrementifstatements;

public class WrapperClass {


    public static void main(String[] args) {

     byte gemiBoy = 13;
     double limabBoy = 450;

     System.out.println(limabBoy / gemiBoy);

     byte k = 13;


     int aa = 123;

     byte kl = (byte) aa;


     byte primitive = 34;
     double autoBox = primitive;

     System.out.println(autoBox);

     int eski = 213;

     Integer yeni = eski;

     int eski1 = yeni.intValue();

     int control = eski1 - eski;
     System.out.println(control);


     String java = "      aaaaaaaaaaasscdgfhgfhffd dvfbbg fdvbfdbn ffbnhmf @hotmail.com";

     int dizinmail = java.indexOf("@");
     int dizinNokta = java.indexOf(".");

     String mail = java.substring(dizinmail, dizinNokta);


     System.out.println(mail);

     String replace = java.replace(" ", "");
     System.out.println(replace);
     System.out.println(mail);

     String silme = java.replaceAll("[a-z]", "");
     System.out.println(silme);


     int karakter = java.length();


     System.out.println(karakter);

     String ikinciparca = java.split("@")[1].toUpperCase();

     System.out.println(ikinciparca);

     String changeMail = ikinciparca.toLowerCase().replace("hotmail", "gmail");

     System.out.println("changeMail = " + changeMail);

     String isteoldu = changeMail.replace("gmail", "GMAİL");

     System.out.println("isteoldu = " + isteoldu);


     String iphone10 = "$458";

     String iphone12 = "786$";

     int a = iphone10.length();

     System.out.println("a = " + a);

     boolean varmı = iphone12.contains("5");


     System.out.println("varmı = " + varmı);

     String algel = iphone10.substring(1);


     System.out.println("algel = " + algel);
     String asd = iphone10.replaceAll("[^0-9]", "*");

     System.out.println("asd = " + asd);

    }

}
