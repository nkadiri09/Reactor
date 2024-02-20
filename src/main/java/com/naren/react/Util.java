package com.naren.react;

import com.github.javafaker.Faker;

import java.util.function.Consumer;

public class Util {

    private static final Faker FAKER = Faker.instance();

    public static Consumer<Object> onNext(){
        return System.out::println;
    }

    public static Consumer<Throwable> onError(){
        return System.out::println;
    }

    public static Runnable onComplete(){
        return () -> System.out.println("Completed");
    }

    public static Faker getFaker(){
        return FAKER;
    }

}