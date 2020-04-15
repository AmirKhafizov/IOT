package ru.kpfu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.kpfu.services.ProducerService;

/**
 * @author Iskander Valiev
 * created by isko
 * on 4/15/20
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private ProducerService producerService;

    @PostMapping("/publish")
    @ResponseStatus(HttpStatus.OK)
    public String sendMessage(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Sent";
    }
}
