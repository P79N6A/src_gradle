package com.ss.android.ugc.aweme.base;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2750a;

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f2751b = new ScheduledThreadPoolExecutor(4);

    /* renamed from: c  reason: collision with root package name */
    public static m f2752c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2753d;

    /* renamed from: e  reason: collision with root package name */
    private Executor f2754e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Executor f2755a;

        public final a a(Executor executor) {
            if (executor == null) {
                executor = m.f2751b;
            }
            this.f2755a = executor;
            return this;
        }
    }

    public static synchronized m a() {
        synchronized (m.class) {
            if (PatchProxy.isSupport(new Object[0], null, f2750a, true, 24012, new Class[0], m.class)) {
                m mVar = (m) PatchProxy.accessDispatch(new Object[0], null, f2750a, true, 24012, new Class[0], m.class);
                return mVar;
            }
            if (f2752c == null) {
                f2752c = new m();
            }
            m mVar2 = f2752c;
            return mVar2;
        }
    }

    public final void a(a aVar) {
        this.f2754e = aVar.f2755a;
        this.f2753d = true;
    }

    private static void a(m mVar) {
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, null, f2750a, true, 24014, new Class[]{m.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mVar2}, null, f2750a, true, 24014, new Class[]{m.class}, Void.TYPE);
        } else if (!mVar2.f2753d) {
            throw new IllegalStateException("TaskManager not init");
        }
    }

    private static Runnable b(Handler handler, Callable callable, int i) {
        final Handler handler2 = handler;
        final Callable callable2 = callable;
        if (PatchProxy.isSupport(new Object[]{handler2, callable2, Integer.valueOf(i)}, null, f2750a, true, 24013, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Runnable.class)) {
            return (Runnable) PatchProxy.accessDispatch(new Object[]{handler2, callable2, Integer.valueOf(i)}, null, f2750a, true, 24013, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Runnable.class);
        }
        final int i2 = i;
        return new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34760a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f34760a, false, 24016, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34760a, false, 24016, new Class[0], Void.TYPE);
                } else if (handler2 == null) {
                    try {
                        callable2.call();
                    } catch (Exception unused) {
                    }
                } else {
                    Message obtainMessage = handler2.obtainMessage(i2);
                    try {
                        obtainMessage.obj = callable2.call();
                    } catch (Exception e2) {
                        obtainMessage.obj = e2;
                    }
                    handler2.sendMessage(obtainMessage);
                }
            }
        };
    }

    public final void a(Handler handler, Callable callable, int i) {
        if (PatchProxy.isSupport(new Object[]{handler, callable, Integer.valueOf(i)}, this, f2750a, false, 24015, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{handler, callable, Integer.valueOf(i)}, this, f2750a, false, 24015, new Class[]{Handler.class, Callable.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this);
        this.f2754e.execute(b(handler, callable, i));
    }
}
