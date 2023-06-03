package az.coders.chapter1.lesson11.staticclass;


 class Enclosing {
    static class Nested {
        private int price = 6;
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }
}