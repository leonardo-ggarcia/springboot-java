package com.leonardogarcia.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardogarcia.course.entities.User;
import com.leonardogarcia.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;	

	@Override
	public void run(String... args) throws Exception {
		User userA = new User(2L, "Paul", "Paul@outlook.com", "7878-987", "13j123");
		User userB = new User(3L, "Jane", "jane@outlook.com", "7238-987", "12312d");
		
		userRepository.saveAll(Arrays.asList(userA, userB));
	}
}
