package com.learning.solid.dip;

public class DIP {
    public static interface NotificationSender {
        public void send(String message);
    }

    public static class EmailService implements NotificationSender {

        @Override
        public void send(String message) {
            System.out.println("Email : " + message);
        }
    }

    public static class SMSService implements NotificationSender {

        @Override
        public void send(String message) {
            System.out.println("SMS : " + message);
        }
    }

    public static class NotificationService {
        private final NotificationSender notificationSender;

        public NotificationService(NotificationSender notificationSender) {
            this.notificationSender = notificationSender;
        }

        public void send(String message) {
            notificationSender.send(message);
        }
    }

    public static void main(String[] args) {
        NotificationSender smsService = new SMSService();
        NotificationService notificationService = new NotificationService(smsService);
        notificationService.send("Hi there !!!");

    }
}
