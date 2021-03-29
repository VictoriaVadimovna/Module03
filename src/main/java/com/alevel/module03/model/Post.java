package com.alevel.module03.model;

public class Post {
    //уникальный идентификатор
    private int id;
    //максимальная длина 100 символов
    private String title;
    //максимальная длина 1000 символов
    private String content;
    //автор сатьи
    private User author;
    //модератор (тот кто апрувит статью)
    private User moderator;
    //рейтинг статьи, может быть как отрицательный так и положительный
    private int rating;
    //статус
    private PostStatus status;
    public Post(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getModerator() {
        return moderator;
    }

    public void setModerator(User moderator) {
        this.moderator = moderator;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public PostStatus getStatus() {
        return status;
    }

    public void setStatus(PostStatus status) {
        this.status = status;
    }
}

