package com.douyin.baseshare;

import android.app.Activity;

public abstract class a implements b, c {

    /* renamed from: a  reason: collision with root package name */
    public Activity f23108a;

    /* access modifiers changed from: protected */
    public abstract boolean b();

    public String c() {
        return null;
    }

    public final boolean a() {
        if (this.f23108a == null) {
            return false;
        }
        return b();
    }

    public a(Activity activity) {
        this.f23108a = activity;
    }
}
