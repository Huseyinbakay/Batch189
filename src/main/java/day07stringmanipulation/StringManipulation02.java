package day07stringmanipulation;

public class StringManipulation02 {


    public static void main(String[] args) {



        /*package day07stringmanipulations;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98*/



        String tv = "$456.99";
        String laptop = "$875.99";


        String newTv = tv.replace("$"," ");


        String newLaptop =laptop.replace("$"," ");

        Double totalPrice    =Double.valueOf(newLaptop) + Double.valueOf(newTv);


        System.out.println(totalPrice);


        //trim metod:Baş ve sondaki space leri siler

        //  "    ali cAN    "====AC




        String  name   ="    ali cAN   ";


        char   firstt  =  name.trim().toUpperCase().charAt(0);

        System.out.println(firstt);


        char last1 = name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println(last1);


        System.out.println(""+firstt+last1);







        //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
        // karakterleri dynamic olarak aliniz
        //abc@gmail.com ===> gmail



        String  a   ="abc@gmail.com";


        int startingIndex  =a.indexOf("@")+1;
        int endIndex      =a.indexOf(".");

        String campany = a.substring(startingIndex,endIndex);
        System.out.println(campany);








    }






}
