package az.coders.chapter1.lesson9;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {

        System.out.println(aRecurMethods(new Scanner(System.in).nextInt()));
    }

   static int aRecurMethods(int i){
        if(i==1){
           return 0;
        }
        return i+aRecurMethods(i-1);
    }


}
