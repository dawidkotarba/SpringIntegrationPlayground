package com.dawidkotarba.springIntegrationPlayground.service;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class KidsService {

    private static final Logger LOG = LoggerFactory.getLogger(KidsService.class);

    public Customer serve(final Customer msg) {
        final String login = msg.getLogin();
        LOG.info("{} is {}!", login, msg.getCustomerType());
        return msg;
    }

}
