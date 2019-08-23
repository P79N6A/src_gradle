package com.sina.weibo.sdk.exception;

public class WeiboAuthException extends WeiboException {
    private static final long serialVersionUID = 1;
    private final String mErrorCode;
    private final String mErrorType;

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public String getErrorType() {
        return this.mErrorType;
    }

    public WeiboAuthException(String str, String str2, String str3) {
        super(str3);
        this.mErrorType = str2;
        this.mErrorCode = str;
    }
}
