package com.t1calculator;
/*
The get method returns the variable value,and
the set method sets the value.

we will often see java program that either have static or public attributes and methods.
A static method is one in which that can be accessed without creating an object of the class,
while public, require an object for accessing it:

Access Modifiers - controls the access level
------------------------------------
public modifier:        The code(which can be a class, ttributes, methods and constructors) is accessible by any other class
private  modifier:      The code is only accessible within the declared class
protected  modifier:    The code is accessible in the same package and subclasses.
default modifier:       the code is only accessible in the same package

Non-Access Modifiers - do not control access level, but provides other functionality
------------------------------------
-final	    The class cannot be inherited by other classes also final Attributes and methods cannot be overridden/modified
-static	    Attributes and methods belongs to the class, rather than an object
-abstract    The class cannot be used to create objects (To access an abstract class, it must be inherited from another class
also abstract Attributes and methods Can only be used in an abstract class, and can only be used on methods. The method does not have a body, for example abstract void run();. The body is provided by the subclass (inherited from).
 -
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

    public  double getAdditionResult(){
        return  firstNumber + secondNumber;
    }
    public  double getSoustractionResult(){
        return  firstNumber - secondNumber;
    }
    public  double getMultiplicatinResult()  {
        return  firstNumber * secondNumber;
    }
    public  double getDivisionResult() {
        return firstNumber > 0 ? firstNumber * secondNumber : 0;

    }



}
