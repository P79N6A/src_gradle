package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    private static a f23680d;

    /* renamed from: a  reason: collision with root package name */
    public final Set<C0261a> f23681a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f23682b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f23683c = new Runnable() {
        public final void run() {
            a.b();
            for (C0261a release : a.this.f23681a) {
                release.release();
            }
            a.this.f23681a.clear();
        }
    };

    /* renamed from: com.facebook.drawee.components.a$a  reason: collision with other inner class name */
    public interface C0261a {
        void release();
    }

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (f23680d == null) {
                f23680d = new a();
            }
            aVar = f23680d;
        }
        return aVar;
    }

    public static void b() {
        boolean z;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
    }

    public final void a(C0261a aVar) {
        b();
        this.f23681a.remove(aVar);
    }
}
