package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class StoryLoadingLine extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72804a;

    /* renamed from: b  reason: collision with root package name */
    public View f72805b;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f72806c;

    /* renamed from: d  reason: collision with root package name */
    public ObjectAnimator f72807d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f72808e;

    /* renamed from: f  reason: collision with root package name */
    private View f72809f;
    private View g;
    private float h;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72804a, false, 84109, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72804a, false, 84109, new Class[0], Void.TYPE);
            return;
        }
        this.f72808e = ObjectAnimator.ofFloat(this, "alpha", new float[]{1.0f, 0.0f});
        this.f72808e.setDuration(300);
        this.f72808e.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72814a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f72814a, false, 84115, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f72814a, false, 84115, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (StoryLoadingLine.this.f72806c != null) {
                    StoryLoadingLine.this.f72806c.cancel();
                }
                StoryLoadingLine.this.setAlpha(1.0f);
                StoryLoadingLine.this.setVisibility(4);
            }
        });
        this.f72808e.start();
    }

    public ObjectAnimator getHideAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f72804a, false, 84110, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f72804a, false, 84110, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f}).setDuration(0);
    }

    public ObjectAnimator getShowAnim() {
        if (PatchProxy.isSupport(new Object[0], this, f72804a, false, 84111, new Class[0], ObjectAnimator.class)) {
            return (ObjectAnimator) PatchProxy.accessDispatch(new Object[0], this, f72804a, false, 84111, new Class[0], ObjectAnimator.class);
        }
        return ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f}).setDuration(150);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72804a, false, 84108, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72804a, false, 84108, new Class[0], Void.TYPE);
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        if (this.f72806c == null) {
            this.f72806c = ValueAnimator.ofInt(new int[]{0, 200});
            this.f72806c.setDuration(600);
            this.f72806c.setRepeatCount(-1);
            this.f72806c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72810a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f72810a, false, 84113, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f72810a, false, 84113, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    float intValue = (float) ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue <= 0.0f || intValue > 100.0f) {
                        if (intValue > 100.0f && intValue <= 200.0f) {
                            float f2 = (intValue - 100.0f) / 100.0f;
                            StoryLoadingLine.this.f72805b.setAlpha(1.0f - f2);
                            StoryLoadingLine.this.f72805b.setScaleX((f2 * 0.2f) + 0.8f);
                        }
                        return;
                    }
                    float f3 = intValue / 100.0f;
                    StoryLoadingLine.this.f72805b.setAlpha(f3);
                    StoryLoadingLine.this.f72805b.setScaleX(f3 * 0.8f);
                }
            });
        }
        if (this.f72807d == null) {
            this.f72807d = ObjectAnimator.ofFloat(this.f72809f, "alpha", new float[]{0.0f, 1.0f});
            this.f72807d.setDuration(300);
            this.f72807d.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72812a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f72812a, false, 84114, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f72812a, false, 84114, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    StoryLoadingLine.this.f72806c.start();
                }
            });
        }
        if (this.f72808e == null || !this.f72808e.isRunning()) {
            if (!this.f72807d.isRunning() && !this.f72806c.isRunning()) {
                this.f72807d.start();
            }
            return;
        }
        this.f72808e.cancel();
        this.f72807d.start();
    }

    public StoryLoadingLine(@NonNull Context context) {
        this(context, null);
    }

    public StoryLoadingLine(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoryLoadingLine(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (PatchProxy.isSupport(new Object[]{context}, this, f72804a, false, 84107, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f72804a, false, 84107, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.g = LayoutInflater.from(context).inflate(C0906R.layout.ar3, this);
        this.f72805b = this.g.findViewById(C0906R.id.bbw);
        this.f72809f = this.g.findViewById(C0906R.id.bbp);
        this.f72805b.setAlpha(0.0f);
        this.f72809f.setAlpha(0.0f);
        this.h = ((float) UIUtils.getScreenWidth(getContext())) - UIUtils.dip2Px(getContext(), 30.0f);
    }
}
