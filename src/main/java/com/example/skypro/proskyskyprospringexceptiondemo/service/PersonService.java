package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;

import java.util.List;

public interface PersonService  {

    List<Person> getPersonByProfessions(List<Integer> professionNumbers);

    void addPerson(Person person);

    void addProfession(String passport, Integer profession);

    String getPersonByPassport(String passport);
}
