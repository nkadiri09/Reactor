package com.rector.sec01;

import reactor.core.publisher.Mono;

public class Lec02MonoJust {

    public static void main(String[] args) {
        Mono<Integer> mono = Mono.just(10);
        // Mono also lazily initialized
        System.out.println("mono is: " + mono);

        // we can log information using mono.log
        mono.log().subscribe(System.out::println);

        mono.subscribe(i -> System.out.println("Received :" + i));
    }
}
