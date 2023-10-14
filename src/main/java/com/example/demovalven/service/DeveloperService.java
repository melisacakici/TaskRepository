package com.example.demovalven.service;

import com.example.demovalven.entity.Developer;
import com.example.demovalven.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {
    private final DeveloperRepository developerRepository;

    @Autowired
    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public Developer getDeveloperById(Long id) {
        return developerRepository.findById(id).orElse(null);
    }

    public List<Developer> getAllDevelopers() {
        return developerRepository.findAll();
    }

    public void saveDeveloper(Developer developer) {
        developerRepository.save(developer);
    }

    // Add more service methods as needed
}

