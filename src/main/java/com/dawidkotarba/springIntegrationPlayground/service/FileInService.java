package com.dawidkotarba.springIntegrationPlayground.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FileInService {

    private static final Logger LOG = LoggerFactory.getLogger(FileInService.class);

    public void print(String fileString) {
        LOG.info("Incoming file: {}", fileString);
    }
}
