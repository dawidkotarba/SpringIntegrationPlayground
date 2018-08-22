package com.dawidkotarba.springIntegrationPlayground.service;

import com.dawidkotarba.springIntegrationPlayground.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerIdGenerationService {

    public int generate(final Customer customer) {
        return customer.hashCode();
    }
}
