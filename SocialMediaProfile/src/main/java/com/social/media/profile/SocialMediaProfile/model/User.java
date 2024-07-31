package com.social.media.profile.SocialMediaProfile.model;

public class User {
    private Integer id;
    private String name;
    private Integer age; //here we wanna use date of birth, use it to calculate age

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getage() {
        return age;
    }

    public void setage(Integer age) {
        this.age = age;
    }

    //what happens if I remove this?
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
