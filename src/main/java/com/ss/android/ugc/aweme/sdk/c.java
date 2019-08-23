package com.ss.android.ugc.aweme.sdk;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.bean.a;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63708a;

    /* renamed from: c  reason: collision with root package name */
    private static c f63709c;

    /* renamed from: b  reason: collision with root package name */
    public a f63710b;

    private c() {
        if (PatchProxy.isSupport(new Object[0], this, f63708a, false, 71028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63708a, false, 71028, new Class[0], Void.TYPE);
            return;
        }
        this.f63710b = new a();
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f63708a, true, 71029, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f63708a, true, 71029, new Class[0], c.class);
        }
        if (f63709c == null) {
            synchronized (c.class) {
                if (f63709c == null) {
                    f63709c = new c();
                }
            }
        }
        return f63709c;
    }
}
