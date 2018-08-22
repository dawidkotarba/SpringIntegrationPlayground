package com.dawidkotarba.springIntegrationPlayground.service;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class KidsService {

    private static final Logger LOG = LoggerFactory.getLogger(KidsService.class);

    public Customer serve(final Message<Customer> msg) {
        final int customerTypeHeader = (int) msg.getHeaders().get("customerGeneratedId");
        final Customer payload = msg.getPayload();
        final String login = payload.getLogin();
        LOG.info("{} is {}. Customer type header: {}", login, payload.getCustomerType(), customerTypeHeader);
        return payload;
    }

}
