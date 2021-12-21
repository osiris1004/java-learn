package com.T1calculator;
/*
The get method returns the variable value,and
the set method sets the value.

we will often see java program that either have static or public attributes and methods.
A static method is one in which that can be accessed without creating an object of the class,
while public, require an object for accessing it:


public	The code(which can be a class, ttributes, methods and constructors) is accessible by any other class
 */

public class SimpleCalculator {
    private double firstNumber ;
    private double secondNumber ;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }


    public double isFirstNumber() {
        return firstNumber;
    }
    public double isSecondNumber() {
        return secondNumber;
    }



}
