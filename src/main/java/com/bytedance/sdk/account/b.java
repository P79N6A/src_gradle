package com.bytedance.sdk.account;

import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.a;
import com.ss.android.account.c;

public abstract class b<T extends BaseApiResponse> extends a<T> {
    public abstract void a(T t, int i);

    public void a(T t, String str) {
    }

    public boolean b(T t) {
        return false;
    }

    public boolean c(T t) {
        return false;
    }

    public boolean d(T t) {
        return false;
    }

    public String e(T t) {
        return null;
    }

    public void f(T t) {
    }

    public abstract void g(T t);

    public final void a(T t) {
        if (t.success) {
            g(t);
        } else if (!b(t)) {
            a(t, t.error);
        } else if (c(t)) {
            a(t, e(t));
        } else {
            c.a();
            if (d(t)) {
                f(t);
            } else {
                a(t, t.error);
            }
        }
    }
}
