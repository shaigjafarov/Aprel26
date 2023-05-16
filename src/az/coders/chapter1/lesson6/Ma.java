package az.coders.chapter1.lesson6;

public class Ma {

    public static void main(String[] args) {
        Flyable flyable=new AirPlane();
        Flyable flyable1=new Helicopter();

        ekranaYazdir(flyable);

    }


    public static void ekranaYazdir(Flyable flyable){
        flyable.fly();
    }
}
