package com.naren.react;

import com.github.javafaker.Faker;
import reactor.core.publisher.Mono;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMono {
    public static void main(String[] args) {
        Mono<String> testMono = Mono.just("Narendra");
        testMono.subscribe(Util.onNext());

        Faker faker = Util.getFaker();
        for (int i = 0; i < 10; i++) {
            System.out.println("Name is: "+faker.name().fullName());
        }
    }
}