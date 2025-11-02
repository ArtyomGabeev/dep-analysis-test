package ag.test;

import org.springframework.messaging.Message;

public interface MessageListener {

    void onMessage(Message<?> message);

}