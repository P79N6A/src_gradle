package com.ss.android.medialib;

import android.os.Looper;
import com.bef.effectsdk.message.MessageCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class h implements MessageCenter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29670a;

    /* renamed from: b  reason: collision with root package name */
    private static h f29671b;

    /* renamed from: c  reason: collision with root package name */
    private List<MessageCenter.a> f29672c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f29673d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f29674e;

    /* renamed from: f  reason: collision with root package name */
    private int f29675f;

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f29670a, true, 16558, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f29670a, true, 16558, new Class[0], h.class);
        }
        if (f29671b == null) {
            synchronized (h.class) {
                if (f29671b == null) {
                    f29671b = new h();
                }
            }
        }
        return f29671b;
    }

    public final synchronized void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29670a, false, 16559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29670a, false, 16559, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29675f == 0) {
            MessageCenter.init();
            MessageCenter.setListener(this);
        }
        this.f29675f++;
    }

    private h() {
        ExecutorService executorService;
        if (PatchProxy.isSupport(new Object[0], null, i.f29678a, true, 16565, new Class[0], ExecutorService.class)) {
            executorService = (ExecutorService) PatchProxy.accessDispatch(new Object[0], null, i.f29678a, true, 16565, new Class[0], ExecutorService.class);
        } else {
            executorService = com.ss.android.ugc.aweme.thread.h.a(m.a(p.FIXED).a(1).a());
        }
        this.f29673d = executorService;
        this.f29674e = new Object();
        this.f29675f = 0;
        this.f29672c = new ArrayList();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29670a, false, 16560, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29670a, false, 16560, new Class[0], Void.TYPE);
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (this) {
                if (this.f29675f > 0) {
                    this.f29675f--;
                    if (this.f29675f == 0) {
                        MessageCenter.destroy();
                    }
                }
            }
        } else {
            this.f29673d.submit(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f29676a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f29676a, false, 16564, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f29676a, false, 16564, new Class[0], Void.TYPE);
                        return;
                    }
                    h.this.c();
                }
            });
        }
    }

    public final void a(MessageCenter.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f29670a, false, 16561, new Class[]{MessageCenter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f29670a, false, 16561, new Class[]{MessageCenter.a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f29674e) {
            if (aVar != null) {
                try {
                    this.f29672c.add(aVar);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void b(MessageCenter.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f29670a, false, 16562, new Class[]{MessageCenter.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f29670a, false, 16562, new Class[]{MessageCenter.a.class}, Void.TYPE);
            return;
        }
        synchronized (this.f29674e) {
            this.f29672c.remove(aVar);
        }
    }

    public void onMessageReceived(int i, int i2, int i3, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f29670a, false, 16563, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2}, this, f29670a, false, 16563, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        synchronized (this.f29674e) {
            for (MessageCenter.a onMessageReceived : this.f29672c) {
                int i4 = i;
                onMessageReceived.onMessageReceived(i, i2, i3, str2);
            }
        }
    }
}
