package com.ss.android.ugc.aweme.main.follow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.PopupWindow;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.ArrayList;
import java.util.List;

public final class e extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54753a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f54754b;

    /* renamed from: c  reason: collision with root package name */
    AnimatorSet f54755c;

    /* renamed from: d  reason: collision with root package name */
    private ConstraintLayout f54756d;

    /* renamed from: e  reason: collision with root package name */
    private AvatarWithBorderView f54757e;

    /* renamed from: f  reason: collision with root package name */
    private AvatarWithBorderView f54758f;
    private AvatarWithBorderView g;
    private List<AvatarWithBorderView> h;

    public final View getContentView() {
        return this.f54756d;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54753a, false, 58035, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54753a, false, 58035, new Class[0], Void.TYPE);
            return;
        }
        if (this.f54755c != null && this.f54754b != null && !this.f54754b.isFinishing() && isShowing()) {
            getContentView().clearAnimation();
            this.f54755c.cancel();
            try {
                dismiss();
            } catch (Exception e2) {
                a.a((Throwable) e2);
            }
        }
        this.f54754b = null;
    }

    public e(Activity activity) {
        super(activity);
        View inflate;
        this.f54754b = activity;
        if (PatchProxy.isSupport(new Object[]{activity}, this, f54753a, false, 58030, new Class[]{Activity.class}, View.class)) {
            inflate = (View) PatchProxy.accessDispatch(new Object[]{activity}, this, f54753a, false, 58030, new Class[]{Activity.class}, View.class);
        } else {
            inflate = View.inflate(activity, C0906R.layout.a5j, null);
        }
        View view = inflate;
        if (PatchProxy.isSupport(new Object[]{view}, this, f54753a, false, 58032, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54753a, false, 58032, new Class[]{View.class}, Void.TYPE);
        } else {
            setContentView(view);
            setBackgroundDrawable(new ColorDrawable(this.f54754b.getResources().getColor(C0906R.color.ano)));
            setOutsideTouchable(false);
            update();
        }
        if (PatchProxy.isSupport(new Object[]{view}, this, f54753a, false, 58031, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f54753a, false, 58031, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f54756d = (ConstraintLayout) view.findViewById(C0906R.id.ci4);
        this.f54757e = (AvatarWithBorderView) view.findViewById(C0906R.id.arm);
        this.f54758f = (AvatarWithBorderView) view.findViewById(C0906R.id.arn);
        this.g = (AvatarWithBorderView) view.findViewById(C0906R.id.aro);
        this.h = new ArrayList(3);
        this.h.add(this.f54757e);
        this.h.add(this.f54758f);
        this.h.add(this.g);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54759a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f54759a, false, 58037, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f54759a, false, 58037, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                e eVar = e.this;
                if (PatchProxy.isSupport(new Object[0], eVar, e.f54753a, false, 58036, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], eVar, e.f54753a, false, 58036, new Class[0], Void.TYPE);
                    return;
                }
                if (!(eVar.f54755c == null || eVar.f54754b == null || !eVar.isShowing())) {
                    eVar.getContentView().clearAnimation();
                    eVar.f54755c.cancel();
                    try {
                        eVar.dismiss();
                    } catch (Exception e2) {
                        a.a((Throwable) e2);
                    }
                }
                eVar.f54754b = null;
            }
        });
    }

    public final boolean a(View view, List<a> list) {
        if (PatchProxy.isSupport(new Object[]{view, list}, this, f54753a, false, 58033, new Class[]{View.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, list}, this, f54753a, false, 58033, new Class[]{View.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (CollectionUtils.isEmpty(list) || view == null) {
            dismiss();
            return false;
        } else {
            int i = 0;
            while (i < list.size() && i < this.h.size()) {
                a aVar = list.get(i);
                UrlModel avatarThumb = aVar.f54746b.getAvatarThumb();
                AvatarWithBorderView avatarWithBorderView = this.h.get(i);
                avatarWithBorderView.setVisibility(0);
                if (aVar.f54745a == 0) {
                    avatarWithBorderView.setBorderColor(C0906R.color.a1z);
                } else {
                    avatarWithBorderView.setBorderColor(C0906R.color.ano);
                }
                c.b(avatarWithBorderView, avatarThumb);
                i++;
            }
            if (!isShowing() && !this.f54754b.isFinishing()) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                this.f54756d.setVisibility(4);
                this.f54756d.measure(0, 0);
                final int measuredWidth = this.f54756d.getMeasuredWidth();
                final int measuredHeight = this.f54756d.getMeasuredHeight();
                try {
                    showAtLocation(view, 0, (int) (((float) (iArr[0] - (measuredWidth / 2))) + UIUtils.dip2Px(view.getContext(), 18.0f)), iArr[1] - view.getHeight());
                    com.ss.android.b.a.a.a.b(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f54761a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f54761a, false, 58038, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f54761a, false, 58038, new Class[0], Void.TYPE);
                            } else if (e.this.f54754b != null && !e.this.f54754b.isFinishing()) {
                                e.this.getContentView().setPivotX((float) (measuredWidth / 2));
                                e.this.getContentView().setPivotY((float) measuredHeight);
                                e eVar = e.this;
                                if (PatchProxy.isSupport(new Object[0], eVar, e.f54753a, false, 58034, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], eVar, e.f54753a, false, 58034, new Class[0], Void.TYPE);
                                    return;
                                }
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                ofFloat.setDuration(580);
                                ofFloat.setInterpolator(new OvershootInterpolator(1.04f));
                                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f54765a;

                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54765a, false, 58039, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54765a, false, 58039, new Class[]{ValueAnimator.class}, Void.TYPE);
                                            return;
                                        }
                                        e.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        e.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                });
                                ofFloat.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f54767a;

                                    public final void onAnimationStart(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f54767a, false, 58040, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f54767a, false, 58040, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        e.this.getContentView().setVisibility(0);
                                    }
                                });
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                                ofFloat2.setDuration(580);
                                ofFloat2.setInterpolator(new OvershootInterpolator(1.04f));
                                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f54769a;

                                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54769a, false, 58041, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54769a, false, 58041, new Class[]{ValueAnimator.class}, Void.TYPE);
                                            return;
                                        }
                                        e.this.getContentView().setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                        e.this.getContentView().setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                                    }
                                });
                                ofFloat2.addListener(new AnimatorListenerAdapter() {

                                    /* renamed from: a  reason: collision with root package name */
                                    public static ChangeQuickRedirect f54771a;

                                    public final void onAnimationEnd(Animator animator) {
                                        if (PatchProxy.isSupport(new Object[]{animator}, this, f54771a, false, 58042, new Class[]{Animator.class}, Void.TYPE)) {
                                            PatchProxy.accessDispatch(new Object[]{animator}, this, f54771a, false, 58042, new Class[]{Animator.class}, Void.TYPE);
                                            return;
                                        }
                                        e.this.a();
                                    }
                                });
                                eVar.f54755c = new AnimatorSet();
                                ofFloat2.setStartDelay(5000);
                                eVar.f54755c.playSequentially(new Animator[]{ofFloat, ofFloat2});
                                eVar.f54755c.start();
                            }
                        }
                    });
                } catch (Exception unused) {
                    return false;
                }
            }
            return true;
        }
    }
}
