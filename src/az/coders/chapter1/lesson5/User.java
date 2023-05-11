package az.coders.chapter1.lesson5;


public class User  {

    private String name;
    private String surname;
    private int  age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //
//    public void adMenimset(String ad){
//        if(ad.length()>=3){
//            name=ad;
//        }
//        else System.out.println("Ad min 3 herf olmalidir");
//
//    }
//
//    private boolean checkSymbol(String ad) {
//
////        for
//        return true;
//    }
//
//    public void soyadMenimset(String soyad){
//        if(soyad.length()>=4)
//        surname=soyad;
//    }
//    public void yasMenimset(int yas){
//        if(yas>=18){
//            age=yas;
//        }
//
//    }
//
//    public  String adGetir(){
//        return  name;
//    }
//    public  String soyadGetir(){
//        return  surname;
//    }
//    public  int yasGetir(){
//        return  age;
//    }


//    User(String name, String surname , int age){
//        this.name= name;
//        this.surname= surname;
//        this.age=age;
//    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
