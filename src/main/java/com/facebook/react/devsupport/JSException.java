package com.facebook.react.devsupport;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class JSException extends Exception {
    private final String mStack;

    public String getStack() {
        return this.mStack;
    }

    public JSException(String str, String str2) {
        super(str);
        this.mStack = str2;
    }

    @DoNotStrip
    public JSException(String str, String str2, Throwable th) {
        super(str, th);
        this.mStack = str2;
    }
}
