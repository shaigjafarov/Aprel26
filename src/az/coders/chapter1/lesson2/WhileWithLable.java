package az.coders.chapter1.lesson2;

public class WhileWithLable {
    public static void main(String[] args) {
        int j = 0;
        int i = 0;
        OUTER:
        while (j < 6) {
            while (i < 5) {
                System.out.println("j=" + j + " i=" + i);
                if (i == 2) {
                    j++;
                    i=0;
                    continue OUTER;
                }
                i++;
            }
            i=0;
            j++;
        }
    }
}
