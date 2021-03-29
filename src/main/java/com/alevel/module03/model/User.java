package com.alevel.module03.model;

import java.util.List;
public class User {
    //уникальный идентификатор
    private int userID;
    private String fullName;
    //должен быть уникальным, не null
    private String login;
    //должен быть уникальным и содержать символ '@'
    private String email;
    //не меньше 18
    private int age;
    //подписки
    private List<User> subscriptions;
    //является ли данный пользователь автором (у пользователя должно быть 1 или более публикаций)
    private Boolean isAuthor;
    //может ли пользователь модерировать статьи
    private Boolean isModerator;
    //0 если пользователь не "автор"
    private List<User> followers;

    public int getId() {
        return userID;
    }

    public void setId(int id) {
        this.userID = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Boolean getAuthor() {
        return isAuthor;
    }

    public void setAuthor(Boolean author) {
        isAuthor = author;
    }

    public Boolean getModerator() {
        return isModerator;
    }

    public void setModerator(Boolean moderator) {
        isModerator = moderator;
    }

    public List<User> getFollowers() {
        return followers;
    }

    public void setFollowers(List<User> followers) {
        this.followers = followers;
    }
}
