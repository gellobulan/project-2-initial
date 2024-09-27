package com.csc205.project2;

public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone() {
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
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
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        return String.format("Cone {height=%.1f, radius=%.1f, surface area=%.10f, volume=%.10f}", height, radius, surfaceArea(), volume());
    }
}