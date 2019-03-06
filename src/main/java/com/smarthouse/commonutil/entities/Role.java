package com.smarthouse.commonutil.entities;

public class Role {

    private final Long id;
    private String name;
    private Integer accessLevel;

    public Role(long id, String name, Integer accessLevel) {
        this.id = id;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }
}
