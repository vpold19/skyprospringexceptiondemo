package com.example.skypro.proskyskyprospringexceptiondemo.domain;

public class Person {
    private String name;
    private String surname;
    private String passport;

    public Person(String name, String surname, String passport) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }
    public void changePassportNumber(String passport){
        if(passport == null && passport.isBlank()){
            this.passport = passport;
        }
    }
}
