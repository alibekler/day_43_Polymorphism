package day45_exceptions;

public class TryCatch2 {

    public static void main(String[] args) {
         int nums[] = {36,6,34,12};

        try{
            System.out.println(nums[5]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try {
            int j = 100;
            int s=j/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
