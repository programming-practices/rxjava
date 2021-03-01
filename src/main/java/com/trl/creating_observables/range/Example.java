package com.trl.creating_observables.range;

import io.reactivex.rxjava3.core.Observable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable.range(1, 10)
                .subscribe(out::println);
    }
}
