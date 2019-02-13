package com.smarthouse.commonutil;

public class TestObject {

    private final String name;

    public TestObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static String getHelloString() {
        return "Hello";
    }
}