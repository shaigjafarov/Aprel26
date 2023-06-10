package az.coders.chapter1.lesson18;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class StudentService {
     private String a;
     private Integer b;


    public StudentService(String a, Integer b) {
        this.a = a;
        this.b = b;
    }

    private void doSomethingPrivate(String args) {
        System.out.println("argument: " + args);
    }
}
public class ExampleAccessingPrivateMethod {
    public static void main(String[] args) {
        try {
            StudentService studentService = new StudentService("Vahid", 17);
            Class<StudentService> studentServiceClass =
                    StudentService.class;


            Field[] fields = studentServiceClass.getDeclaredFields();
            Override annotation = fields[0].getAnnotation(Override.class);
            boolean annotationPresent = fields[0].isAnnotationPresent(Override.class);


            Arrays.stream(fields).forEach(a-> {a.setAccessible(true);
                try {
                    System.out.println(a.get(studentService));
                }catch (Exception e){


                }

            });



//
//            Method doSomethingPrivate =
//                    studentServiceClass.getDeclaredMethod(
//                            "doSomethingPrivate", String.class);
//            doSomethingPrivate.setAccessible(true);
//            doSomethingPrivate.invoke( studentService,
//                    "hello students! Let's bunk the class today");
//
//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}