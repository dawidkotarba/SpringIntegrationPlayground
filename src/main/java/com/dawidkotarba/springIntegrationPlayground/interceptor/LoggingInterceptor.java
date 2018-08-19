package com.dawidkotarba.springIntegrationPlayground.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.ChannelInterceptorAdapter;

public class LoggingInterceptor extends ChannelInterceptorAdapter {

    private static final Logger LOG = LoggerFactory.getLogger(LoggingInterceptor.class);

    @Override
    public Message<?> preSend(Message<?> message, MessageChannel channel) {
        LOG.info("Message: {} in channel: {}", message.getPayload(), channel);
        return super.preSend(message, channel);
    }
}
