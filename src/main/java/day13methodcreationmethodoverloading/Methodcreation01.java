package day13methodcreationmethodoverloading;

public class Methodcreation01 {
    public static void main(String[] args) {

       int sonuc1=sayilar(4,5,9);

        System.out.println("sonuc"+sonuc1);
        //ornek 1 : 2 sayiyi carpma islemi yapan bir method olusturunuz


        //method call

       int sonuc= carpma(3,7);

        System.out.println(sonuc);

        //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.



        print("Ali Can");





    }//method kapanıs



    protected static int carpma(int a,int b){
      return   a*b;

    }


    public static  int  sayilar (int d,int e,int f){

        return d*e+f;
    }


//Ornek 3: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.


    public static void print(String str){

        System.out.println(str);
    }



//Eger bir method yeni bir data üretmiyorsa retun type void olur.
    //eğer type void ise body içine return yazmana gerek yok
    //method oluştururken kullanılan variable ler parantez içine parametre,,,,içine yazdığın değerler de arguments ler denir.






}//class kapanış

