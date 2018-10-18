package com.jwt.demo.repository;

import com.jwt.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Nidura on 2018-10-18.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
}
