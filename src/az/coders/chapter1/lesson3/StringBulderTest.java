package az.coders.chapter1.lesson3;

public class StringBulderTest {

    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("first");
        StringBuilder stringBuilder2= new StringBuilder("second");

        stringBuilder.append(stringBuilder2);
        stringBuilder.append(3.4);
        System.out.println(stringBuilder);



         StringBuilder sb = new StringBuilder("animals");
         sb.insert(7, "-");
         sb.insert(-1, "-");
         sb.insert(4, "-");
         System.out.println(sb);

    }
}
