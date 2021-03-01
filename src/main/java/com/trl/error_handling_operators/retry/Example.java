package com.trl.error_handling_operators.retry;

import io.reactivex.rxjava3.core.Observable;

import java.util.Scanner;
import java.util.concurrent.Callable;

import static java.lang.System.out;

public class Example {
    public static void main(String[] args) {

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Callable<?> callable1 = () -> {

            Scanner scanner = new Scanner(System.in);
            out.println("Guess word...");
            String word = scanner.nextLine();

            if (word.equals("Hello")) {
                return "You guessed word. Congratulations";
            } else {
                throw new RuntimeException("Word is incorrect");
            }
        };

//        Observable.fromCallable(callable1)
//                .retry()
//                .subscribe(out::println);

        out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Callable<?> callable2 = () -> {

            Scanner scanner = new Scanner(System.in);
            out.println("You have three attempts for guess word...");
            String word = scanner.nextLine();

            if (word.equals("Hello")) {
                return "You guessed word. Congratulations";
            } else {
                throw new RuntimeException("Word is incorrect");
            }
        };

        Observable.fromCallable(callable2)
                .retry(3)
                .subscribe(
                        out::println,
                        error -> out.println(error.getMessage())
                );
    }
}
