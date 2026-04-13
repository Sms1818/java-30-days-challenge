/*
Design a Notification System for an application.

The app needs to send notifications through different channels:

Email
SMS
Push Notification
Requirements

Each notification type should be able to:

send(String message)

and print its own message, for example:

Email → Sending EMAIL: Hello
SMS → Sending SMS: Hello
Push → Sending PUSH: Hello
Extra Requirement

Before sending any notification, the system should first do a common step:

validateMessage(String message)

Rules:

if message is null or empty, print:

Invalid message

and do not send anything

In main

You should be able to do something like:

sendNotification(..., "Hello User");

for all three types.
*/

// Solution: My intuition was to use interface at first but then I realized that the validateMessage() method is common for all the notification types and it can be implemented in the abstract class Notification which will be extended by the classes Email, SMS and PushNotification. Each class will provide its own implementation of the sendNotification() method to print the respective messages. The main method will create objects of each notification type and call the sendNotification() method with a message to send the notifications.

// I used an abstract class because notification types share common behavior, validation, and differ only in the actual sending logic. I made sendNotification() final so the sending workflow stays consistent, and subclasses only implement the variable part through send().

// Output:
// Sending EMAIL: Hello User
// Sending SMS: Hello User
// Sending PUSH: Hello User

abstract class Notification{
    public final void sendNotification(String message){
        if(!validateMessage(message)){
           return; 
        }
        send(message);
    }
    public boolean validateMessage(String message){
        if(message==null || message.trim().isEmpty()){
            System.out.println("Invalid message");
            return false;
        }
        return true;
    }
    protected  abstract void send(String message);
}

class Email extends Notification{
    @Override
    protected  void send(String message) {
        System.out.println("Sending EMAIL: "+message);
    }
}
class SMS extends Notification{
    @Override
    protected  void send(String message) {
        System.out.println("Sending SMS: "+message);
    }
}
class PushNotification extends Notification{
    @Override
    protected  void send(String message) {
        System.out.println("Sending PUSH: "+message);
    }
}
public class NotificationSystemDemo {
    public static void main(String[] args) {
        Notification email=new Email();
        Notification sms=new SMS();
        Notification push=new PushNotification();

        email.sendNotification("Hello User");
        sms.sendNotification("Hello User");
        push.sendNotification("Hello User");
    }
}
