package factorymethod;

public class Main {

    public static void main(String[] args) {

        NotificationService emailService =
                new NotificationService(new EmailNotificationFactory());

        NotificationService smsService =
                new NotificationService(new SMSNotificationFactory());

        NotificationService pushService =
                new NotificationService(new PushNotificationFactory());

        String message = "Bem-vindo ao sistema!";

        emailService.sendNotification(message);
        smsService.sendNotification(message);
        pushService.sendNotification(message);
    }
}