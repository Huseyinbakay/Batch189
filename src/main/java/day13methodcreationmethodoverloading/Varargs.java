package day13methodcreationmethodoverloading;

public class Varargs {
    public static void main(String[] args) {


        int result=toplamaYap(5,6,7,8,9,10,11,12);//Bu parametreye sonsuz eleman atabilirsin.Varargs deniyor.
                                                      //Eğer varargs varsa bir methodda en sonda olmalı çünkü o dolmayan
        System.out.println(result);                  //bir kutu.Ondan önce pararmetre koyabilirsin.
    }//method parantez


    public static int toplamaYap(int... a) {
        int sum = 0;

        for (int w : a) {
            sum = sum + w;

        }
        return sum;
    }


    //1) Bir method parantezinde birden fazla varargs kullanilmaz
    //2) Bir method parantezinde birden fazla parametre kullanilacaksa Varargs en sonda olmalidir


    //Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu.
    //Bu yapiya Varargs diyoruz
    //Varargs arka planda Array yapisini kullanir


}//clas
