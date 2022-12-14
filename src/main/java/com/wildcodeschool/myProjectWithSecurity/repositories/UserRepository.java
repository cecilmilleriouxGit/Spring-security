package com.wildcodeschool.myProjectWithSecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.myProjectWithSecurity.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    public User findByUsername(String username);
}