package com.alevel.module03.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    //уникальный идентификатор
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    @Column(name = "full_name")
    private String fullName;
    //должен быть уникальным, не null
    @Column(name = "login")
    private String login;
    //должен быть уникальным и содержать символ '@'
    @Column(name = "email")
    private String email;
    //не меньше 18
    @Column(name = "age")
    private int age;
    //подписки

    private List<User> subscriptions = new ArrayList<>();
    //является ли данный пользователь автором (у пользователя должно быть 1 или более публикаций)
    @Column(name = "is_author")
    private Boolean isAuthor;
    //может ли пользователь модерировать статьи
    @Column(name = "is_moderator")
    private Boolean isModerator;
    //0 если пользователь не "автор"
    private List<User> followers;

    public User() {

    }

    public User(int userID, String fullName, String login, String email, int age) {
        this.userID = userID;
        this.fullName = fullName;
        this.login = login;
        this.email = email;
        this.age = age;
    }

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
