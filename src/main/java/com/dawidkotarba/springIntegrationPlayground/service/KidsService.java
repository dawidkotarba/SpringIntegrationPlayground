package com.dawidkotarba.springIntegrationPlayground.service;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class KidsService {

    private static final Logger LOG = LoggerFactory.getLogger(KidsService.class);

    public Message<Customer> serve(Message<Customer> msg) {
        final String login = msg.getPayload().getLogin();
        LOG.info("{} is a kid!", login);
        return msg;
    }

}
