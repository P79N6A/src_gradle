package com.ss.android.ugc.effectmanager.common.model;

public class BaseNetResponse {
    public String message;
    public int status_code;

    public String toString() {
        return "BaseNetResponse{status_code=" + this.status_code + ", message='" + this.message + '\'' + '}';
    }
}
