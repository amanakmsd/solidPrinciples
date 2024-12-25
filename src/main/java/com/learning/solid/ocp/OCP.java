package com.learning.solid.ocp;

import java.util.Objects;

public class OCP {
    public static abstract class Shape {
        public abstract void draw();
    }

    public static class Circle extends Shape {

        @Override
        public void draw() {
            System.out.println("Draw a circle : Pi * r^2");
        }
    }

    public static class Square extends Shape {

        @Override
        public void draw() {
            System.out.println("Draw a square : r^2");
        }
    }

    public static class Triangle extends Shape {

        @Override
        public void draw() {
            System.out.println("Draw a triangle : r*h/2;");
        }
    }

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        Shape triangle = new Triangle();
        triangle.draw();
    }

}
