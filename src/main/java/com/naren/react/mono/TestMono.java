package com.naren.react.mono;

import com.github.javafaker.Faker;
import com.naren.react.util.Util;
import reactor.core.publisher.Mono;

public class TestMono {
    public static void main(String[] args) {
        //monoJust();
        // monoOnNextAndOnErrorAndOnCompleted();
        getName(3).subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    private static void monoJust() {
        Mono<String> testMono = Mono.just("Narendra");
        testMono.subscribe(Util.onNext());
    }

    private static void monoFaker() {
        Mono<String> testMono = Mono.just("Narendra");
        testMono.subscribe(Util.onNext());
        Faker faker = Util.getFaker();
        for (int i = 0; i < 10; i++) {
            System.out.println("Name is: "+faker.name().fullName());
        }
    }

    private static void monoOnNextAndOnErrorAndOnCompleted() {
        Faker faker = Util.getFaker();
        for (int i = 0; i < 10; i++) {
            System.out.println("Name is: "+faker.name().fullName());
        }
    }

    public static Mono<String> getName(int i) {
        if (i == 1)
            return Mono.just(Util.getFaker().name().fullName());
        else if (i == 2)
            return Mono.empty();
        else
            return Mono.error(new RuntimeException("Record Not found"));
    }


}