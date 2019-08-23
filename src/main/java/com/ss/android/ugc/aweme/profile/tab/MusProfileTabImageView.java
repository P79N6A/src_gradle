package com.ss.android.ugc.aweme.profile.tab;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusProfileTabImageView extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61702a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f61703b;

    /* renamed from: c  reason: collision with root package name */
    private ValueAnimator f61704c;

    /* renamed from: d  reason: collision with root package name */
    private ValueAnimator f61705d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f61706e = true;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61702a, false, 67671, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61702a, false, 67671, new Class[0], Void.TYPE);
            return;
        }
        b();
        c();
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f61702a, false, 67672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61702a, false, 67672, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f61703b = (ImageView) findViewById(C0906R.id.aq8);
        this.f61703b.setAlpha(0.5f);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61702a, false, 67674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61702a, false, 67674, new Class[0], Void.TYPE);
            return;
        }
        this.f61704c = ValueAnimator.ofFloat(new float[]{0.5f, 1.0f});
        this.f61704c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61707a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f61707a, false, 67680, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f61707a, false, 67680, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                MusProfileTabImageView.this.a(valueAnimator2);
            }
        });
        this.f61704c.setDuration(150);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61702a, false, 67675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61702a, false, 67675, new Class[0], Void.TYPE);
            return;
        }
        this.f61705d = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
        this.f61705d.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61709a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f61709a, false, 67681, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f61709a, false, 67681, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                MusProfileTabImageView.this.a(valueAnimator2);
            }
        });
        this.f61705d.setDuration(150);
    }

    public void setAnimationEnabled(boolean z) {
        this.f61706e = z;
    }

    public MusProfileTabImageView(@NonNull Context context) {
        super(context);
        a();
    }

    public final void a(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61702a, false, 67676, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61702a, false, 67676, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        this.f61703b.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setImageResource(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f61702a, false, 67673, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f61702a, false, 67673, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f61703b.setImageResource(i);
    }

    public void setSelected(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61702a, false, 67679, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61702a, false, 67679, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        this.f61704c.cancel();
        this.f61705d.cancel();
        if (z) {
            if (this.f61706e) {
                if (PatchProxy.isSupport(new Object[0], this, f61702a, false, 67677, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f61702a, false, 67677, new Class[0], Void.TYPE);
                } else {
                    this.f61704c.start();
                }
            }
        } else if (this.f61706e) {
            if (PatchProxy.isSupport(new Object[0], this, f61702a, false, 67678, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f61702a, false, 67678, new Class[0], Void.TYPE);
                return;
            }
            this.f61705d.start();
        }
    }

    public MusProfileTabImageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MusProfileTabImageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
