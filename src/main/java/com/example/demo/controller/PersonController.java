package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.repo.PersonRepo;

@RestController
public class PersonController {

    @Autowired
    private PersonRepo PersonRepo;

    @PostMapping("/addPerson")
    public String addPerson() {
        // Add logic to save a new person to the database
        return "Person added successfully";
    }

    @GetMapping("/Persons")
    public Iterable<Person> getAllPersons() {
        // Mengembalikan semua data Person dalam format JSON
        return PersonRepo.findAll();
    }

}