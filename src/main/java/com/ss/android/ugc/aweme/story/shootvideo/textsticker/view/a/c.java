package com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.a;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.story.shootvideo.textfont.TextStickerViewModel;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.o;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74347a;

    /* renamed from: b  reason: collision with root package name */
    public o.a f74348b;

    /* renamed from: c  reason: collision with root package name */
    public float f74349c;

    /* renamed from: d  reason: collision with root package name */
    public float f74350d;

    /* renamed from: e  reason: collision with root package name */
    public float f74351e;

    /* renamed from: f  reason: collision with root package name */
    public float f74352f;
    public long g;
    public float h;
    public float i;
    public boolean j;
    public int k = 2;
    public final int l = 200;
    public int m;
    public int n;
    public boolean o;
    public SafeHandler p;
    public o q;
    public boolean r;
    public boolean s;
    private Runnable t = new a(this, (byte) 0);
    private TextStickerViewModel u;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74353a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f74353a, false, 86499, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74353a, false, 86499, new Class[0], Void.TYPE);
                return;
            }
            c.this.j = false;
            if (c.this.q != null) {
                c.this.q.invalidate();
            }
        }

        private a() {
        }

        /* synthetic */ a(c cVar, byte b2) {
            this();
        }
    }

    public final boolean a() {
        if (this.k == 3) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.k == 4) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.k != 2) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (!PatchProxy.isSupport(new Object[0], this, f74347a, false, 86495, new Class[0], Boolean.TYPE)) {
            return ((Boolean) e().a().getValue()).booleanValue();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74347a, false, 86495, new Class[0], Boolean.TYPE)).booleanValue();
    }

    private TextStickerViewModel e() {
        if (PatchProxy.isSupport(new Object[0], this, f74347a, false, 86496, new Class[0], TextStickerViewModel.class)) {
            return (TextStickerViewModel) PatchProxy.accessDispatch(new Object[0], this, f74347a, false, 86496, new Class[0], TextStickerViewModel.class);
        }
        if (this.u == null) {
            this.u = (TextStickerViewModel) ViewModelProviders.of((FragmentActivity) this.q.getContext()).get(TextStickerViewModel.class);
        }
        return this.u;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f74347a, false, 86494, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f74347a, false, 86494, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.j = z;
        if (this.t != null) {
            this.q.removeCallbacks(this.t);
            this.t = null;
        }
        if (z && this.p != null && this.t == null) {
            this.t = new a(this, (byte) 0);
            this.q.postDelayed(this.t, 3000);
        }
        this.q.invalidate();
    }

    public final void a(int i2, int i3) {
        this.m = i2;
        this.n = i3;
    }

    public final boolean a(float f2, float f3) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74347a, false, 86492, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f74347a, false, 86492, new Class[]{Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        this.g = System.currentTimeMillis();
        float f4 = f2 - ((float) this.m);
        float f5 = f3 - ((float) this.n);
        this.f74351e = f4;
        this.f74352f = f5;
        if (this.s) {
            this.k = 2;
            this.s = false;
        }
        if (this.j) {
            if (this.q.f(f4, f5)) {
                this.k = 5;
            } else if (this.q.c(f4, f5)) {
                this.k = 4;
                this.h = this.q.getRotateRect().centerX();
                this.i = this.q.getRotateRect().centerY();
            } else if (this.q.e(f4, f5)) {
                this.k = 6;
                this.h = this.q.getEditRect().centerX();
                this.i = this.q.getEditRect().centerY();
            } else if (this.q.d(f4, f5)) {
                this.k = 7;
                this.h = this.q.getTimeRect().centerX();
                this.i = this.q.getTimeRect().centerY();
            }
            z = true;
        }
        if (this.k == 2 || d()) {
            this.o = this.q.b(f4, f5);
            if (this.o) {
                this.k = 3;
                this.h = f4;
                this.i = f5;
                z = true;
            }
        }
        return z;
    }
}
