package az.coders.chapter1.lesson26;
public class Person {
    private String name;
    private int age;
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }
    public static class Builder {
        private String name;
        private int age;
        public Builder(String name) {
            this.name = name;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this);
        }
    }
}
