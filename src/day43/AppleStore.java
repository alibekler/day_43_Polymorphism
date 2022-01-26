package day43;

public class AppleStore {

    public static void main(String[] args) {

        AppleDevice obj = new Mac();
        obj.use();

        Mac obj2 = (Mac) obj;
        obj2.code();
        obj2.use();

        ((Mac) obj).use();
       ((Mac) obj).code();

    }
}
