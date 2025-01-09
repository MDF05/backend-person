package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repo.PersonRepo;

@RestController
public class PersonController {

    @Autowired
    PersonRepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person) {
        repo.save(person);
    }

    @GetMapping("/Persons")
    public Iterable<Person> getAllPersons() {
        // Mengembalikan semua data Person dalam format JSON
        return repo.findAll();
    }

}