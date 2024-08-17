package com.co.ias.cleanarchitecture.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Generated;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "users")
@RequiredArgsConstructor
@Getter
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
}
