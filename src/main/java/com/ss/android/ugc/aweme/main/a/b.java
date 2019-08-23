package com.ss.android.ugc.aweme.main.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.utils.bg;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3521a;

    /* renamed from: b  reason: collision with root package name */
    public View f3522b;

    /* renamed from: c  reason: collision with root package name */
    public ViewStub f3523c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f3524d;

    /* renamed from: e  reason: collision with root package name */
    private Runnable f3525e = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f54297a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f54297a, false, 57962, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f54297a, false, 57962, new Class[0], Void.TYPE);
                return;
            }
            b.this.b();
        }
    };

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3521a, false, 57957, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3521a, false, 57957, new Class[0], Void.TYPE);
            return;
        }
        bg.d(this);
        if (this.f3524d != null) {
            this.f3524d.removeCallbacksAndMessages(null);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3521a, false, 57955, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3521a, false, 57955, new Class[0], Void.TYPE);
        } else if (this.f3522b != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3522b, "scaleX", new float[]{1.0f, 0.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f3522b, "scaleY", new float[]{1.0f, 0.0f, 0.0f});
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(200);
            animatorSet.play(ofFloat).with(ofFloat2);
            animatorSet.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54295a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54295a, false, 57961, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54295a, false, 57961, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                    if (b.this.f3523c != null) {
                        b.this.f3523c.setVisibility(8);
                    }
                    if (b.this.f3522b != null) {
                        b.this.f3522b.clearAnimation();
                        b.this.f3522b.setVisibility(8);
                    }
                }
            });
            animatorSet.start();
            c();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3521a, false, 57954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3521a, false, 57954, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3522b == null) {
            this.f3522b = this.f3523c.inflate();
        }
        this.f3524d = new Handler(Looper.getMainLooper());
        r.onEvent(MobClick.obtain().setEventName("photo_notice").setLabelName("shoot_bottom_tab"));
        bg.c(this);
        this.f3522b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54288a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f54288a, false, 57958, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f54288a, false, 57958, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                b.this.b();
                r.onEvent(MobClick.obtain().setEventName("photo_notice_click").setLabelName("shoot_bottom_tab"));
            }
        });
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f3522b, "scaleX", new float[]{0.0f, 1.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f3522b, "scaleY", new float[]{0.0f, 1.0f, 1.0f});
        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(800);
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54290a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54290a, false, 57959, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54290a, false, 57959, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                b.this.f3522b.setVisibility(0);
            }
        });
        animatorSet.play(ofFloat).with(ofFloat2);
        this.f3524d.post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54292a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f54292a, false, 57960, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f54292a, false, 57960, new Class[0], Void.TYPE);
                    return;
                }
                animatorSet.start();
            }
        });
        this.f3524d.postDelayed(this.f3525e, 6000);
    }

    public b(ViewStub viewStub) {
        this.f3523c = viewStub;
    }

    @Subscribe(a = ThreadMode.MAIN)
    public void onEventMainThread(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3521a, false, 57956, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3521a, false, 57956, new Class[]{a.class}, Void.TYPE);
            return;
        }
        b();
    }
}
