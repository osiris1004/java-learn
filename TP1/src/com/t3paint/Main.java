package com.t3paint;

public class Main {
    public static void main(String[] args) {
        PaintCalculator paintDetail = new PaintCalculator(2,2,2);
        System.out.println("" +
                "your surface room is :" +paintDetail.roomArea()+" square area"+
                "\nand you will need " +String.format("%.2f",paintDetail.quantityOfPaintInLiter())+" litters"+
                "\nwhich cost " +String.format("%.2f",paintDetail.price())+"euro");

    }
}
