package com.spring.demo.DAO;

import com.spring.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, String> {

}
