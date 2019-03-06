package com.smarthouse.commonutil.entities;

public class Customer {

    private final Long id;
    private final String name;
    private final String email;
    private final String phoneNumber;
    private final String password;
    private Role role;

    public Customer(Long id, String name, String email, String phoneNumber, String password, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}
