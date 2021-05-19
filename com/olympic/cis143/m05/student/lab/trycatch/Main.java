package com.olympic.cis143.m05.student.lab.trycatch;

/*
 * Author: Joseph Racke
 * Date: 17-MAY-2021
 */

public class Main {

    public static void main (String[] a) throws InterruptedException {
        Main main = new Main();
        main.testNeedsToBeModified();;
    }

    public void testNeedsToBeModified() throws InterruptedException {
        new ThrowsException().throwAnExceptionForMe();
    }
}
