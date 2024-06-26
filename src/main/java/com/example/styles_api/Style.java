package com.example.styles_api;

public class Style {
    private String name;
    private String identifier;

    public String getName() {
        return name;
    }

    public Style(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
}
