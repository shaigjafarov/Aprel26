package az.coders.chapter1.lesson6;

public class ConstructorExm {




    static int a=5;
    static {

        System.out.println(a);
    }
    int b=6;
    {
        System.out.println(b);

    }





    public ConstructorExm(
    ) {
        System.out.println("Constructor isledi");
    }
    int  s=6;

    public static void main(String[] args) {
       new ConstructorExm();
    }

}
