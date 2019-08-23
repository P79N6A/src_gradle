package com.tt.option;

import android.text.TextUtils;

public abstract class BaseAbstractHostDepend<T> {
    protected T defaultOptionDepend;

    /* access modifiers changed from: protected */
    public abstract String getImplClassName();

    /* access modifiers changed from: protected */
    public String getCompleteImplClassName() {
        if (TextUtils.isEmpty(getImplClassName())) {
            return null;
        }
        return "com.tt.miniapp.impl." + getImplClassName();
    }

    /* access modifiers changed from: protected */
    public boolean inject() {
        if (this.defaultOptionDepend != null) {
            return true;
        }
        if (TextUtils.isEmpty(getCompleteImplClassName())) {
            return false;
        }
        try {
            this.defaultOptionDepend = Class.forName(getCompleteImplClassName()).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (this.defaultOptionDepend != null) {
            return true;
        }
        return false;
    }
}
