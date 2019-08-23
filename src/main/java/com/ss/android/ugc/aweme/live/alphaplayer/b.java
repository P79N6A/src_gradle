package com.ss.android.ugc.aweme.live.alphaplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.alphaplayer.d;
import com.ss.android.ugc.aweme.live.alphaplayer.e;
import com.ss.android.ugc.aweme.live.alphaplayer.i;

@SuppressLint({"ViewConstructor"})
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53215a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f53216b;

    /* renamed from: c  reason: collision with root package name */
    public i f53217c;

    /* renamed from: d  reason: collision with root package name */
    public h f53218d;
    private float q;
    private float r;
    private d.a s;

    public final d.a getScaleType() {
        return this.s;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f53215a, false, 55446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53215a, false, 55446, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53217c != null) {
            this.f53217c.a((i.a) new i.a() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53225a;

                /* renamed from: c  reason: collision with root package name */
                private Surface f53227c;

                public final void a(Surface surface) {
                    if (PatchProxy.isSupport(new Object[]{surface}, this, f53225a, false, 55449, new Class[]{Surface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{surface}, this, f53225a, false, 55449, new Class[]{Surface.class}, Void.TYPE);
                        return;
                    }
                    if (this.f53227c != null) {
                        this.f53227c.release();
                    }
                    this.f53227c = surface;
                    b.this.f53216b = true;
                    b.this.f53218d.a(surface);
                    b.this.f53218d.a();
                }
            });
        }
    }

    public final void setPlayerController(h hVar) {
        this.f53218d = hVar;
    }

    public final void setScaleType(d.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f53215a, false, 55440, new Class[]{d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f53215a, false, 55440, new Class[]{d.a.class}, Void.TYPE);
            return;
        }
        this.s = aVar;
        if (this.f53217c != null) {
            this.f53217c.a(aVar);
        }
    }

    public final void setVideoRenderer(k kVar) {
        if (PatchProxy.isSupport(new Object[]{kVar}, this, f53215a, false, 55443, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar}, this, f53215a, false, 55443, new Class[]{k.class}, Void.TYPE);
            return;
        }
        this.f53217c = kVar;
        setRenderer(kVar);
        c();
        setRenderMode(0);
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53215a, false, 55447, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f53215a, false, 55447, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        a(this.q, this.r);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f53215a, false, 55441, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f53215a, false, 55441, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (f2 > 0.0f && f3 > 0.0f) {
            this.q = f2;
            this.r = f3;
        }
        if (this.f53217c != null) {
            final float measuredWidth = (float) getMeasuredWidth();
            final float measuredHeight = (float) getMeasuredHeight();
            final float f4 = f2;
            final float f5 = f3;
            AnonymousClass1 r0 = new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f53219a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f53219a, false, 55448, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f53219a, false, 55448, new Class[0], Void.TYPE);
                        return;
                    }
                    b.this.f53217c.a(measuredWidth, measuredHeight, f4, f5);
                }
            };
            if (PatchProxy.isSupport(new Object[]{r0}, this, e.f53248e, false, 55481, new Class[]{Runnable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{r0}, this, e.f53248e, false, 55481, new Class[]{Runnable.class}, Void.TYPE);
                return;
            }
            this.h.a((Runnable) r0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        super(context, null);
        if (!isInEditMode()) {
            if (PatchProxy.isSupport(new Object[]{null}, this, f53215a, false, 55442, new Class[]{AttributeSet.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f53215a, false, 55442, new Class[]{AttributeSet.class}, Void.TYPE);
                return;
            }
            setEGLContextClientVersion(2);
            if (PatchProxy.isSupport(new Object[]{8, 8, 8, 8, 16, 0}, this, e.f53248e, false, 55471, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{8, 8, 8, 8, 16, 0}, this, e.f53248e, false, 55471, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                e.b bVar = new e.b(8, 8, 8, 8, 16, 0);
                setEGLConfigChooser((e.C0617e) bVar);
            }
            if (PatchProxy.isSupport(new Object[]{null}, this, f53215a, false, 55445, new Class[]{AttributeSet.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{null}, this, f53215a, false, 55445, new Class[]{AttributeSet.class}, Void.TYPE);
            }
            c();
            bringToFront();
            setPreserveEGLContextOnPause(true);
            setOpaque(false);
        }
    }
}
