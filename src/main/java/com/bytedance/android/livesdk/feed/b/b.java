package com.bytedance.android.livesdk.feed.b;

import android.content.Context;
import com.bytedance.android.live.core.setting.m;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.android.livesdk.feed.tab.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13995a;

    /* renamed from: b  reason: collision with root package name */
    private static b f13996b = new b();

    /* renamed from: c  reason: collision with root package name */
    private static com.bytedance.android.livesdkapi.service.b f13997c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f13998d;

    /* renamed from: e  reason: collision with root package name */
    private static Context f13999e;

    private b() {
    }

    public static Context b() {
        return f13999e;
    }

    public static com.bytedance.android.livesdkapi.service.b c() {
        return f13997c;
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f13995a, true, 8577, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f13995a, true, 8577, new Class[0], Void.TYPE);
        } else {
            a.d().b().subscribe(c.f14001b, d.f14003b);
        }
    }

    public static void a(com.bytedance.android.livesdkapi.service.b bVar) {
        com.bytedance.android.livesdkapi.service.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f13995a, true, 8576, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f13995a, true, 8576, new Class[]{com.bytedance.android.livesdkapi.service.b.class}, Void.TYPE);
        } else if (!f13998d) {
            synchronized (b.class) {
                if (!f13998d) {
                    f13998d = true;
                    f13997c = new a(bVar2);
                    f13999e = bVar.a().a();
                    if (PatchProxy.isSupport(new Object[0], null, f13995a, true, 8578, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f13995a, true, 8578, new Class[0], Void.TYPE);
                    } else {
                        if (!c.a()) {
                            a.d().b().subscribe(e.f14005b, f.f14007b);
                        }
                        com.bytedance.android.live.core.b.a(new com.bytedance.android.livesdk.feed.a.a());
                        if ("local_test".equals(f13997c.a().c())) {
                            m.a(true);
                        }
                    }
                }
            }
        }
    }
}
