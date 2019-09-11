package com.chat.me.mvpdemoapplication.models;

/**
 * Created by vishal on 11/09/19.
 */

public class ModelInfo {
    private String name, age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n Age: " + age;
    }
}
