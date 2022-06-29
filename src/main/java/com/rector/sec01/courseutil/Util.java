package com.rector.sec01.courseutil;

import java.util.function.Consumer;

public class Util {

    public static Consumer<Object> onNext(){
        return o -> System.out.println("Received: "+o);
    }

    public static Consumer<Throwable> onError(){
        return err -> System.out.println("Error: "+err.getMessage());
    }

    public static Runnable onnComplete(){
        return () -> System.out.println("Completed");
    }
}
