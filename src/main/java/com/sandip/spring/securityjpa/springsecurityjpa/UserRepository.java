package com.sandip.spring.securityjpa.springsecurityjpa;

import com.sandip.spring.securityjpa.springsecurityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}