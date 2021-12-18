package com.company.cw8;

public class Main {

    public static void main(String[] args) throws MyException {
        test();
    }

    private static String test() throws MyException {

        try {
            System.out.println("try");
            System.out.println(9/0);
        } catch (ArithmeticException exception) {
            throw new MyException("MyException was caught", exception);
        }

        return "";
    }

}
