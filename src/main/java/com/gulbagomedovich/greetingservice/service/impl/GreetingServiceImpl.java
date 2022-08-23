package com.gulbagomedovich.greetingservice.service.impl;

import com.gulbagomedovich.greetingservice.dto.GreetingDto;
import com.gulbagomedovich.greetingservice.service.GreetingService;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingServiceImpl implements GreetingService {
    private static final String GREETING_TEMPLATE = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    @Override
    public GreetingDto getGreeting(String name) {
        return new GreetingDto(counter.incrementAndGet(), String.format(GREETING_TEMPLATE, name));
    }
}
