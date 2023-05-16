package az.coders.chapter1.lesson7;

public abstract class Vechile {

     private Engine engine;
     private Wheel wheel;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
    public  abstract void  run ();

}
