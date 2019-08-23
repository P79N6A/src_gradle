package com.mapbox.mapboxsdk.maps;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.mapbox.mapboxsdk.maps.widgets.CompassView;
import com.mapbox.mapboxsdk.utils.a;

public final class ac {

    /* renamed from: a  reason: collision with root package name */
    final CompassView f26606a;

    /* renamed from: b  reason: collision with root package name */
    final ImageView f26607b;

    /* renamed from: c  reason: collision with root package name */
    public d f26608c;

    /* renamed from: d  reason: collision with root package name */
    public final float f26609d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f26610e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f26611f = true;
    public boolean g = true;
    public boolean h = true;
    public boolean i;
    public boolean j = true;
    public boolean k = true;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    public boolean o = true;
    public boolean p = true;
    public PointF q;
    private final g r;
    private final x s;
    private final int[] t = new int[4];
    private final int[] u = new int[4];
    private final View v;
    private final int[] w = new int[4];

    private boolean d() {
        return this.f26606a.f26742b;
    }

    private int f() {
        return this.t[0];
    }

    private int g() {
        return this.t[1];
    }

    private int h() {
        return this.t[2];
    }

    private int i() {
        return this.t[3];
    }

    @NonNull
    private Drawable j() {
        return this.f26606a.getCompassImage();
    }

    private int m() {
        return this.w[0];
    }

    private int n() {
        return this.w[1];
    }

    private int o() {
        return this.w[2];
    }

    private int p() {
        return this.w[3];
    }

    private int s() {
        return this.u[0];
    }

    private int t() {
        return this.u[1];
    }

    private int u() {
        return this.u[2];
    }

    private int v() {
        return this.u[3];
    }

    public final float b() {
        return this.s.a();
    }

    public final float c() {
        return this.s.b();
    }

    private int e() {
        return ((FrameLayout.LayoutParams) this.f26606a.getLayoutParams()).gravity;
    }

    private boolean k() {
        if (this.v.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private int l() {
        return ((FrameLayout.LayoutParams) this.v.getLayoutParams()).gravity;
    }

    private boolean q() {
        if (this.f26607b.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    private int r() {
        return ((FrameLayout.LayoutParams) this.f26607b.getLayoutParams()).gravity;
    }

    public final boolean a() {
        return this.f26606a.isEnabled();
    }

    @UiThread
    public final void a(int i2) {
        a(this.f26606a, i2);
    }

    private void f(Bundle bundle) {
        bundle.putBoolean("mapbox_zoomControlsEnabled", this.i);
    }

    private void g(Bundle bundle) {
        bundle.putBoolean("mapbox_deselectMarkerOnTap", this.p);
    }

    private void h(Bundle bundle) {
        bundle.putParcelable("mapbox_userFocalPoint", this.q);
    }

    public final void b(int i2) {
        a(this.v, i2);
    }

    public final void c(int i2) {
        a(this.f26607b, i2);
    }

    public final void d(boolean z) {
        int i2;
        ImageView imageView = this.f26607b;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
    }

    private void d(Bundle bundle) {
        bundle.putInt("mapbox_logoGravity", l());
        bundle.putInt("mapbox_logoMarginLeft", m());
        bundle.putInt("mapbox_logoMarginTop", n());
        bundle.putInt("mapbox_logoMarginRight", o());
        bundle.putInt("mapbox_logoMarginBottom", p());
        bundle.putBoolean("mapbox_logoEnabled", k());
    }

    private void e(Bundle bundle) {
        bundle.putInt("mapbox_attrGravity", r());
        bundle.putInt("mapbox_attrMarginLeft", s());
        bundle.putInt("mapbox_attrMarginTop", t());
        bundle.putInt("mapbox_attrMarginRight", u());
        bundle.putInt("mapbox_atrrMarginBottom", v());
        bundle.putBoolean("mapbox_atrrEnabled", q());
    }

    public final void b(boolean z) {
        this.f26606a.f26742b = z;
    }

    public final void c(boolean z) {
        int i2;
        View view = this.v;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    private void b(Bundle bundle) {
        bundle.putBoolean("mapbox_zoomEnabled", this.g);
        bundle.putBoolean("mapbox_scrollEnabled", this.h);
        bundle.putBoolean("mapbox_rotateEnabled", this.f26610e);
        bundle.putBoolean("mapbox_tiltEnabled", this.f26611f);
        bundle.putBoolean("mapbox_doubleTapEnabled", this.j);
        bundle.putBoolean("mapbox_scaleAnimationEnabled", this.k);
        bundle.putBoolean("mapbox_rotateAnimationEnabled", this.l);
        bundle.putBoolean("mapbox_flingAnimationEnabled", this.m);
        bundle.putBoolean("mapbox_increaseRotateThreshold", this.n);
        bundle.putBoolean("mapbox_increaseScaleThreshold", this.o);
    }

    private void c(Bundle bundle) {
        bundle.putBoolean("mapbox_compassEnabled", a());
        bundle.putInt("mapbox_compassGravity", e());
        bundle.putInt("mapbox_compassMarginLeft", f());
        bundle.putInt("mapbox_compassMarginTop", g());
        bundle.putInt("mapbox_compassMarginBottom", i());
        bundle.putInt("mapbox_compassMarginRight", h());
        bundle.putBoolean("mapbox_compassFade", d());
        bundle.putByteArray("mapbox_compassImage", a.b(j()));
    }

    public final void a(@Nullable PointF pointF) {
        this.q = pointF;
        this.r.a(pointF);
    }

    public final void a(@NonNull Drawable drawable) {
        this.f26606a.setCompassImage(drawable);
    }

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        b(bundle);
        c(bundle);
        d(bundle);
        e(bundle);
        f(bundle);
        g(bundle);
        h(bundle);
    }

    public final void a(boolean z) {
        this.f26606a.setEnabled(z);
    }

    private static void a(@NonNull View view, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    @UiThread
    public final void a(int i2, int i3, int i4, int i5) {
        a(this.f26606a, this.t, i2, i3, i4, i5);
    }

    public final void b(int i2, int i3, int i4, int i5) {
        a(this.v, this.w, i2, i3, i4, i5);
    }

    public final void c(int i2, int i3, int i4, int i5) {
        a(this.f26607b, this.u, i2, i3, i4, i5);
    }

    ac(@NonNull x xVar, @NonNull g gVar, @NonNull CompassView compassView, @NonNull ImageView imageView, @NonNull View view, float f2) {
        this.s = xVar;
        this.r = gVar;
        this.f26606a = compassView;
        this.f26607b = imageView;
        this.v = view;
        this.f26609d = f2;
    }

    private static void a(@NonNull View view, int[] iArr, int i2, int i3, int i4, int i5) {
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.setMargins(i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart(i2);
            layoutParams.setMarginEnd(i4);
        }
        view.setLayoutParams(layoutParams);
    }
}
