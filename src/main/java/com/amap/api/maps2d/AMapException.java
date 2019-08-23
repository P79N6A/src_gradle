package com.amap.api.maps2d;

public class AMapException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f6305a = "未知的错误";

    public String getErrorMessage() {
        return this.f6305a;
    }

    public AMapException() {
    }

    public AMapException(String str) {
        this.f6305a = str;
    }
}
