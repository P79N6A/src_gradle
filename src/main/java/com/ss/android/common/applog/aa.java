package com.ss.android.common.applog;

import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.LinkedList;

public class aa extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28097a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile aa f28098b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f28099c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f28100d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f28101e = false;

    /* renamed from: f  reason: collision with root package name */
    private final LinkedList<Runnable> f28102f = new LinkedList<>();

    private aa() {
        super("TeaThread");
    }

    public static aa a() {
        if (PatchProxy.isSupport(new Object[0], null, f28097a, true, 15658, new Class[0], aa.class)) {
            return (aa) PatchProxy.accessDispatch(new Object[0], null, f28097a, true, 15658, new Class[0], aa.class);
        }
        if (f28098b == null) {
            synchronized (aa.class) {
                if (f28098b == null) {
                    aa aaVar = new aa();
                    f28098b = aaVar;
                    aaVar.start();
                }
            }
        }
        return f28098b;
    }

    @NonNull
    private Handler b() {
        if (PatchProxy.isSupport(new Object[0], this, f28097a, false, 15667, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], this, f28097a, false, 15667, new Class[0], Handler.class);
        }
        if (this.f28099c == null) {
            synchronized (this) {
                if (this.f28099c == null) {
                    this.f28099c = new Handler(getLooper());
                }
            }
        }
        return this.f28099c;
    }

    public void onLooperPrepared() {
        if (PatchProxy.isSupport(new Object[0], this, f28097a, false, 15659, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28097a, false, 15659, new Class[0], Void.TYPE);
            return;
        }
        super.onLooperPrepared();
        synchronized (this.f28100d) {
            this.f28101e = true;
            ArrayList<Runnable> arrayList = new ArrayList<>(this.f28102f);
            this.f28102f.clear();
            if (!arrayList.isEmpty()) {
                for (Runnable d2 : arrayList) {
                    d(d2);
                }
            }
        }
    }

    private void d(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f28097a, false, 15661, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f28097a, false, 15661, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        if (runnable2 != null) {
            b().post(runnable2);
        }
    }

    public final void b(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f28097a, false, 15665, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f28097a, false, 15665, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        b().removeCallbacks(runnable2);
    }

    public final void c(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f28097a, false, 15666, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f28097a, false, 15666, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        a(runnable);
    }

    public final void a(Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{runnable}, this, f28097a, false, 15660, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable}, this, f28097a, false, 15660, new Class[]{Runnable.class}, Void.TYPE);
        } else if (runnable != null) {
            if (this.f28101e) {
                d(runnable);
                return;
            }
            synchronized (this.f28100d) {
                if (this.f28101e) {
                    d(runnable);
                } else {
                    if (this.f28102f.size() > 1000) {
                        this.f28102f.poll();
                    }
                    this.f28102f.add(runnable);
                }
            }
        }
    }

    public final void a(Runnable runnable, long j) {
        Runnable runnable2 = runnable;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{runnable2, new Long(j2)}, this, f28097a, false, 15663, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2, new Long(j2)}, this, f28097a, false, 15663, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (runnable2 != null) {
            b(runnable);
            if (PatchProxy.isSupport(new Object[]{runnable2, new Long(j2)}, this, f28097a, false, 15664, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{runnable2, new Long(j2)}, this, f28097a, false, 15664, new Class[]{Runnable.class, Long.TYPE}, Void.TYPE);
            } else if (runnable2 != null) {
                b().postDelayed(runnable2, j2);
            }
        }
    }
}
