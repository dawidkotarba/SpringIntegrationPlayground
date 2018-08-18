package com.dawidkotarba.springIntegrationPlayground.endpoint;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class IndboundEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(IndboundEndpoint.class);

    public void post(Message<Customer> msg) {
        LOG.info("Login: {}", msg.getPayload().getLogin());
    }

}
