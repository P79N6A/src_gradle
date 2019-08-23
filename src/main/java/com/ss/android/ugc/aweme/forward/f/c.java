package com.ss.android.ugc.aweme.forward.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48311a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, b> f48312b = new HashMap();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f48313a = new c();
    }

    public static c a() {
        return a.f48313a;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f48311a, false, 45535, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f48311a, false, 45535, new Class[0], Void.TYPE);
            return;
        }
        this.f48312b.clear();
    }

    public final void a(String str, b bVar) {
        String str2 = str;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{str2, bVar2}, this, f48311a, false, 45534, new Class[]{String.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, bVar2}, this, f48311a, false, 45534, new Class[]{String.class, b.class}, Void.TYPE);
            return;
        }
        this.f48312b.put(str2, bVar2);
    }
}
