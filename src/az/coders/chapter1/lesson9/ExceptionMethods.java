package az.coders.chapter1.lesson9;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class ExceptionMethods {



    public  void  sdvf(A sd){
        sd.asd();

    }



}


abstract class A{

     abstract void so() throws IOException;

     void  asd(){

     };


}

class B extends  A{


    @Override
    void so() {

    }

    @Override
    void asd(){
        try {
            super.asd();
        } catch (Exception e){


        }

    }
}
