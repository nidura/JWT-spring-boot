package com.jwt.demo.service;

import com.jwt.demo.model.Person;
import com.jwt.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nidura on 2018-10-18.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;


    public List<Person> findAll() {
        return personRepository.findAll();
    }
}
