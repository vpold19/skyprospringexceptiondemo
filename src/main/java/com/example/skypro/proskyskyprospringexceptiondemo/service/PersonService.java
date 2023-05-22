package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;

public interface PersonService  {

    void addPerson(Person person);

    String getPersonByPassport(String passport);
}
