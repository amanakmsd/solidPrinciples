package com.learning.solid.isp;

public class ISP {
    public static interface Payment {
        public void pay();
    }

    public static class PaytmPayment implements Payment {

        @Override
        public void pay() {
            System.out.println("Payment done via paytm");
        }
    }

    public static class PhonepePayment implements Payment {

        @Override
        public void pay() {
            System.out.println("Payment done via Phonepe");
        }
    }

    public static void main(String[] args) {
        Payment phonepePayment = new PhonepePayment();
        phonepePayment.pay();
    }
}
