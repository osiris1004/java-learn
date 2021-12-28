package com.t5cicle;

public class Circle {
    protected double radius;
    public Circle(double radius) {
       this.radius =  (radius < 0 )? 0: radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return  Math.PI * Math.pow(getRadius(),2);
    }
}
