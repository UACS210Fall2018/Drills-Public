package edu.uacs210fall2018.drill05;

public class Triangle extends Shape {
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
    public String toString() {
        return "Triangle(base = " + base + ", height = " + height + ")";
    }

    private double base;
    private double height;

}
