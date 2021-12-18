package com.company.cw8;

public class Main {

    public static void main(String[] args) throws MyException {

        test();

    }

    private static String test() throws MyException {

        try {
            System.out.println("try");
        } catch (NullPointerException exception) {
            throw new MyException("MyException was caught", exception);
        }

        return "";
    }

}
