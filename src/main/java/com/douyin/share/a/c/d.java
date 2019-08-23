package com.douyin.share.a.c;

import android.content.Context;
import android.os.Handler;
import com.douyin.share.a.b.c.a;
import com.douyin.share.a.b.c.c;

public abstract class d implements a, c {

    /* renamed from: b  reason: collision with root package name */
    protected Context f23146b;

    public boolean a(com.douyin.share.a.b.b.d dVar, Handler handler) {
        return true;
    }

    public d(Context context) {
        if (context != null) {
            this.f23146b = context;
            return;
        }
        throw new IllegalArgumentException("appContext is null");
    }
}
