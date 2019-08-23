package com.ss.android.ugc.aweme.app.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34108a;

    /* renamed from: c  reason: collision with root package name */
    private static b f34109c;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34110b;

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f34108a, true, 23467, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f34108a, true, 23467, new Class[0], b.class);
        }
        if (f34109c == null) {
            synchronized (b.class) {
                if (f34109c == null) {
                    f34109c = new b();
                }
            }
        }
        return f34109c;
    }
}
