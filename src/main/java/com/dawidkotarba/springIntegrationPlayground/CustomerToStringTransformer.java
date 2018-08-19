package com.dawidkotarba.springIntegrationPlayground;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomerToStringTransformer {

    public String transfor(Message<Customer> msg) {
        return msg.getPayload().toString();
    }
}
