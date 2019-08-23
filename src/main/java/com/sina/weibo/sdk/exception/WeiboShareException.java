package com.sina.weibo.sdk.exception;

public class WeiboShareException extends WeiboException {
    private static final long serialVersionUID = 1;

    public WeiboShareException() {
    }

    public WeiboShareException(String str) {
        super(str);
    }

    public WeiboShareException(Throwable th) {
        super(th);
    }

    public WeiboShareException(String str, Throwable th) {
        super(str, th);
    }
}
