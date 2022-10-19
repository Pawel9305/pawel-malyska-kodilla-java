package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result  = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.err.println("Error!");
        }

        //Pierwszy test jednostkowy -->
        System.out.println("Test - pierwszy test jednostkowy");

        Calculator calculator = new Calculator();

        int sum = calculator.add(5, 2);

        if (sum == 7) {
            System.out.println("test OK");
        } else {
            System.err.println("Error!");
        }

        int sub = calculator.subtract(10, 8);

        if (sub == 2) {
            System.out.println("test OK");
        } else {
            System.err.println("Error!");
        }

    }
}
