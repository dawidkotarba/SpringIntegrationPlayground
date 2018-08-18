package com.dawidkotarba.springIntegrationPlayground.endpoint;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class IndboundEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(IndboundEndpoint.class);

    public Message<Customer> post1(Message<Customer> msg) {
        LOG.info("Login [1]: {}", msg.getPayload().getLogin());
        return msg;
    }

    public Message<Customer> post2(Message<Customer> msg) {
        LOG.info("Login [2]: {}", msg.getPayload().getLogin());
        return msg;
    }

    public Message<Customer> post3(Message<Customer> msg) {
        LOG.info("Login [3]: {}", msg.getPayload().getLogin());
        return msg;
    }

}
