package az.coders.chapter1.lesson12;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Generics<E> {


    public static void main(String[] args) {
//        List<String>   list=  new ArrayList<>();

//        A userA= new A();
//        userA.toString(new User());
   }



     static  <T> A sdjh(T t){

        return null;
   }
}

class User{
    int a;


}

class A <E>{


    A(E e){
        this.e=e;
    }

    E e;


    String toString(E e){
       return  e.toString();
    }



}
 class Crate<T> {
     public <T> T tricky(T t) {
         return t;
     }
 }

class ST{
    public static CharSequence createName() {
        List<String> asda= new ArrayList<>();
        Crate<Robot> crate = new Crate<>();
        return crate.<CharSequence>tricky("bot");
    } 
    
}
  

