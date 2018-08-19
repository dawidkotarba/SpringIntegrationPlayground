package com.dawidkotarba.springIntegrationPlayground.transformer;


import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class CustomerLoginTransformer {

    public Message<Customer> transform(Message<Customer> msg) {
        final String login = msg.getPayload().getLogin();
        msg.getPayload().setLogin(login + "-test");
        return msg;
    }
}
