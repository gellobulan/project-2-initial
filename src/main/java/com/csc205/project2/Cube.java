package com.csc205.project2;

public class Cube extends Shape {
    private double width;

    public Cube() {
        this.width = 0.0;
    }

    public Cube(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 6.0 * Math.pow(width, 2);
    }

    @Override
    public double volume() {
        return Math.pow(width, 3);
    }

    @Override
    public String toString() {
        return String.format("Cube {width=%.1f, surface area=%.1f, volume=%.1f}", width, surfaceArea(), volume());
    }
}
