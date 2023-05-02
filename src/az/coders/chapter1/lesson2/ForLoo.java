package az.coders.chapter1.lesson2;

public class ForLoo {

    public static void main(String[] args) {

        OUTER:
        for (int j = 0; j < 6; j++) {
            INNER:
            for (int i = 0; i < 5; i++) {
                System.out.println("j=" + j + " i=" + i);
                if (i == 2) {
                    continue OUTER;
                }
            }
        }
    }
}


//            for (int j = 0; j<i; j++) {
//                System.out.println("i=" + i + " j=" + j);
//            }
//