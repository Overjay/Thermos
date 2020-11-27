package com.overjay;


public class Main {


    public static void main(String[] args) {
        MatLayer testLayer = new MatLayer(0.15f, 130.0f, 0.054f, 0.002f, 1);
        System.out.println(testLayer.thickness);
        System.out.println(testLayer.thermResist);
    }




}
