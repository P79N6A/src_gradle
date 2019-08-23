package com.amap.api.mapcore2d;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public class k {
    private static float I = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    private static final float[] J = new float[BaseLoginOrRegisterActivity.o];
    private static final float[] K = new float[BaseLoginOrRegisterActivity.o];
    private static float O = 8.0f;
    private static float P;
    private float A;
    private float B;
    private boolean C;
    private Interpolator D;
    private boolean E;
    private float F;
    private int G;
    private float H;
    private float L;
    private final float M;
    private float N;

    /* renamed from: a  reason: collision with root package name */
    private int f6240a;

    /* renamed from: b  reason: collision with root package name */
    private int f6241b;

    /* renamed from: c  reason: collision with root package name */
    private int f6242c;

    /* renamed from: d  reason: collision with root package name */
    private float f6243d;

    /* renamed from: e  reason: collision with root package name */
    private float f6244e;

    /* renamed from: f  reason: collision with root package name */
    private float f6245f;
    private int g;
    private int h;
    private float i;
    private float j;
    private float k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private float r;
    private float s;
    private float t;
    private long u;
    private long v;
    private float w;
    private float x;
    private float y;
    private float z;

    public final int b() {
        return this.p;
    }

    public final int c() {
        return this.q;
    }

    public final float d() {
        return this.r;
    }

    public final float e() {
        return this.s;
    }

    public final float f() {
        return this.t;
    }

    public final int h() {
        return this.f6240a;
    }

    public final boolean a() {
        return this.C;
    }

    static {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = 0.0f;
        int i2 = 0;
        float f13 = 0.0f;
        while (true) {
            float f14 = 1.0f;
            if (i2 < 100) {
                float f15 = ((float) i2) / 100.0f;
                float f16 = 1.0f;
                while (true) {
                    f2 = 2.0f;
                    f3 = ((f16 - f12) / 2.0f) + f12;
                    f4 = 3.0f;
                    f5 = f14 - f3;
                    f6 = f3 * 3.0f * f5;
                    f7 = f3 * f3 * f3;
                    float f17 = (((f5 * 0.175f) + (f3 * 0.35000002f)) * f6) + f7;
                    float f18 = f16;
                    if (((double) Math.abs(f17 - f15)) < 1.0E-5d) {
                        break;
                    }
                    if (f17 > f15) {
                        f16 = f3;
                    } else {
                        f12 = f3;
                        f16 = f18;
                    }
                    f14 = 1.0f;
                }
                J[i2] = (f6 * ((f5 * 0.5f) + f3)) + f7;
                float f19 = 1.0f;
                while (true) {
                    f8 = ((f19 - f13) / f2) + f13;
                    f9 = 1.0f - f8;
                    f10 = f8 * f4 * f9;
                    f11 = f8 * f8 * f8;
                    float f20 = (((f9 * 0.5f) + f8) * f10) + f11;
                    if (((double) Math.abs(f20 - f15)) < 1.0E-5d) {
                        break;
                    }
                    if (f20 > f15) {
                        f19 = f8;
                    } else {
                        f13 = f8;
                    }
                    f2 = 2.0f;
                    f4 = 3.0f;
                }
                K[i2] = (f10 * ((f9 * 0.175f) + (f8 * 0.35000002f))) + f11;
                i2++;
            } else {
                float[] fArr = J;
                K[100] = 1.0f;
                fArr[100] = 1.0f;
                P = 1.0f;
                P = 1.0f / a(1.0f);
                return;
            }
        }
    }

    public boolean g() {
        float f2;
        if (this.C) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.u);
        if (((long) currentAnimationTimeMillis) < this.v) {
            switch (this.f6240a) {
                case 1:
                    float f3 = ((float) currentAnimationTimeMillis) / ((float) this.v);
                    int i2 = (int) (f3 * 100.0f);
                    float f4 = 1.0f;
                    float f5 = 0.0f;
                    if (i2 < 100) {
                        float f6 = ((float) i2) / 100.0f;
                        int i3 = i2 + 1;
                        float f7 = J[i2];
                        f5 = (J[i3] - f7) / ((((float) i3) / 100.0f) - f6);
                        f4 = f7 + ((f3 - f6) * f5);
                    }
                    this.F = ((f5 * ((float) this.G)) / ((float) this.v)) * 1000.0f;
                    this.p = this.f6241b + Math.round(((float) (this.g - this.f6241b)) * f4);
                    this.p = Math.min(this.p, this.m);
                    this.p = Math.max(this.p, this.l);
                    this.q = this.f6242c + Math.round(f4 * ((float) (this.h - this.f6242c)));
                    this.q = Math.min(this.q, this.o);
                    this.q = Math.max(this.q, this.n);
                    if (this.p == this.g && this.q == this.h) {
                        this.C = true;
                        break;
                    }
                case 2:
                    float f8 = ((float) currentAnimationTimeMillis) * this.w;
                    if (this.D == null) {
                        f2 = a(f8);
                    } else {
                        f2 = this.D.getInterpolation(f8);
                    }
                    this.p = this.f6241b + Math.round(this.x * f2);
                    this.q = this.f6242c + Math.round(this.y * f2);
                    this.r = this.f6243d + (this.z * f2);
                    this.s = this.f6244e + (this.A * f2);
                    this.t = this.f6245f + (f2 * this.B);
                    break;
            }
        } else {
            this.p = this.g;
            this.q = this.h;
            this.r = this.i;
            this.s = this.j;
            this.t = this.k;
            this.C = true;
        }
        return true;
    }

    public final void a(boolean z2) {
        this.C = z2;
    }

    public k(Context context) {
        this(context, null);
    }

    private float b(float f2) {
        return this.M * 386.0878f * f2;
    }

    static float a(float f2) {
        float f3;
        float f4 = f2 * O;
        if (f4 < 1.0f) {
            f3 = f4 - (1.0f - ((float) Math.exp((double) (-f4))));
        } else {
            f3 = 0.36787945f + ((1.0f - ((float) Math.exp((double) (1.0f - f4)))) * 0.63212055f);
        }
        return f3 * P;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private k(android.content.Context r3, android.view.animation.Interpolator r4) {
        /*
            r2 = this;
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()
            int r0 = r0.targetSdkVersion
            r1 = 11
            if (r0 < r1) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.k.<init>(android.content.Context, android.view.animation.Interpolator):void");
    }

    private k(Context context, Interpolator interpolator, boolean z2) {
        this.H = ViewConfiguration.getScrollFriction();
        this.C = true;
        this.D = interpolator;
        this.M = context.getResources().getDisplayMetrics().density * 160.0f;
        this.L = b(ViewConfiguration.getScrollFriction());
        this.E = z2;
        this.N = b(0.84f);
    }
}
