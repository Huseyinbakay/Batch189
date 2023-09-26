package day23;

public class ExceptionRunner {


    public static void main(String[] args) {


        getStd(140);
    }


     /*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()

     */




    public static void  getStd(int grade){


                if (grade<0||grade>101){

                    try {
                        throw new InvalidStudentGradeException("Notlar geçersiz");
                    } catch (InvalidStudentGradeException e) {
                        throw new RuntimeException(e);

                    }
                }else {
                    System.out.println(grade);
                }

    }


}
