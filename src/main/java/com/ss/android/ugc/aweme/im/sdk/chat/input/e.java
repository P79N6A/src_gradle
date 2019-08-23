package com.ss.android.ugc.aweme.im.sdk.chat.input;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.im.sdk.chat.view.b;
import com.ss.android.ugc.aweme.im.sdk.utils.o;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50467a;

    /* renamed from: b  reason: collision with root package name */
    private final d f50468b;

    /* renamed from: c  reason: collision with root package name */
    private final Activity f50469c;

    /* renamed from: d  reason: collision with root package name */
    private final b f50470d;

    /* renamed from: e  reason: collision with root package name */
    private final View f50471e;

    e(d dVar, Activity activity, b bVar, View view) {
        this.f50468b = dVar;
        this.f50469c = activity;
        this.f50470d = bVar;
        this.f50471e = view;
    }

    public final void run() {
        long j;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (PatchProxy.isSupport(new Object[0], this, f50467a, false, 50598, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f50467a, false, 50598, new Class[0], Void.TYPE);
            return;
        }
        d dVar = this.f50468b;
        Activity activity = this.f50469c;
        b bVar = this.f50470d;
        View view = this.f50471e;
        if (activity != null && !activity.isFinishing()) {
            o a2 = o.a();
            if (PatchProxy.isSupport(new Object[]{(byte) 0}, a2, o.f52605a, false, 53429, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{(byte) 0}, a2, o.f52605a, false, 53429, new Class[]{Boolean.TYPE}, Void.TYPE);
            } else {
                a2.f52608b.edit().putBoolean("hint_start_video_chat", false).commit();
            }
            int dip2Px = (int) UIUtils.dip2Px(activity, 8.0f);
            ImageView imageView = dVar.f3368e;
            bVar.a(imageView, dip2Px - imageView.getLeft(), -dip2Px);
            dVar.y = new l(activity, bVar, view);
            l lVar = dVar.y;
            float measuredWidth = ((float) dVar.f3368e.getMeasuredWidth()) / 2.0f;
            float measuredHeight = (float) view.getMeasuredHeight();
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(measuredWidth), Float.valueOf(measuredHeight)}, lVar, l.f50652a, false, 50628, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(measuredWidth), Float.valueOf(measuredHeight)}, lVar, l.f50652a, false, 50628, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            } else if (lVar.f50654c != null && !lVar.f50654c.isFinishing() && lVar.f50655d != null && lVar.f50653b != null) {
                lVar.f50653b.setVisibility(8);
                lVar.f50653b.setPivotX(measuredWidth);
                lVar.f50653b.setPivotY(measuredHeight);
                if (PatchProxy.isSupport(new Object[0], lVar, l.f50652a, false, 50629, new Class[0], ValueAnimator.class)) {
                    j = 580;
                    valueAnimator = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], lVar, l.f50652a, false, 50629, new Class[0], ValueAnimator.class);
                } else {
                    j = 580;
                    valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    valueAnimator.setDuration(580);
                    valueAnimator.setInterpolator(new OvershootInterpolator(1.04f));
                    valueAnimator.addUpdateListener(new m(lVar));
                    valueAnimator.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50657a;

                        public final void onAnimationStart(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f50657a, false, 50634, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f50657a, false, 50634, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            l.this.f50653b.setVisibility(0);
                        }
                    });
                }
                if (PatchProxy.isSupport(new Object[0], lVar, l.f50652a, false, 50630, new Class[0], ValueAnimator.class)) {
                    valueAnimator2 = (ValueAnimator) PatchProxy.accessDispatch(new Object[0], lVar, l.f50652a, false, 50630, new Class[0], ValueAnimator.class);
                } else {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    ofFloat.setDuration(j);
                    ofFloat.setInterpolator(new OvershootInterpolator(1.04f));
                    ofFloat.addUpdateListener(new n(lVar));
                    ofFloat.addListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f50659a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f50659a, false, 50635, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f50659a, false, 50635, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            l.this.a();
                        }
                    });
                    ofFloat.setStartDelay(3000);
                    valueAnimator2 = ofFloat;
                }
                lVar.f50656e = new AnimatorSet();
                lVar.f50656e.playSequentially(new Animator[]{valueAnimator, valueAnimator2});
                lVar.f50656e.start();
            }
        }
    }
}
