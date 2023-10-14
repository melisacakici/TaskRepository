package com.example.demovalven.service;

import com.example.demovalven.entity.CommitList;
import com.example.demovalven.repository.CommitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommitService {

    @Autowired
    private CommitRepository commitRepository;

    public void saveCommit(CommitList commitList) {
        commitRepository.save(commitList);
    }

    public List<CommitList> getAllCommits() {
        return commitRepository.findAll();
    }
}
