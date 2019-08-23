package com.bytedance.article.common.monitor.c;

import android.content.Context;
import com.bytedance.apm.f.h;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentHashMap<String, h> f19137b = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public Context f19138a;

    public a(Context context) {
        if (context != null) {
            this.f19138a = com.bytedance.apm.k.a.a(context);
        }
    }
}
