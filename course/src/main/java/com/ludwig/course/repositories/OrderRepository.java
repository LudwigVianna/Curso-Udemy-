package com.ludwig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ludwig.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
