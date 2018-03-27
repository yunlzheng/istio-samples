package com.github.labs.model;

public class Welcome {

    private String fooVersion;
    private String barVersion;

    private String message;

    public String getBarVersion() {
        return barVersion;
    }

    public void setBarVersion(String barVersion) {
        this.barVersion = barVersion;
    }

    public String getFooVersion() {
        return fooVersion;
    }

    public void setFooVersion(String fooVersion) {
        this.fooVersion = fooVersion;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
