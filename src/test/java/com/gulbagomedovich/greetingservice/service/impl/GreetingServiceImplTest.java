package com.gulbagomedovich.greetingservice.service.impl;

import com.gulbagomedovich.greetingservice.dto.GreetingDto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class GreetingServiceImplTest {
    @InjectMocks
    private GreetingServiceImpl greetingService;

    @Test
    void getGreeting() {
        String name = "Murad";

        GreetingDto greeting = greetingService.getGreeting(name);
        String actual = greeting.getContent();

        String expected = String.format("Hello, %s!", name);

        assertEquals(expected, actual);
    }
}