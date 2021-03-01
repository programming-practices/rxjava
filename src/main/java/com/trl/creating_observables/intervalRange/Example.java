package com.trl.creating_observables.intervalRange;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) throws InterruptedException {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable.intervalRange(1L, 10L, 1L, 1L,TimeUnit.SECONDS)
                .subscribe(out::println);

        // Without a Tread.sleep(), nothing will be output to the console. Because the executable code carried over to
        // a separate thread, and the main thread will be terminated.
        Thread.sleep(10000);

    }
}
