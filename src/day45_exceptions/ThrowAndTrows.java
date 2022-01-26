package day45_exceptions;

public class ThrowAndTrows {

    public static void main(String[] args) {

        System.out.println("Hello world");

        //throw new RuntimeException("This is some exception");

        try {
            throw new Exception("ssss");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String username="";

        if (username.isEmpty()){
            throw new RuntimeException("Username cannot be empty");
        }else{
            System.out.println("Valid Username");
        }
    }


    public static void throwsException() throws Exception {

        throw new Exception("dscdscds");
    }

    public static void sleep2() throws Exception {
        throwsException();
    }

    public static void sleep3(){
        try {
            sleep2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
