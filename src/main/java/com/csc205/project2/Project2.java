package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public class Project2 {

    public static void main(String[] args) {

        // Instantiate the shapes
        Sphere sphere = new Sphere(2.0);
        Cube cube = new Cube(5.0);
        Cylinder cylinder = new Cylinder(4.0, 1.0);
        Cone cone = new Cone(4.0, 2.0); // Ensure this class is implemented

        // Create a list to hold the shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);
        shapes.add(cone);

        // Print each shape's details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}