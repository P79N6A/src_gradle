package com.ss.android.ugc.aweme.base.ui.session;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.antiaddic.c;
import java.util.HashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35004a;

    /* renamed from: c  reason: collision with root package name */
    private static b f35005c;

    /* renamed from: b  reason: collision with root package name */
    HashMap<String, a> f35006b = new HashMap<>();

    private b() {
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f35004a, true, 25160, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f35004a, true, 25160, new Class[0], b.class);
        }
        if (f35005c == null) {
            synchronized (c.class) {
                if (f35005c == null) {
                    f35005c = new b();
                }
            }
        }
        return f35005c;
    }

    public final synchronized void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f35004a, false, 25163, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f35004a, false, 25163, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f35006b.values().remove(aVar);
    }

    public final synchronized <T> a<T> a(String str, Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{str, cls}, this, f35004a, false, 25161, new Class[]{String.class, Class.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, cls}, this, f35004a, false, 25161, new Class[]{String.class, Class.class}, a.class);
        }
        if (!this.f35006b.containsKey(str)) {
            this.f35006b.put(str, new a());
        }
        return this.f35006b.get(str);
    }

    public final synchronized <T> a<T> b(String str, Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{str, cls}, this, f35004a, false, 25162, new Class[]{String.class, Class.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str, cls}, this, f35004a, false, 25162, new Class[]{String.class, Class.class}, a.class);
        }
        return this.f35006b.get(str);
    }
}
