package com.gulbagomedovich.greetingservice.controller;

import com.gulbagomedovich.greetingservice.dto.GreetingDto;
import com.gulbagomedovich.greetingservice.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
@RequiredArgsConstructor
public class GreetingController {
    private final GreetingService greetingService;

    @GetMapping
    public GreetingDto getGreeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return greetingService.getGreeting(name);
    }
}
