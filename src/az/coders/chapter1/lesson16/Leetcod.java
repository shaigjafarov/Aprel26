package az.coders.chapter1.lesson16;

public class Leetcod {

    public static void main(String[] args) {
        String str = "cabcabcabcab";
        int i = 1;
        String tekrarlanan = null;

        while (i < str.length()) {
            String substring = str.substring(0, i);
            if (checkReptbl(substring, str)) {
                tekrarlanan = substring;
            }
            i++;
        }

        System.out.println(tekrarlanan);
    }

    private static boolean checkReptbl(String a, String str) {
        String s = str;
        int count = 0;
        while (s.length() > 0) {
            if (s.indexOf(a) == 0) {
                s = s.replaceFirst(a, "");
                count++;
            } else break;
        }
        return count >= 2&& s.length()==0;

    }

}
