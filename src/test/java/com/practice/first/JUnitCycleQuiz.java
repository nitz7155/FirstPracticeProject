package com.practice.first;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitCycleQuiz {

    @BeforeEach
    public void beforeEach() {
        System.out.println("Hello!");
    }

    @Test
    public void junitTest1() {
        System.out.println("This is first test");
    }

    @Test
    public void junitTest2() {
        System.out.println("This is second test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Bye!");
    }
}
