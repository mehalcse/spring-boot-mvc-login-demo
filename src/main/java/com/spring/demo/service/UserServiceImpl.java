package com.spring.demo.service;

import com.spring.demo.DAO.UserDAO;
import com.spring.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public boolean checkUser(User u) {

        System.out.println("From Service: " + u );
        String un = u.getUname();
        User tempCheck = null;
        try {
            tempCheck = userDAO.findOne(un);
            if(tempCheck != null && tempCheck.getPwd().equals(u.getPwd())) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }



}
