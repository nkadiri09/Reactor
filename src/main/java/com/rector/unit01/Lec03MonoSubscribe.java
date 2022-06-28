package com.rector.unit01;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Narendra");
        // Mono also lazily initialized
        System.out.println("mono is: " + mono);

        // we can log information using mono.log
        mono.log().subscribe(i-> System.out.println("Received :" + i));
        mono.subscribe(
                i -> System.out.println("Received :" + i),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("completed")
        );
    }
}
