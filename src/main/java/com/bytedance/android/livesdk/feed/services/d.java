package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.livesdk.feed.e.a;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.android.livesdk.feed.network.c;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14391a;

    /* renamed from: b  reason: collision with root package name */
    private static d f14392b = new d();

    private d() {
    }

    public static d a() {
        return f14392b;
    }

    public final g b() {
        if (!PatchProxy.isSupport(new Object[0], this, f14391a, false, 8892, new Class[0], g.class)) {
            return (g) b.a(g.class);
        }
        return (g) PatchProxy.accessDispatch(new Object[0], this, f14391a, false, 8892, new Class[0], g.class);
    }

    public final a c() {
        if (!PatchProxy.isSupport(new Object[0], this, f14391a, false, 8893, new Class[0], a.class)) {
            return (a) b.a(a.class);
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f14391a, false, 8893, new Class[0], a.class);
    }

    public final c d() {
        if (!PatchProxy.isSupport(new Object[0], this, f14391a, false, 8894, new Class[0], c.class)) {
            return (c) b.a(c.class);
        }
        return (c) PatchProxy.accessDispatch(new Object[0], this, f14391a, false, 8894, new Class[0], c.class);
    }

    public final Gson e() {
        if (!PatchProxy.isSupport(new Object[0], this, f14391a, false, 8895, new Class[0], Gson.class)) {
            return (Gson) b.a(Gson.class);
        }
        return (Gson) PatchProxy.accessDispatch(new Object[0], this, f14391a, false, 8895, new Class[0], Gson.class);
    }
}
