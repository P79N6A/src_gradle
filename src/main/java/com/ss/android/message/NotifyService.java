package com.ss.android.message;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.a.a.a;
import com.ss.android.message.a.a.c;
import com.ss.android.message.a.a.d;
import com.ss.android.message.b;
import com.ss.android.message.b.h;
import com.ss.android.pushmanager.app.e;
import com.ss.android.pushmanager.setting.b;
import java.util.HashMap;
import java.util.Map;

public class NotifyService extends Service implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29804a = null;
    private static volatile int p = 0;
    private static volatile boolean q = false;
    private static volatile String r = "";
    private static volatile boolean s = true;
    private static volatile boolean t = false;
    private static volatile String u = "";
    private static volatile boolean v = true;

    /* renamed from: b  reason: collision with root package name */
    public g f29805b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHandler f29806c = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: d  reason: collision with root package name */
    boolean f29807d = false;

    /* renamed from: e  reason: collision with root package name */
    d f29808e = null;

    /* renamed from: f  reason: collision with root package name */
    public Map<Long, a> f29809f = new HashMap();
    boolean g = true;
    ContentObserver h = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29815a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29815a, false, 17895, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29815a, false, 17895, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            if (b.a().f()) {
                NotifyService.this.c();
            }
        }
    };
    ContentObserver i = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29817a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29817a, false, 17896, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29817a, false, 17896, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            if (b.a().f()) {
                NotifyService.this.d();
            }
        }
    };
    ContentObserver j = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29819a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29819a, false, 17897, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29819a, false, 17897, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            if (b.a().f()) {
                NotifyService.this.e();
            }
        }
    };
    ContentObserver k = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29821a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29821a, false, 17898, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29821a, false, 17898, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            NotifyService.this.f();
        }
    };
    ContentObserver l = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29823a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29823a, false, 17887, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29823a, false, 17887, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            NotifyService.this.f29805b.c();
        }
    };
    ContentObserver m = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29825a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29825a, false, 17888, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29825a, false, 17888, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            NotifyService.this.g();
        }
    };
    ContentObserver n = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29827a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29827a, false, 17889, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29827a, false, 17889, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            if (b.a().f()) {
                NotifyService.this.h();
                NotifyService.this.f29805b.c();
            }
        }
    };
    ContentObserver o = new ContentObserver(this.f29806c) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f29829a;

        public final void onChange(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f29829a, false, 17890, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f29829a, false, 17890, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            if (b.a().f()) {
                NotifyService.this.i();
            }
        }
    };
    private b.a w = new b.a() {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f29810b;

        public final void a(final c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f29810b, false, 17884, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f29810b, false, 17884, new Class[]{c.class}, Void.TYPE);
                return;
            }
            NotifyService.this.f29806c.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29812a;

                public final void run() {
                    c cVar;
                    if (PatchProxy.isSupport(new Object[0], this, f29812a, false, 17886, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29812a, false, 17886, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        AnonymousClass1 r1 = AnonymousClass1.this;
                        c cVar2 = cVar;
                        if (PatchProxy.isSupport(new Object[]{cVar2}, r1, AnonymousClass1.f29810b, false, 17885, new Class[]{c.class}, Void.TYPE)) {
                            Object[] objArr = {cVar2};
                            AnonymousClass1 r10 = r1;
                            PatchProxy.accessDispatch(objArr, r10, AnonymousClass1.f29810b, false, 17885, new Class[]{c.class}, Void.TYPE);
                        } else {
                            if (cVar2 != null) {
                                Logger.debug();
                                try {
                                    long c2 = cVar2.c();
                                    if (NotifyService.this.f29809f == null || !NotifyService.this.f29809f.containsKey(Long.valueOf(c2))) {
                                        cVar = new c();
                                    } else {
                                        cVar = (c) NotifyService.this.f29809f.get(Long.valueOf(c2));
                                    }
                                    cVar.f29856e = cVar2.c();
                                    cVar.f29853b = cVar2.d();
                                    cVar.f29854c = cVar2.e();
                                    cVar.f29855d = cVar2.f();
                                    cVar.f29857f = cVar2.a();
                                    cVar.g = cVar2.b();
                                    cVar.h = cVar2.g();
                                    NotifyService.this.f29809f.put(Long.valueOf(c2), cVar);
                                    NotifyService.this.a();
                                } catch (NullPointerException e2) {
                                    h.a((Exception) e2);
                                } catch (Exception e3) {
                                    h.a(e3);
                                }
                                NotifyService notifyService = NotifyService.this;
                                if (PatchProxy.isSupport(new Object[0], notifyService, NotifyService.f29804a, false, 17870, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], notifyService, NotifyService.f29804a, false, 17870, new Class[0], Void.TYPE);
                                } else {
                                    Logger.debug();
                                    if (notifyService.f29809f != null) {
                                        notifyService.b();
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        }

        public final void b(c cVar) {
            if (PatchProxy.isSupport(new Object[]{cVar}, this, f29810b, false, 17883, new Class[]{c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{cVar}, this, f29810b, false, 17883, new Class[]{c.class}, Void.TYPE);
                return;
            }
            if (cVar != null) {
                Logger.debug();
            }
        }
    };
    private HandlerThread x = new HandlerThread("NotifyService");
    private volatile Looper y;

    public void handleMsg(Message message) {
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17876, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17876, new Class[0], Void.TYPE);
            return;
        }
        try {
            String d2 = com.ss.android.pushmanager.setting.b.a().d();
            if (!StringUtils.isEmpty(d2) && !d2.equals(r)) {
                r = d2;
            }
        } catch (Exception unused) {
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17877, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17877, new Class[0], Void.TYPE);
            return;
        }
        boolean f2 = com.ss.android.pushmanager.setting.b.a().f();
        s = f2;
        if (!f2 && com.ss.android.pushmanager.setting.b.a().b()) {
            stopSelf();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17878, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17878, new Class[0], Void.TYPE);
            return;
        }
        try {
            boolean b2 = com.ss.android.pushmanager.setting.b.a().b();
            t = b2;
            if (b2) {
                stopSelf();
            }
        } catch (Exception unused) {
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17879, new Class[0], Void.TYPE);
            return;
        }
        try {
            String g2 = com.ss.android.pushmanager.setting.b.a().g();
            if (!StringUtils.isEmpty(g2) && !g2.equals(u)) {
                u = g2;
            }
        } catch (Exception unused) {
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17882, new Class[0], Void.TYPE);
            return;
        }
        try {
            getContentResolver().unregisterContentObserver(this.h);
            getContentResolver().unregisterContentObserver(this.i);
            getContentResolver().unregisterContentObserver(this.j);
            getContentResolver().unregisterContentObserver(this.k);
            getContentResolver().unregisterContentObserver(this.l);
            getContentResolver().unregisterContentObserver(this.m);
            getContentResolver().unregisterContentObserver(this.n);
            getContentResolver().unregisterContentObserver(this.o);
        } catch (Throwable unused) {
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17874, new Class[0], Void.TYPE);
            return;
        }
        long c2 = (long) e.a().b().c();
        boolean l2 = com.ss.android.pushmanager.setting.b.a().l();
        if (l2 != p) {
            p = l2 ? 1 : 0;
            if (this.f29809f != null) {
                c cVar = (c) this.f29809f.get(Long.valueOf(c2));
                if (cVar != null) {
                    cVar.g = l2;
                    this.f29809f.put(Long.valueOf(c2), cVar);
                    a();
                }
            }
        }
        Logger.debug();
        b();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17880, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17880, new Class[0], Void.TYPE);
            return;
        }
        boolean h2 = com.ss.android.pushmanager.setting.b.a().h();
        if (h2 != v) {
            v = h2;
        }
        if (v) {
            if (Build.VERSION.SDK_INT >= 21) {
                PushJobService.a(this);
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            PushJobService.b(this);
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17861, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.x.start();
        this.y = this.x.getLooper();
        this.f29806c = new WeakHandler(this.y, this);
        this.f29806c.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29831a;

            /* JADX WARNING: Can't wrap try/catch for region: R(32:9|(1:11)(1:12)|13|(1:15)|16|17|(1:19)|20|21|22|(2:24|(1:26)(2:27|(3:31|(1:36)(1:35)|(1:38))))|39|40|41|42|(1:44)(1:45)|46|(1:48)(1:49)|50|(1:52)(2:53|54)|55|56|(1:58)(2:59|(1:61)(1:62))|63|64|(1:66)(1:(1:68))|69|(4:71|(1:73)(3:74|75|(1:77)(2:78|(1:80)(2:81|(1:83)(4:84|(1:86)|87|(1:89)(2:90|(2:92|93))))))|94|95)|96|97|(1:99)|100) */
            /* JADX WARNING: Can't wrap try/catch for region: R(4:71|(1:73)(3:74|75|(1:77)(2:78|(1:80)(2:81|(1:83)(4:84|(1:86)|87|(1:89)(2:90|(2:92|93))))))|94|95) */
            /* JADX WARNING: Can't wrap try/catch for region: R(5:101|102|103|104|105) */
            /* JADX WARNING: Code restructure failed: missing block: B:102:?, code lost:
                com.bytedance.common.utility.Logger.debug();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
                com.ss.android.message.b.b.a(r9.getApplicationContext());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:105:0x0445, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x043b */
            /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00ea */
            /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0213 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0278 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x0415 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x041a */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:44:0x0105 A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:45:0x011a A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x013b A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x0152 A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:52:0x017a A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:53:0x018b A[SYNTHETIC, Splitter:B:53:0x018b] */
            /* JADX WARNING: Removed duplicated region for block: B:58:0x023d A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:59:0x024f A[Catch:{ Throwable -> 0x0278 }] */
            /* JADX WARNING: Removed duplicated region for block: B:66:0x0297 A[Catch:{ Throwable -> 0x041a }] */
            /* JADX WARNING: Removed duplicated region for block: B:67:0x02af A[Catch:{ Throwable -> 0x041a }] */
            /* JADX WARNING: Removed duplicated region for block: B:71:0x02e3 A[Catch:{ Throwable -> 0x041a }] */
            /* JADX WARNING: Removed duplicated region for block: B:99:0x0424 A[Catch:{ Throwable -> 0x0445 }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r18 = this;
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f29831a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 17891(0x45e3, float:2.507E-41)
                    r2 = r18
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0025
                    java.lang.Object[] r2 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r4 = f29831a
                    r5 = 0
                    r6 = 17891(0x45e3, float:2.507E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]
                    java.lang.Class r8 = java.lang.Void.TYPE
                    r3 = r18
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    return
                L_0x0025:
                    r1 = r18
                    com.ss.android.message.NotifyService r9 = com.ss.android.message.NotifyService.this     // Catch:{  }
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{  }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{  }
                    r5 = 0
                    r6 = 17862(0x45c6, float:2.503E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{  }
                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{  }
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{  }
                    if (r2 == 0) goto L_0x004c
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{  }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{  }
                    r5 = 0
                    r6 = 17862(0x45c6, float:2.503E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{  }
                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{  }
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{  }
                    goto L_0x0446
                L_0x004c:
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{  }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{  }
                    r5 = 0
                    r6 = 17860(0x45c4, float:2.5027E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{  }
                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{  }
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{  }
                    if (r2 == 0) goto L_0x006e
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{  }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{  }
                    r5 = 0
                    r6 = 17860(0x45c4, float:2.5027E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{  }
                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{  }
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{  }
                    goto L_0x0075
                L_0x006e:
                    com.ss.android.message.g r2 = new com.ss.android.message.g     // Catch:{  }
                    r2.<init>(r9)     // Catch:{  }
                    r9.f29805b = r2     // Catch:{  }
                L_0x0075:
                    boolean r2 = com.bytedance.common.utility.Logger.debug()     // Catch:{  }
                    if (r2 == 0) goto L_0x0082
                    android.content.Context r2 = r9.getApplicationContext()     // Catch:{  }
                    com.ss.android.pushmanager.app.f.a(r2)     // Catch:{  }
                L_0x0082:
                    com.ss.android.push.daemon.c r2 = com.ss.android.push.daemon.c.a(r9)     // Catch:{ Throwable -> 0x043b }
                    r2.a()     // Catch:{ Throwable -> 0x043b }
                    com.ss.android.pushmanager.app.d$a r2 = com.ss.android.pushmanager.app.d.a()     // Catch:{ Throwable -> 0x043b }
                    if (r2 == 0) goto L_0x0092
                    r2.a(r9)     // Catch:{ Throwable -> 0x043b }
                L_0x0092:
                    r10 = 1
                    com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x00ea }
                    boolean r2 = r2.s()     // Catch:{ Throwable -> 0x00ea }
                    if (r2 == 0) goto L_0x00ea
                    int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00ea }
                    r3 = 18
                    if (r2 >= r3) goto L_0x00ae
                    r2 = -2048(0xfffffffffffff800, float:NaN)
                    android.app.Notification r3 = new android.app.Notification     // Catch:{ Throwable -> 0x00ea }
                    r3.<init>()     // Catch:{ Throwable -> 0x00ea }
                    r9.startForeground(r2, r3)     // Catch:{ Throwable -> 0x00ea }
                    goto L_0x00ea
                L_0x00ae:
                    int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00ea }
                    if (r2 < r3) goto L_0x00ea
                    int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00ea }
                    r3 = 24
                    if (r2 >= r3) goto L_0x00ea
                    boolean r2 = com.ss.android.message.b.h.c()     // Catch:{ Throwable -> 0x00ea }
                    if (r2 == 0) goto L_0x00c6
                    boolean r2 = com.ss.android.message.b.h.b()     // Catch:{ Throwable -> 0x00ea }
                    if (r2 == 0) goto L_0x00c6
                    r2 = 1
                    goto L_0x00c7
                L_0x00c6:
                    r2 = 0
                L_0x00c7:
                    if (r2 != 0) goto L_0x00ea
                    android.app.Notification$Builder r2 = new android.app.Notification$Builder     // Catch:{ Throwable -> 0x00ea }
                    android.content.Context r3 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x00ea }
                    r2.<init>(r3)     // Catch:{ Throwable -> 0x00ea }
                    r3 = 2130840575(0x7f020bff, float:1.7286193E38)
                    android.app.Notification$Builder r2 = r2.setSmallIcon(r3)     // Catch:{ Throwable -> 0x00ea }
                    android.app.Notification r2 = r2.build()     // Catch:{ Throwable -> 0x00ea }
                    android.content.Intent r3 = new android.content.Intent     // Catch:{ Throwable -> 0x00ea }
                    java.lang.Class<com.ss.android.message.NotifyIntentService> r4 = com.ss.android.message.NotifyIntentService.class
                    r3.<init>(r9, r4)     // Catch:{ Throwable -> 0x00ea }
                    r9.startService(r3)     // Catch:{ Throwable -> 0x00ea }
                    r9.startForeground(r10, r2)     // Catch:{ Throwable -> 0x00ea }
                L_0x00ea:
                    com.bytedance.common.utility.Logger.debug()     // Catch:{  }
                    com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ Throwable -> 0x0278 }
                    r14 = 0
                    r15 = 19208(0x4b08, float:2.6916E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r12 = r2
                    r16 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x0278 }
                    if (r3 == 0) goto L_0x011a
                    java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ Throwable -> 0x0278 }
                    r14 = 0
                    r15 = 19208(0x4b08, float:2.6916E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r12 = r2
                    r16 = r3
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x0278 }
                    java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x0278 }
                    goto L_0x0124
                L_0x011a:
                    com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r2 = r2.f2546c     // Catch:{ Throwable -> 0x0278 }
                    java.lang.String r3 = "push_apps"
                    java.lang.String r4 = ""
                    java.lang.String r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ Throwable -> 0x0278 }
                L_0x0124:
                    r9.a(r2)     // Catch:{ Throwable -> 0x0278 }
                    com.ss.android.message.a.a.d r11 = new com.ss.android.message.a.a.d     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Throwable -> 0x0278 }
                    r5 = 0
                    r6 = 17871(0x45cf, float:2.5043E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x0278 }
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0278 }
                    if (r2 == 0) goto L_0x0152
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Throwable -> 0x0278 }
                    r5 = 0
                    r6 = 17871(0x45cf, float:2.5043E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ Throwable -> 0x0278 }
                    r3 = r9
                    java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Throwable -> 0x0278 }
                    long r2 = r2.longValue()     // Catch:{ Throwable -> 0x0278 }
                    goto L_0x015f
                L_0x0152:
                    com.ss.android.pushmanager.app.e r2 = com.ss.android.pushmanager.app.e.a()     // Catch:{ Throwable -> 0x0278 }
                    com.ss.android.pushmanager.c r2 = r2.b()     // Catch:{ Throwable -> 0x0278 }
                    int r2 = r2.c()     // Catch:{ Throwable -> 0x0278 }
                    long r2 = (long) r2     // Catch:{ Throwable -> 0x0278 }
                L_0x015f:
                    android.content.Context r4 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x0278 }
                    r11.<init>(r2, r4)     // Catch:{ Throwable -> 0x0278 }
                    r9.f29808e = r11     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Throwable -> 0x0278 }
                    r5 = 0
                    r6 = 17881(0x45d9, float:2.5057E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0278 }
                    r3 = r9
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0278 }
                    if (r2 == 0) goto L_0x018b
                    java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Throwable -> 0x0278 }
                    r5 = 0
                    r6 = 17881(0x45d9, float:2.5057E-41)
                    java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0278 }
                    r3 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0278 }
                    goto L_0x0213
                L_0x018b:
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "allow_self_push_enable"
                    java.lang.String r4 = "boolean"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.h     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "push_notify_enable"
                    java.lang.String r4 = "boolean"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.i     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "loc"
                    java.lang.String r4 = "string"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.j     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "allow_network"
                    java.lang.String r4 = "boolean"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.k     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "ssids"
                    java.lang.String r4 = "string"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.l     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "shut_push_on_stop_service"
                    java.lang.String r4 = "boolean"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.m     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "uninstall_question_url"
                    java.lang.String r4 = "string"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.n     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.content.ContentResolver r2 = r9.getContentResolver()     // Catch:{ Throwable -> 0x0213 }
                    java.lang.String r3 = "allow_push_job_service"
                    java.lang.String r4 = "boolean"
                    android.net.Uri r3 = com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider.a(r9, r3, r4)     // Catch:{ Throwable -> 0x0213 }
                    android.database.ContentObserver r4 = r9.o     // Catch:{ Throwable -> 0x0213 }
                    r2.registerContentObserver(r3, r10, r4)     // Catch:{ Throwable -> 0x0213 }
                L_0x0213:
                    r9.f()     // Catch:{ Throwable -> 0x0278 }
                    r9.e()     // Catch:{ Throwable -> 0x0278 }
                    r9.d()     // Catch:{ Throwable -> 0x0278 }
                    r9.g()     // Catch:{ Throwable -> 0x0278 }
                    r9.h()     // Catch:{ Throwable -> 0x0278 }
                    r9.i()     // Catch:{ Throwable -> 0x0278 }
                    com.ss.android.message.sswo.a r2 = com.ss.android.message.sswo.a.a(r9)     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.sswo.a.f30057a     // Catch:{ Throwable -> 0x0278 }
                    r14 = 0
                    r15 = 18116(0x46c4, float:2.5386E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0278 }
                    r12 = r2
                    r16 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x0278 }
                    if (r3 == 0) goto L_0x024f
                    java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0278 }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.sswo.a.f30057a     // Catch:{ Throwable -> 0x0278 }
                    r14 = 0
                    r15 = 18116(0x46c4, float:2.5386E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0278 }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0278 }
                    r12 = r2
                    r16 = r3
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x0278 }
                    goto L_0x0278
                L_0x024f:
                    com.ss.android.pushmanager.setting.b r3 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x0278 }
                    boolean r3 = r3.o()     // Catch:{ Throwable -> 0x0278 }
                    if (r3 != 0) goto L_0x025d
                    r2.a()     // Catch:{ Throwable -> 0x0278 }
                    goto L_0x0278
                L_0x025d:
                    android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch:{ Throwable -> 0x0278 }
                    r3.<init>()     // Catch:{ Throwable -> 0x0278 }
                    java.lang.String r4 = "android.intent.action.SCREEN_OFF"
                    r3.addAction(r4)     // Catch:{ Throwable -> 0x0278 }
                    java.lang.String r4 = "android.intent.action.SCREEN_ON"
                    r3.addAction(r4)     // Catch:{ Throwable -> 0x0278 }
                    java.lang.String r4 = "android.intent.action.USER_PRESENT"
                    r3.addAction(r4)     // Catch:{ Throwable -> 0x0278 }
                    android.content.Context r4 = r2.f30059b     // Catch:{ Throwable -> 0x0278 }
                    com.ss.android.message.sswo.SswoReceiver r2 = r2.f30060c     // Catch:{ Throwable -> 0x0278 }
                    r4.registerReceiver(r2, r3)     // Catch:{ Throwable -> 0x0278 }
                L_0x0278:
                    android.content.Context r2 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x041a }
                    java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x041a }
                    r11[r0] = r2     // Catch:{ Throwable -> 0x041a }
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.pushmanager.app.f.f30515a     // Catch:{ Throwable -> 0x041a }
                    r14 = 1
                    r15 = 19012(0x4a44, float:2.6641E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x041a }
                    java.lang.Class<android.content.Context> r4 = android.content.Context.class
                    r3[r0] = r4     // Catch:{ Throwable -> 0x041a }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x041a }
                    r16 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x041a }
                    r4 = 2
                    if (r3 == 0) goto L_0x02af
                    java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ Throwable -> 0x041a }
                    r11[r0] = r2     // Catch:{ Throwable -> 0x041a }
                    r12 = 0
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.pushmanager.app.f.f30515a     // Catch:{ Throwable -> 0x041a }
                    r14 = 1
                    r15 = 19012(0x4a44, float:2.6641E-41)
                    java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ Throwable -> 0x041a }
                    java.lang.Class<android.content.Context> r3 = android.content.Context.class
                    r2[r0] = r3     // Catch:{ Throwable -> 0x041a }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x041a }
                    r16 = r2
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x041a }
                    goto L_0x02d4
                L_0x02af:
                    if (r2 == 0) goto L_0x02d4
                    r3 = 3
                    java.lang.String[] r5 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x041a }
                    java.lang.String r6 = "lockFile"
                    r5[r0] = r6     // Catch:{ Throwable -> 0x041a }
                    java.lang.String r6 = "lockFile1"
                    r5[r10] = r6     // Catch:{ Throwable -> 0x041a }
                    java.lang.String r6 = "lockFile2"
                    r5[r4] = r6     // Catch:{ Throwable -> 0x041a }
                    com.ss.android.pushmanager.app.f.a((android.content.Context) r2, (java.lang.String[]) r5)     // Catch:{ Throwable -> 0x041a }
                    java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x041a }
                    java.lang.String r5 = "observerFile"
                    r3[r0] = r5     // Catch:{ Throwable -> 0x041a }
                    java.lang.String r5 = "observerFile1"
                    r3[r10] = r5     // Catch:{ Throwable -> 0x041a }
                    java.lang.String r5 = "observerFile2"
                    r3[r4] = r5     // Catch:{ Throwable -> 0x041a }
                    com.ss.android.pushmanager.app.f.a((android.content.Context) r2, (java.lang.String[]) r3)     // Catch:{ Throwable -> 0x041a }
                L_0x02d4:
                    com.ss.android.message.g r2 = r9.f29805b     // Catch:{ Throwable -> 0x041a }
                    r2.b()     // Catch:{ Throwable -> 0x041a }
                    com.ss.android.pushmanager.setting.b r2 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Throwable -> 0x041a }
                    boolean r2 = r2.u()     // Catch:{ Throwable -> 0x041a }
                    if (r2 == 0) goto L_0x041a
                    com.ss.android.message.g r2 = r9.f29805b     // Catch:{ Throwable -> 0x041a }
                    java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x041a }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.g.f30004a     // Catch:{ Throwable -> 0x041a }
                    r14 = 0
                    r15 = 17850(0x45ba, float:2.5013E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x041a }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x041a }
                    r12 = r2
                    r16 = r3
                    boolean r3 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x041a }
                    if (r3 == 0) goto L_0x030c
                    java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x041a }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.g.f30004a     // Catch:{ Throwable -> 0x041a }
                    r14 = 0
                    r15 = 17850(0x45ba, float:2.5013E-41)
                    java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x041a }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x041a }
                    r12 = r2
                    r16 = r0
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Throwable -> 0x041a }
                    goto L_0x0415
                L_0x030c:
                    int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{  }
                    r5 = 21
                    if (r3 < r5) goto L_0x0314
                    goto L_0x0415
                L_0x0314:
                    com.ss.android.pushmanager.setting.b r3 = com.ss.android.pushmanager.setting.b.a()     // Catch:{  }
                    boolean r3 = r3.u()     // Catch:{  }
                    if (r3 != 0) goto L_0x0320
                    goto L_0x0415
                L_0x0320:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{  }
                    r3.<init>()     // Catch:{  }
                    android.content.Context r5 = r2.f30005b     // Catch:{  }
                    android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()     // Catch:{  }
                    java.lang.String r5 = r5.dataDir     // Catch:{  }
                    r3.append(r5)     // Catch:{  }
                    java.lang.String r5 = "/lib"
                    r3.append(r5)     // Catch:{  }
                    java.lang.String r3 = r3.toString()     // Catch:{  }
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{  }
                    r5.<init>()     // Catch:{  }
                    r5.append(r3)     // Catch:{  }
                    java.lang.String r6 = "/libsupervisor.so"
                    r5.append(r6)     // Catch:{  }
                    java.lang.String r5 = r5.toString()     // Catch:{  }
                    android.content.Context r6 = r2.f30005b     // Catch:{  }
                    java.lang.String r6 = r6.getPackageName()     // Catch:{  }
                    java.lang.Class<com.ss.android.message.NotifyService> r7 = com.ss.android.message.NotifyService.class
                    java.lang.String r7 = r7.getName()     // Catch:{  }
                    android.content.Context r8 = r2.f30005b     // Catch:{  }
                    java.lang.String r8 = com.ss.android.message.b.k.a((android.content.Context) r8)     // Catch:{  }
                    android.content.Context r11 = r2.f30005b     // Catch:{  }
                    android.content.Context r11 = r11.getApplicationContext()     // Catch:{  }
                    java.lang.String r11 = com.ss.android.pushmanager.app.f.a(r11)     // Catch:{  }
                    if (r11 != 0) goto L_0x036a
                    goto L_0x0415
                L_0x036a:
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{  }
                    r12.<init>()     // Catch:{  }
                    r12.append(r6)     // Catch:{  }
                    long r13 = android.os.SystemClock.elapsedRealtime()     // Catch:{  }
                    r12.append(r13)     // Catch:{  }
                    java.lang.String r12 = r12.toString()     // Catch:{  }
                    java.lang.String r12 = com.bytedance.common.utility.DigestUtils.md5Hex((java.lang.String) r12)     // Catch:{  }
                    r2.f30007d = r12     // Catch:{  }
                    android.content.Context r12 = r2.f30005b     // Catch:{  }
                    java.lang.String r12 = com.ss.android.message.b.k.b(r12)     // Catch:{  }
                    java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{  }
                    r13.<init>()     // Catch:{  }
                    r13.append(r5)     // Catch:{  }
                    java.lang.String r5 = " "
                    r13.append(r5)     // Catch:{  }
                    r13.append(r6)     // Catch:{  }
                    java.lang.String r5 = " "
                    r13.append(r5)     // Catch:{  }
                    r13.append(r7)     // Catch:{  }
                    java.lang.String r5 = " "
                    r13.append(r5)     // Catch:{  }
                    r13.append(r8)     // Catch:{  }
                    java.lang.String r5 = " "
                    r13.append(r5)     // Catch:{  }
                    r13.append(r11)     // Catch:{  }
                    java.lang.String r5 = " "
                    r13.append(r5)     // Catch:{  }
                    java.lang.String r5 = r2.f30007d     // Catch:{  }
                    r13.append(r5)     // Catch:{  }
                    java.lang.String r5 = " "
                    r13.append(r5)     // Catch:{  }
                    if (r12 == 0) goto L_0x03c5
                    r13.append(r12)     // Catch:{  }
                L_0x03c5:
                    java.lang.String r5 = r13.toString()     // Catch:{  }
                    java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{  }
                    r11[r0] = r5     // Catch:{  }
                    r11[r10] = r3     // Catch:{  }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.g.f30004a     // Catch:{  }
                    r14 = 0
                    r15 = 17851(0x45bb, float:2.5015E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{  }
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r6[r0] = r7     // Catch:{  }
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r6[r10] = r7     // Catch:{  }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{  }
                    r12 = r2
                    r16 = r6
                    boolean r6 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{  }
                    if (r6 == 0) goto L_0x0407
                    java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{  }
                    r11[r0] = r5     // Catch:{  }
                    r11[r10] = r3     // Catch:{  }
                    com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.g.f30004a     // Catch:{  }
                    r14 = 0
                    r15 = 17851(0x45bb, float:2.5015E-41)
                    java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{  }
                    java.lang.Class<java.lang.String> r4 = java.lang.String.class
                    r3[r0] = r4     // Catch:{  }
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r3[r10] = r0     // Catch:{  }
                    java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{  }
                    r12 = r2
                    r16 = r3
                    com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{  }
                    goto L_0x0415
                L_0x0407:
                    boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{  }
                    if (r0 != 0) goto L_0x0415
                    java.lang.Runtime r0 = java.lang.Runtime.getRuntime()     // Catch:{ Throwable -> 0x0415 }
                    r2 = 0
                    r0.exec(r5, r2, r2)     // Catch:{ Throwable -> 0x0415 }
                L_0x0415:
                    com.ss.android.message.g r0 = r9.f29805b     // Catch:{ Throwable -> 0x041a }
                    r0.c()     // Catch:{ Throwable -> 0x041a }
                L_0x041a:
                    com.ss.android.pushmanager.d r0 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x0445 }
                    com.ss.android.message.e r0 = r0.f()     // Catch:{ Throwable -> 0x0445 }
                    if (r0 == 0) goto L_0x042f
                    com.ss.android.pushmanager.d r0 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x0445 }
                    com.ss.android.message.e r0 = r0.f()     // Catch:{ Throwable -> 0x0445 }
                    r0.a((android.content.Context) r9)     // Catch:{ Throwable -> 0x0445 }
                L_0x042f:
                    com.ss.android.pushmanager.j r0 = com.ss.android.pushmanager.j.b()     // Catch:{ Throwable -> 0x0445 }
                    android.content.Context r2 = r9.getApplicationContext()     // Catch:{ Throwable -> 0x0445 }
                    r0.a((android.content.Context) r2)     // Catch:{ Throwable -> 0x0445 }
                    goto L_0x0446
                L_0x043b:
                    com.bytedance.common.utility.Logger.debug()     // Catch:{  }
                    android.content.Context r0 = r9.getApplicationContext()     // Catch:{ Exception -> 0x0446 }
                    com.ss.android.message.b.b.a(r0)     // Catch:{ Exception -> 0x0446 }
                L_0x0445:
                    return
                L_0x0446:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.NotifyService.AnonymousClass6.run():void");
            }
        });
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x00c6 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29804a     // Catch:{ all -> 0x00c6 }
            r4 = 0
            r5 = 17867(0x45cb, float:2.5037E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x00c6 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c6 }
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00c6 }
            com.meituan.robust.ChangeQuickRedirect r4 = f29804a     // Catch:{ all -> 0x00c6 }
            r5 = 0
            r6 = 17867(0x45cb, float:2.5037E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x00c6 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c6 }
            r3 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r12)
            return
        L_0x0025:
            java.lang.String r1 = ""
            r2 = 1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0078 }
            r3.<init>()     // Catch:{ Exception -> 0x0078 }
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r4 = r12.f29809f     // Catch:{ Exception -> 0x0078 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ Exception -> 0x0078 }
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x0078 }
            r6 = 0
        L_0x0038:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x0078 }
            if (r7 == 0) goto L_0x006a
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x0078 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ Exception -> 0x0078 }
            com.ss.android.message.a.a.a r7 = (com.ss.android.message.a.a.a) r7     // Catch:{ Exception -> 0x0078 }
            if (r7 == 0) goto L_0x0038
            int r8 = r4.size()     // Catch:{ Exception -> 0x0078 }
            int r8 = r8 - r2
            if (r6 == r8) goto L_0x0060
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0078 }
            r3.append(r7)     // Catch:{ Exception -> 0x0078 }
            java.lang.String r7 = "@"
            r3.append(r7)     // Catch:{ Exception -> 0x0078 }
            goto L_0x0067
        L_0x0060:
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0078 }
            r3.append(r7)     // Catch:{ Exception -> 0x0078 }
        L_0x0067:
            int r6 = r6 + 1
            goto L_0x0038
        L_0x006a:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0078 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0073 }
            r1 = r3
            goto L_0x007c
        L_0x0073:
            r1 = move-exception
            r11 = r3
            r3 = r1
            r1 = r11
            goto L_0x0079
        L_0x0078:
            r3 = move-exception
        L_0x0079:
            com.ss.android.message.b.h.a((java.lang.Exception) r3)     // Catch:{ all -> 0x00c6 }
        L_0x007c:
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ all -> 0x00c6 }
            if (r3 != 0) goto L_0x00c4
            com.ss.android.pushmanager.setting.b r3 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ all -> 0x00c6 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c6 }
            r4[r0] = r1     // Catch:{ all -> 0x00c6 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ all -> 0x00c6 }
            r7 = 0
            r8 = 19207(0x4b07, float:2.6915E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ all -> 0x00c6 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r0] = r5     // Catch:{ all -> 0x00c6 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c6 }
            r5 = r3
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c6 }
            if (r4 == 0) goto L_0x00b5
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c6 }
            r4[r0] = r1     // Catch:{ all -> 0x00c6 }
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.pushmanager.setting.b.f2543a     // Catch:{ all -> 0x00c6 }
            r7 = 0
            r8 = 19207(0x4b07, float:2.6915E-41)
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ all -> 0x00c6 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r9[r0] = r1     // Catch:{ all -> 0x00c6 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c6 }
            r5 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r12)
            return
        L_0x00b5:
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$b r0 = r3.f2546c     // Catch:{ all -> 0x00c6 }
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r0 = r0.a()     // Catch:{ all -> 0x00c6 }
            java.lang.String r2 = "push_apps"
            com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider$a r0 = r0.a((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x00c6 }
            r0.a()     // Catch:{ all -> 0x00c6 }
        L_0x00c4:
            monitor-exit(r12)
            return
        L_0x00c6:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.NotifyService.a():void");
    }

    public final void b() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17869, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17869, new Class[0], Void.TYPE);
            return;
        }
        if (Logger.debug()) {
            StringBuilder sb = new StringBuilder("doPushStart mPushApps Contains ");
            if (this.f29809f == null) {
                i2 = 0;
            } else {
                i2 = this.f29809f.size();
            }
            sb.append(i2);
            Logger.d("PushService NotifyService", sb.toString());
        }
        if (!com.ss.android.pushmanager.setting.b.a().l()) {
            Logger.debug();
            try {
                if (this.f29808e != null) {
                    this.f29808e.a();
                }
            } catch (Exception e2) {
                h.a(e2);
            }
        } else {
            if (!(this.f29808e == null || this.f29809f == null || this.f29809f.isEmpty())) {
                for (a next : this.f29809f.values()) {
                    if (PatchProxy.isSupport(new Object[]{next}, this, f29804a, false, 17872, new Class[]{a.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{next}, this, f29804a, false, 17872, new Class[]{a.class}, Void.TYPE);
                    } else if (!(this.f29808e == null || next == null)) {
                        this.f29808e.a(next, (Context) this);
                    }
                }
            }
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f29804a, false, 17875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29804a, false, 17875, new Class[0], Void.TYPE);
            return;
        }
        long c2 = (long) e.a().b().c();
        Boolean valueOf = Boolean.valueOf(com.ss.android.pushmanager.setting.b.a().c());
        if (valueOf.booleanValue() != q) {
            if (this.f29809f != null) {
                c cVar = (c) this.f29809f.get(Long.valueOf(c2));
                if (cVar != null) {
                    cVar.f29857f = com.ss.android.pushmanager.setting.b.a().c();
                    this.f29809f.put(Long.valueOf(c2), cVar);
                    a();
                }
            }
            q = valueOf.booleanValue();
            if (this.f29808e != null) {
                this.f29808e.a(getApplicationContext(), (d.a) new d.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f29838a;

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f29838a, false, 17894, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f29838a, false, 17894, new Class[0], Void.TYPE);
                            return;
                        }
                        NotifyService.this.b();
                    }
                });
            }
            if (com.ss.android.pushmanager.setting.b.a().k()) {
                stopSelf();
                try {
                    com.ss.android.message.b.b.a(getApplicationContext());
                } catch (Throwable unused) {
                }
            }
            Logger.debug();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:9|(1:11)|12|13|14|15|16|17|18|(1:20)|21) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0069 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0088 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[Catch:{ Exception -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008c A[Catch:{ Exception -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
            r8 = this;
            r7 = 0
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = f29804a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 17863(0x45c7, float:2.5031E-41)
            r1 = r8
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0023
            java.lang.Object[] r0 = new java.lang.Object[r7]
            com.meituan.robust.ChangeQuickRedirect r2 = f29804a
            r3 = 0
            r4 = 17863(0x45c7, float:2.5031E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0023:
            super.onDestroy()
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x009e }
            com.meituan.robust.ChangeQuickRedirect r2 = f29804a     // Catch:{ Exception -> 0x009e }
            r3 = 0
            r4 = 17864(0x45c8, float:2.5033E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x009e }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x009e }
            r1 = r8
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x0048
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x009e }
            com.meituan.robust.ChangeQuickRedirect r2 = f29804a     // Catch:{ Exception -> 0x009e }
            r3 = 0
            r4 = 17864(0x45c8, float:2.5033E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch:{ Exception -> 0x009e }
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x009e }
            r1 = r8
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009e }
            goto L_0x0088
        L_0x0048:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x009e }
            r0 = 1
            r8.f29807d = r0     // Catch:{ Exception -> 0x009e }
            com.ss.android.message.a.a.d r0 = r8.f29808e     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x005a
            com.ss.android.message.a.a.d r0 = r8.f29808e     // Catch:{ Exception -> 0x009e }
            r0.a()     // Catch:{ Exception -> 0x009e }
            r0 = 0
            r8.f29808e = r0     // Catch:{ Exception -> 0x009e }
        L_0x005a:
            r8.j()     // Catch:{ Exception -> 0x009e }
            com.ss.android.message.sswo.a r0 = com.ss.android.message.sswo.a.a(r8)     // Catch:{ Exception -> 0x009e }
            r0.a()     // Catch:{ Exception -> 0x009e }
            com.ss.android.message.g r0 = r8.f29805b     // Catch:{ Exception -> 0x0069 }
            r0.a()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            com.ss.android.message.log.a.a()     // Catch:{ Exception -> 0x009e }
            com.ss.android.pushmanager.d r0 = com.ss.android.pushmanager.f.a()     // Catch:{ Exception -> 0x0088 }
            com.ss.android.message.e r0 = r0.f()     // Catch:{ Exception -> 0x0088 }
            if (r0 == 0) goto L_0x0081
            com.ss.android.pushmanager.d r0 = com.ss.android.pushmanager.f.a()     // Catch:{ Exception -> 0x0088 }
            com.ss.android.message.e r0 = r0.f()     // Catch:{ Exception -> 0x0088 }
            r0.a()     // Catch:{ Exception -> 0x0088 }
        L_0x0081:
            com.ss.android.pushmanager.j r0 = com.ss.android.pushmanager.j.b()     // Catch:{ Exception -> 0x0088 }
            r0.a()     // Catch:{ Exception -> 0x0088 }
        L_0x0088:
            android.os.HandlerThread r0 = r8.x     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x009d
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x009e }
            r1 = 18
            if (r0 < r1) goto L_0x0098
            android.os.HandlerThread r0 = r8.x     // Catch:{ Exception -> 0x009e }
            r0.quitSafely()     // Catch:{ Exception -> 0x009e }
            goto L_0x009e
        L_0x0098:
            android.os.HandlerThread r0 = r8.x     // Catch:{ Exception -> 0x009e }
            r0.quit()     // Catch:{ Exception -> 0x009e }
        L_0x009d:
            return
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.NotifyService.onDestroy():void");
    }

    public IBinder onBind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f29804a, false, 17858, new Class[]{Intent.class}, IBinder.class)) {
            return (IBinder) PatchProxy.accessDispatch(new Object[]{intent}, this, f29804a, false, 17858, new Class[]{Intent.class}, IBinder.class);
        }
        Logger.debug();
        return this.w;
    }

    public boolean onUnbind(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f29804a, false, 17859, new Class[]{Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{intent}, this, f29804a, false, 17859, new Class[]{Intent.class}, Boolean.TYPE)).booleanValue();
        }
        Logger.debug();
        return super.onUnbind(intent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r19) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            monitor-enter(r18)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00e1 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x00e1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29804a     // Catch:{ all -> 0x00e1 }
            r4 = 0
            r5 = 17868(0x45cc, float:2.5038E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e1 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ all -> 0x00e1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00e1 }
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00e1 }
            r1[r10] = r0     // Catch:{ all -> 0x00e1 }
            com.meituan.robust.ChangeQuickRedirect r3 = f29804a     // Catch:{ all -> 0x00e1 }
            r4 = 0
            r5 = 17868(0x45cc, float:2.5038E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00e1 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ all -> 0x00e1 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00e1 }
            r2 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r18)
            return
        L_0x0038:
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r19)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0040
            monitor-exit(r18)
            return
        L_0x0040:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ all -> 0x00e1 }
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r1 = r8.f29809f     // Catch:{ Exception -> 0x00db }
            r1.clear()     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = "@"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x00db }
            if (r0 == 0) goto L_0x00d9
            int r1 = r0.length     // Catch:{ Exception -> 0x00db }
            r2 = 0
        L_0x0052:
            if (r2 >= r1) goto L_0x00d9
            r3 = r0[r2]     // Catch:{ Exception -> 0x00db }
            com.ss.android.message.a.a.c r4 = new com.ss.android.message.a.a.c     // Catch:{ Exception -> 0x00db }
            r4.<init>()     // Catch:{ Exception -> 0x00db }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00db }
            r11[r10] = r3     // Catch:{ Exception -> 0x00db }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.a.a.c.f29852a     // Catch:{ Exception -> 0x00db }
            r14 = 0
            r15 = 17973(0x4635, float:2.5186E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00db }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6     // Catch:{ Exception -> 0x00db }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00db }
            r12 = r4
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00db }
            if (r5 == 0) goto L_0x008d
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00db }
            r11[r10] = r3     // Catch:{ Exception -> 0x00db }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.message.a.a.c.f29852a     // Catch:{ Exception -> 0x00db }
            r14 = 0
            r15 = 17973(0x4635, float:2.5186E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00db }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r10] = r5     // Catch:{ Exception -> 0x00db }
            java.lang.Class r17 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x00db }
            r12 = r4
            r16 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00db }
            goto L_0x00c8
        L_0x008d:
            if (r3 == 0) goto L_0x00c8
            java.lang.String r5 = "\\|"
            java.lang.String[] r3 = r3.split(r5)     // Catch:{ Exception -> 0x00db }
            if (r3 == 0) goto L_0x00c8
            int r5 = r3.length     // Catch:{ Exception -> 0x00db }
            r6 = 7
            if (r5 != r6) goto L_0x00c8
            r5 = r3[r10]     // Catch:{ Exception -> 0x00db }
            r4.f29853b = r5     // Catch:{ Exception -> 0x00db }
            r5 = r3[r9]     // Catch:{ Exception -> 0x00db }
            r4.f29854c = r5     // Catch:{ Exception -> 0x00db }
            r5 = 2
            r5 = r3[r5]     // Catch:{ Exception -> 0x00db }
            r4.f29855d = r5     // Catch:{ Exception -> 0x00db }
            r5 = 3
            r5 = r3[r5]     // Catch:{ Exception -> 0x00db }
            long r5 = java.lang.Long.parseLong(r5)     // Catch:{ Exception -> 0x00db }
            r4.f29856e = r5     // Catch:{ Exception -> 0x00db }
            r5 = 4
            r5 = r3[r5]     // Catch:{ Exception -> 0x00db }
            boolean r5 = java.lang.Boolean.parseBoolean(r5)     // Catch:{ Exception -> 0x00db }
            r4.f29857f = r5     // Catch:{ Exception -> 0x00db }
            r5 = 5
            r5 = r3[r5]     // Catch:{ Exception -> 0x00db }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x00db }
            r4.g = r5     // Catch:{ Exception -> 0x00db }
            r5 = 6
            r3 = r3[r5]     // Catch:{ Exception -> 0x00db }
            r4.h = r3     // Catch:{ Exception -> 0x00db }
        L_0x00c8:
            java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r3 = r8.f29809f     // Catch:{ Exception -> 0x00db }
            long r5 = r4.d()     // Catch:{ Exception -> 0x00db }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x00db }
            r3.put(r5, r4)     // Catch:{ Exception -> 0x00db }
            int r2 = r2 + 1
            goto L_0x0052
        L_0x00d9:
            monitor-exit(r18)
            return
        L_0x00db:
            r0 = move-exception
            com.ss.android.message.b.h.a((java.lang.Exception) r0)     // Catch:{ all -> 0x00e1 }
            monitor-exit(r18)
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.NotifyService.a(java.lang.String):void");
    }

    public int onStartCommand(final Intent intent, int i2, int i3) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29804a, false, 17865, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{intent2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f29804a, false, 17865, new Class[]{Intent.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        super.onStartCommand(intent, i2, i3);
        Logger.debug();
        this.f29806c.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29833a;

            /* JADX WARNING: Can't wrap try/catch for region: R(10:8|9|(1:11)|12|13|14|(1:16)|(6:18|19|(2:21|(1:23)(1:(2:25|(2:27|(3:29|(1:31)(1:(2:35|(1:46)(2:41|42)))|75))(2:47|(2:49|(3:51|(4:54|(2:56|(2:58|82)(2:59|(2:61|(2:63|84)(4:64|(2:66|(1:68)(2:69|85))|70|86))(1:83)))(1:81)|79|52)|80))))))|71|72|75)|73|74) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0077 */
            /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
            /* JADX WARNING: Removed duplicated region for block: B:16:0x007b A[Catch:{ Exception -> 0x022a }] */
            /* JADX WARNING: Removed duplicated region for block: B:18:0x007f A[SYNTHETIC, Splitter:B:18:0x007f] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r17 = this;
                    r8 = r17
                    r0 = 0
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f29833a
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r4 = 0
                    r5 = 17892(0x45e4, float:2.5072E-41)
                    r2 = r17
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                    if (r1 == 0) goto L_0x0027
                    java.lang.Object[] r1 = new java.lang.Object[r0]
                    com.meituan.robust.ChangeQuickRedirect r3 = f29833a
                    r4 = 0
                    r5 = 17892(0x45e4, float:2.5072E-41)
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r7 = java.lang.Void.TYPE
                    r2 = r17
                    com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    return
                L_0x0027:
                    com.ss.android.message.NotifyService r1 = com.ss.android.message.NotifyService.this     // Catch:{ Exception -> 0x022a }
                    android.content.Intent r2 = r14     // Catch:{ Exception -> 0x022a }
                    r3 = 1
                    java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x022a }
                    r9[r0] = r2     // Catch:{ Exception -> 0x022a }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Exception -> 0x022a }
                    r12 = 0
                    r13 = 17866(0x45ca, float:2.5036E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x022a }
                    java.lang.Class<android.content.Intent> r4 = android.content.Intent.class
                    r14[r0] = r4     // Catch:{ Exception -> 0x022a }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x022a }
                    r10 = r1
                    boolean r4 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x022a }
                    if (r4 == 0) goto L_0x005b
                    java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x022a }
                    r9[r0] = r2     // Catch:{ Exception -> 0x022a }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Exception -> 0x022a }
                    r12 = 0
                    r13 = 17866(0x45ca, float:2.5036E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x022a }
                    java.lang.Class<android.content.Intent> r2 = android.content.Intent.class
                    r14[r0] = r2     // Catch:{ Exception -> 0x022a }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x022a }
                    r10 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x022a }
                    goto L_0x022a
                L_0x005b:
                    com.ss.android.pushmanager.d r4 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x0077 }
                    com.ss.android.message.e r4 = r4.f()     // Catch:{ Throwable -> 0x0077 }
                    if (r4 == 0) goto L_0x0070
                    com.ss.android.pushmanager.d r4 = com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x0077 }
                    com.ss.android.message.e r4 = r4.f()     // Catch:{ Throwable -> 0x0077 }
                    r4.a((android.content.Intent) r2)     // Catch:{ Throwable -> 0x0077 }
                L_0x0070:
                    com.ss.android.pushmanager.j r4 = com.ss.android.pushmanager.j.b()     // Catch:{ Throwable -> 0x0077 }
                    r4.a((android.content.Intent) r2)     // Catch:{ Throwable -> 0x0077 }
                L_0x0077:
                    boolean r4 = r1.g     // Catch:{ Exception -> 0x022a }
                    if (r4 == 0) goto L_0x007d
                    r1.g = r0     // Catch:{ Exception -> 0x022a }
                L_0x007d:
                    if (r2 == 0) goto L_0x0225
                    android.os.Bundle r2 = r2.getExtras()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.pushmanager.setting.b r4 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Exception -> 0x0229 }
                    boolean r4 = r4.f()     // Catch:{ Exception -> 0x0229 }
                    if (r4 == 0) goto L_0x021d
                    com.ss.android.pushmanager.setting.b r4 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Exception -> 0x0229 }
                    boolean r4 = r4.k()     // Catch:{ Exception -> 0x0229 }
                    if (r4 == 0) goto L_0x0099
                    goto L_0x021d
                L_0x0099:
                    if (r2 == 0) goto L_0x0225
                    java.lang.String r4 = "push_heart_beat"
                    boolean r4 = r2.getBoolean(r4)     // Catch:{ Exception -> 0x0229 }
                    r5 = 2
                    if (r4 == 0) goto L_0x013a
                    com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.a.d r2 = r1.f29808e     // Catch:{ Exception -> 0x0229 }
                    if (r2 == 0) goto L_0x022a
                    com.ss.android.message.a.a.d r2 = r1.f29808e     // Catch:{ Exception -> 0x0229 }
                    android.content.Context r4 = r1.getApplicationContext()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.NotifyService$8 r6 = new com.ss.android.message.NotifyService$8     // Catch:{ Exception -> 0x0229 }
                    r6.<init>()     // Catch:{ Exception -> 0x0229 }
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0229 }
                    r9[r0] = r4     // Catch:{ Exception -> 0x0229 }
                    r9[r3] = r6     // Catch:{ Exception -> 0x0229 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.message.a.a.d.f29858a     // Catch:{ Exception -> 0x0229 }
                    r12 = 0
                    r13 = 17981(0x463d, float:2.5197E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class<android.content.Context> r1 = android.content.Context.class
                    r14[r0] = r1     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class<com.ss.android.message.a.a.d$a> r1 = com.ss.android.message.a.a.d.a.class
                    r14[r3] = r1     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0229 }
                    r10 = r2
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0229 }
                    if (r1 == 0) goto L_0x00f1
                    java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0229 }
                    r9[r0] = r4     // Catch:{ Exception -> 0x0229 }
                    r9[r3] = r6     // Catch:{ Exception -> 0x0229 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.message.a.a.d.f29858a     // Catch:{ Exception -> 0x0229 }
                    r12 = 0
                    r13 = 17981(0x463d, float:2.5197E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class<android.content.Context> r1 = android.content.Context.class
                    r14[r0] = r1     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class<com.ss.android.message.a.a.d$a> r0 = com.ss.android.message.a.a.d.a.class
                    r14[r3] = r0     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0229 }
                    r10 = r2
                    com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0229 }
                    goto L_0x0229
                L_0x00f1:
                    if (r4 == 0) goto L_0x022a
                    com.ss.android.pushmanager.setting.b r0 = com.ss.android.pushmanager.setting.b.a()     // Catch:{ Exception -> 0x0229 }
                    boolean r0 = r0.l()     // Catch:{ Exception -> 0x0229 }
                    if (r0 == 0) goto L_0x022a
                    com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.b.d r0 = r2.f29862c     // Catch:{ Exception -> 0x0229 }
                    if (r0 == 0) goto L_0x0135
                    com.ss.android.message.a.b.d r0 = r2.f29862c     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.b.b r0 = r0.d()     // Catch:{ Exception -> 0x0229 }
                    int r0 = r0.getStateValue()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.b.b r1 = com.ss.android.message.a.b.b.SOCKET_CONNECTED     // Catch:{ Exception -> 0x0229 }
                    int r1 = r1.getStateValue()     // Catch:{ Exception -> 0x0229 }
                    if (r0 < r1) goto L_0x0135
                    com.ss.android.message.a.b.d r0 = r2.f29862c     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.b.b r0 = r0.d()     // Catch:{ Exception -> 0x0229 }
                    int r0 = r0.getStateValue()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.b.b r1 = com.ss.android.message.a.b.b.SOCKET_DISCONNECTING     // Catch:{ Exception -> 0x0229 }
                    int r1 = r1.getStateValue()     // Catch:{ Exception -> 0x0229 }
                    if (r0 >= r1) goto L_0x0135
                    com.ss.android.message.a.b.d r0 = r2.f29862c     // Catch:{ IOException -> 0x012f }
                    r0.c()     // Catch:{ IOException -> 0x012f }
                    goto L_0x0229
                L_0x012f:
                    r0 = move-exception
                    com.ss.android.message.b.h.a((java.lang.Exception) r0)     // Catch:{ Exception -> 0x0229 }
                    goto L_0x0229
                L_0x0135:
                    r6.a()     // Catch:{ Exception -> 0x0229 }
                    goto L_0x022a
                L_0x013a:
                    java.lang.String r4 = "remove_app"
                    boolean r4 = r2.getBoolean(r4)     // Catch:{ Exception -> 0x0229 }
                    if (r4 == 0) goto L_0x0225
                    com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0229 }
                    java.lang.String r4 = "remove_app_package"
                    java.lang.String r2 = r2.getString(r4)     // Catch:{ Exception -> 0x0229 }
                    boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0229 }
                    if (r4 != 0) goto L_0x022a
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r4 = r1.f29809f     // Catch:{ Exception -> 0x0229 }
                    java.util.Collection r4 = r4.values()     // Catch:{ Exception -> 0x0229 }
                    java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x0229 }
                L_0x015b:
                    boolean r6 = r4.hasNext()     // Catch:{ Exception -> 0x0229 }
                    if (r6 == 0) goto L_0x022a
                    java.lang.Object r6 = r4.next()     // Catch:{ Exception -> 0x0229 }
                    com.ss.android.message.a.a.a r6 = (com.ss.android.message.a.a.a) r6     // Catch:{ Exception -> 0x0229 }
                    java.lang.String r7 = r6.f()     // Catch:{ Exception -> 0x0229 }
                    boolean r7 = r2.equals(r7)     // Catch:{ Exception -> 0x0229 }
                    if (r7 == 0) goto L_0x015b
                    long r6 = r6.d()     // Catch:{ Exception -> 0x0229 }
                    java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Long r10 = new java.lang.Long     // Catch:{ Exception -> 0x0229 }
                    r10.<init>(r6)     // Catch:{ Exception -> 0x0229 }
                    r9[r0] = r10     // Catch:{ Exception -> 0x0229 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Exception -> 0x0229 }
                    r12 = 0
                    r13 = 17873(0x45d1, float:2.5045E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0229 }
                    r14[r0] = r10     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0229 }
                    r10 = r1
                    boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0229 }
                    if (r9 == 0) goto L_0x01ad
                    java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Long r10 = new java.lang.Long     // Catch:{ Exception -> 0x0229 }
                    r10.<init>(r6)     // Catch:{ Exception -> 0x0229 }
                    r9[r0] = r10     // Catch:{ Exception -> 0x0229 }
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.message.NotifyService.f29804a     // Catch:{ Exception -> 0x0229 }
                    r12 = 0
                    r13 = 17873(0x45d1, float:2.5045E-41)
                    java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0229 }
                    r14[r0] = r6     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0229 }
                    r10 = r1
                    com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0229 }
                    goto L_0x015b
                L_0x01ad:
                    com.ss.android.message.a.a.d r9 = r1.f29808e     // Catch:{ Exception -> 0x0229 }
                    if (r9 == 0) goto L_0x015b
                    com.ss.android.message.a.a.d r9 = r1.f29808e     // Catch:{ Exception -> 0x0229 }
                    java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Long r11 = new java.lang.Long     // Catch:{ Exception -> 0x0229 }
                    r11.<init>(r6)     // Catch:{ Exception -> 0x0229 }
                    r10[r0] = r11     // Catch:{ Exception -> 0x0229 }
                    r10[r3] = r1     // Catch:{ Exception -> 0x0229 }
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.message.a.a.d.f29858a     // Catch:{ Exception -> 0x0229 }
                    r13 = 0
                    r14 = 17984(0x4640, float:2.5201E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r11 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0229 }
                    r15[r0] = r11     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class<android.content.Context> r11 = android.content.Context.class
                    r15[r3] = r11     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0229 }
                    r11 = r9
                    boolean r10 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0229 }
                    if (r10 == 0) goto L_0x01f8
                    java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Long r11 = new java.lang.Long     // Catch:{ Exception -> 0x0229 }
                    r11.<init>(r6)     // Catch:{ Exception -> 0x0229 }
                    r10[r0] = r11     // Catch:{ Exception -> 0x0229 }
                    r10[r3] = r1     // Catch:{ Exception -> 0x0229 }
                    com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.message.a.a.d.f29858a     // Catch:{ Exception -> 0x0229 }
                    r13 = 0
                    r14 = 17984(0x4640, float:2.5201E-41)
                    java.lang.Class[] r15 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r6 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x0229 }
                    r15[r0] = r6     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class<android.content.Context> r6 = android.content.Context.class
                    r15[r3] = r6     // Catch:{ Exception -> 0x0229 }
                    java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0229 }
                    r11 = r9
                    com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x0229 }
                    goto L_0x015b
                L_0x01f8:
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r10 = r9.f29861b     // Catch:{ Exception -> 0x0229 }
                    java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0229 }
                    r10.remove(r6)     // Catch:{ Exception -> 0x0229 }
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r6 = r9.f29861b     // Catch:{ Exception -> 0x0229 }
                    if (r6 == 0) goto L_0x0218
                    java.util.Map<java.lang.Long, com.ss.android.message.a.a.a> r6 = r9.f29861b     // Catch:{ Exception -> 0x0229 }
                    boolean r6 = r6.isEmpty()     // Catch:{ Exception -> 0x0229 }
                    if (r6 == 0) goto L_0x020e
                    goto L_0x0218
                L_0x020e:
                    com.ss.android.message.a.a.d$2 r6 = new com.ss.android.message.a.a.d$2     // Catch:{ Exception -> 0x0229 }
                    r6.<init>(r1)     // Catch:{ Exception -> 0x0229 }
                    r9.a((android.content.Context) r1, (com.ss.android.message.a.a.d.a) r6)     // Catch:{ Exception -> 0x0229 }
                    goto L_0x015b
                L_0x0218:
                    r9.a()     // Catch:{ Exception -> 0x0229 }
                    goto L_0x015b
                L_0x021d:
                    android.content.Context r0 = r1.getApplicationContext()     // Catch:{  }
                    com.ss.android.message.b.b.a(r0)     // Catch:{  }
                    goto L_0x0229
                L_0x0225:
                    r1.b()     // Catch:{ Exception -> 0x0229 }
                    goto L_0x022a
                L_0x0229:
                    return
                L_0x022a:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.NotifyService.AnonymousClass7.run():void");
            }
        });
        if (com.ss.android.pushmanager.setting.a.a().a("is_notify_service_stick", Boolean.TRUE)) {
            return 1;
        }
        return 0;
    }
}
