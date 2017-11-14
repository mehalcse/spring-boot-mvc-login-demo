package com.spring.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name = "USER")
public class User {

    @Id
    @Column(name = "uname")
    private String uname;

    @Column(name = "pwd")
    private String pwd;

    public User() {

    }

    public User(String uname, String pwd) {
        this.uname = uname;
        this.pwd = pwd;
    }


    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }


    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }




    @Override
    public String toString() {
        return "Username: " + uname + " Password: " + pwd;
    }
}
