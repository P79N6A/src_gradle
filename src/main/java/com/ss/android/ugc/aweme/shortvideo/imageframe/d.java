package com.ss.android.ugc.aweme.shortvideo.imageframe;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class d extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68235a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f68236b;

    /* renamed from: c  reason: collision with root package name */
    public final ReadWriteLock f68237c = new ReentrantReadWriteLock();

    /* renamed from: d  reason: collision with root package name */
    public final Handler f68238d;

    interface a {
        void a(Message message);
    }

    d() {
        super("WorkerThread", 10);
        start();
        this.f68236b = new ArrayList(1);
        this.f68238d = new Handler(getLooper()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68239a;

            public final void handleMessage(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f68239a, false, 77534, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f68239a, false, 77534, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                d.this.f68237c.readLock().lock();
                try {
                    for (a a2 : d.this.f68236b) {
                        a2.a(message);
                    }
                } finally {
                    d.this.f68237c.readLock().unlock();
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f68235a, false, 77533, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f68235a, false, 77533, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f68237c.writeLock().lock();
        try {
            this.f68236b.remove(aVar);
        } finally {
            this.f68237c.writeLock().unlock();
        }
    }
}
