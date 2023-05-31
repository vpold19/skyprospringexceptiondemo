package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Driver;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.TruckDriver;
import org.springframework.stereotype.Service;

import java.util.*;

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
    List<String> professions = new ArrayList<>(Arrays.asList(
            "Безработный",
            "Водитель",
            "Плотник",
            "Столяр",
            "Актер"
    ));
    Map<String, Integer> professionsCode = new HashMap<>(Map.of(
            "Безработный", 0,
            "Водитель", 1,
            "Плотник", 2,
            "Столяр", 3,
            "Актер", 4
    ));

    public List<Person> getPersonByProfession(Integer professionNumber) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons.values()) {
            if (person.getProfessionNumbers().contains(professionNumber)) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public List<Person> getPersonByProfessions(List<Integer> professionNumbers) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons.values()) {
            if (person.getProfessionNumbers().containsAll(professionNumbers)) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public void addPerson(Person person) {
        persons.put(person.getPassport(), person);
    }

    @Override
    public void addProfession(String passport, Integer profession) {
        Person person = persons.get(passport);
        if (person == null) {
            throw new RuntimeException("Человек с таким номером паспорта не найден ");
        }
        person.getProfessionNumbers().add(profession);
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
                + getProfessionNames(person.getProfessionNumbers());
        return personDescription;
    }

    private String getProfessionNames(Set<Integer> professionNumbers) {
        String result = " ";
        for (Integer professionNumber : professionNumbers) {
            result = result + " " + professions.get(professionNumber);
        }
        return result;
    }
}
