package ag.test;

import ag.test.internal.JMSMessageListener;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class MessageListenerAutoConfiguration {

    @Bean
    MessageListener messageListener() {
        return new JMSMessageListener();
    }

}