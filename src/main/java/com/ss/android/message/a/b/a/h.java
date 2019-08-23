package com.ss.android.message.a.b.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.pushmanager.app.b;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29932a;

    /* renamed from: c  reason: collision with root package name */
    private static volatile h f29933c;

    /* renamed from: b  reason: collision with root package name */
    public b f29934b = new b(10);

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f29932a, true, 18065, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f29932a, true, 18065, new Class[0], h.class);
        }
        if (f29933c == null) {
            synchronized (h.class) {
                if (f29933c == null) {
                    f29933c = new h();
                }
            }
        }
        return f29933c;
    }

    private h() {
        String str;
        b bVar = this.f29934b;
        com.ss.android.pushmanager.setting.b a2 = com.ss.android.pushmanager.setting.b.a();
        if (PatchProxy.isSupport(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19204, new Class[0], String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[0], a2, com.ss.android.pushmanager.setting.b.f2543a, false, 19204, new Class[0], String.class);
        } else {
            str = a2.f2546c.a("self_push_message_ids", "");
        }
        bVar.a(str);
    }
}
