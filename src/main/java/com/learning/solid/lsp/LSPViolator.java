package com.learning.solid.lsp;

public class LSPViolator {
    public static abstract class Bird {
        public abstract void fly();
    }

    public static class Kiwi extends Bird {

        @Override
        public void fly() {
            System.out.println("I am flying high");
        }
    }

    public static class Penguin extends Bird {

        @Override
        public void fly() {
            throw new UnsupportedOperationException("Who asks penguins to fly ? Shame! Shame!");
        }
    }

    public static void main(String[] args) {
        try {
            Bird kiwi = new Kiwi();
            kiwi.fly();

            Bird penguin = new Penguin();
            penguin.fly();
        } catch (Exception e) {
            System.out.println("Exception occured" + e.getMessage());
        }
    }

}
