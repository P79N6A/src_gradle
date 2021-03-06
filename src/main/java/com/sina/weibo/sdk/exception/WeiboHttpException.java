package com.sina.weibo.sdk.exception;

public class WeiboHttpException extends WeiboException {
    private static final long serialVersionUID = 1;
    private final int mStatusCode;

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public WeiboHttpException(String str, int i) {
        super(str);
        this.mStatusCode = i;
    }
}
