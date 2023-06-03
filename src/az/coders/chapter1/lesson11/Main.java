package az.coders.chapter1.lesson11;

public class Main {


    public static void main(String[] args) {

        Season.FALL.getHours();
    }


    public  boolean checkAccess(User user){

        if(user.role.accessPages.contains("main")){
            return  true;
        }
        else return  false;
    }


}

class User {

    RoleEnum role;
    String name;


}
