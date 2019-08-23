package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13330a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile i f13331b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile i f13332c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile b f13333d;

    private j() {
    }

    @NonNull
    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f13330a, true, 7732, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f13330a, true, 7732, new Class[0], d.class);
        }
        if (f13331b == null) {
            synchronized (j.class) {
                if (f13331b == null) {
                    f13331b = new i();
                }
            }
        }
        return f13331b;
    }

    @NonNull
    public static d b() {
        if (PatchProxy.isSupport(new Object[0], null, f13330a, true, 7733, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f13330a, true, 7733, new Class[0], d.class);
        }
        if (f13332c == null) {
            synchronized (j.class) {
                if (f13332c == null) {
                    f13332c = new i();
                }
            }
        }
        return f13332c;
    }

    @NonNull
    public static d c() {
        if (PatchProxy.isSupport(new Object[0], null, f13330a, true, 7734, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f13330a, true, 7734, new Class[0], d.class);
        }
        if (f13333d == null) {
            synchronized (j.class) {
                if (f13333d == null) {
                    f13333d = new b(a(), b());
                }
            }
        }
        return f13333d;
    }

    static synchronized void d() {
        synchronized (j.class) {
            if (PatchProxy.isSupport(new Object[0], null, f13330a, true, 7735, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f13330a, true, 7735, new Class[0], Void.TYPE);
                return;
            }
            if (f13331b != null) {
                f13331b.a(true);
            }
            if (f13332c != null) {
                f13332c.a(true);
            }
            f13331b = new i();
            f13332c = new i();
            f13333d = new b(f13331b, f13332c);
        }
    }

    static synchronized void e() {
        synchronized (j.class) {
            if (PatchProxy.isSupport(new Object[0], null, f13330a, true, 7736, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f13330a, true, 7736, new Class[0], Void.TYPE);
                return;
            }
            if (f13332c != null) {
                f13332c.a(true);
            }
            if (f13331b != null) {
                f13331b.a(true);
            }
            f13333d = null;
            f13332c = null;
            f13331b = null;
        }
    }
}
