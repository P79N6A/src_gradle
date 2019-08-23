package com.ss.android.ugc.aweme.profile.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class ProfileTabView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62318a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f62319b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f62320c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f62321d;

    /* renamed from: e  reason: collision with root package name */
    private int f62322e;

    /* renamed from: f  reason: collision with root package name */
    private int f62323f;
    private ValueAnimator g;
    private ValueAnimator h;
    private boolean i;

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f62318a, false, 68931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62318a, false, 68931, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.f62321d = (TextView) findViewById(C0906R.id.title);
        this.f62319b = (TextView) findViewById(C0906R.id.a3u);
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f62318a, false, 68930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62318a, false, 68930, new Class[0], Void.TYPE);
            return;
        }
        float f2 = getContext().getResources().getDisplayMetrics().density;
        this.f62322e = (int) (8.0f * f2);
        this.f62323f = (int) (f2 * 3.0f);
        b();
        c();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62318a, false, 68938, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62318a, false, 68938, new Class[0], Void.TYPE);
            return;
        }
        this.g = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62324a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f62324a, false, 68942, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f62324a, false, 68942, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                ProfileTabView.this.a(valueAnimator2);
            }
        });
        this.g.setDuration(300);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f62318a, false, 68939, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62318a, false, 68939, new Class[0], Void.TYPE);
            return;
        }
        this.h = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62326a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueAnimator valueAnimator2 = valueAnimator;
                if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f62326a, false, 68943, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f62326a, false, 68943, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                ProfileTabView.this.a(valueAnimator2);
            }
        });
        this.h.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f62328a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f62328a, false, 68944, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f62328a, false, 68944, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                ProfileTabView.this.f62319b.setVisibility(8);
            }
        });
        this.h.setDuration(300);
    }

    public void setAnimationEnabled(boolean z) {
        this.i = z;
    }

    public ProfileTabView(Context context) {
        super(context);
        a();
    }

    public void setDescription(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62318a, false, 68935, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62318a, false, 68935, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f62319b.setText(str2);
    }

    public void setText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f62318a, false, 68932, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f62318a, false, 68932, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f62321d.setText(str2);
    }

    public void setDrawableLeft(Drawable drawable) {
        if (PatchProxy.isSupport(new Object[]{drawable}, this, f62318a, false, 68933, new Class[]{Drawable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{drawable}, this, f62318a, false, 68933, new Class[]{Drawable.class}, Void.TYPE);
            return;
        }
        this.f62321d.setCompoundDrawables(drawable, null, null, null);
        if (Build.VERSION.SDK_INT >= 17) {
            this.f62321d.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, null, null, null);
        }
        this.f62321d.setCompoundDrawablePadding((int) UIUtils.dip2Px(getContext(), 3.5f));
    }

    public void setTextColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f62318a, false, 68934, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f62318a, false, 68934, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f62321d.setTextColor(i2);
    }

    public final void a(ValueAnimator valueAnimator) {
        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f62318a, false, 68937, new Class[]{ValueAnimator.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f62318a, false, 68937, new Class[]{ValueAnimator.class}, Void.TYPE);
            return;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f2 = floatValue - 1.0f;
        this.f62321d.setTranslationY(((float) this.f62322e) * f2);
        float f3 = 1.0f - floatValue;
        float f4 = 1.0f - (0.13f * f3);
        this.f62321d.setScaleX(f4);
        this.f62321d.setScaleY(f4);
        this.f62319b.setTranslationY(f2 * ((float) (this.f62322e - this.f62323f)));
        this.f62319b.setAlpha(f3);
    }

    public void setSelected(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f62318a, false, 68936, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f62318a, false, 68936, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.setSelected(z);
        this.g.cancel();
        this.h.cancel();
        if (z) {
            if (this.i) {
                if (PatchProxy.isSupport(new Object[0], this, f62318a, false, 68940, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f62318a, false, 68940, new Class[0], Void.TYPE);
                } else if (this.f62320c) {
                    this.f62321d.setAlpha(1.0f);
                } else {
                    this.f62319b.setVisibility(0);
                    this.g.start();
                }
            }
        } else if (this.i) {
            if (PatchProxy.isSupport(new Object[0], this, f62318a, false, 68941, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f62318a, false, 68941, new Class[0], Void.TYPE);
            } else if (this.f62320c) {
                this.f62321d.setAlpha(0.6f);
            } else {
                this.h.start();
            }
        }
    }

    public ProfileTabView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ProfileTabView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
