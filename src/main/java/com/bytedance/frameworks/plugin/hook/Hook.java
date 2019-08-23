package com.bytedance.frameworks.plugin.hook;

public abstract class Hook {
    protected Object mRawObject;

    public abstract void onHook();

    /* access modifiers changed from: protected */
    public void setRawObject(Object obj) {
        this.mRawObject = obj;
    }
}
