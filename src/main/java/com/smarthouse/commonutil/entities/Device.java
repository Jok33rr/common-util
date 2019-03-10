package com.smarthouse.commonutil.entities;

public class Device {

    private final long id;
    private String name;

    public Device(final long id) {
        this.id = id;
    }

    public Device(final long id, final String name) {
        this.id = id;
        this.name = name;
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
}
