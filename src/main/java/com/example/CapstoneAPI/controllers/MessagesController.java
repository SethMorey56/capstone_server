package com.example.CapstoneAPI.controllers;

import com.example.CapstoneAPI.domain.Messages;
import com.example.CapstoneAPI.respository.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessagesController {

    private final MessagesRepository messagesRepository;

    @Autowired
    public MessagesController(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @GetMapping("/messages")
    public Iterable<Messages> getMessages() {
        return messagesRepository.findAll();
    }
}
