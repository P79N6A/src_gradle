package com.bytedance.bdlocation.client;

public class BDLocationException extends Exception {
    public BDLocationException(String str) {
        super(str);
    }

    public BDLocationException(Throwable th) {
        super(th);
    }
}
