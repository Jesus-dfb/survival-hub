package com.survivalhub.model;

public class World {
    private Long id;
    private String name;
    private String game;
    private String description;

    public World() {
    }

    public World(Long id, String name, String game, String description) {
        this.id = id;
        this.name = name;
        this.game = game;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGame() {
        return game;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}