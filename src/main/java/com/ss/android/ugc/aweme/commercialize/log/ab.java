package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;

public class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39287a;

    /* renamed from: e  reason: collision with root package name */
    private static ab f39288e;

    /* renamed from: b  reason: collision with root package name */
    public Set<String> f39289b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f39290c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public boolean f39291d = false;

    public static ab a() {
        if (PatchProxy.isSupport(new Object[0], null, f39287a, true, 31863, new Class[0], ab.class)) {
            return (ab) PatchProxy.accessDispatch(new Object[0], null, f39287a, true, 31863, new Class[0], ab.class);
        }
        if (f39288e == null) {
            synchronized (ab.class) {
                if (f39288e == null) {
                    f39288e = new ab();
                }
            }
        }
        return f39288e;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f39287a, false, 31865, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f39287a, false, 31865, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f39289b.contains(str)) {
            this.f39289b.remove(str);
        }
    }
}
