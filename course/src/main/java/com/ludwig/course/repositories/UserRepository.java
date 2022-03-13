package com.ludwig.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ludwig.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
