package com.bytedance.android.livesdk.fansclub;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.bytedance.android.livesdk.fansclub.l;
import com.bytedance.android.livesdk.message.model.v;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class JoinFansPortraitNotifyView extends RelativeLayout implements l.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13850a;
    static final Interpolator s = PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    View f13851b;

    /* renamed from: c  reason: collision with root package name */
    public View f13852c;

    /* renamed from: d  reason: collision with root package name */
    View f13853d;

    /* renamed from: e  reason: collision with root package name */
    View f13854e;

    /* renamed from: f  reason: collision with root package name */
    public l f13855f;
    public v g;
    public d h;
    float i;
    ValueAnimator j;
    ValueAnimator k;
    ValueAnimator l;
    ValueAnimator m;
    ValueAnimator n;
    public ValueAnimator o;
    public int p;
    public int q;
    public boolean r;
    private VHeadView t;
    private TextView u;
    private int v;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f13850a, false, 8316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13850a, false, 8316, new Class[0], Void.TYPE);
            return;
        }
        this.f13854e.setAlpha(1.0f);
        this.f13853d.setAlpha(1.0f);
        this.f13851b.setAlpha(1.0f);
        this.f13852c.setScaleX(1.0f);
        this.f13852c.setScaleY(1.0f);
        this.f13852c.setTranslationX(0.0f);
        this.f13852c.setTranslationY(0.0f);
        UIUtils.updateLayout(this.f13853d, this.p, this.q);
        UIUtils.updateLayout(this.f13852c, this.p, this.q);
    }

    public void setAnchorView(d dVar) {
        this.h = dVar;
    }

    public void setJoinMessagePresenter(l lVar) {
        this.f13855f = lVar;
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f13850a, false, 8312, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f13850a, false, 8312, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.i = UIUtils.dip2Px(getContext(), 20.0f);
        this.v = (int) UIUtils.dip2Px(getContext(), 40.0f);
        View.inflate(context, C0906R.layout.ahm, this);
        this.f13851b = findViewById(C0906R.id.b6x);
        this.f13852c = findViewById(C0906R.id.b6w);
        this.t = (VHeadView) findViewById(C0906R.id.ayr);
        this.u = (TextView) findViewById(C0906R.id.dli);
        this.f13853d = findViewById(C0906R.id.b6v);
        this.f13854e = findViewById(C0906R.id.b6z);
        UIUtils.setViewVisibility(this, 4);
    }

    public final void a(v vVar) {
        if (PatchProxy.isSupport(new Object[]{vVar}, this, f13850a, false, 8313, new Class[]{v.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vVar}, this, f13850a, false, 8313, new Class[]{v.class}, Void.TYPE);
        } else if (vVar != null) {
            this.g = vVar;
            User user = vVar.f16693d;
            if (user != null) {
                b.b(this.t, user.getAvatarThumb(), this.v, this.v, 2130841141);
                this.u.setText(user.getNickName());
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f13852c.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                layoutParams.setMargins(layoutParams.leftMargin, getResources().getDimensionPixelOffset(C0906R.dimen.ou), layoutParams.rightMargin, layoutParams.bottomMargin);
                this.f13852c.setLayoutParams(layoutParams);
                post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f13856a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f13856a, false, 8323, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f13856a, false, 8323, new Class[0], Void.TYPE);
                            return;
                        }
                        UIUtils.setViewVisibility(JoinFansPortraitNotifyView.this, 0);
                        JoinFansPortraitNotifyView.this.p = JoinFansPortraitNotifyView.this.f13852c.getWidth();
                        JoinFansPortraitNotifyView.this.q = JoinFansPortraitNotifyView.this.f13852c.getHeight();
                        JoinFansPortraitNotifyView.this.a();
                        JoinFansPortraitNotifyView joinFansPortraitNotifyView = JoinFansPortraitNotifyView.this;
                        if (PatchProxy.isSupport(new Object[0], joinFansPortraitNotifyView, JoinFansPortraitNotifyView.f13850a, false, 8314, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], joinFansPortraitNotifyView, JoinFansPortraitNotifyView.f13850a, false, 8314, new Class[0], Void.TYPE);
                            return;
                        }
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, joinFansPortraitNotifyView.i, 0.0f);
                        translateAnimation.setDuration(270);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(270);
                        AnimationSet animationSet = new AnimationSet(false);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setDuration(270);
                        animationSet.setStartOffset(30);
                        joinFansPortraitNotifyView.f13852c.startAnimation(animationSet);
                        joinFansPortraitNotifyView.j = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        joinFansPortraitNotifyView.j.setInterpolator(JoinFansPortraitNotifyView.s);
                        joinFansPortraitNotifyView.j.setDuration(300);
                        joinFansPortraitNotifyView.j.addUpdateListener(new e(joinFansPortraitNotifyView));
                        joinFansPortraitNotifyView.j.start();
                        joinFansPortraitNotifyView.k = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 1.0f});
                        joinFansPortraitNotifyView.k.addUpdateListener(new f(joinFansPortraitNotifyView));
                        joinFansPortraitNotifyView.k.setDuration(2100);
                        joinFansPortraitNotifyView.k.setStartDelay(300);
                        joinFansPortraitNotifyView.k.start();
                        joinFansPortraitNotifyView.l = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                        joinFansPortraitNotifyView.l.addUpdateListener(new g(joinFansPortraitNotifyView));
                        joinFansPortraitNotifyView.l.setStartDelay(2400);
                        joinFansPortraitNotifyView.l.setDuration(150);
                        joinFansPortraitNotifyView.l.start();
                        joinFansPortraitNotifyView.m = ValueAnimator.ofInt(new int[]{joinFansPortraitNotifyView.f13852c.getWidth(), (int) UIUtils.dip2Px(joinFansPortraitNotifyView.getContext(), 40.0f)});
                        joinFansPortraitNotifyView.m.setDuration(350);
                        joinFansPortraitNotifyView.m.addUpdateListener(new h(joinFansPortraitNotifyView));
                        joinFansPortraitNotifyView.m.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f13858a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f13858a, false, 8324, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f13858a, false, 8324, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                if (!JoinFansPortraitNotifyView.this.r) {
                                    JoinFansPortraitNotifyView joinFansPortraitNotifyView = JoinFansPortraitNotifyView.this;
                                    if (PatchProxy.isSupport(new Object[0], joinFansPortraitNotifyView, JoinFansPortraitNotifyView.f13850a, false, 8315, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], joinFansPortraitNotifyView, JoinFansPortraitNotifyView.f13850a, false, 8315, new Class[0], Void.TYPE);
                                    } else if (joinFansPortraitNotifyView.h == null) {
                                        joinFansPortraitNotifyView.setVisibility(4);
                                    } else {
                                        UIUtils.updateLayout(joinFansPortraitNotifyView.f13852c, (int) UIUtils.dip2Px(joinFansPortraitNotifyView.getContext(), 40.0f), -3);
                                        joinFansPortraitNotifyView.post(new Runnable() {

                                            /* renamed from: a  reason: collision with root package name */
                                            public static ChangeQuickRedirect f13860a;

                                            public final void run() {
                                                if (PatchProxy.isSupport(new Object[0], this, f13860a, false, 8325, new Class[0], Void.TYPE)) {
                                                    PatchProxy.accessDispatch(new Object[0], this, f13860a, false, 8325, new Class[0], Void.TYPE);
                                                } else if (!JoinFansPortraitNotifyView.this.r) {
                                                    float x = JoinFansPortraitNotifyView.this.f13852c.getX();
                                                    float y = JoinFansPortraitNotifyView.this.f13852c.getY();
                                                    float x2 = JoinFansPortraitNotifyView.this.f13852c.getX() + (((float) JoinFansPortraitNotifyView.this.f13852c.getWidth()) / 2.0f);
                                                    float y2 = JoinFansPortraitNotifyView.this.f13852c.getY() + (((float) JoinFansPortraitNotifyView.this.f13852c.getHeight()) / 2.0f);
                                                    float anchorX = JoinFansPortraitNotifyView.this.h.getAnchorX();
                                                    float anchorY = JoinFansPortraitNotifyView.this.h.getAnchorY();
                                                    a aVar = new a(new PointF(x2 - (((x2 - anchorX) * 2.0f) / 3.0f), y2 - (((y2 - y2) * 2.0f) / 3.0f)));
                                                    JoinFansPortraitNotifyView.this.o = ValueAnimator.ofObject(aVar, new Object[]{new PointF(x2, y2), new PointF(anchorX, anchorY)});
                                                    JoinFansPortraitNotifyView.this.o.addUpdateListener(new j(this, x, y));
                                                    JoinFansPortraitNotifyView.this.o.setDuration(200);
                                                    JoinFansPortraitNotifyView.this.o.addListener(new AnimatorListenerAdapter() {

                                                        /* renamed from: a  reason: collision with root package name */
                                                        public static ChangeQuickRedirect f13862a;

                                                        public final void onAnimationEnd(Animator animator) {
                                                            if (PatchProxy.isSupport(new Object[]{animator}, this, f13862a, false, 8328, new Class[]{Animator.class}, Void.TYPE)) {
                                                                PatchProxy.accessDispatch(new Object[]{animator}, this, f13862a, false, 8328, new Class[]{Animator.class}, Void.TYPE);
                                                                return;
                                                            }
                                                            if (!JoinFansPortraitNotifyView.this.r) {
                                                                UIUtils.setViewVisibility(JoinFansPortraitNotifyView.this, 4);
                                                                JoinFansPortraitNotifyView.this.a();
                                                            }
                                                        }
                                                    });
                                                    JoinFansPortraitNotifyView.this.o.start();
                                                    JoinFansPortraitNotifyView.this.h.a(new k(this));
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        });
                        joinFansPortraitNotifyView.m.setInterpolator(JoinFansPortraitNotifyView.s);
                        joinFansPortraitNotifyView.m.setStartDelay(2400);
                        joinFansPortraitNotifyView.m.start();
                        joinFansPortraitNotifyView.n = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                        joinFansPortraitNotifyView.n.setDuration(150);
                        joinFansPortraitNotifyView.n.setStartDelay(2400);
                        joinFansPortraitNotifyView.n.addUpdateListener(new i(joinFansPortraitNotifyView));
                        joinFansPortraitNotifyView.n.start();
                    }
                });
            }
        }
    }

    public JoinFansPortraitNotifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public JoinFansPortraitNotifyView(Context context, boolean z) {
        super(context);
        a(context);
    }

    public JoinFansPortraitNotifyView(Context context, boolean z, l lVar) {
        super(context);
        a(context);
        this.f13855f = lVar;
    }
}
