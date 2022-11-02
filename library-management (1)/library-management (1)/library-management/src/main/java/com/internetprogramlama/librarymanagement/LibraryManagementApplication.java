package com.internetprogramlama.librarymanagement;


import com.internetprogramlama.librarymanagement.respositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LibraryManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@Autowired
	private PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception{


	}

}
