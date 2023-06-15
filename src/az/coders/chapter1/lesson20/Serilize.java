package az.coders.chapter1.lesson20;

import java.io.*;

public class Serilize {

    public static void main(String[] args) {

//        try (ObjectOutputStream o = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("/Users/shaiqjafarov/IdeaProjects/Aprel26/src/az/coders/chapter1/lesson20/resr.ser")) {
//        })) {
//
//            o.writeObject(new Student("SS", "wwww", "22"));
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try (ObjectInputStream o = new ObjectInputStream(new BufferedInputStream(new FileInputStream("/Users/shaiqjafarov/IdeaProjects/Aprel26/src/az/coders/chapter1/lesson20/resr.ser")) {
        })) {

            Student  s= (Student) o.readObject();
            System.out.println(s);





        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}

class Student implements Serializable {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private static final long serialVersionUID = 393053474813714841L;
    String name;
    String surname;

    transient String age;
    // 11

    public Student(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age= age;
    }
}
