package com.example.lab9.service;

import com.example.lab9.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {

}
