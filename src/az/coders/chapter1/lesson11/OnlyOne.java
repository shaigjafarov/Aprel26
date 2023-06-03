package az.coders.chapter1.lesson11;

public enum OnlyOne {
   ONCE(true);
   private OnlyOne(boolean b) {
      System.out.print("constructing,");
   }
}
 class PrintTheOne {
   public static void main(String[] args) {
      System.out.print("begin,");
      OnlyOne firstCall = OnlyOne.ONCE;  // prints
      System.out.print("end");
      OnlyOne sds= OnlyOne.ONCE;
   }
}