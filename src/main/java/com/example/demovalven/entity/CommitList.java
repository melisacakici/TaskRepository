package com.example.demovalven.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.security.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "List_tbl")
public class CommitList {

    @Id
    @GeneratedValue
    private int id;
    private String hash;
    private Timestamp timestamp;
    private String author;


}
