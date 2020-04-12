package com.test.mybatis.entity;

public class User {
    int id;
    String name;
    int age;
    String create_time;

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User(int id, String name, int age, String create_time) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.create_time = create_time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }


    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", create_time='" + create_time + '\'' +
                '}';
    }
}
