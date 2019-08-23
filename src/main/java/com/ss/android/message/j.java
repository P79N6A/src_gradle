package com.ss.android.message;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2491a;

    /* renamed from: d  reason: collision with root package name */
    private static j f2492d;

    /* renamed from: b  reason: collision with root package name */
    public final Looper f2493b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHandler f2494c;

    /* renamed from: e  reason: collision with root package name */
    private final HandlerThread f2495e = new HandlerThread("PushThreadHandler");

    public void handleMsg(Message message) {
    }

    private j() {
        this.f2495e.start();
        this.f2493b = this.f2495e.getLooper();
        this.f2494c = new WeakHandler(this.f2493b, this);
    }

    public static j a() {
        if (PatchProxy.isSupport(new Object[0], null, f2491a, true, 17939, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f2491a, true, 17939, new Class[0], j.class);
        }
        if (f2492d == null) {
            synchronized (j.class) {
                if (f2492d == null) {
                    f2492d = new j();
                }
            }
        }
        return f2492d;
    }

    public final void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f2491a, false, 17940, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f2491a, false, 17940, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        a(runnable2, 0);
    }

    public final void a(Runnable runnable, long j) {
        Runnable runnable2 = runnable;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{runnable2, new Long(j2)}, this, f2491a, false, 17941, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2, new Long(j2)}, this, f2491a, false, 17941, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE);
        } else if (j2 <= 0) {
            this.f2494c.post(runnable);
        } else {
            this.f2494c.postDelayed(runnable, j2);
        }
    }
}
