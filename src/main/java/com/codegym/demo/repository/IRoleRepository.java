package com.codegym.demo.repository;

import com.codegym.demo.model.Role;
import com.codegym.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
