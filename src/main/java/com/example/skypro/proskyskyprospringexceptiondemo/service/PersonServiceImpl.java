package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Driver;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.TruckDriver;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{
    Person [] persons = {
            new Person("Жан", "Рено", "12345", 2),
            new Person("Люк", "Бессон", "54321", 3),
            new Person("Жерар", "Депардье", "41232", 0),
            new Driver("Джейсон", "Стетхом", "928374", "3491", 1),
            new TruckDriver("Роберт", "Патрик", "1000", "2345", 4)
    };
    String[] professions = {
            "Безработный",
            "Водитель",
            "Плотник",
            "Столяр",

    };
    @Override
    public String getPerson(Integer number){
        final Person person;
        if(number>= persons.length){
            throw new BadPersonNumberException();
        }
            person = persons[number];
        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                +person.getPassport() + " "
                +professions[person.getProfessionNumber()];
        return personDescription;
    }
}
