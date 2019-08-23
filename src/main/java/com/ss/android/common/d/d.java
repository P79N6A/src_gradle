package com.ss.android.common.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28268a;

    /* renamed from: d  reason: collision with root package name */
    private static d f28269d;

    /* renamed from: b  reason: collision with root package name */
    StringBuilder f28270b = new StringBuilder();

    /* renamed from: c  reason: collision with root package name */
    public boolean f28271c;

    private d() {
    }

    public static d a() {
        if (PatchProxy.isSupport(new Object[0], null, f28268a, true, 15871, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], null, f28268a, true, 15871, new Class[0], d.class);
        }
        if (f28269d == null) {
            synchronized (d.class) {
                if (f28269d == null) {
                    f28269d = new d();
                }
            }
        }
        return f28269d;
    }
}
