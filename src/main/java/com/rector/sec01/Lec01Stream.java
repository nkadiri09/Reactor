package com.rector.sec01;

import java.util.stream.Stream;

public class Lec01Stream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5)
                .map(i -> {
                    System.out.println("Test");
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Test11111");
                    return i * 2;
                });
        // Stream is lazy initialized
        System.out.println(integerStream);

        //intermediate operations
        //List<Integer> collect = integerStream.map(a -> a * a).collect(Collectors.toList());
        // System.out.println("collect is: "+collect);


        /**
         *  Terminal operation
         *  Stream will execute whenever we connect with Terminal operator.
         */

        integerStream.forEach(System.out::println);
    }
}
