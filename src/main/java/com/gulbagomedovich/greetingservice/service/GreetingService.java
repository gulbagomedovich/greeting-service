package com.gulbagomedovich.greetingservice.service;

import com.gulbagomedovich.greetingservice.dto.GreetingDto;

public interface GreetingService {
    GreetingDto getGreeting(String name);
}
