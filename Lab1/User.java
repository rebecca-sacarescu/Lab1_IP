package com.rebecca;

public class User {
    String name;
    String email;
    String password;

    public User(String name, String email, String password, double budget) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void display() {
        System.out.println(this.name + " " + this.email);
    }
}
