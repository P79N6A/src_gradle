package com.ss.android.ugc.aweme.base.sharedpref;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.b;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34884a;

    public static f a() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24874, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24874, new Class[0], f.class);
        }
        return a(b.a.f34880a);
    }

    public static f b() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24875, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24875, new Class[0], f.class);
        }
        return a("profile");
    }

    public static f c() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24876, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24876, new Class[0], f.class);
        }
        return a("story");
    }

    public static f d() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24879, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24879, new Class[0], f.class);
        }
        return a("guide");
    }

    public static f e() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24880, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24880, new Class[0], f.class);
        }
        return a("search");
    }

    public static f f() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24881, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24881, new Class[0], f.class);
        }
        return a("follow_feed");
    }

    public static f g() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24883, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24883, new Class[0], f.class);
        }
        return a("rec_user");
    }

    public static f h() {
        if (PatchProxy.isSupport(new Object[0], null, f34884a, true, 24886, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f34884a, true, 24886, new Class[0], f.class);
        }
        return a("user_growth");
    }

    public static f a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f34884a, true, 24887, new Class[]{String.class}, f.class)) {
            return d.a(k.a(), str2);
        }
        return (f) PatchProxy.accessDispatch(new Object[]{str2}, null, f34884a, true, 24887, new Class[]{String.class}, f.class);
    }
}
