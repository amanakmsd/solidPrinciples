package com.learning.solid.isp;

public class ISPViolator {
    public static interface Payment {
        void payViaPaytm();
        void payViaPhonePe();
    }

    public static class PaymentImpl implements Payment {

        @Override
        public void payViaPaytm() {
            System.out.println("Payment done via paytm");
        }

        @Override
        public void payViaPhonePe() {
            System.out.println("Payment done via phonepe");
        }
    }

    public static void main(String[] args) {
        Payment payment = new PaymentImpl();
        payment.payViaPaytm();
    }
}
