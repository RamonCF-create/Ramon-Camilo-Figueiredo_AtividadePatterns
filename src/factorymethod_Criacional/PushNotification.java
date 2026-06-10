package factorymethod_Criacional;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("PushFactory enviando: \"" + message + "\"");
    }
}