package az.coders.chapter1.lesson26;

// Shape interface
public interface Shape extends Cloneable {
    void draw();
    Shape clone();
}
 class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public Shape clone() {
        return new Circle();
    }
}
 class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public Shape clone() {
        return new Square();
    }
}
