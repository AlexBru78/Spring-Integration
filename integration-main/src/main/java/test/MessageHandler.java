package test;

import org.springframework.messaging.Message;

public class MessageHandler {

    public void handleSplitMessage(Message<?> message) {
        Object payload = message.getPayload();
        System.out.println("Split message: " + payload);
    }
}
