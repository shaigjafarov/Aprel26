package az.coders.chapter1.lesson11.anonimous;

public class AnonimousClass {

    static interface II{


    }

    abstract class SaleToday{
        abstract  boolean aa();
    }


    public static void main(String[] args) {

        II i= new II() {
        };

        AnonimousClass anonimousClass= new AnonimousClass(){

            void  sdf(){

            }

        };

        SaleToday saleToday= new AnonimousClass().new SaleToday(){
            @Override
            boolean aa() {
                return false;
            }
        };

    }




}
