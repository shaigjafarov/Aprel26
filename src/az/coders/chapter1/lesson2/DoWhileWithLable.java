package az.coders.chapter1.lesson2;

public class DoWhileWithLable {

    public static void main(String[] args) {
        int i=0;
       OUTER: do {
            System.out.println();
            int j=0;
            do{
                System.out.println("i="+i+" j="+j);
                j++;
                if(j==2){
                    i++;
                    continue OUTER;
                }
            }while (j<5);
            i++;
        }while (i<5);


    }
}
