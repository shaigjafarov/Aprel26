package az.coders.chapter1.lesson3;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner skaner=new Scanner(System.in);
        int num=skaner.nextInt();
        String ucluk="";

        while(num>0){
            ucluk=ucluk+(num)%3;
            num=num/3;
        }
        StringBuilder uc=new StringBuilder(ucluk);
        uc.reverse();
        System.out.println(uc);
    }
}
