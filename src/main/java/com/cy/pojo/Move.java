package com.cy.pojo;

public class Move {
    private String name;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Move{" +
                "name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}