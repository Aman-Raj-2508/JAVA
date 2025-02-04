public class NotificationExample {
    public static void main(String[] args) {
        NotificationService emailService = new EmailService("as@gmail.com");
        NotificationService smsService = new SMSNotificationService("+11 94304");

        emailService.sendNotifications("Hello this is an email ");
        smsService.sendNotifications("hello this is an SMS");

        emailService.subscribeToTopic("Maths");
        smsService.subscribeToTopic("Bio");

    }
}
