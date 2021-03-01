package com.trl.creating_observables.fromArray;

import io.reactivex.rxjava3.core.Observable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Observable.fromArray(array)
                .subscribe(
                        out::println,
                        Throwable::printStackTrace,
                        () -> out.println("Done"));
    }
}
