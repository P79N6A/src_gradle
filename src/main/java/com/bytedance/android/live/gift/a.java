package com.bytedance.android.live.gift;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8454a;

    /* renamed from: c  reason: collision with root package name */
    private static a f8455c;

    /* renamed from: b  reason: collision with root package name */
    public Map<b, c> f8456b = new HashMap();

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f8454a, true, 1699, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f8454a, true, 1699, new Class[0], a.class);
        }
        if (f8455c == null) {
            f8455c = new a();
        }
        return f8455c;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f8454a, false, 1702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8454a, false, 1702, new Class[0], Void.TYPE);
            return;
        }
        for (c a2 : this.f8456b.values()) {
            a2.a();
        }
    }
}
