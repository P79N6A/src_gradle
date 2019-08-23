package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.follow.LiveTagViewModel;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.main.MainPageExperimentHelper;
import com.ss.android.ugc.aweme.main.base.b;
import com.ss.android.ugc.aweme.message.model.SimpleUser;
import com.ss.android.ugc.aweme.utils.cd;

public class a extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54463c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f54464d;

    /* renamed from: e  reason: collision with root package name */
    View f54465e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f54466f;
    public RemoteImageView g;
    public boolean h;
    private ImageView i;
    private TextView j;
    private ImageView k;
    private LiveTagViewModel l;
    private SimpleUser m;

    public SimpleUser getCurrentUser() {
        return this.m;
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57860, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(0);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57861, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57861, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(8);
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57866, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57866, new Class[0], Void.TYPE);
            return;
        }
        this.k.setVisibility(8);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57855, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57855, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new c(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57856, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57856, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new d(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57857, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57857, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new e(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57859, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57859, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.addUpdateListener(new h(this));
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54473a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54473a, false, 57883, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54473a, false, 57883, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.f54466f.setVisibility(4);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(200);
        ofFloat2.addUpdateListener(new i(this));
        ofFloat2.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54475a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54475a, false, 57884, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54475a, false, 57884, new Class[]{Animator.class}, Void.TYPE);
                } else if (a.this.h) {
                    a.this.g.setVisibility(0);
                } else {
                    a.this.f54464d.setVisibility(0);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.start();
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57867, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new j(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57863, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57863, new Class[0], Void.TYPE);
            return;
        }
        final float alpha = this.g.getAlpha();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, "alpha", new float[]{alpha, 0.0f});
        ofFloat.setDuration(150);
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54484a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54484a, false, 57887, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54484a, false, 57887, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.g.setVisibility(4);
                a.this.g.setAlpha(alpha);
                a.this.h = false;
            }
        });
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f54464d, "alpha", new float[]{0.0f, alpha});
        ofFloat2.setDuration(150);
        ofFloat2.setStartDelay(100);
        ofFloat2.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54487a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54487a, false, 57888, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54487a, false, 57888, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.f54464d.setVisibility(0);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57865, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57865, new Class[0], Void.TYPE);
            return;
        }
        this.j.setVisibility(8);
        this.i.setVisibility(8);
        if (this.h) {
            m();
        }
        this.k.setVisibility(0);
        this.l.f47732b = true;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57854, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57854, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f54463c, false, 57858, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54463c, false, 57858, new Class[0], Void.TYPE);
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f54466f, "rotation", new float[]{0.0f, -360.0f});
        ofFloat.setDuration(500);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54467a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54467a, false, 57880, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54467a, false, 57880, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.f54466f.setPivotY((float) (a.this.f54466f.getHeight() / 2));
                a.this.f54466f.setPivotX((float) (a.this.f54466f.getWidth() / 2));
                a.this.f54466f.setAlpha(0.0f);
                a.this.f54466f.setRotation(0.0f);
                a.this.f54466f.setVisibility(0);
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.addUpdateListener(new f(this));
        ofFloat2.setDuration(150);
        ofFloat2.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54469a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54469a, false, 57881, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54469a, false, 57881, new Class[]{Animator.class}, Void.TYPE);
                } else if (a.this.h) {
                    a.this.g.setVisibility(4);
                } else {
                    a.this.f54464d.setVisibility(4);
                }
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat3.addUpdateListener(new g(this));
        ofFloat3.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54471a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f54471a, false, 57882, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f54471a, false, 57882, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                a.this.f54466f.setVisibility(0);
            }
        });
        ofFloat3.setDuration(150);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat2).with(ofFloat);
        animatorSet.play(ofFloat2).before(ofFloat3);
        animatorSet.start();
    }

    private boolean b(SimpleUser simpleUser) {
        SimpleUser simpleUser2 = simpleUser;
        if (PatchProxy.isSupport(new Object[]{simpleUser2}, this, f54463c, false, 57864, new Class[]{SimpleUser.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{simpleUser2}, this, f54463c, false, 57864, new Class[]{SimpleUser.class}, Boolean.TYPE)).booleanValue();
        } else if (simpleUser2 == null || simpleUser.getAvatarThumb() == null) {
            return false;
        } else {
            this.m = simpleUser2;
            return true;
        }
    }

    public final void a(int i2) {
        String valueOf;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54463c, false, 57868, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54463c, false, 57868, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(getTabType(), "NOTIFICATION") || TextUtils.equals(getTabType(), "FOLLOW")) {
            if (i2 <= 0) {
                this.j.setVisibility(8);
                return;
            }
            this.j.setVisibility(0);
            this.i.setVisibility(8);
            if (i2 > 99) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(i2);
            }
            String str = valueOf;
            TextView textView = this.j;
            if (PatchProxy.isSupport(new Object[]{textView, str}, this, f54463c, false, 57870, new Class[]{TextView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView, str}, this, f54463c, false, 57870, new Class[]{TextView.class, String.class}, Void.TYPE);
            } else {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
                TextPaint textPaint = new TextPaint();
                textPaint.setTextSize(textView.getTextSize());
                layoutParams.width = Math.max(((int) (textPaint.measureText(str) + ((float) textView.getPaddingLeft()) + ((float) textView.getPaddingRight()))) + 2, textView.getMinWidth());
                textView.setLayoutParams(layoutParams);
            }
            this.j.setText(str);
        }
    }

    public final void a(final SimpleUser simpleUser) {
        final View view;
        if (PatchProxy.isSupport(new Object[]{simpleUser}, this, f54463c, false, 57862, new Class[]{SimpleUser.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{simpleUser}, this, f54463c, false, 57862, new Class[]{SimpleUser.class}, Void.TYPE);
        } else if (b(simpleUser)) {
            if (this.h) {
                view = this.g;
            } else {
                view = this.f54464d;
            }
            final float alpha = view.getAlpha();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{alpha, 0.0f});
            ofFloat.setDuration(150);
            ofFloat.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54477a;

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54477a, false, 57885, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54477a, false, 57885, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    view.setVisibility(4);
                    view.setAlpha(alpha);
                }
            });
            float scaleX = this.g.getScaleX();
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.g, "scaleX", new float[]{0.0f, scaleX});
            ofFloat2.setDuration(300);
            ofFloat2.setInterpolator(cd.a(2, 0.32f, 0.94f, 0.6f, 1.0f));
            ofFloat2.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54481a;

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54481a, false, 57886, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54481a, false, 57886, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    a.this.g.setVisibility(0);
                    a.this.h = true;
                    c.b(a.this.g, simpleUser.getAvatarThumb());
                }
            });
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.g, "scaleY", new float[]{0.0f, scaleX});
            ofFloat3.setDuration(300);
            ofFloat3.setInterpolator(cd.a(2, 0.32f, 0.94f, 0.6f, 1.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.play(ofFloat2).with(ofFloat3).after(ofFloat);
            animatorSet.start();
        }
    }

    public a(@NonNull Context context, String str) {
        super(context, str);
        String str2;
        int i2;
        int i3;
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a5z, this);
        this.f54464d = (TextView) inflate.findViewById(C0906R.id.cz7);
        this.j = (TextView) inflate.findViewById(C0906R.id.cyr);
        this.i = (ImageView) inflate.findViewById(C0906R.id.cyq);
        this.f54465e = inflate.findViewById(C0906R.id.cz0);
        this.f54466f = (ImageView) inflate.findViewById(C0906R.id.cz1);
        this.g = (RemoteImageView) inflate.findViewById(C0906R.id.b5v);
        ViewGroup.LayoutParams layoutParams = this.f54465e.getLayoutParams();
        if (MainPageExperimentHelper.f() == 1) {
            str2 = context.getString(C0906R.string.ae9);
        } else {
            str2 = com.ss.android.ugc.aweme.y.a.a().c();
        }
        this.f54464d.setText(str2);
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f54463c, false, 57869, new Class[]{String.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, f54463c, false, 57869, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(UIUtils.dip2Px(getContext(), 16.0f));
            i2 = (int) textPaint.measureText(str2);
        }
        layoutParams.width = i2;
        this.f54465e.setLayoutParams(layoutParams);
        View view = this.f54465e;
        if (com.ss.android.ugc.aweme.profile.a.d()) {
            i3 = 8;
        } else {
            i3 = 0;
        }
        v.a(view, i3);
        this.l = LiveTagViewModel.a((FragmentActivity) context);
        try {
            if (!com.ss.android.g.a.a() && g.b().bi().intValue() == 1) {
                z = true;
            }
        } catch (Exception unused) {
        }
        if (z) {
            this.k = (ImageView) inflate.findViewById(C0906R.id.b5x);
        } else {
            this.k = (ImageView) inflate.findViewById(C0906R.id.b5w);
        }
    }
}
