package com.trl.creating_observables.fromIterable;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Observable.fromIterable(list)
                .subscribe(
                        out::println,
                        Throwable::printStackTrace,
                        () -> out.println("Done"));
    }
}
