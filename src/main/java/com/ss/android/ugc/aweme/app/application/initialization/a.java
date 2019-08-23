package com.ss.android.ugc.aweme.app.application.initialization;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.a.b.b;
import com.ss.android.ugc.a.b.c;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.OkHttpClient;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33947a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReference<Context> f33948b = new AtomicReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<C0436a<OkHttpClient>> f33949c = new AtomicReference<>(null);

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference<C0436a<b>> f33950d = new AtomicReference<>(null);

    /* renamed from: e  reason: collision with root package name */
    private static volatile ScheduledExecutorService f33951e;

    /* renamed from: com.ss.android.ugc.aweme.app.application.initialization.a$a  reason: collision with other inner class name */
    public interface C0436a<T> {
        T a();
    }

    static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f33947a, true, 23258, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f33947a, true, 23258, new Class[0], Void.TYPE);
            return;
        }
        Context andSet = f33948b.getAndSet(null);
        C0436a andSet2 = f33949c.getAndSet(null);
        C0436a andSet3 = f33950d.getAndSet(null);
        com.ss.android.ugc.a.b a2 = com.ss.android.ugc.a.b.a();
        if (andSet != null) {
            a2.a(andSet);
        }
        if (andSet2 != null) {
            a2.a((OkHttpClient) andSet2.a());
        }
        if (andSet3 != null) {
            a2.f31517b = (b) andSet3.a();
        }
    }

    private static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f33947a, true, 23257, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f33947a, true, 23257, new Class[0], Void.TYPE);
        } else if (f33951e == null) {
            synchronized (a.class) {
                if (f33951e == null) {
                    f33951e = (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a("iesDownloadManagerHolder").a());
                }
            }
        }
    }

    public static void a(e eVar, d dVar) {
        e eVar2 = eVar;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, dVar2}, null, f33947a, true, 23255, new Class[]{e.class, d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, dVar2}, null, f33947a, true, 23255, new Class[]{e.class, d.class}, Void.TYPE);
            return;
        }
        b();
        f33951e.execute(new b(eVar2, dVar2));
    }

    public static void a(String str, c cVar) {
        String str2 = str;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{str2, cVar2}, null, f33947a, true, 23256, new Class[]{String.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, cVar2}, null, f33947a, true, 23256, new Class[]{String.class, c.class}, Void.TYPE);
            return;
        }
        b();
        f33951e.execute(new c(str2, cVar2));
    }
}
