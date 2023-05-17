package com.example.skypro.proskyskyprospringexceptiondemo.service;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Driver;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.TruckDriver;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    List<Person> persons = List.of(
            new Person("Жан", "Рено", "12345", 2),
            new Person("Люк", "Бессон", "54321", 3),
            new Person("Жерар", "Депардье", "41232", 0),
            new Driver("Джейсон", "Стетхом", "928374", "3491", 2),
            new TruckDriver("Роберт", "Патрик", "1000", "2345", 1)
    );
    List<String> professions = List.of(
            "Безработный",
            "Водитель",
            "Плотник",
            "Столяр"
            );

    @Override
    public String getPerson(Integer number) throws BadPersonNumberException {
        final Person person;
        if (number >= persons.size()) {

            throw new BadPersonNumberException("Ошибка в том, что номер человека заведома больше размера массива,");
        }
        person = persons.get(number);
        final String personDescription = " "
                + person.getName() + " "
                + person.getSurname() + " "
                + person.getPassport() + " "
                + professions.get(person.getProfessionNumber());
        return personDescription;
    }
}
