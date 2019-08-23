package com.amap.api.services.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.Proxy;

public class df extends db {

    /* renamed from: a  reason: collision with root package name */
    private static df f6810a;

    /* renamed from: b  reason: collision with root package name */
    private ee f6811b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f6812c;

    /* renamed from: com.amap.api.services.a.df$1  reason: invalid class name */
    class AnonymousClass1 extends ef {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dg f6813a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ dh f6814b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ df f6815c;

        public void a() {
            try {
                this.f6815c.a(this.f6815c.b(this.f6813a, false), this.f6814b);
            } catch (be e2) {
                this.f6815c.a(e2, this.f6814b);
            }
        }
    }

    static class a extends Handler {
        public a() {
        }

        private a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 0:
                        ((dj) message.obj).f6822b.a();
                        break;
                    case 1:
                        dj djVar = (dj) message.obj;
                        djVar.f6822b.a(djVar.f6821a);
                        break;
                    default:
                        return;
                }
            } catch (Throwable unused) {
            }
        }

        /* synthetic */ a(Looper looper, AnonymousClass1 r2) {
            this(looper);
        }
    }

    public static df a(boolean z) {
        return a(z, 5);
    }

    public byte[] d(dg dgVar) throws be {
        try {
            di b2 = b(dgVar, false);
            if (b2 != null) {
                return b2.f6817a;
            }
            return null;
        } catch (be e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new be("未知的错误");
        }
    }

    public byte[] e(dg dgVar) throws be {
        try {
            di b2 = b(dgVar, true);
            if (b2 != null) {
                return b2.f6817a;
            }
            return null;
        } catch (be e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new be("未知的错误");
        }
    }

    public byte[] b(dg dgVar) throws be {
        try {
            di a2 = a(dgVar, false);
            if (a2 != null) {
                return a2.f6817a;
            }
            return null;
        } catch (be e2) {
            throw e2;
        } catch (Throwable th) {
            ca.d().b(th, "NetManager", "makeSyncPostRequest");
            throw new be("未知的错误");
        }
    }

    /* access modifiers changed from: private */
    public void a(be beVar, dh dhVar) {
        dj djVar = new dj();
        djVar.f6821a = beVar;
        djVar.f6822b = dhVar;
        Message obtain = Message.obtain();
        obtain.obj = djVar;
        obtain.what = 1;
        this.f6812c.sendMessage(obtain);
    }

    private df(boolean z, int i) {
        if (z) {
            try {
                this.f6811b = ee.a(i);
            } catch (Throwable th) {
                ca.c(th, "NetManger", "NetManger1");
            }
        }
        if (Looper.myLooper() == null) {
            this.f6812c = new a(Looper.getMainLooper(), null);
        } else {
            this.f6812c = new a();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.amap.api.services.a.df a(boolean r2, int r3) {
        /*
            java.lang.Class<com.amap.api.services.a.df> r0 = com.amap.api.services.a.df.class
            monitor-enter(r0)
            com.amap.api.services.a.df r1 = f6810a     // Catch:{ Throwable -> 0x0022 }
            if (r1 != 0) goto L_0x000f
            com.amap.api.services.a.df r1 = new com.amap.api.services.a.df     // Catch:{ Throwable -> 0x0022 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0022 }
            f6810a = r1     // Catch:{ Throwable -> 0x0022 }
            goto L_0x0022
        L_0x000f:
            if (r2 == 0) goto L_0x0022
            com.amap.api.services.a.df r2 = f6810a     // Catch:{ Throwable -> 0x0022 }
            com.amap.api.services.a.ee r2 = r2.f6811b     // Catch:{ Throwable -> 0x0022 }
            if (r2 != 0) goto L_0x0022
            com.amap.api.services.a.df r2 = f6810a     // Catch:{ Throwable -> 0x0022 }
            com.amap.api.services.a.ee r3 = com.amap.api.services.a.ee.a(r3)     // Catch:{ Throwable -> 0x0022 }
            r2.f6811b = r3     // Catch:{ Throwable -> 0x0022 }
            goto L_0x0022
        L_0x0020:
            r2 = move-exception
            goto L_0x0026
        L_0x0022:
            com.amap.api.services.a.df r2 = f6810a     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)
            return r2
        L_0x0026:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.df.a(boolean, int):com.amap.api.services.a.df");
    }

    public di b(dg dgVar, boolean z) throws be {
        Proxy proxy;
        try {
            c(dgVar);
            if (dgVar.h == null) {
                proxy = null;
            } else {
                proxy = dgVar.h;
            }
            return new de(dgVar.f6816f, dgVar.g, proxy, z).a(dgVar.i(), dgVar.e(), dgVar.d());
        } catch (be e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new be("未知的错误");
        }
    }

    /* access modifiers changed from: private */
    public void a(di diVar, dh dhVar) {
        dhVar.a(diVar.f6818b, diVar.f6817a);
        dj djVar = new dj();
        djVar.f6822b = dhVar;
        Message obtain = Message.obtain();
        obtain.obj = djVar;
        obtain.what = 0;
        this.f6812c.sendMessage(obtain);
    }
}
