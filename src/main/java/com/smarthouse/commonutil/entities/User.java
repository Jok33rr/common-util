package com.smarthouse.commonutil.entities;

public class User {

    private final long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Role role;

    public User(final long id) {
        this.id = id;
    }

    public User(final long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public User(final long id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(final long id, final String name, final String email, final String phoneNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(final long id, final String name, final String email, final String phoneNumber, final String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public User(final long id, final String name, final String email, final String phoneNumber, final String password, final Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(final Role role) {
        this.role = role;
    }
}
