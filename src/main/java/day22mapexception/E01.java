package day22mapexception;

public class E01 {

    public static void main(String[] args) {


        bol(12,3);
        bol(12,1);

        bol2(5,2);





    }


    public static void bol2(int a,int b){

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){

            System.out.println("0 a bölüm yapılamaz");
        }

    }




    public static void bol(int a,int b){
        System.out.println(a/b);

    }
}
