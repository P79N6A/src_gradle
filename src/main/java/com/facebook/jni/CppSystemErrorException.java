package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class CppSystemErrorException extends CppException {
    int errorCode;

    public int getErrorCode() {
        return this.errorCode;
    }

    @DoNotStrip
    public CppSystemErrorException(String str, int i) {
        super(str);
        this.errorCode = i;
    }
}
