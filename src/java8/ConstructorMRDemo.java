package java8;

interface InterfaceMessage {
    Message getMsg(String msg);
}

public class ConstructorMRDemo {

    public static void main(String[] args) {

        InterfaceMessage message = Message::new;
        message.getMsg("hii");

    }
}

class Message {
    Message(String msg) {
        System.out.println(msg);
    }
}