package com.ss.android.ugc.aweme.detail.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FadeImageView extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41359a;

    /* renamed from: b  reason: collision with root package name */
    public a f41360b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f41361c;

    public interface a {
        void a(ImageView imageView);
    }

    public boolean isSelected() {
        return this.f41361c;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f41359a, false, 35166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f41359a, false, 35166, new Class[0], Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 0.0f});
        ofFloat.setDuration(100);
        ofFloat.setInterpolator(new LinearInterpolator());
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "alpha", new float[]{getAlpha(), 1.0f});
        ofFloat2.setDuration(100);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f41362a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f41362a, false, 35167, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f41362a, false, 35167, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (FadeImageView.this.f41360b != null) {
                    FadeImageView.this.f41360b.a(FadeImageView.this);
                }
            }
        });
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public void setListener(a aVar) {
        this.f41360b = aVar;
    }

    public void setSelected(boolean z) {
        this.f41361c = z;
    }

    public FadeImageView(Context context) {
        this(context, null);
    }

    public FadeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
