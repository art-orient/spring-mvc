package com.itvdn.lesson7.dto;

public class RequestBodyResponse {
    private String nameWithId;

    public RequestBodyResponse(String nameWithId) {
        this.nameWithId = nameWithId;
    }

    public String getNameWithId() {
        return nameWithId;
    }
}
