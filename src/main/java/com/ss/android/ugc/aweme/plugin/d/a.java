package com.ss.android.ugc.aweme.plugin.d;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59274a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f59275b;

    /* renamed from: c  reason: collision with root package name */
    private int f59276c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f59277d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f59278e;

    /* renamed from: f  reason: collision with root package name */
    private int f59279f;

    public final int a() {
        return this.f59276c;
    }

    public final void b(int i) {
        this.f59276c = 0;
    }

    public a(Context context) {
        this(context, false);
    }

    public final void a(int i) {
        this.f59279f = 2;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59274a, false, 64613, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59274a, false, 64613, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f59277d.removeCallbacks(this.f59278e);
    }

    public a(final Context context, boolean z) {
        this.f59277d = new Handler(Looper.getMainLooper());
        this.f59279f = 2;
        this.f59275b = z;
        this.f59278e = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59280a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f59280a, false, 64615, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59280a, false, 64615, new Class[0], Void.TYPE);
                } else if (a.this.f59275b) {
                    g.a(context).b();
                } else {
                    g.a(context).a();
                }
            }
        };
    }

    public final void a(boolean z, Exception exc) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), exc}, this, f59274a, false, 64614, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), exc}, this, f59274a, false, 64614, new Class[]{Boolean.TYPE, Exception.class}, Void.TYPE);
        } else if (!z && exc != null) {
            this.f59276c++;
            this.f59277d.removeCallbacks(this.f59278e);
            if (this.f59276c <= this.f59279f) {
                this.f59277d.postDelayed(this.f59278e, 30000);
            }
        }
    }
}
