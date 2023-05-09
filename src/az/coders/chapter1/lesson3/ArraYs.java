package az.coders.chapter1.lesson3;

public class ArraYs {


    public static void main(String[] args) {
        int arr[]= new  int[10];
        String [] dsdf= new String[23];

        int arr1[]={1,2,3,4,5,6};

        int []biDimension[][]={{{1,2},{3, 4}},{{3,4} ,{6,7}}} ,dsjks  ;

        for (int i = 0; i < biDimension.length; i++) {
            for (int j = 0; j < biDimension[i].length ; j++) {
                for (int k = 0; k < biDimension[i][j].length; k++) {
                    System.out.print(biDimension[i][j][k]+" ");

                }
                System.out.println();


            }
            System.out.println("///");
        }


        System.out.println(dsdf[12]);



//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }






    }
}
