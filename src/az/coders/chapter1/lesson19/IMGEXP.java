package az.coders.chapter1.lesson19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IMGEXP {

    public static void main(String[] args) throws IOException {
        byte[] bytes;
        try(var fi= new FileInputStream("/Users/shaiqjafarov/IdeaProjects/Aprel26/src/az/coders/chapter1/lesson19/img.png")){
             bytes = fi.readAllBytes();
            for (byte a:bytes) {
                System.out.println(a);
            }
        }
bytes[1]=100;
bytes[2]=100;
bytes[3]=100;
bytes[4]=100;
bytes[5]=100;
bytes[6]=100;

        try(var fi= new FileOutputStream("/Users/shaiqjafarov/IdeaProjects/Aprel26/src/az/coders/chapter1/lesson19/imgcop.png")){
            fi.write(bytes);
        }

    }
}
