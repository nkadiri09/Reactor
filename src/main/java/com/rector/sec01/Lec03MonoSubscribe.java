package com.rector.sec01;

import com.rector.sec01.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {
    public static void main(String[] args) {
        Mono<String> mono = Mono.just("Narendra");
        // Mono also lazily initialized
        System.out.println("mono is: " + mono);

        // we can log information using mono.log
        mono.log().subscribe(i-> System.out.println("Received :" + i));
        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onnComplete()
        );
    }
}
