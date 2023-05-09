package az.coders.chapter1.lesson3;

import java.util.Arrays;

public class ForeachTest {

    public static void main(String[] args) {
        int a=5;
        int b=7;


        String str="5";
        int i1 = Integer.parseInt(str);
        String s = String.valueOf(5);



//        String



        int []arr= {6,4,2,5,5,5,1,3};
//
//        for (int sa:arr) {
//            System.out.print(sa);
//        }
//        System.out.println(arr);
//

//        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int i = Arrays.binarySearch(arr, 2);
        System.out.println(i);


    }


}
