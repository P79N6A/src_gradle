package com.douyin.share.a.c;

import android.content.Context;
import android.os.Handler;
import com.bytedance.wttsharesdk.a;
import com.douyin.share.a.b.b.d;
import com.douyin.share.a.b.c.c;

public abstract class l implements c {

    /* renamed from: a  reason: collision with root package name */
    protected Context f23155a;

    public final boolean a(d dVar, Handler handler) {
        return true;
    }

    public final boolean a() {
        if (a.a(this.f23155a) && a.c(this.f23155a)) {
            return true;
        }
        return false;
    }

    public l(Context context) {
        if (context != null) {
            this.f23155a = context;
            return;
        }
        throw new IllegalArgumentException("appContext is null");
    }
}
