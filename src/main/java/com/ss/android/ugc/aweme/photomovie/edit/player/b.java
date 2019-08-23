package com.ss.android.ugc.aweme.photomovie.edit.player;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.photomovie.transition.ITransition;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.shortvideo.fc;

public final class b implements ITransition {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58987a;

    /* renamed from: b  reason: collision with root package name */
    public f f58988b;

    /* renamed from: c  reason: collision with root package name */
    private FrameLayout f58989c;

    /* renamed from: d  reason: collision with root package name */
    private View f58990d;

    /* renamed from: e  reason: collision with root package name */
    private View f58991e;

    /* renamed from: f  reason: collision with root package name */
    private View f58992f;
    private int g;
    private int h;
    private float i;
    private int j = fc.c(this.f58990d.getContext());

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f58987a, false, 64171, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58987a, false, 64171, new Class[0], Void.TYPE);
            return;
        }
        if (this.f58991e != null) {
            this.f58991e.setVisibility(0);
        }
        if (this.f58992f != null) {
            this.f58992f.setVisibility(0);
        }
        if (this.f58988b != null) {
            this.f58988b.d();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58987a, false, 64168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58987a, false, 64168, new Class[0], Void.TYPE);
            return;
        }
        if (this.f58991e != null) {
            this.f58991e.setVisibility(4);
        }
        if (this.f58992f != null) {
            this.f58992f.setVisibility(4);
        }
        if (this.f58988b != null) {
            this.f58988b.a();
        }
    }

    private void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58987a, false, 64172, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58987a, false, 64172, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.g == 0) {
            this.g = this.f58990d.getHeight();
            this.h = this.f58990d.getWidth();
            this.f58990d.setPivotX((float) (this.h / 2));
            this.i = (((float) ((this.g - i2) - this.j)) * 1.0f) / ((float) this.g);
            this.f58990d.setPivotY(((float) this.j) / (1.0f - this.i));
        }
    }

    b(@NonNull FrameLayout frameLayout, @NonNull View view) {
        this.f58989c = frameLayout;
        this.f58990d = view;
        this.f58991e = frameLayout.findViewById(C0906R.id.bxv);
        this.f58992f = frameLayout.findViewById(C0906R.id.bxu);
    }

    public final void b(float f2, int i2, int i3) {
        int i4 = i3;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58987a, false, 64170, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58987a, false, 64170, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i4);
        int i5 = i2;
        c(1.0f - f2, i2, i4);
    }

    private void c(float f2, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58987a, false, 64173, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58987a, false, 64173, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f58990d.setScaleY(((((float) this.g) - (((float) (this.j + i3)) * f2)) * 1.0f) / ((float) this.g));
        this.f58990d.setScaleX(((((float) this.h) - ((((float) this.h) * (1.0f - this.i)) * f2)) * 1.0f) / ((float) this.h));
    }

    public final void a(float f2, int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58987a, false, 64169, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f58987a, false, 64169, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i3);
        c(f2, i2, i3);
    }
}
