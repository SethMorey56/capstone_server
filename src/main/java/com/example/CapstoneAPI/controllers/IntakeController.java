package com.example.CapstoneAPI.controllers;

import com.example.CapstoneAPI.domain.Intake;
import com.example.CapstoneAPI.respository.IntakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class IntakeController {

    private final IntakeRepository intakeRepository;

    @Autowired
    public IntakeController(IntakeRepository intakeRepository) {
        this.intakeRepository = intakeRepository;
    }

    @RequestMapping(value = "/intake", method = RequestMethod.GET)
    @CrossOrigin
    public Iterable<Intake> getAllIntake() {
        return intakeRepository.findAll();
    }

    @RequestMapping(value = "/intake", method = RequestMethod.POST)
    @CrossOrigin
    public Iterable<Intake> createIntake(@RequestBody Intake thing) {
         intakeRepository.save(thing);
         return intakeRepository.findAll();
    }

    @RequestMapping(value = "/intake/{id}", method = RequestMethod.GET)
    @CrossOrigin
    public Intake createIntake(@PathVariable int id, @RequestBody Intake thing) {
        intakeRepository.save(thing);
        return intakeRepository.findById(id).orElse(null);
    }
}
