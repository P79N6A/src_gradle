package com.bytedance.c.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.c.a;
import com.bytedance.frameworks.plugin.b;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.component.a.c;
import com.bytedance.frameworks.plugin.d;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.h;
import com.bytedance.frameworks.plugin.hook.ClassLoaderHook;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {

    /* renamed from: e  reason: collision with root package name */
    private static a f2106e;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.c.a f2107a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.frameworks.plugin.a f2108b;

    /* renamed from: c  reason: collision with root package name */
    public b f2109c;

    /* renamed from: d  reason: collision with root package name */
    public List<WeakReference<d>> f2110d = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    private Context f2111f;

    private a() {
    }

    public static a a() {
        if (f2106e == null) {
            synchronized (a.class) {
                if (f2106e == null) {
                    f2106e = new a();
                }
            }
        }
        return f2106e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b() {
        /*
            r2 = this;
            monitor-enter(r2)
            com.bytedance.c.a r0 = r2.f2107a     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.f2094a     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            com.bytedance.c.a r0 = r2.f2107a     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.f2097d     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0090
            android.content.Context r0 = r2.f2111f     // Catch:{ all -> 0x0092 }
            boolean r0 = com.bytedance.frameworks.plugin.b.f.b(r0)     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x001f
            android.content.Context r0 = r2.f2111f     // Catch:{ all -> 0x0092 }
            boolean r0 = com.bytedance.frameworks.plugin.b.f.c(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
        L_0x001f:
            boolean r0 = com.bytedance.frameworks.plugin.f.g.a()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x003c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "mira hook process 2: "
            r0.<init>(r1)     // Catch:{ all -> 0x0092 }
            android.content.Context r1 = r2.f2111f     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = com.bytedance.frameworks.plugin.b.f.a(r1)     // Catch:{ all -> 0x0092 }
            r0.append(r1)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r0)     // Catch:{ all -> 0x0092 }
        L_0x003c:
            com.bytedance.frameworks.plugin.hook.InstrumentationHook r0 = new com.bytedance.frameworks.plugin.hook.InstrumentationHook     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.onHook()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.c.h r0 = new com.bytedance.frameworks.plugin.c.h     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.c.a r0 = new com.bytedance.frameworks.plugin.c.a     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.hook.ActivityThreadHandlerHook r0 = new com.bytedance.frameworks.plugin.hook.ActivityThreadHandlerHook     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.onHook()     // Catch:{ all -> 0x0092 }
            com.bytedance.c.a r0 = r2.f2107a     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.f2099f     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0090
            com.bytedance.frameworks.plugin.c.g r0 = new com.bytedance.frameworks.plugin.c.g     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.c.d r0 = new com.bytedance.frameworks.plugin.c.d     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.c.c r0 = new com.bytedance.frameworks.plugin.c.c     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            com.bytedance.frameworks.plugin.c.f r0 = new com.bytedance.frameworks.plugin.c.f     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0092 }
            r1 = 21
            if (r0 < r1) goto L_0x0090
            com.bytedance.frameworks.plugin.c.e r0 = new com.bytedance.frameworks.plugin.c.e     // Catch:{ all -> 0x0092 }
            r0.<init>()     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
        L_0x0090:
            monitor-exit(r2)
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.c.a.a.b():void");
    }

    public final synchronized void a(Context context, com.bytedance.c.a aVar) {
        if (context != null) {
            if (aVar == null) {
                aVar = new a.C0008a().a();
            }
            if (!(context instanceof Application)) {
                this.f2111f = context.getApplicationContext();
            } else {
                this.f2111f = context;
            }
            this.f2107a = aVar;
            e.a(this.f2111f);
            g.f2259a = this.f2107a.f2095b;
            g.a("mira enable: " + this.f2107a.f2094a);
            if (this.f2107a.g.size() > 0) {
                List<String> list = aVar.g;
                if (list != null && list.size() > 0) {
                    f.f2171a.addAll(list);
                }
            }
            if (this.f2107a.f2094a) {
                Context context2 = this.f2111f;
                com.bytedance.c.a aVar2 = this.f2107a;
                if (f.b(this.f2111f) || f.c(this.f2111f)) {
                    if (g.a()) {
                        g.a("mira hook process 1: " + f.a(this.f2111f));
                    }
                    if (h.a()) {
                        com.bytedance.frameworks.plugin.compat.a.a.a();
                    }
                    com.bytedance.frameworks.plugin.b.a.a();
                    if (aVar2.f2096c) {
                        com.bytedance.frameworks.plugin.core.h.a((Application) context2);
                    }
                    new ClassLoaderHook().onHook();
                    com.bytedance.frameworks.plugin.d.d.a().b();
                }
                if (aVar2.f2098e) {
                    c.a();
                }
            }
        } else {
            throw new IllegalArgumentException("context must be not null !!!");
        }
    }
}
