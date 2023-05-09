package az.coders.chapter1.lesson4;

public class Fibo {

    public static void main(String[] args) {
        Fibonecci(5,3, 10);

        //{  8, 11 ,19 ,30}




    }

    public static   void Fibonecci(int num1,int num2, int count){
        int num3=0;
        for(int i=2; i<count; ++i){
            num3=num1+num2;
            System.out.print(" "+num3);
            num1=num2;
            num2=num3;
        }
    }
}
