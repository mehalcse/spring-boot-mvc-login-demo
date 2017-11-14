package com.spring.demo.addData;

import com.spring.demo.DAO.UserDAO;
import com.spring.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddUserData {

    @Autowired
    UserDAO userDAO;

    public void saveUserData() {
        User u1 = new User("userDemo", "demo12345");
        User u2 = new User("userTest", "test12345");

        userDAO.save(u1);
        userDAO.save(u2);

        System.out.println("From Add Data Service : Data Added");
    }

}
