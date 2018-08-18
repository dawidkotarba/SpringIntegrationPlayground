package com.dawidkotarba.springIntegrationPlayground.service;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class AdultsService {

    private static final Logger LOG = LoggerFactory.getLogger(AdultsService.class);

    public void serve(Message<Customer> msg) {
        final String login = msg.getPayload().getLogin();
        LOG.info("{} is an adult!", login);
    }
}
