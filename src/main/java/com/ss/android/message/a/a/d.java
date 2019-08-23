package com.ss.android.message.a.a;

import android.annotation.SuppressLint;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.a.b.a.a.e;
import com.ss.android.message.a.b.a.e;
import com.ss.android.message.a.b.b;
import com.ss.android.message.a.b.c;
import com.ss.android.message.b.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class d implements com.ss.android.message.a.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29858a;

    /* renamed from: d  reason: collision with root package name */
    public static b f29859d = b.SOCKET_DISCONNECTED;

    /* renamed from: e  reason: collision with root package name */
    static final Object f29860e = new Object();
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: b  reason: collision with root package name */
    public final Map<Long, a> f29861b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.message.a.b.d f29862c = null;

    /* renamed from: f  reason: collision with root package name */
    public final long f29863f;
    private Context g;

    public interface a {
        void a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f29858a, false, 17980, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29858a, false, 17980, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29862c != null) {
            Logger.debug();
            this.f29862c.b();
            this.f29862c = null;
        }
    }

    private void b(final Context context) throws IOException {
        if (PatchProxy.isSupport(new Object[]{context}, this, f29858a, false, 17979, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f29858a, false, 17979, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Logger.debug();
        if (com.ss.android.pushmanager.setting.b.a().l()) {
            synchronized (f29860e) {
                if (this.f29862c == null) {
                    this.f29862c = new e(context.getApplicationContext(), this);
                }
            }
            if (this.f29862c.d() != b.SOCKET_DISCONNECTED || !NetworkUtils.isNetworkAvailable(context)) {
                if (this.f29862c.d() == b.HANDSSHAKEED || this.f29862c.d() == b.REGISTERED) {
                    a(context, (a) new a() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f29864a;

                        public final void a() {
                            if (PatchProxy.isSupport(new Object[0], this, f29864a, false, 17989, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f29864a, false, 17989, new Class[0], Void.TYPE);
                                return;
                            }
                            d.this.a(context);
                        }
                    });
                }
                return;
            }
            Logger.debug();
            this.f29862c.a();
            this.f29862c.b(b.ALL, this);
            this.f29862c.a(b.ALL, this);
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f29858a, false, 17986, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f29858a, false, 17986, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null && com.ss.android.pushmanager.setting.b.a().l()) {
            Logger.debug();
            if (this.f29862c == null || this.f29862c.d() == b.SOCKET_DISCONNECTED) {
                try {
                    if (this.f29861b != null && !this.f29861b.isEmpty()) {
                        b(context);
                    }
                } catch (IOException e2) {
                    h.a((Exception) e2);
                }
            }
        }
    }

    public final void a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f29858a, false, 17988, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f29858a, false, 17988, new Class[]{c.class}, Void.TYPE);
            return;
        }
        f29859d = cVar2.f29950c;
        for (a a2 : this.f29861b.values()) {
            a2.a(cVar2);
        }
    }

    public d(long j, Context context) {
        this.f29863f = j;
        this.g = context.getApplicationContext();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r15, byte[] r17) {
        /*
            r14 = this;
            r8 = r14
            r9 = r15
            r0 = r17
            r11 = 2
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r12 = 0
            r1[r12] = r2
            r13 = 1
            r1[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f29858a
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r12] = r2
            java.lang.Class<byte[]> r2 = byte[].class
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 17987(0x4643, float:2.5205E-41)
            r2 = r14
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x004b
            java.lang.Object[] r1 = new java.lang.Object[r11]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r1[r12] = r2
            r1[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f29858a
            r4 = 0
            r5 = 17987(0x4643, float:2.5205E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r12] = r0
            java.lang.Class<byte[]> r0 = byte[].class
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x004b:
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r1 = r8.f29861b
            java.lang.Long r2 = java.lang.Long.valueOf(r15)
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.message.a.a.a r1 = (com.ss.android.message.a.a.a) r1
            if (r1 == 0) goto L_0x0063
            android.content.Context r2 = r8.g     // Catch:{ Exception -> 0x005f }
            r1.a(r2, r0)     // Catch:{ Exception -> 0x005f }
            return
        L_0x005f:
            r0 = move-exception
            com.ss.android.message.b.h.a((java.lang.Exception) r0)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.a.d.a(long, byte[]):void");
    }

    public final void a(Context context, a aVar) {
        if (PatchProxy.isSupport(new Object[]{context, aVar}, this, f29858a, false, 17985, new Class[]{Context.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aVar}, this, f29858a, false, 17985, new Class[]{Context.class, a.class}, Void.TYPE);
        } else if (context != null && com.ss.android.pushmanager.setting.b.a().l()) {
            try {
                if (this.f29862c == null || !(this.f29862c.d() == b.HANDSSHAKEED || this.f29862c.d() == b.REGISTERED)) {
                    if (aVar != null) {
                        aVar.a();
                    }
                    return;
                }
                com.ss.android.message.a.b.a.a.e eVar = new com.ss.android.message.a.b.a.a.e();
                for (a next : this.f29861b.values()) {
                    eVar.getClass();
                    e.a aVar2 = new e.a();
                    aVar2.f29889b = Long.valueOf(next.d());
                    aVar2.f29890c = next.c();
                    aVar2.f29891d = next.e();
                    Logger.debug();
                    eVar.f29887b.add(aVar2);
                }
                this.f29862c.a(eVar);
            } catch (NullPointerException e2) {
                h.a((Exception) e2);
            } catch (Exception e3) {
                h.a(e3);
            }
        }
    }

    public final void a(a aVar, Context context) {
        if (PatchProxy.isSupport(new Object[]{aVar, context}, this, f29858a, false, 17983, new Class[]{a.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, context}, this, f29858a, false, 17983, new Class[]{a.class, Context.class}, Void.TYPE);
            return;
        }
        Logger.debug();
        if (aVar == null) {
            Logger.debug();
        } else if (!com.ss.android.pushmanager.setting.b.a().l()) {
            Logger.debug();
        } else {
            try {
                Logger.debug();
                this.f29861b.put(Long.valueOf(aVar.d()), aVar);
                a(context);
            } catch (Exception e2) {
                h.a(e2);
            }
        }
    }
}
