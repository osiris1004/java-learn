package com.t3paint;


public class PaintCalculator {
    private double roomLength;
    private double roomWidth;
    private double roomHeight;

    PaintCalculator(double roomLength,double roomWidth,double roomHeight){
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
        this.roomHeight = roomHeight;

    }

    public double getRoomLength() {
        return roomLength;
    }
    public double getRoomWidth() {
        return roomWidth;
    }
    public double getRoomHeight() {
        return roomHeight;
    }


    public double roomArea(){
        return getRoomHeight()*getRoomWidth()*getRoomLength();
    }
    public  double quantityOfPaintInLiter(){
        return roomArea()/3.785;
    }
    public  double price(){
        //1l = 30$
        return quantityOfPaintInLiter()/30;
    }


}
