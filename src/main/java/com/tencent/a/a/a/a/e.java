package com.tencent.a.a.a.a;

import android.content.Context;
import com.tencent.wxop.stat.a.i;

public final class e extends f {
    public e(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        synchronized (this) {
            i.a(this.f79217a).a(h.c("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return h.a(this.f79217a, "android.permission.WRITE_SETTINGS");
    }

    /* access modifiers changed from: protected */
    public final String b() {
        String a2;
        synchronized (this) {
            a2 = i.a(this.f79217a).a(h.c("4kU71lN96TJUomD1vOU9lgj9Tw=="));
        }
        return a2;
    }
}
