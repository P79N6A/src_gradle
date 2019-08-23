package com.bytedance.android.livesdk.chatroom.end;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class LiveRecommendBar extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10069a;

    /* renamed from: b  reason: collision with root package name */
    public float f10070b = -1.0f;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f10071c;

    public interface a {
        void a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10069a, false, 4267, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10069a, false, 4267, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10071c != null) {
            this.f10071c.removeAllUpdateListeners();
            this.f10071c.removeAllListeners();
            this.f10071c.cancel();
            UIUtils.updateLayout(this, (int) this.f10070b, -3);
        }
    }

    public LiveRecommendBar(Context context) {
        super(context);
    }

    @MainThread
    public final void a(final a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10069a, false, 4266, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10069a, false, 4266, new Class[]{a.class}, Void.TYPE);
            return;
        }
        post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f10072a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f10072a, false, 4268, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f10072a, false, 4268, new Class[0], Void.TYPE);
                    return;
                }
                if (LiveRecommendBar.this.f10070b == -1.0f) {
                    LiveRecommendBar.this.f10070b = (float) LiveRecommendBar.this.getMeasuredWidth();
                }
                if (LiveRecommendBar.this.f10071c == null || !LiveRecommendBar.this.f10071c.isRunning()) {
                    LiveRecommendBar.this.f10071c = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    LiveRecommendBar.this.f10071c.setDuration(5000);
                    LiveRecommendBar.this.f10071c.setInterpolator(new LinearInterpolator());
                    LiveRecommendBar.this.f10071c.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f10075a;

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f10075a, false, 4269, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f10075a, false, 4269, new Class[]{ValueAnimator.class}, Void.TYPE);
                                return;
                            }
                            UIUtils.updateLayout(LiveRecommendBar.this, (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * LiveRecommendBar.this.f10070b), -3);
                        }
                    });
                    LiveRecommendBar.this.f10071c.addListener(new Animator.AnimatorListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f10077a;

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f10077a, false, 4270, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f10077a, false, 4270, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            if (aVar != null) {
                                aVar.a();
                            }
                        }
                    });
                    LiveRecommendBar.this.f10071c.start();
                }
            }
        });
    }

    public LiveRecommendBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveRecommendBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public LiveRecommendBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
