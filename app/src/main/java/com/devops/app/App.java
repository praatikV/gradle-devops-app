package com.devops.app;

/**
 * Entry point for the DevOps demo application.
 * Demonstrates a simple service that Gradle will build, test, and package.
 */
public class App {

    public String greeting() {
        return "Hello from a Gradle-built Java app!";
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.greeting());

        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("20 / 4 = " + calc.divide(20, 4));
    }
}
