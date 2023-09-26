package day18oop;

public class Animal {
/*
1  Parent classdaki methodu child class içinde özellestirerek kullanmaya overriding deniyor

2 Overidingde methodun ismine ve parantezine dokunulmaz.Methot Signature.

3 Child class daki overrride eden eat methodunna overriding denir.
  Animal parent classdakine yani eat methoduna Overriden method denir
4 private methodlar override edilemez

5 Child classdaki methodun acces modifieri parent classdaki everriden edilen methoddan daha dar olamaz.

6Overriden method(parentdeki method) protected ise child class daki overriding method ya public ya da protected olabilir.
Overriden method private ise overriding yapılmaz zaten

7 Child classda overriding edilen method ile Parent clasdaki return type arasında
 İSaRELETİONAL SHİPP varsa return typlarda bu returnlar değiştirebilirsin.Cünkü extend yaptun

 8 Methodun return typ e primitive ise overriding yaparken bu primitive ve parent child ilişkisi olmadığından return type değiştirilmez.Burda
 return type aynı olmalı

 Childde overriding edilen methodun retyrn type ile Parentteki methodun return Type arasında yani return typler arasında is a relitionalshipp yoksa onu
 yani return type ı değiştiremezssinnnn

 9 methodun return typr VOİD ise overrideng yaparken type değiştiremezsin


 10 static methodlar override edilemez.Çünkü static methodlar tüm childler için ortaktır.

 11 final methodlar override edilemez....

 Method Overriding+Method Overloading=Polymophism
 */
    public  void eat(){

        System.out.println("animals eat");
    }


    public void drink(){

        System.out.println("Animas drink");
    }

    public  Animal create(){
        return new Animal();

    }

    public  int add(int a, int b){
        return a+b;

    }

public Integer multiplay(Integer a, Integer b){
        return a*b;
}

public  final double alandaire(double r){

  return 3.14*Math.pow(r,2);

  //bu methodu override edemedin değil mi?Edemezsin ki zaren
    //kural bu final ise override edemezsin.
    //Ha bir de final keyword ile varible oluşturusan o değeri asla değiştiremezsin.


}


}
