package test;

import org.springframework.messaging.Message;

public class MessageProcessor {
    public void processMessage(Message<String> message) {
        String payload = message.getPayload();
        System.out.println("Processing message: " + payload);
    }
}
