package desighPatterns.creationalPattern.factoryMethodPattern;

import java.util.Scanner;

/**
 * Factory Method Pattern is a Creational Design Pattern, it uses an interface to create the Objects in the super class, allowing the subclass to alter the type of the Object.
 * <p> It encapsulates object creation logic in a separate method, promoting loose coupling between the creator and the created objects.</p>
 */
enum NotificationTypes {
    EMAIL,
    SMS,
    PUSH;
}
abstract class Notification{
    abstract public void send();
}

class Email extends Notification{

    private String sender;
    private String receiver;
    private String body;

    @Override
    public void send(){
        System.out.println("Email notification is sent...");
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setReceiver(String receiver){
        this.receiver = receiver;
    }
}


class Sms extends Notification{

    private Long PhoneNumber;
    @Override
    public void send() {
        System.out.println("SMS notification is sent...");
    }

    public void setPhoneNumber(Long phoneNumber){
        this.PhoneNumber = phoneNumber;
    }

}

abstract class NotificationFactory{
    abstract public Notification create();
}

class EmailFactory extends NotificationFactory{
    @Override
    public Notification create(){
        Email email = new Email();

        // We might receive the sender and receiver and body as params to this function and there can be many validations on the arguments.
        // So, here object creation process is a bit complicated.

        email.setBody("body");
        email.setSender("sender");
        email.setReceiver("RECEIVER");
        return email;
    }
}

class SmsFactory extends NotificationFactory{
    @Override
    public Notification create() {
        Sms sms = new Sms();
        // We might receive the phoneNumber as an argument of this method & we need to perform some validations on it.
        sms.setPhoneNumber(9449222908l);
        return sms;
    }
}


public class Client {

    public static void main(String []args) {
        if(false)
        {

        // If we try to handle the creation of Objects in client code instead of using factory methods:
        // Client code must be altered when a new Notification type is required to be incorporated, this is against OCP.
        // If the Object creation process is complicated, we need to handle everything in client code only. This will be against SRP.
        // --> Let say you need to decide the sender and receiver, validate them etc.
        //

        NotificationTypes notificationType = null;
        Notification notification1 = null;

        System.out.println("What type of notification do you want to send...?? SMS, EMAIL, PUSH: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            notificationType = NotificationTypes.valueOf(scanner.next());
        }

        switch (notificationType) {
            case SMS -> {
                notification1 = new Sms();
                // We might need to perform some validations on the phone Number. So, we need to add that code here.
                ((Sms) notification1).setPhoneNumber(7736409143l);
                break;
            }
            case EMAIL -> {
                notification1 = new Email();
                // We might need to perform some validations on sender and receiver and body here. So, we need to add that code here.
                ((Email) notification1).setBody("body");
                ((Email) notification1).setSender("sender");
                ((Email) notification1).setReceiver("RECEIVER");
                break;
            }
            default -> System.out.println("Invalid NotificationType");
        }
        notification1.send();
    }
        else
        {
            NotificationTypes notificationType = null;
            NotificationFactory notificationFactory = null;
            Notification notification = null;

            System.out.println("What type of notification do you want to send...?? SMS, EMAIL, PUSH: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNext()) {
                notificationType = NotificationTypes.valueOf(scanner.next());
            }

            switch (notificationType) {
                case SMS -> {
                    notificationFactory = new SmsFactory();
                    break;
                }
                case EMAIL -> {
                    notificationFactory = new EmailFactory();
                    break;
                }
                default -> System.out.println("Invalid NotificationType");
            }
            notification = notificationFactory.create();
            notification.send();
        }
    }
}
