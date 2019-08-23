package com.bytedance.android.livesdk.effect;

import android.animation.ValueAnimator;
import com.bytedance.android.live.core.c.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.FileNotFoundException;

public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13774a;

    /* renamed from: b  reason: collision with root package name */
    private final f f13775b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13776c;

    /* renamed from: d  reason: collision with root package name */
    private final int f13777d;

    /* renamed from: e  reason: collision with root package name */
    private final int f13778e;

    g(f fVar, int i, int i2, int i3) {
        this.f13775b = fVar;
        this.f13776c = i;
        this.f13777d = i2;
        this.f13778e = i3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f13774a, false, 8172, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f13774a, false, 8172, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        f fVar = this.f13775b;
        int i = this.f13776c;
        int i2 = this.f13777d;
        int i3 = this.f13778e;
        if (i == 0) {
            try {
                a.a("LiveFilterHelper", "FilterEffect update left file:" + fVar.f13768b.get(i2).getFilterPath() + " right file:" + fVar.f13768b.get(i3).getFilterPath() + " pos:" + ((Float) valueAnimator.getAnimatedValue()));
                fVar.f13769c.a(fVar.f13768b.get(i2).getFilterPath(), fVar.f13768b.get(i3).getFilterPath(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
            } catch (FileNotFoundException unused) {
            }
            return;
        }
        a.a("LiveFilterHelper", "FilterEffect update left file:" + fVar.f13768b.get(i3).getFilterPath() + " right file:" + fVar.f13768b.get(i2).getFilterPath() + " pos:" + (1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        fVar.f13769c.a(fVar.f13768b.get(i3).getFilterPath(), fVar.f13768b.get(i2).getFilterPath(), 1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
