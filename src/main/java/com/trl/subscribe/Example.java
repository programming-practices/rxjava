package com.trl.subscribe;

import io.reactivex.rxjava3.core.Observable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable<Integer> observable1 = Observable.just(1, 2, 3, 4, 5);
        observable1.subscribe(out::println);

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable<Integer> observable2 = Observable.just(1, 2, 3, 4, 5);
        observable1.subscribe(out::println, out::println, () -> out.println("Wil be launched when action is completed"));
    }
}
