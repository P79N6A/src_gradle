package com.bytedance.frameworks.plugin;

import android.app.Application;
import com.bytedance.frameworks.plugin.compat.a.a;
import com.bytedance.frameworks.plugin.d.d;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class Mira {

    /* renamed from: a  reason: collision with root package name */
    static boolean f2139a = false;

    /* renamed from: b  reason: collision with root package name */
    public static final List<WeakReference<d>> f2140b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static boolean f2141c = true;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    private static c f2142d;

    /* renamed from: e  reason: collision with root package name */
    private static b f2143e;

    /* renamed from: f  reason: collision with root package name */
    private static a f2144f;

    public static boolean b() {
        return f2141c;
    }

    @Deprecated
    public static c c() {
        return f2142d;
    }

    public static b d() {
        return f2143e;
    }

    public static a e() {
        return f2144f;
    }

    public static boolean a() {
        return g.a();
    }

    public static void a(Application application) {
        if (h.a()) {
            a.a();
        }
        com.bytedance.frameworks.plugin.b.a.a();
        com.bytedance.frameworks.plugin.core.h.a(application);
        d.a().b();
    }
}
