package com.internetprogramlama.librarymanagement.services;

import com.internetprogramlama.librarymanagement.entities.Person;


import java.util.List;

public interface PersonService  {
    List<Person> getAllPersons();

    Person savePerson(Person person);

    Person getPersonById(Long id);
}
