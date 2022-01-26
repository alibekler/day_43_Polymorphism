package day45_exceptions;

import java.io.IOException;
import java.util.InputMismatchException;

public class OrCatchBlock {

    static String str;

    public static void main(String[] args) {

        try {
            System.out.println(str.toUpperCase());
        } catch (NumberFormatException  | InputMismatchException e) {
            System.out.println("error caught");
        }
    }
}

