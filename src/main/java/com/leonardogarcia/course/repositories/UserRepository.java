package com.leonardogarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardogarcia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
