package com.bytedance.android.livesdk.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.v4.view.animation.PathInterpolatorCompat;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.message.model.ag;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class b extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15526a;
    static final Interpolator o = PathInterpolatorCompat.create(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: b  reason: collision with root package name */
    View f15527b;

    /* renamed from: c  reason: collision with root package name */
    public View f15528c;

    /* renamed from: d  reason: collision with root package name */
    View f15529d;

    /* renamed from: e  reason: collision with root package name */
    View f15530e;

    /* renamed from: f  reason: collision with root package name */
    public a f15531f;
    public ag g;
    float h;
    ValueAnimator i;
    ValueAnimator j;
    ValueAnimator k;
    public int l;
    public int m;
    boolean n;
    private VHeadView p;
    private TextView q;
    private TextView r;
    private int s;
    private boolean t;

    private static int a(int i2) {
        if (i2 < 31) {
            return 2130841081;
        }
        return i2 < 41 ? 2130841082 : 2130841083;
    }

    public final void a(ag agVar) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{agVar}, this, f15526a, false, 10143, new Class[]{ag.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{agVar}, this, f15526a, false, 10143, new Class[]{ag.class}, Void.TYPE);
        } else if (agVar != null) {
            this.g = agVar;
            User user = agVar.f16446b;
            if (user != null) {
                com.bytedance.android.livesdk.chatroom.f.b.b(this.p, user.getAvatarThumb(), this.s, this.s, 2130841141);
                this.q.setText(user.getNickName());
                int i2 = agVar.f16448d;
                this.f15527b.setBackgroundResource(a(i2));
                this.r.setText(getContext().getResources().getString(C0906R.string.cz1, new Object[]{Integer.valueOf(i2)}));
                if (a.e()) {
                    this.q.setTypeface(null, 0);
                    this.r.setTypeface(null, 0);
                }
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f15528c.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                Context context = getContext();
                if (this.t) {
                    f2 = 24.0f;
                } else {
                    f2 = 56.0f;
                }
                layoutParams.setMargins(layoutParams.leftMargin, (int) UIUtils.dip2Px(context, f2), layoutParams.rightMargin, layoutParams.bottomMargin);
                this.f15528c.setLayoutParams(layoutParams);
                post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f15532a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f15532a, false, 10150, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f15532a, false, 10150, new Class[0], Void.TYPE);
                            return;
                        }
                        UIUtils.setViewVisibility(b.this, 0);
                        b.this.l = b.this.f15528c.getWidth();
                        b.this.m = b.this.f15528c.getHeight();
                        b bVar = b.this;
                        if (PatchProxy.isSupport(new Object[0], bVar, b.f15526a, false, 10145, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], bVar, b.f15526a, false, 10145, new Class[0], Void.TYPE);
                        } else {
                            bVar.f15530e.setAlpha(1.0f);
                            bVar.f15529d.setAlpha(1.0f);
                            bVar.f15527b.setAlpha(1.0f);
                            bVar.f15528c.setScaleX(1.0f);
                            bVar.f15528c.setScaleY(1.0f);
                            bVar.f15528c.setTranslationX(0.0f);
                            bVar.f15528c.setTranslationY(0.0f);
                            UIUtils.updateLayout(bVar.f15529d, bVar.l, bVar.m);
                            UIUtils.updateLayout(bVar.f15528c, bVar.l, bVar.m);
                        }
                        b bVar2 = b.this;
                        if (PatchProxy.isSupport(new Object[0], bVar2, b.f15526a, false, 10144, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], bVar2, b.f15526a, false, 10144, new Class[0], Void.TYPE);
                            return;
                        }
                        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, bVar2.h, 0.0f);
                        translateAnimation.setDuration(270);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        alphaAnimation.setDuration(270);
                        AnimationSet animationSet = new AnimationSet(false);
                        animationSet.addAnimation(translateAnimation);
                        animationSet.addAnimation(alphaAnimation);
                        animationSet.setDuration(270);
                        animationSet.setStartOffset(30);
                        bVar2.f15528c.startAnimation(animationSet);
                        bVar2.i = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                        bVar2.i.setInterpolator(b.o);
                        bVar2.i.setDuration(300);
                        bVar2.i.addUpdateListener(new c(bVar2));
                        bVar2.i.start();
                        bVar2.j = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 1.0f});
                        bVar2.j.addUpdateListener(new d(bVar2));
                        bVar2.j.setDuration(2100);
                        bVar2.j.setStartDelay(300);
                        bVar2.j.start();
                        bVar2.k = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                        bVar2.k.addUpdateListener(new e(bVar2));
                        bVar2.k.addListener(new AnimatorListenerAdapter() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f15534a;

                            public final void onAnimationEnd(Animator animator) {
                                if (PatchProxy.isSupport(new Object[]{animator}, this, f15534a, false, 10151, new Class[]{Animator.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{animator}, this, f15534a, false, 10151, new Class[]{Animator.class}, Void.TYPE);
                                    return;
                                }
                                b.this.g.f16449e = false;
                                b.this.setVisibility(4);
                                if (b.this.f15531f != null) {
                                    b.this.f15531f.a();
                                }
                            }
                        });
                        bVar2.k.setStartDelay(2400);
                        bVar2.k.setDuration(150);
                        bVar2.k.start();
                    }
                });
            }
        }
    }

    public b(Context context, boolean z, a aVar) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f15526a, false, 10142, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f15526a, false, 10142, new Class[]{Context.class}, Void.TYPE);
        } else {
            this.h = UIUtils.dip2Px(getContext(), 20.0f);
            this.s = (int) UIUtils.dip2Px(getContext(), 40.0f);
            View.inflate(context, C0906R.layout.ais, this);
            this.f15527b = findViewById(C0906R.id.b6x);
            this.f15528c = findViewById(C0906R.id.b6w);
            this.p = (VHeadView) findViewById(C0906R.id.ayr);
            this.q = (TextView) findViewById(C0906R.id.dli);
            this.f15529d = findViewById(C0906R.id.b6v);
            this.f15530e = findViewById(C0906R.id.b6z);
            this.r = (TextView) findViewById(C0906R.id.dcw);
            UIUtils.setViewVisibility(this, 4);
        }
        this.f15531f = aVar;
        this.t = z;
    }
}
