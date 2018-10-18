package com.jwt.demo.controller;

import com.jwt.demo.model.Person;
import com.jwt.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nidura on 2018-10-18.
 */
@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(method = RequestMethod.GET)
    public List<Person> findAll(){
       return personService.findAll();
    }

}
