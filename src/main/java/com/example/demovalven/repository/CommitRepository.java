package com.example.demovalven.repository;

import com.example.demovalven.entity.CommitList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommitRepository extends JpaRepository <CommitList, Integer> {
}
