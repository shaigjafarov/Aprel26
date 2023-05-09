package az.coders.chapter1.lesson4.practice;

import java.util.Arrays;
import java.util.Scanner;

public class RepeatCountSymbol {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=scanner.next();
        System.out.print('"'+str+" ==> ");
        char []arr=str.toUpperCase().toCharArray();
        Arrays.sort(arr);
//        System.out.println(arr);
        int i,j;
        for(i=0; i<= arr.length-1; i++){
            int n=1;
            for(j=i+1; j<=arr.length-1;j++){
                if(arr[j] == arr[i]){
                    n++;
                } else {
                    break;
                }
            }
            i=j-1;
            System.out.print(arr[i]+"-"+n+"  ");
        }
    }
}
