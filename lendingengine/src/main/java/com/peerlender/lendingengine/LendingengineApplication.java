package com.peerlender.lendingengine;

import com.peerlender.lendingengine.domain.model.User;
import com.peerlender.lendingengine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LendingengineApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {SpringApplication.run(LendingengineApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Dilane","Dilane","Kamga", 19,"Software Engineer" ));
		userRepository.save(new User("Cedric","Cedric","Kamga", 21,"Politic" ));
		userRepository.save(new User("Nolan","Nolan","Fogue", 4,"Pupil" ));
	}
}
