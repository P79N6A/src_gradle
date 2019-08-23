package com.bytedance.ies.dmt.ui.d;

import android.text.TextUtils;

public class g {

    /* renamed from: a  reason: collision with root package name */
    private static g f20350a;

    /* renamed from: b  reason: collision with root package name */
    private String f20351b;

    /* renamed from: c  reason: collision with root package name */
    private long f20352c;

    public static g a() {
        if (f20350a == null) {
            synchronized (g.class) {
                if (f20350a == null) {
                    f20350a = new g();
                }
            }
        }
        return f20350a;
    }

    public final boolean a(String str) {
        if (System.currentTimeMillis() - this.f20352c > 2000) {
            this.f20351b = str;
            this.f20352c = System.currentTimeMillis();
            return true;
        } else if (!TextUtils.equals(this.f20351b, str)) {
            return true;
        } else {
            return false;
        }
    }
}
