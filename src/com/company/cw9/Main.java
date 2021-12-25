package com.company.cw9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Optional<String> optionalS = Optional.ofNullable(returnName("неVasya"));

        System.out.println(optionalS.orElse("No name"));

//        int max = 1000000;
//        List<UUID> values = new ArrayList<>(max);
//
//        for (int i = 0; i < max; i++) {
//            UUID uuid = UUID.randomUUID();
//            values.add(uuid);
//        }
//
//        long t0 = System.nanoTime();
//
//        long count = values.parallelStream()
//                .distinct()
//                .count();
//
//        long t1 = System.nanoTime();
//        long ms = TimeUnit.NANOSECONDS.toMillis(t1-t0);
//
//        System.out.println(ms);

//        List<String> list = new ArrayList<>();
//
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.add("five");
//        list.add("six");
//        list.add("seven");
//        list.add("eight");
//        list.add("nine");
//        list.add("ten");
//
//        Stream stream = list.stream();
//
//        stream.filter(x -> x.toString().length() == 3).limit(2).forEach(System.out::println);

//        list.forEach(System.out::println);
    }

    static String returnName(String name) {
        return name.equals("Vasya") ? null : name;
    }

//    @FunctionalInterface
//    interface Function {
//        int execute (int a, int b);
//    }
//
//    @FunctionalInterface
//    interface Function1 {
//        String execute (String str1, String str2);
//    }
//
//    public static void main(String[] args) {
////        List<Integer> list = new ArrayList<>();
////
////        list.add(1);
////        list.add(2);
////        list.add(3);
////        list.add(4);
////
////        list.forEach(n -> System.out.println(n));   //lambda
////
////        list.forEach(System.out::println);  //method reference
////
////        Consumer<Integer> method = (n) -> {System.out.println(n);}; //consumer
////        list.forEach(method);
////        Function sum = ((a, b) -> a + b);     //lambda
//        Function sum = (Integer::sum);      //reference
//        Function multiply = ((a, b) -> a * b);
//
////        System.out.println(sum.execute(3, 9));
////        System.out.println(multiply.execute(4, 5));
//
////      -------------------------------------------------
//
//        Predicate predicate = (n -> n%13 == 0);
//        System.out.println(predicate.check(13));
//
//        Function1 check = ((str1, str2) -> {
//            if (str1.length() > str2.length()){
//             return str1;
//            } else {
//                return str2;
//            }
//        });
//        System.out.println(check.execute("abc", "apple"));
//
////        Predicate predicate1 = x -> ;
////        System.out.println(predicate1.check(10));
//    }

}
