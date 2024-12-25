package com.learning.solid.lsp;

public class LSP {
    public abstract static class Bird {
        public abstract void move();
    }

    public static class FlyingBird extends Bird {

        @Override
        public void move() {
            System.out.println("I can fly high !!");
        }
    }

    public static class NonFlyingBird extends Bird {

        @Override
        public void move() {
            System.out.println("I can walk , okay !!");
        }
    }

    public static class Penguin extends NonFlyingBird {}

    public static class Kiwi extends FlyingBird {}

    public static void main(String[] args) {
        Bird kiwi = new Kiwi();
        kiwi.move();

        Bird penguin = new NonFlyingBird();
        penguin.move();
    }
}
