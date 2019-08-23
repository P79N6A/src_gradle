package com.ss.android.ugc.aweme.commerce.preview.refresh.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.commerce.preview.refresh.PtrFrameLayout;
import com.ss.android.ugc.aweme.commerce.preview.refresh.a.b;
import com.ss.android.ugc.aweme.commerce.preview.refresh.c;

public final class a extends FrameLayout implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37623a;

    /* renamed from: b  reason: collision with root package name */
    private int f37624b = 150;

    /* renamed from: c  reason: collision with root package name */
    private int f37625c = -180;

    /* renamed from: d  reason: collision with root package name */
    private RotateAnimation f37626d;

    /* renamed from: e  reason: collision with root package name */
    private RotateAnimation f37627e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f37628f;
    private View g;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37623a, false, 29182, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37623a, false, 29182, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f37623a, false, 29183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37623a, false, 29183, new Class[0], Void.TYPE);
            return;
        }
        this.g.clearAnimation();
    }

    public final void c(PtrFrameLayout ptrFrameLayout) {
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout}, this, f37623a, false, 29186, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout}, this, f37623a, false, 29186, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        this.f37628f.setVisibility(0);
    }

    public final void d(PtrFrameLayout ptrFrameLayout) {
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout}, this, f37623a, false, 29187, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout}, this, f37623a, false, 29187, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        b();
    }

    public final void a(PtrFrameLayout ptrFrameLayout) {
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout}, this, f37623a, false, 29184, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout}, this, f37623a, false, 29184, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        a();
    }

    public final void b(PtrFrameLayout ptrFrameLayout) {
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout}, this, f37623a, false, 29185, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout}, this, f37623a, false, 29185, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            return;
        }
        this.g.setVisibility(0);
        this.f37628f.setVisibility(0);
        this.f37628f.setText(getResources().getString(C0906R.string.y5));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{null}, this, f37623a, false, 29180, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{null}, this, f37623a, false, 29180, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, R$styleable.PullReleaseHeader, 0, 0);
        if (obtainStyledAttributes != null) {
            this.f37624b = obtainStyledAttributes.getInt(0, this.f37624b);
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[0], this, f37623a, false, 29181, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37623a, false, 29181, new Class[0], Void.TYPE);
        } else {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, (float) this.f37625c, 1, 0.5f, 1, 0.5f);
            this.f37626d = rotateAnimation;
            this.f37626d.setInterpolator(new LinearInterpolator());
            this.f37626d.setDuration((long) this.f37624b);
            this.f37626d.setFillAfter(true);
            RotateAnimation rotateAnimation2 = new RotateAnimation((float) this.f37625c, 0.0f, 1, 0.5f, 1, 0.5f);
            this.f37627e = rotateAnimation2;
            this.f37627e.setInterpolator(new LinearInterpolator());
            this.f37627e.setDuration((long) this.f37624b);
            this.f37627e.setFillAfter(true);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.hq, this);
        this.g = inflate.findViewById(C0906R.id.b4n);
        this.f37628f = (TextView) inflate.findViewById(C0906R.id.dko);
        a();
    }

    public final void a(PtrFrameLayout ptrFrameLayout, boolean z, byte b2, c cVar) {
        PtrFrameLayout ptrFrameLayout2 = ptrFrameLayout;
        byte b3 = b2;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(b2), cVar2}, this, f37623a, false, 29188, new Class[]{PtrFrameLayout.class, Boolean.TYPE, Byte.TYPE, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2, Byte.valueOf(z), Byte.valueOf(b2), cVar2}, this, f37623a, false, 29188, new Class[]{PtrFrameLayout.class, Boolean.TYPE, Byte.TYPE, c.class}, Void.TYPE);
            return;
        }
        int offsetToRefresh = ptrFrameLayout.getOffsetToRefresh();
        int i = cVar2.f37634f;
        int i2 = cVar2.g;
        if (i >= offsetToRefresh || i2 < offsetToRefresh) {
            if (i > offsetToRefresh && i2 <= offsetToRefresh && z && b3 == 2) {
                if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2}, this, f37623a, false, 29189, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2}, this, f37623a, false, 29189, new Class[]{PtrFrameLayout.class}, Void.TYPE);
                } else if (!ptrFrameLayout2.f37604d) {
                    this.f37628f.setVisibility(0);
                    this.f37628f.setText(C0906R.string.y6);
                }
                if (this.g != null) {
                    this.g.clearAnimation();
                    this.g.startAnimation(this.f37626d);
                }
            }
        } else if (z && b3 == 2) {
            if (PatchProxy.isSupport(new Object[]{ptrFrameLayout2}, this, f37623a, false, 29190, new Class[]{PtrFrameLayout.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{ptrFrameLayout2}, this, f37623a, false, 29190, new Class[]{PtrFrameLayout.class}, Void.TYPE);
            } else {
                this.f37628f.setVisibility(0);
                this.f37628f.setText(getResources().getString(C0906R.string.y5));
            }
            if (this.g != null) {
                this.g.clearAnimation();
                this.g.startAnimation(this.f37627e);
            }
        }
    }
}
