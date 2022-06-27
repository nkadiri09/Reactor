package com.rector.unit01;

import java.util.stream.Stream;

public class Lec01Stream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1)
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
        System.out.println(integerStream);
        integerStream.forEach(System.out::println);
    }
}
