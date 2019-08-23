package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34189a;

    /* renamed from: d  reason: collision with root package name */
    private static j f34190d;

    /* renamed from: b  reason: collision with root package name */
    public boolean f34191b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f34192c = true;

    public static j a() {
        if (PatchProxy.isSupport(new Object[0], null, f34189a, true, 22260, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f34189a, true, 22260, new Class[0], j.class);
        }
        if (f34190d == null) {
            synchronized (j.class) {
                if (f34190d == null) {
                    f34190d = new j();
                }
            }
        }
        return f34190d;
    }
}
