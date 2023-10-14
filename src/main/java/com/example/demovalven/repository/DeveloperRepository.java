package com.example.demovalven.repository;

import com.example.demovalven.entity.Developer;
import com.example.demovalven.service.DeveloperService;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository extends JpaRepository<Developer, Long> {
}
