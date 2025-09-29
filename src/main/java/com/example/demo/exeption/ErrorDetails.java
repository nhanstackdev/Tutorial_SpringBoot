package com.example.demo.exeption;

import java.util.Date;

public class ErrorDetails {
    private String message;
    private Date timestamp;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details) {
        super();
        this.message = message;
        this.timestamp = timestamp;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
