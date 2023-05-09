package az.coders.chapter1.lesson3;

public class StringBuilderRevers {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Salam");

        StringBuilder stringBuilder1= new StringBuilder(stringBuilder.length());
        for (int i = stringBuilder.length()-1; i >= 0; --i) {
//            System.out.println(stringBuilder.charAt(i));
            stringBuilder.append(stringBuilder.charAt(i));


        }
        System.out.println(stringBuilder);

    }

}
