package day22mapexception;

public class E02 {


    public static void main(String[] args) {
        String s="1234a";

          convertor(s);





    }

    public  static void convertor(String a){
        try {
            int intS=Integer.valueOf(a);
            System.out.println(intS+1);
        }catch (NumberFormatException e){

            System.out.println("Rakam dışı karakter var");

            System.out.println("e.getMessage() = " + e.getMessage());
        }




    }
}
