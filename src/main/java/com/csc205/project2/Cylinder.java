package com.csc205.project2;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    // Make sure the order is height first, then radius
    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * (height + radius);
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder {height=%.1f, radius=%.1f, surface area=%.10f, volume=%.10f}", height, radius, surfaceArea(), volume());
    }
}