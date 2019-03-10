package com.smarthouse.commonutil.entities;

public class Role {

    private final Long id;
    private String name;
    private int accessLevel;

    public Role(final long id) {
        this.id = id;
    }

    public Role(final Long id, final String name) {
        this.id = id;
        this.name = name;
    }

    public Role(final Long id, final String name, final int accessLevel) {
        this.id = id;
        this.name = name;
        this.accessLevel = accessLevel;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(final int accessLevel) {
        this.accessLevel = accessLevel;
    }
}
