package com.sanjay.blogapp.repositories;

import com.sanjay.blogapp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
