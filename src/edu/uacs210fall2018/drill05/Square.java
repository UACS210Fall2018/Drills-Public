package edu.uacs210fall2018.drill05;

public class Square extends Shape {
    public Square(double size) {
        this.size = size;
    }

    public double area() {
        return size * size;
    }

    public String toString() {
        return "Square(size = " + size + ")";
    }

    private double size;
}
