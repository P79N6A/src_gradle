package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.net.Proxy;

public class eu extends ep {

    /* renamed from: a  reason: collision with root package name */
    private static eu f6085a;

    /* renamed from: b  reason: collision with root package name */
    private fe f6086b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f6087c;

    /* renamed from: com.amap.api.mapcore2d.eu$1  reason: invalid class name */
    class AnonymousClass1 extends ff {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ev f6088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ew f6089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ eu f6090c;

        public void a() {
            try {
                this.f6090c.a(this.f6090c.b(this.f6088a, false), this.f6089b);
            } catch (co e2) {
                this.f6090c.a(e2, this.f6089b);
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
                        ((ey) message.obj).f6099b.a();
                        break;
                    case 1:
                        ey eyVar = (ey) message.obj;
                        eyVar.f6099b.a(eyVar.f6098a);
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

    public static eu a(boolean z) {
        return a(z, 5);
    }

    public byte[] c(ev evVar) throws co {
        try {
            ex b2 = b(evVar, false);
            if (b2 != null) {
                return b2.f6094a;
            }
            return null;
        } catch (co e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new co("未知的错误");
        }
    }

    public byte[] a(ev evVar) throws co {
        try {
            ex a2 = a(evVar, false);
            if (a2 != null) {
                return a2.f6094a;
            }
            return null;
        } catch (co e2) {
            throw e2;
        } catch (Throwable th) {
            dg.a().c(th, "NetManager", "makeSyncPostRequest");
            throw new co("未知的错误");
        }
    }

    /* access modifiers changed from: private */
    public void a(co coVar, ew ewVar) {
        ey eyVar = new ey();
        eyVar.f6098a = coVar;
        eyVar.f6099b = ewVar;
        Message obtain = Message.obtain();
        obtain.obj = eyVar;
        obtain.what = 1;
        this.f6087c.sendMessage(obtain);
    }

    private eu(boolean z, int i) {
        if (z) {
            try {
                this.f6086b = fe.a(i);
            } catch (Throwable th) {
                dg.b(th, "NetManger", "NetManger1");
            }
        }
        if (Looper.myLooper() == null) {
            this.f6087c = new a(Looper.getMainLooper(), null);
        } else {
            this.f6087c = new a();
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized com.amap.api.mapcore2d.eu a(boolean r2, int r3) {
        /*
            java.lang.Class<com.amap.api.mapcore2d.eu> r0 = com.amap.api.mapcore2d.eu.class
            monitor-enter(r0)
            com.amap.api.mapcore2d.eu r1 = f6085a     // Catch:{ Throwable -> 0x0022 }
            if (r1 != 0) goto L_0x000f
            com.amap.api.mapcore2d.eu r1 = new com.amap.api.mapcore2d.eu     // Catch:{ Throwable -> 0x0022 }
            r1.<init>(r2, r3)     // Catch:{ Throwable -> 0x0022 }
            f6085a = r1     // Catch:{ Throwable -> 0x0022 }
            goto L_0x0022
        L_0x000f:
            if (r2 == 0) goto L_0x0022
            com.amap.api.mapcore2d.eu r2 = f6085a     // Catch:{ Throwable -> 0x0022 }
            com.amap.api.mapcore2d.fe r2 = r2.f6086b     // Catch:{ Throwable -> 0x0022 }
            if (r2 != 0) goto L_0x0022
            com.amap.api.mapcore2d.eu r2 = f6085a     // Catch:{ Throwable -> 0x0022 }
            com.amap.api.mapcore2d.fe r3 = com.amap.api.mapcore2d.fe.a(r3)     // Catch:{ Throwable -> 0x0022 }
            r2.f6086b = r3     // Catch:{ Throwable -> 0x0022 }
            goto L_0x0022
        L_0x0020:
            r2 = move-exception
            goto L_0x0026
        L_0x0022:
            com.amap.api.mapcore2d.eu r2 = f6085a     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)
            return r2
        L_0x0026:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.eu.a(boolean, int):com.amap.api.mapcore2d.eu");
    }

    public ex b(ev evVar, boolean z) throws co {
        Proxy proxy;
        try {
            b(evVar);
            if (evVar.f6093e == null) {
                proxy = null;
            } else {
                proxy = evVar.f6093e;
            }
            return new es(evVar.f6091c, evVar.f6092d, proxy, z).a(evVar.g(), evVar.e(), evVar.f());
        } catch (co e2) {
            throw e2;
        } catch (Throwable unused) {
            throw new co("未知的错误");
        }
    }

    /* access modifiers changed from: private */
    public void a(ex exVar, ew ewVar) {
        ewVar.a(exVar.f6095b, exVar.f6094a);
        ey eyVar = new ey();
        eyVar.f6099b = ewVar;
        Message obtain = Message.obtain();
        obtain.obj = eyVar;
        obtain.what = 0;
        this.f6087c.sendMessage(obtain);
    }
}
