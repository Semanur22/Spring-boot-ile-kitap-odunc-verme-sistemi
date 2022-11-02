package com.internetprogramlama.librarymanagement.controller;



import com.internetprogramlama.librarymanagement.entities.Person;
import com.internetprogramlama.librarymanagement.services.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;




@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    public PersonController(PersonService personService){
        super();
        this.personService=personService;
    }

    @GetMapping("/")
    public String menu() {
        return "main_menu";
    }

    @GetMapping("/persons")
    public String listPersons(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "persons";
    }


    @GetMapping("/register")
    public String createPerson(Model model) {
        Person person = new Person();
        model.addAttribute("person", person);
        return "person_register";

    }
    @RequestMapping("/persons")
    public  String savePerson( @ModelAttribute("person") Person person) {
        personService.savePerson(person);
        return "redirect:/persons";
    }




}
