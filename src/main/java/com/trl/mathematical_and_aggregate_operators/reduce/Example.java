package com.trl.mathematical_and_aggregate_operators.reduce;

import io.reactivex.rxjava3.core.Observable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable.just("Hello", "World", "!!!")
                .reduce((a, b) -> a + b)
                .subscribe(out::println);

    }
}
