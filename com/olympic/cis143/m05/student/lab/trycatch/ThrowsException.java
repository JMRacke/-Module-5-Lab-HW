package com.olympic.cis143.m05.student.lab.trycatch;

/*
 * Author: Joseph Racke
 * Date: 17-MAY-2021
 */

public class ThrowsException {

    public void throwAnExceptionForMe() throws  InterruptedException, MyException {
        this.thowMultipleExceptionsForMe();
    }

    private void thowMultipleExceptionsForMe() throws  InterruptedException, MyException {
        if ( 1 == 1 ) {
            throw new InterruptedException("Another exception that you will need to take care of.");
        }
        throw new MyException("Simple exception that you will need to take care of");
    }
}
