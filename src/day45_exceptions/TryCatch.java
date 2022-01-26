package day45_exceptions;

public class TryCatch {

    public static void main(String[] args) {

        try{
            String str = "jAVA";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5));
            System.out.println(str.charAt(1));
        }catch (Exception e){
            System.out.println("Exception happened in try block ");
        }

    }
}

