package com.ss.android.ugc.aweme.commercialize.utils;

import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.a;

public class ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39667a;
    private static volatile ad h;

    /* renamed from: b  reason: collision with root package name */
    public Handler f39668b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public Aweme f39669c;

    /* renamed from: d  reason: collision with root package name */
    public int f39670d;

    /* renamed from: e  reason: collision with root package name */
    public int f39671e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f39672f;
    public Runnable g;
    private int i;

    private ad() {
    }

    public static ad a() {
        if (PatchProxy.isSupport(new Object[0], null, f39667a, true, 32534, new Class[0], ad.class)) {
            return (ad) PatchProxy.accessDispatch(new Object[0], null, f39667a, true, 32534, new Class[0], ad.class);
        }
        if (h == null) {
            synchronized (ad.class) {
                if (h == null) {
                    h = new ad();
                }
            }
        }
        return h;
    }

    public final long a(Aweme aweme) {
        long j;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f39667a, false, 32540, new Class[]{Aweme.class}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{aweme}, this, f39667a, false, 32540, new Class[]{Aweme.class}, Long.TYPE)).longValue();
        }
        if (o.v()) {
            j = a.a().V();
        } else {
            j = o.b().d();
        }
        if (j > 0) {
            return j;
        }
        if (aweme == null || aweme.getVideo() == null || aweme.getVideo().getDuration() <= 0) {
            return 1;
        }
        return (long) aweme.getVideo().getDuration();
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f39667a, false, 32535, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f39667a, false, 32535, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f39670d = i2;
        if (PatchProxy.isSupport(new Object[0], this, f39667a, false, 32537, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39667a, false, 32537, new Class[0], Void.TYPE);
            return;
        }
        if (this.f39670d == this.i) {
            this.g = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f39673a;

                /* renamed from: b  reason: collision with root package name */
                final Aweme f39674b = ad.this.f39669c;

                /* renamed from: c  reason: collision with root package name */
                long f39675c;

                public final void run() {
                    long j;
                    if (PatchProxy.isSupport(new Object[0], this, f39673a, false, 32541, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f39673a, false, 32541, new Class[0], Void.TYPE);
                        return;
                    }
                    if (this.f39674b == ad.this.f39669c) {
                        if (o.v()) {
                            j = a.a().d();
                        } else {
                            j = o.b().c();
                        }
                        if (j < 0) {
                            j = 0;
                        }
                        if (j >= ((long) ad.this.f39671e) || (j < this.f39675c && ad.this.f39670d > 0)) {
                            ad adVar = ad.this;
                            Runnable runnable = ad.this.f39672f;
                            if (PatchProxy.isSupport(new Object[]{runnable}, adVar, ad.f39667a, false, 32538, new Class[]{Runnable.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{runnable}, adVar, ad.f39667a, false, 32538, new Class[]{Runnable.class}, Void.TYPE);
                            } else if (runnable != null) {
                                try {
                                    runnable.run();
                                } catch (Exception unused) {
                                }
                            }
                            ad.this.f39672f = null;
                            return;
                        }
                        this.f39675c = j;
                        ad.this.f39668b.postDelayed(this, 1000);
                    }
                }
            };
            this.f39668b.post(this.g);
        }
    }

    public final void a(int i2, Runnable runnable) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), runnable}, this, f39667a, false, 32536, new Class[]{Integer.TYPE, Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), runnable}, this, f39667a, false, 32536, new Class[]{Integer.TYPE, Runnable.class}, Void.TYPE);
        } else if (this.f39669c != null) {
            long a2 = a(this.f39669c);
            long j = (long) i2;
            this.i = (int) (j / a2);
            this.f39671e = (int) (j % a2);
            this.f39672f = runnable;
            a(0);
        }
    }
}
