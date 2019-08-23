package com.bytedance.article.common.monitor.b;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f19125a;

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, C0143a> f19126b = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.article.common.monitor.b.a$a  reason: collision with other inner class name */
    public class C0143a {

        /* renamed from: a  reason: collision with root package name */
        String f19132a;

        /* renamed from: b  reason: collision with root package name */
        public long f19133b = 0;

        /* renamed from: c  reason: collision with root package name */
        public boolean f19134c = false;

        public C0143a(String str, long j, boolean z) {
            this.f19132a = str;
        }
    }

    public a(Context context) {
        if (context != null) {
            f19125a = com.bytedance.apm.k.a.a(context);
        }
    }
}
