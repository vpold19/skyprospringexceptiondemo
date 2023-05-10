package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Driver;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.TruckDriver;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    Person [] persons = {
            new Person("Жан", "Рено", "12345"),
            new Person("Люк", "Бессон", "54321"),
            new Person("Жерар", "Депардье", "41232"),
            new Driver("Джейсон", "Стетхом", "928374", "3491"),
            new TruckDriver("Роберт", "Патрик", "1000", "2345")
    };
    @Override
    public String getPerson(Integer number){
        final Person person;
        person = persons[number];
        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                +person.getPassport();
        return personDescription;
    }
}
