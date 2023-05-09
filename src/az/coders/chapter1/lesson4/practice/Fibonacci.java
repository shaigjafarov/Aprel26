package az.coders.chapter1.lesson4.practice;

public class Fibonacci {
    public static void main(String[] args) {


                int[] arr = {1,2,3,5,8};

                for(int i=2; i<=arr.length-1; i++){
                    if(arr[i]==(arr[i-1]+arr[i-2])){
                        if(i>=arr.length-1) {
                            System.out.println("true");
                        }
                    }else{
                        System.out.println("false");
                        break;

            }
        }
    }
}
