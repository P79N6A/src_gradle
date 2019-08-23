package com.ss.android.ugc.aweme.base.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class AnimationImageView extends LottieAnimationView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34896a;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f34896a, false, 24920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34896a, false, 24920, new Class[0], Void.TYPE);
            return;
        }
        setImageFolder("images");
        addAnimatorListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34897a;

            public final void onAnimationCancel(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f34897a, false, 24924, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f34897a, false, 24924, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationCancel(animator);
                AnimationImageView.this.setLayerType(0, null);
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f34897a, false, 24923, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f34897a, false, 24923, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                AnimationImageView.this.setLayerType(0, null);
            }
        });
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f34896a, false, 24922, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34896a, false, 24922, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        cancelAnimation();
    }

    public AnimationImageView(Context context) {
        super(context);
        a();
    }

    private void setImageFolder(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f34896a, false, 24921, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f34896a, false, 24921, new Class[]{String.class}, Void.TYPE);
            return;
        }
        setImageAssetsFolder(str);
    }

    public AnimationImageView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public AnimationImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }
}
