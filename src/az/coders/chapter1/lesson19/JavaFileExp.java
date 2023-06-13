package az.coders.chapter1.lesson19;

import java.io.*;

public class JavaFileExp {


    public static void main(String[] args) throws IOException {
        try (var a =new BufferedReader( new FileReader("/Users/shaiqjafarov/IdeaProjects/Aprel26/src/az/coders/chapter1/lesson19/ss.txt"))) {
            String chr ;
            while (null !=(chr=a.readLine())) {
                System.out.print(chr);
            }
        }
        File file= new File("/Users/shaiqjafarov/IdeaProjects/Aprel26/src/az/coders/chapter1/lesson19/ss.txt");
        System.out.println(file.length());
        try (var a =new BufferedReader( new FileReader(file))) {
            String chr ;
            while (null !=(chr=a.readLine())) {
                System.out.print(chr);
            }
        }

        System.out.println(file.length());
        String c= "";
        try ( var b= new BufferedReader(new FileReader(file))) {
             c= b.readLine();
            for (int i = 0; i < 10; i++) {
              c=c+i;
            }
//            a.write(c);
        }

        try ( var a=  (new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
              c=c+i;
            }
            a.write(c);
        }














    }
}
