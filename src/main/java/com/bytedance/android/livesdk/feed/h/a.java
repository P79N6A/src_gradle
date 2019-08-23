package com.bytedance.android.livesdk.feed.h;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.UiThread;
import android.view.Choreographer;
import com.bytedance.android.livesdk.feed.r;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14171a;

    /* renamed from: b  reason: collision with root package name */
    static final boolean f14172b = Logger.debug();

    /* renamed from: c  reason: collision with root package name */
    long f14173c;

    /* renamed from: d  reason: collision with root package name */
    long f14174d;

    /* renamed from: e  reason: collision with root package name */
    long f14175e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14176f;
    public int g;
    @SuppressLint({"NewApi"})
    private Choreographer.FrameCallback h;

    /* renamed from: com.bytedance.android.livesdk.feed.h.a$a  reason: collision with other inner class name */
    public static class C0100a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14179a = new a((byte) 0);
    }

    private a() {
        this.h = new Choreographer.FrameCallback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14177a;

            @TargetApi(16)
            public final void doFrame(long j) {
                if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f14177a, false, 8774, new Class[]{Long.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f14177a, false, 8774, new Class[]{Long.TYPE}, Void.TYPE);
                } else if (a.this.f14176f) {
                    if (a.this.f14174d <= 0) {
                        a.this.f14174d = j;
                    } else {
                        a.this.f14175e++;
                    }
                    a.this.f14173c = j;
                    try {
                        Choreographer.getInstance().postFrameCallback(this);
                        if (a.f14172b) {
                            a.this.a(true);
                        }
                    } catch (Throwable unused) {
                        a.this.f14176f = false;
                    }
                }
            }
        };
    }

    @UiThread
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14171a, false, 8770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14171a, false, 8770, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f14176f && Build.VERSION.SDK_INT >= 16) {
            try {
                b();
                this.f14176f = true;
                Choreographer.getInstance().postFrameCallback(this.h);
            } catch (Throwable unused) {
                this.f14176f = false;
            }
        }
    }

    @UiThread
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14171a, false, 8771, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14171a, false, 8771, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Choreographer.getInstance().removeFrameCallback(this.h);
                if (this.f14176f) {
                    a(false);
                }
            } catch (Throwable unused) {
            }
        }
        this.f14176f = false;
        this.f14174d = 0;
        this.f14173c = 0;
        this.f14175e = 0;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        int i;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14171a, false, 8773, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14171a, false, 8773, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            i = 1;
        } else {
            i = 30;
        }
        if (this.f14175e >= ((long) i) && this.f14173c > this.f14174d) {
            float f2 = (((float) this.f14175e) * 1.0E9f) / ((float) (this.f14173c - this.f14174d));
            if (!z) {
                r.a(f2);
                this.g++;
            }
        }
    }
}
