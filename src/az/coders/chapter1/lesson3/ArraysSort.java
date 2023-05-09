package az.coders.chapter1.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrayin olcusunu qeyd edin: ");
        int i = scanner.nextInt();


        int a[]= new int[i];

        for (int j = 0; j <i; j++) {
            System.out.print("Eded daxil edin: ");
            a[j]=scanner.nextInt();
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString( a));


    }
}
