package com.example.crud;

public class Todo { //for input retrieve data in database

    private int id;
    private String title;
    private String description;
    private long started;
    private long finished;

    public Todo() {

    }

    public Todo(int id, String title, String description, long started, long finished) { // code -> generate
        this.id = id;
        this.title = title;
        this.description = description;
        this.started = started;
        this.finished = finished;
    }

    public Todo(String title, String description, long started, long finished) {
        this.title = title;
        this.description = description;
        this.started = started;
        this.finished = finished;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStarted() {
        return started;
    }

    public void setStarted(long started) {
        this.started = started;
    }

    public long getFinished() {
        return finished;
    }

    public void setFinished(long finished) {
        this.finished = finished;
    }
}