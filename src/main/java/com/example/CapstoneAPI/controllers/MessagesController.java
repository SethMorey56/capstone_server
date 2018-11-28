package com.example.CapstoneAPI.controllers;

import com.example.CapstoneAPI.domain.Messages;
import com.example.CapstoneAPI.respository.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class MessagesController {

    private final MessagesRepository messagesRepository;

    @Autowired
    public MessagesController(MessagesRepository messagesRepository) {
        this.messagesRepository = messagesRepository;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    @CrossOrigin
    public Iterable<Messages> getAllMessages() {
        return messagesRepository.findAll();
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    @CrossOrigin
    public Iterable<Messages> createMessages(@RequestBody Messages thing) {
        System.out.println("userId" + thing.getUserId());
        thing.setCreated_at(LocalDateTime.now());
        messagesRepository.save(thing);
        return messagesRepository.findAll();
    }
}
