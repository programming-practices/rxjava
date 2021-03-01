package com.trl.tmp;

import io.reactivex.rxjava3.core.Observable;

public class RxJavaHelloWorld {
    public static void main(String[] args) {

        Observable<String> observable = Observable.just("Hello World !!!");
        observable.subscribe(System.out::println);

    }
}
