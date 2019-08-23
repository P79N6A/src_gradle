package com.amap.api.services.a;

import android.content.Context;

public abstract class w<T, V> extends b<T, V> {
    /* access modifiers changed from: protected */
    public boolean e(String str) {
        if (str == null || str.equals("") || str.equals("[]")) {
            return true;
        }
        return false;
    }

    public w(Context context, T t) {
        super(context, t);
    }
}
