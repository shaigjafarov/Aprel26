package az.coders.chapter1.lesson6;

import az.coders.chapter1.lesson7.Car;

public class BMW extends Car {

    public String marka;
    public String model;
    public int count =5;

    public BMW(String marka, String model, String petrol3) {
        this.marka = marka;
        this.model = model;
        petrol = petrol3;
    }


    public void setPetrol(String xx) {
        this.petrol = xx;
    }


    public BMW() {
        super();
    }

    @Override
    public void run() {
        System.out.println("car run");

    }

    @Override
    public int sfd() {
        return 54;
    }
}
