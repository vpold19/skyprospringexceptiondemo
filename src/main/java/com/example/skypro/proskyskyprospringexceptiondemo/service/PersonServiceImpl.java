package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Driver;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.TruckDriver;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonServiceImpl implements PersonService {
    Map<String, Person> persons = new HashMap<>(Map.of(
            "12345",
            new Person("Жан", "Рено", "12345", 2),
            "54321",
            new Person("Люк", "Бессон", "54321", 3),
            "41232 ",
            new Person("Жерар", "Депардье", "41232", 0),
            "928374",
            new Driver("Джейсон", "Стетхом", "928374", "3491", 2),
            "1000 ",
            new TruckDriver("Роберт", "Патрик", "1000", "2345", 1)
    ));
    List<String> professions = new ArrayList<>(List.of(
            "Безработный",
            "Водитель",
            "Плотник",
            "Столяр"
    ));


    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(), person);
    }

    @Override
    public String getPersonByPassport(String passport) {
        Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден ");
        }
        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions.get(person.getProfessionNumber());
        return personDescription;
    }
}
