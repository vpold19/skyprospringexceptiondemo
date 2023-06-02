package com.example.skypro.proskyskyprospringexceptiondemo.controller;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Person;
import com.example.skypro.proskyskyprospringexceptiondemo.exceptions.BadPersonNumberException;
import com.example.skypro.proskyskyprospringexceptiondemo.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(path = "/person/by-passport")
    public String getPersonInfo(@RequestParam("passport") String passport) {
        personService.getPersonByPassport(passport);
        return personService.getPersonByPassport(passport);

    }


    @GetMapping(path = "person/profession/add")
    public String addProfession(@RequestParam("passport") String passport,
                                @RequestParam("profession") Integer profession) {
        personService.addProfession(passport, profession);
        return "Профессия успешна добавлена";
    }


    @GetMapping(path = "/person/add")
    public String addPerson(@RequestParam("name") String name,
                            @RequestParam("surname") String surname,
                            @RequestParam("passport") String passport,
                            @RequestParam("profession") Integer profession) {
        Person person = new Person(
                name,
                surname,
                passport,
                profession
        );
        personService.addPerson(person);
        return "Person added ";
    }

    @GetMapping(path = "/persons/by-profession")
    public String getByProfession(@RequestParam("profession") int profession) {
        List<Person> personsByProfession = personService.getPersonByProfession(profession);
        List<String> passports = new ArrayList<>();
        // for (final Person person : personsByProfession) {
        //     passports.add(person.getPassport());
        // }
        List<String> streamPassports = personsByProfession.stream().
                map(e -> e.getPassport()) // e == person
                .map(passport -> "your passport = " + passport + " bitch")
                .collect(Collectors.toList());

        return streamPassports.toString();
    }
}

