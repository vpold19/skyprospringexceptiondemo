package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;

public interface PersonService  {

    String getPerson(Integer number) throws BadPersonNumberException;

    void addPerson(Person person);
}
