package com.leonardogarcia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardogarcia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
