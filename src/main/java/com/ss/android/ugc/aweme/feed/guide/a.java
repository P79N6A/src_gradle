package com.ss.android.ugc.aweme.feed.guide;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45366a;

    /* renamed from: b  reason: collision with root package name */
    public AnimationImageView f45367b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f45368c;

    /* renamed from: d  reason: collision with root package name */
    public View f45369d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f45370e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f45371f;
    public boolean g;
    public ViewStub h;
    public Float i;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f45366a, false, 41161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45366a, false, 41161, new Class[0], Void.TYPE);
            return;
        }
        this.f45370e = true;
        this.f45371f = false;
        if (this.g) {
            if (this.f45367b.isAnimating()) {
                this.f45367b.cancelAnimation();
            }
            this.f45369d.setVisibility(8);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f45366a, false, 41164, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45366a, false, 41164, new Class[0], Void.TYPE);
            return;
        }
        if (this.g) {
            this.f45369d.clearAnimation();
            if (this.f45367b.isAnimating()) {
                this.f45367b.cancelAnimation();
            }
            this.f45367b.setVisibility(8);
            this.f45369d.setOnClickListener(null);
            this.f45369d.setVisibility(8);
        }
        this.f45371f = false;
    }

    public final void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f45366a, false, 41163, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45366a, false, 41163, new Class[0], Void.TYPE);
        } else if (this.g) {
            this.f45369d.setOnClickListener(null);
            if (this.f45367b.isAnimating()) {
                this.f45367b.cancelAnimation();
            }
            this.f45369d.animate().alpha(0.0f).setDuration(300).withEndAction(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f45376a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f45376a, false, 41170, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f45376a, false, 41170, new Class[0], Void.TYPE);
                        return;
                    }
                    a.this.f45369d.setVisibility(8);
                    a.this.f45371f = false;
                }
            }).start();
        } else {
            this.f45371f = false;
        }
    }

    public a(View view) {
        this.h = (ViewStub) view.findViewById(C0906R.id.cwq);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f45366a, false, 41165, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f45366a, false, 41165, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.g) {
            this.f45369d.setTranslationY(f2);
        } else {
            this.i = Float.valueOf(f2);
        }
    }
}
