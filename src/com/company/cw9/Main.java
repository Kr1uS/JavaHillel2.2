package com.company.cw9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.forEach(n -> System.out.println(n));   //lambda

        list.forEach(System.out::println);  //method reference

        Consumer<Integer> method = (n) -> {System.out.println(n);}; //consumer
        list.forEach(method);
    }

}
