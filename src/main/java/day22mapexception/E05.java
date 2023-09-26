package day22mapexception;

public class E05 {
    public static void main(String[] args) {


        int a=12;
        int b =2;
        String s="AliCan";

        getCharFromString(s,a,b);


    }

    public static void getCharFromString(String s,int a,int b){

        try {
            int idx=a/b;
            char ch=s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.err.println("HATA");
            System.out.println("e.getMessage() = " + e.getMessage());

        }catch (StringIndexOutOfBoundsException e){

            System.out.println("Olmayan index");

            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }

}
