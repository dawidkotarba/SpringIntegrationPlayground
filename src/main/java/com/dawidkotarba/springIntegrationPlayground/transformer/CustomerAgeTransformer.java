package com.dawidkotarba.springIntegrationPlayground.transformer;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomerAgeTransformer {

    public Message<Customer> transform(Message<Customer> msg) {
        final int age = msg.getPayload().getAge();
        if (age < 0 || age > 120) {
            msg.getPayload().setAge(0);
        }
        return msg;
    }
}
