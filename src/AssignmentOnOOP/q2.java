package AssignmentOnOOP;

public class q2 {
    public static void main(String[] args) {
        System.out.println(plus(12,2));
        System.out.println(minus(20,12));
        System.out.println(multiply(12,2));
        System.out.println(divide(12,2));

    }


   static int plus(int num1, int num2){
        return num1+num2;
    }

    static int minus(int num1, int num2){
        return num1-num2;
    }

    static int multiply(int num1, int num2){
        return num1*num2;
    }

    static int divide(int num1, int num2) {
        return num1 / num2;

    }

}
