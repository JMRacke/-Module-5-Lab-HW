package com.olympic.cis143.m05.student.homework.annotations1;

/*
 * Author: Joseph Racke
 * Date: 17-MAY-2021
 */
public class HomeworkAnnotations implements IHomeworkAnnotation {

	@Override @Deprecated
    public String sayHello() {
        return "Hello";
    }

	@Deprecated
    public String sayGoodBye() {
        return "Goodbye";
    }
}
