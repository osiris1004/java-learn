package com.t5cicle;

/*

class subClass extends parentClass{}
all so the class with public static void main can extend
* */
class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);  // super(radius) call the constructor of the parent class and pass the radius.
        //this is because when you create an object of the subClass you can pass the value radius
        // since the subClass extend from the parent
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return  (2*Math.PI*getRadius()*getHeight())+(2*Math.PI*Math.pow(getRadius(),2));
    }
}
