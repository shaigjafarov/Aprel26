package az.coders.chapter1.lesson5;

import java.util.Arrays;

public class JavaVarag {
    public static void main(String...args) {
        JavaVarag javaVarag= new JavaVarag();
        javaVarag.writeToConsole(1,2,3,4,5,6);


    }


    public void writeToConsole(int...arr){

//        for (int a:arr) {
//            System.out.println(a);
//        }
        System.out.println(Arrays.toString(arr));



    }


    public void writeToConsole(int a1, int a2){
//        for (int a:arr) {
//            System.out.println(a);
//        }
    }

}
