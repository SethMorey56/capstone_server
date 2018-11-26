package com.example.CapstoneAPI.controllers;

import com.example.CapstoneAPI.domain.CounselorsDomain;
import com.example.CapstoneAPI.respository.CounselorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounselorsController {

    private final
    CounselorsRepository counselorsRepository;

    @Autowired
    public CounselorsController(CounselorsRepository counselorsRepository) {
        this.counselorsRepository = counselorsRepository;
    }

    @GetMapping("/counselors")
    public Iterable<CounselorsDomain> getCounselors() {
        return counselorsRepository.findAll();
    }
}
