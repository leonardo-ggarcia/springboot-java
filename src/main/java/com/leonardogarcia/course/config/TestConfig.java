package com.leonardogarcia.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.leonardogarcia.course.entities.Order;
import com.leonardogarcia.course.entities.User;
import com.leonardogarcia.course.repositories.OrderRepository;
import com.leonardogarcia.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User userA = new User(null, "Paul", "paul@outlook.com", "7878-987", "13j123");
		User userB = new User(null, "Jane", "jane@outlook.com", "7238-987", "12312d");
		
		Order orderA = new Order(null, Instant.parse("2020-09-08T18:51:10Z"), userA);
		Order orderB = new Order(null, Instant.parse("2020-09-09T17:41:20Z"), userB);
		Order orderC = new Order(null, Instant.parse("2020-09-10T17:31:30Z"), userA);
		
		
		userRepository.saveAll(Arrays.asList(userA, userB));
		orderRepository.saveAll(Arrays.asList(orderA, orderB, orderC));
	}
}
