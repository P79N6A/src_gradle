package com.ss.android.ugc.aweme.main;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.b.b;
import com.ss.android.ugc.aweme.utils.bg;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54284a;

    /* renamed from: d  reason: collision with root package name */
    private static a f54285d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f54286b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f54287c;

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f54284a, true, 57017, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f54284a, true, 57017, new Class[0], a.class);
        }
        if (f54285d == null) {
            synchronized (a.class) {
                if (f54285d == null) {
                    f54285d = new a();
                }
            }
        }
        return f54285d;
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54284a, false, 57019, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54284a, false, 57019, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f54287c != z) {
            this.f54287c = z;
            bg.a(new b());
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54284a, false, 57018, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54284a, false, 57018, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z != this.f54286b) {
            this.f54286b = z;
            bg.a(new com.ss.android.ugc.aweme.main.b.a());
        }
    }
}
