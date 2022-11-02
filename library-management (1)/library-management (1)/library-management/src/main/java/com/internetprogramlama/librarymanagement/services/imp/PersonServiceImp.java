package com.internetprogramlama.librarymanagement.services.imp;

import com.internetprogramlama.librarymanagement.entities.Person;
import com.internetprogramlama.librarymanagement.respositories.PersonRepository;
import com.internetprogramlama.librarymanagement.services.PersonService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {


    private PersonRepository personRepository;


    public PersonServiceImp(PersonRepository personRepository) {
        super();
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> getAllPersons()
    {
        return personRepository.findAll();
    }
    @Override
    public Person savePerson(Person person){
        return personRepository.save(person);
    }

    @Override
    public Person getPersonById(Long id) {
        return personRepository.findById(id).get();
    }

}
