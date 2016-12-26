package com.formento.spring.reactive.web;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

// mvn -Dtest=PerformanceTest test
// mvn -Dtest=PerformanceTest#shouldRunAllThreadsPossibles test
public class PerformanceTest {

    private final static String[] NUMBERS = {
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten"};

    private static final Random RANDOM = new Random();
    private static final Integer BOUND = NUMBERS.length - 1;

    private String giveMeANewText() {
        return NUMBERS[RANDOM.nextInt(BOUND)];
    }

    private String randomString;

    @Before
    public void init() {
        this.randomString = giveMeANewText();
    }

    @Test
    public void shouldExplodeMemory() {
        String text = "text";
        while (true) {
            text += text;
        }
    }

    @Test(timeout = 1500)
    public void shouldRunAllThreadsPossibles() {
        final Person person = new Person();
        while (true) {
            final Runnable runnable = () -> {
//                for (int i = 0; i <= 100; i++) {
                while (true) {
                    person.name = giveMeANewText();
                }
//                System.out.println(Thread.currentThread().getName());
            };

            new Thread(runnable).start();
        }
    }

}

class Person {
    String name;
}
