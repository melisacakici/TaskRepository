package com.example.demovalven.service;

import com.example.demovalven.entity.CommitList;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GitService {

    private CommitService commitService;

    public void saveCommits(List<CommitList> commitLists) {
        for(CommitList commitList : commitLists) {
            commitService.saveCommit(commitList);
        }
    }
}
