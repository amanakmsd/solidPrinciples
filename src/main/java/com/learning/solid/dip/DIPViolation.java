package com.learning.solid.dip;

public class DIPViolation {
    public static class EmailService {
        public void send(String message) {
            System.out.println("Email : " + message);

        }
    }

    public static class NotificationService {
        public EmailService emailService;

        public NotificationService() {
            this.emailService = new EmailService();
        }

        public void send(String message) {
            emailService.send(message);
        }
    }

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.send("Hi there !!!!");
    }
}
