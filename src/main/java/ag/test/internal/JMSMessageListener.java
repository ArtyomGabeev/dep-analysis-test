package ag.test.internal;

import ag.test.MessageListener;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;

public class JMSMessageListener implements MessageListener {

    @Override
    @JmsListener(containerFactory = "myFactory", destination = "dst")
    public void onMessage(Message<?> message) {
        // TODO
    }
}