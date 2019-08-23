package com.bytedance.android.livesdkapi.depend.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdkapi.depend.e.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18648a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f18649b = "b";

    /* renamed from: d  reason: collision with root package name */
    private static final String f18650d = (f18649b + "-Thread");

    /* renamed from: e  reason: collision with root package name */
    private static final a.c f18651e = new a.c() {
    };

    /* renamed from: f  reason: collision with root package name */
    private static volatile b f18652f;

    /* renamed from: c  reason: collision with root package name */
    public Handler f18653c;
    private boolean g;
    private Executor h;

    private b() {
    }

    public final void a(Callable callable) {
        Callable callable2 = callable;
        if (PatchProxy.isSupport(new Object[]{callable2}, this, f18648a, false, 14952, new Class[]{Callable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{callable2}, this, f18648a, false, 14952, new Class[]{Callable.class}, Void.TYPE);
            return;
        }
        a((Handler) null, callable2, 0);
    }

    private synchronized void a(Executor executor) {
        if (PatchProxy.isSupport(new Object[]{executor}, this, f18648a, false, 14954, new Class[]{Executor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{executor}, this, f18648a, false, 14954, new Class[]{Executor.class}, Void.TYPE);
            return;
        }
        this.h = executor;
        this.f18653c = new Handler(Looper.getMainLooper());
        this.g = true;
    }

    private synchronized void b() {
        if (PatchProxy.isSupport(new Object[0], this, f18648a, false, 14955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18648a, false, 14955, new Class[0], Void.TYPE);
            return;
        }
        a(32);
    }

    public static b a() {
        if (PatchProxy.isSupport(new Object[0], null, f18648a, true, 14948, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], null, f18648a, true, 14948, new Class[0], b.class);
        }
        if (f18652f == null) {
            synchronized (b.class) {
                if (f18652f == null) {
                    b bVar = new b();
                    f18652f = bVar;
                    bVar.b();
                }
            }
        }
        return f18652f;
    }

    public static void a(b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, f18648a, true, 14949, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, f18648a, true, 14949, new Class[]{b.class}, Void.TYPE);
        } else if (!bVar2.g) {
            throw new IllegalStateException("LiveTaskManager: Must call init() before use.");
        }
    }

    private synchronized void a(int i) {
        if (PatchProxy.isSupport(new Object[]{32}, this, f18648a, false, 14956, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{32}, this, f18648a, false, 14956, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(32, f18650d);
    }

    private synchronized void a(int i, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str}, this, f18648a, false, 14957, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str}, this, f18648a, false, 14957, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(i, str, f18651e);
    }

    private synchronized void a(int i, String str, a.c cVar) {
        a aVar;
        String str2 = str;
        a.c cVar2 = cVar;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, cVar2}, this, f18648a, false, 14958, new Class[]{Integer.TYPE, String.class, a.c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, cVar2}, this, f18648a, false, 14958, new Class[]{Integer.TYPE, String.class, a.c.class}, Void.TYPE);
                return;
            }
            a.C0133a aVar2 = new a.C0133a();
            aVar2.f18639b = i;
            aVar2.f18641d = str2;
            aVar2.f18640c = cVar2;
            if (PatchProxy.isSupport(new Object[0], aVar2, a.C0133a.f18638a, false, 14945, new Class[0], a.class)) {
                aVar = (a) PatchProxy.accessDispatch(new Object[0], aVar2, a.C0133a.f18638a, false, 14945, new Class[0], a.class);
            } else {
                aVar = new a(aVar2.f18639b, new a.d(aVar2.f18641d, (byte) 0), aVar2.f18640c, (byte) 0);
            }
            a((Executor) aVar);
        }
    }

    private void a(Handler handler, Callable callable, int i) {
        Runnable runnable;
        final Callable callable2 = callable;
        if (PatchProxy.isSupport(new Object[]{null, callable2, 0}, this, f18648a, false, 14951, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null, callable2, 0}, this, f18648a, false, 14951, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this);
        Executor executor = this.h;
        if (PatchProxy.isSupport(new Object[]{null, callable2, 0}, null, f18648a, true, 14950, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Runnable.class)) {
            runnable = (Runnable) PatchProxy.accessDispatch(new Object[]{null, callable2, 0}, null, f18648a, true, 14950, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Runnable.class);
        } else {
            runnable = new Runnable(null, 0) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18654a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f18654a, false, 14959, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f18654a, false, 14959, new Class[0], Void.TYPE);
                    } else if (null == null) {
                        try {
                            callable2.call();
                        } catch (Exception unused) {
                        }
                    } else {
                        Message obtainMessage = null.obtainMessage(0);
                        try {
                            obtainMessage.obj = callable2.call();
                        } catch (Exception e2) {
                            obtainMessage.obj = e2;
                        }
                        null.sendMessage(obtainMessage);
                    }
                }
            };
        }
        executor.execute(runnable);
    }
}
