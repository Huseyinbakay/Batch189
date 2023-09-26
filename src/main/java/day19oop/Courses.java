package day19oop;

public class Courses {

    //Abstraction
    //eğer bir class dan obje oluşturulmasu istemiyorsak ve bu clası child class ların yapmak zorunda oldukları görevler belirlemek
    //için kullanıyorsak abstrack olmalı

    //Eğer parenteki methodu childlardan hiçbiri kullnamıyorsa o methodun body kısmını sildik.Methodun body kismini siklince methot hata
    //verdi.O zaman return type önüne abstrack yazdık.


    //Abstack kullanınca bu sefer class şikayet etti.O yüzden abstrack method içeren class da ABSTRACK yapılmalı.

    //Eğer parent class da abstrack bir method varsa o classın childları o methodu kulaanamak zorundadır.

    //Body si olan methodlar yavi somut methodlar abstrack CLASS a yazılabilir.

    //Ama abstrack methodlar concrite yani somut yani abstrack olmayan classlar içine yazılamazlar.

    //bir method hem abstrack hem de body bulunduramaz.


    //final methodlar abstrack olamazlar.final methodlar override yapılamadığı için abstrack olamazlar.

    //Abstrack class alrdan obje oluşturamazsın

    //Absrack class ları constructur ı var ama obje olusurulmuıyor.

    //Abstrack classın abstrack ya da concreid class ı oabilir.
    //Abstrack class child olmak isterse direk olabiliyor.Eğer Abstrack değil ise override etmek zorundasın o classı.

    //Abstrack methodları private olamaz.Cünkü Childalar bu methodu zorunlu kullanmak zorundadır.E private olursa override edemezler.

    //Abstrack classların Abstrack methodları var.O class lar FİNAL olamaz.



}
