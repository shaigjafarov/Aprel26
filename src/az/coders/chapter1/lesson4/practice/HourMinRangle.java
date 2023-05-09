package az.coders.chapter1.lesson4.practice;

import java.util.Scanner;

public class HourMinRangle {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("saat eqrebinin deyerini qeyd edin: ");
        int hour=sc.nextInt();
        System.out.println("deqiqe eqrebinin deyerini qeyd edin: ");
        int min=sc.nextInt();

        if (hour > 12) {
            hour = hour % 12;
        }


        float HourBucaq = hour * 30;
        float minBucaq = min * 6;
        float bucaqFerqi = min * 0.5f;
        float cavab = Math.abs(HourBucaq - minBucaq);

        if (HourBucaq > minBucaq) {
            cavab = cavab + bucaqFerqi;
        } else {
            cavab = cavab - bucaqFerqi;
        }
        if (cavab > 180) {
            System.out.println(360 - cavab);
        } else {

            System.out.println(cavab);
        }
    }
}
