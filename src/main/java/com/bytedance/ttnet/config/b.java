package com.bytedance.ttnet.config;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static volatile b f22593e;

    /* renamed from: f  reason: collision with root package name */
    private static final Object f22594f = new Object();
    private static volatile SharedPreferences h;

    /* renamed from: a  reason: collision with root package name */
    volatile int f22595a;

    /* renamed from: b  reason: collision with root package name */
    volatile long f22596b;

    /* renamed from: c  reason: collision with root package name */
    volatile int f22597c;

    /* renamed from: d  reason: collision with root package name */
    volatile int f22598d;
    private volatile Context g;

    public static b a() {
        return f22593e;
    }

    /* access modifiers changed from: package-private */
    public SharedPreferences b() {
        if (h == null) {
            h = c.a(this.g, "image_opt_table", 0);
        }
        return h;
    }

    public static b a(Context context) {
        if (f22593e == null) {
            synchronized (f22594f) {
                if (f22593e == null) {
                    f22593e = new b(context);
                }
            }
        }
        return f22593e;
    }

    private b(Context context) {
        if (context != null) {
            this.g = context.getApplicationContext();
        }
        try {
            SharedPreferences b2 = b();
            this.f22595a = b2.getInt("image_opt_switch", 0);
            this.f22596b = b2.getLong("image_opt_black_interval", 0);
            this.f22597c = b2.getInt("image_opt_failed_times", 0);
            this.f22598d = b2.getInt("image_opt_limit_count", 0);
        } catch (Throwable unused) {
        }
    }
}
