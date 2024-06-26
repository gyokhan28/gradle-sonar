package com.example.styles_api;

import java.util.List;

public class StyleResponseBody {
    private int total_count;
    private List<Style> styles;

    public int getTotal_count() {
        return total_count;
    }

    public StyleResponseBody(int total_count, List<Style> styles) {
        this.total_count = total_count;
        this.styles = styles;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public List<Style> getStyles() {
        return styles;
    }

    public void setStyles(List<Style> styles) {
        this.styles = styles;
    }
}
