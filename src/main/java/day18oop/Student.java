package day18oop;

public class Student {

   /*
   Encapsulation ===>kapsülleme denmek

   Encapsulation Nedir? Data hiding(veri saklamadır)

   DAta nasıl saklanır

   Access modifier pirivate yaparsan o class ı saklayabilirsin

    Encapsulation yağtığın datayı istersen diğer classlardan görünür yapabilirsin
     get method kullanarak encapsulate edilmiş datayı okuyabilirsin


     Encapsulation datayı de


     1)Set metodları hep public olur
     2)set methodun return type void olur hep
     3) Set method parametre kullanır.Parametrenin datatype aynı olur.

     Set method kullanarak varolan object üzerinde sürekli değişiklikler yaparak tek obje üzeinden işlem yaparız.

    Getter ve Setter ikisine  java beans deniyor.

    */

private StringBuilder tcNo=new StringBuilder();  // private yaparak bunu saklamış oldun.Tek bulabilecegin yer clasın içi.
    public String isim="Ali Can";

    public int yas=14;

    private boolean basarilimi=true;


    private double not=3.14;

    //haha bak ulaşılabilir yaptı

    public StringBuilder getTcNo() {
        return tcNo;
    }

    public double getNot() {
        return not;
    }


    public void setTcNo(StringBuilder tcNo) {
        this.tcNo = tcNo;
    }

    public void setBasarilimi(boolean basarilimi) {
        this.basarilimi = basarilimi;
    }

    public void setNot(double not, int i) {
        this.not = not;
    }

    public boolean isBasarilimi() {
        return basarilimi;






    }
}
