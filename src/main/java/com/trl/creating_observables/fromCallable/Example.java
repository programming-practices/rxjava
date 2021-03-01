package com.trl.creating_observables.fromCallable;

import io.reactivex.rxjava3.core.Observable;

import java.util.Scanner;
import java.util.concurrent.Callable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Observable.fromCallable(
                () -> {
                    return "Hello World !!!";
                })
                .subscribe(out::println);


        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Callable<String> callable = () -> {
            Scanner scanner = new Scanner(System.in);
            out.println("Enter you name...");
            String name = scanner.nextLine();
            return "Hello " + name + "!!!";
        };

        Observable.fromCallable(callable)
                .subscribe(out::println);
    }
}
