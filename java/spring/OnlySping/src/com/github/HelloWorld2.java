package com.github;

public class HelloWorld2 {
    private String name;

    public HelloWorld2() {
        System.out.println("constructor.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("set name.");
        this.name = name;
    }

    public void sayHi() {
        System.out.println(this.getName());
    }
}

