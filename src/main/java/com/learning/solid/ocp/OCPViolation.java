package com.learning.solid.ocp;

import java.util.Objects;

public class OCPViolation {
    public static class Shape {
        String type;

        public Shape(String type) {
            this.type = type;
        }
    }

    public static class ShapeDrawer {
        public void draw(Shape shape) {
            if (Objects.equals(shape.type, "circle")) {
                System.out.println("Draw a circle : Pi * r^2");
            } else if (Objects.equals(shape.type, "square")) {
                System.out.println("Draw a square : r^2");
            } else if (Objects.equals(shape.type, "triangle")) {
                System.out.println("Draw a triangle : r*h/2;");
            }
        }
    }

    public static void main(String[] args) {
        Shape circle = new Shape("circle");
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.draw(circle);

        Shape square = new Shape("square");
        shapeDrawer.draw(square);

        Shape triangle = new Shape("triangle");
        shapeDrawer.draw(triangle);
    }

}
