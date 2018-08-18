package com.dawidkotarba.springIntegrationPlayground.router;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class AgeRouter {

    private static final Logger LOG = LoggerFactory.getLogger(AgeRouter.class);

    public boolean isAdult(Message<Customer> msg) {
        final int age = msg.getPayload().getAge();
        LOG.info("Age: {}", age);
        return age >= 18;
    }
}
