package com.ss.android.ugc.aweme.anim.a;

import android.content.Context;
import android.graphics.Camera;
import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends Animation {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f33326b;

    /* renamed from: c  reason: collision with root package name */
    protected final float f33327c;

    /* renamed from: d  reason: collision with root package name */
    protected final float f33328d;

    /* renamed from: e  reason: collision with root package name */
    protected final float f33329e;

    /* renamed from: f  reason: collision with root package name */
    protected final float f33330f;
    protected final float g;
    protected float h = 1.0f;
    protected Camera i;

    public void initialize(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f33326b, false, 21639, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f33326b, false, 21639, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.initialize(i2, i3, i4, i5);
        this.i = new Camera();
    }

    public b(Context context, float f2, float f3, float f4, float f5, float f6) {
        this.f33327c = f2;
        this.f33328d = f3;
        this.f33329e = f4;
        this.f33330f = f5;
        this.g = f6;
        this.h = context.getResources().getDisplayMetrics().density;
    }
}
