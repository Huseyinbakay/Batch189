package day15stringbuilderaccesmodifier;

public class Student {


    public String stdName="Ali can";
    protected   String adreess="Ankara";

    String email="avci_----";


    private int tcNooo=457852112;


    //public her class dan kullanilabilirler
   // public String stdName = "Ali Can";

    //protected olanlar baska package dan sadece child classlardan gorülebilir
    protected String address = "Istanbul";

    //default access modifierlarda default keyword yazilmaz
    //default olanlar baska package lardan kullanilamazlar
  //  String email ="alican@gmail.com";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler


}
