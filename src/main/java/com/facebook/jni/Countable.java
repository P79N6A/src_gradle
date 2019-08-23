package com.facebook.jni;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class Countable {
    @DoNotStrip
    private long mInstance;

    public native void dispose();

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        dispose();
        super.finalize();
    }
}
