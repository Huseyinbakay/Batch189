package day14constructorsdatetime;

public class Carrunner {
    public static void main(String[] args) {

                                        //new Car() buna construcktor deniyor
        Car c1=new Car("bmw","m4",2022,false);               //c1 benim objem
                                        // bunları car classından çagırdım

        System.out.println(c1.hybrid);

        System.out.println(c1.make);

        System.out.println(c1.model);

        c1.hareket();//bunlar kendi oluşturduğum methodlar
        c1.guvenlik();//


        Car c2=new Car("tofas","sahin",2000,false);
        Car c3=new Car("honda","jazz",2013,true);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        Car c4=new Car(false);
        System.out.println("yakıt= " + c4);

    }
}
