package az.coders.chapter1.lesson8;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.MissingFormatWidthException;
import java.util.Scanner;

public class ExceptionExm {


    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(bol(3,0));

        }catch (RuntimeException e){
            e.getMessage();
        }
//        try {
//            System.out.println(scanner.nextInt()/ scanner.nextInt());
//        }/*catch (ArithmeticException e){
//            System.out.println("Riyazi emeliyyat zamani xeta");
//        }catch (InputMismatchException e){
//            System.out.println("Uygun deyer daxil edimleyib");
//        }*/
//        finally {
//            return;
//        }


    }


   static int bol(int a, int b)
    {
        if(b==0){
           throw new  SifiraBolmeMumkunDeyil("b-nin deyeri sifirdi");
        }
        return a/ b;
    }

}
