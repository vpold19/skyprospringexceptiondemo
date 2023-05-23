package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;

public interface PersonService  {

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    String getPersonByPassport(String passport);
}
