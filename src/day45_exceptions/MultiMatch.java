package day45_exceptions;

public class MultiMatch {

    public static void main(String[] args) {

        try {
            System.out.println(4/0);

            String str = null;
            System.out.println(str.toUpperCase());

            int[] n ={10,4};
            System.out.println(n[2]);
        }catch (ArithmeticException a){
            System.out.println("Arithmetic exception happened");
        }catch (NullPointerException n){
            System.out.println("NullPointer exception happened");
        }catch (RuntimeException r){
            r.printStackTrace();
        }
    }
}
