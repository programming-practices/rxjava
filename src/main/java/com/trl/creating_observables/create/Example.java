package com.trl.creating_observables.create;

import io.reactivex.rxjava3.core.Observable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable.create(emitter -> {
            emitter.onNext("Hello World!!!");
//            emitter.onComplete();

        }).subscribe(out::println);
    }
}
