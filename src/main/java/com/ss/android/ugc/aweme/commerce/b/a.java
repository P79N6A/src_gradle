package com.ss.android.ugc.aweme.commerce.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36691a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f36692b = "a";

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f36693c;

    private a() {
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f36691a, true, 28286, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f36691a, true, 28286, new Class[0], a.class);
        }
        if (f36693c == null) {
            synchronized (a.class) {
                if (f36693c == null) {
                    f36693c = new a();
                }
            }
        }
        return f36693c;
    }
}
