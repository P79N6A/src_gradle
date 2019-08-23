package com.ss.android.ugc.aweme.main.base.tab;

import android.animation.ValueAnimator;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.b.a.a.a;
import com.ss.android.ugc.aweme.main.base.b;
import com.ss.android.ugc.aweme.setting.AbTestManager;

public final class m extends b {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f54546c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f54547d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f54548e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f54549f;
    private int g = AbTestManager.a().G().intValue();
    private RelativeLayout h;
    private RelativeLayout i;
    private TextView j;

    public final void l() {
    }

    public final ImageView getTabIcon() {
        return this.f54547d;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57926, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57926, new Class[0], Void.TYPE);
            return;
        }
        this.f54547d.setSelected(false);
        a(false);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57927, new Class[0], Void.TYPE);
            return;
        }
        a(false);
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57929, new Class[0], Void.TYPE);
            return;
        }
        a(true);
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57931, new Class[0], Void.TYPE);
            return;
        }
        setRefreshing(false);
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57932, new Class[0], Void.TYPE);
            return;
        }
        this.f54549f.setVisibility(0);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57933, new Class[0], Void.TYPE);
            return;
        }
        this.f54549f.setVisibility(8);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57928, new Class[0], Void.TYPE);
            return;
        }
        this.f54547d.setSelected(true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54550a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54550a, false, 57939, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54550a, false, 57939, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                m.this.f54547d.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m.this.f54547d.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                m.this.f54548e.setAlpha(m.this.f54548e.getAlpha() + ((((float) valueAnimator.getCurrentPlayTime()) * 0.3f) / ((float) valueAnimator.getDuration())));
            }
        });
        ofFloat.start();
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f54546c, false, 57930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54546c, false, 57930, new Class[0], Void.TYPE);
            return;
        }
        this.f54547d.setImageResource(2130838967);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        final AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(150);
        alphaAnimation2.setInterpolator(new LinearInterpolator());
        alphaAnimation2.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54552a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f54552a, false, 57940, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f54552a, false, 57940, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                m.this.f54547d.clearAnimation();
                m.this.f54547d.startAnimation(alphaAnimation);
            }
        });
        final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -360.0f, (float) (this.f54547d.getWidth() / 2), (float) (this.f54547d.getHeight() / 2));
        rotateAnimation.setInterpolator(new LinearInterpolator());
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setDuration(1000);
        rotateAnimation.setRepeatMode(1);
        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54555a;

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationRepeat(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f54555a, false, 57942, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f54555a, false, 57942, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                if (!m.this.f54425b) {
                    rotateAnimation.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f54555a, false, 57941, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f54555a, false, 57941, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                m.this.f54547d.setSelected(m.this.isSelected());
                a.b(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f54559a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f54559a, false, 57943, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f54559a, false, 57943, new Class[0], Void.TYPE);
                            return;
                        }
                        m.this.f54547d.startAnimation(alphaAnimation2);
                    }
                });
            }
        });
        this.f54547d.startAnimation(rotateAnimation);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f54546c, false, 57937, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f54546c, false, 57937, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        ofFloat.setDuration(300);
        final boolean z2 = z;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f54561a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54561a, false, 57944, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54561a, false, 57944, new Class[]{ValueAnimator.class}, Void.TYPE);
                } else if (z2) {
                    m.this.f54548e.setAlpha(((((float) valueAnimator.getCurrentPlayTime()) * 0.3f) / ((float) valueAnimator.getDuration())) + 0.6f);
                } else {
                    m.this.f54548e.setAlpha(0.9f - ((((float) valueAnimator.getCurrentPlayTime()) * 0.3f) / ((float) valueAnimator.getDuration())));
                }
            }
        });
        ofFloat.start();
    }

    public final void a(int i2) {
        String valueOf;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f54546c, false, 57934, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f54546c, false, 57934, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (TextUtils.equals(getTabType(), "NOTIFICATION") || TextUtils.equals(getTabType(), "FOLLOW")) {
            if (i2 <= 0) {
                this.j.setVisibility(4);
                return;
            }
            this.j.setVisibility(0);
            if (i2 > 99) {
                valueOf = "99+";
            } else {
                valueOf = String.valueOf(i2);
            }
            String str = valueOf;
            TextView textView = this.j;
            if (PatchProxy.isSupport(new Object[]{textView, str}, this, f54546c, false, 57935, new Class[]{TextView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView, str}, this, f54546c, false, 57935, new Class[]{TextView.class, String.class}, Void.TYPE);
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

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(@android.support.annotation.NonNull android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131690694(0x7f0f04c6, float:1.9010439E38)
            android.view.View r4 = r4.inflate(r5, r3)
            r5 = 2131170237(0x7f0713bd, float:1.7954827E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.f54547d = r5
            r5 = 2131170251(0x7f0713cb, float:1.7954855E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.f54548e = r5
            android.widget.TextView r5 = r3.f54548e
            android.text.TextPaint r5 = r5.getPaint()
            r0 = 1
            r5.setFakeBoldText(r0)
            r5 = 2131170234(0x7f0713ba, float:1.795482E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r3.f54549f = r5
            r5 = 2131166143(0x7f0703bf, float:1.7946523E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r3.i = r5
            r5 = 2131170246(0x7f0713c6, float:1.7954845E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            r3.h = r5
            r5 = 2131170235(0x7f0713bb, float:1.7954823E38)
            android.view.View r4 = r4.findViewById(r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.j = r4
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r4 = r4.G()
            int r4 = r4.intValue()
            r3.g = r4
            java.lang.String r4 = r3.getTabType()
            int r5 = r4.hashCode()
            r1 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            r2 = 2
            if (r5 == r1) goto L_0x00a4
            r1 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r5 == r1) goto L_0x009a
            r1 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r5 == r1) goto L_0x0090
            r1 = 2079338417(0x7bf02fb1, float:2.4942371E36)
            if (r5 == r1) goto L_0x0086
            goto L_0x00ae
        L_0x0086:
            java.lang.String r5 = "FOLLOW"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ae
            r4 = 1
            goto L_0x00af
        L_0x0090:
            java.lang.String r5 = "USER"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ae
            r4 = 3
            goto L_0x00af
        L_0x009a:
            java.lang.String r5 = "HOME"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ae
            r4 = 0
            goto L_0x00af
        L_0x00a4:
            java.lang.String r5 = "NOTIFICATION"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ae
            r4 = 2
            goto L_0x00af
        L_0x00ae:
            r4 = -1
        L_0x00af:
            r5 = 2131559641(0x7f0d04d9, float:1.8744632E38)
            switch(r4) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x00c8;
                case 2: goto L_0x00bf;
                case 3: goto L_0x00b6;
                default: goto L_0x00b5;
            }
        L_0x00b5:
            goto L_0x00fd
        L_0x00b6:
            android.widget.TextView r4 = r3.f54548e
            r5 = 2131561844(0x7f0d0d74, float:1.87491E38)
            r4.setText(r5)
            goto L_0x00fd
        L_0x00bf:
            android.widget.TextView r4 = r3.f54548e
            r5 = 2131561517(0x7f0d0c2d, float:1.8748437E38)
            r4.setText(r5)
            return
        L_0x00c8:
            int r4 = r3.g
            if (r4 != r2) goto L_0x00da
            android.widget.TextView r4 = r3.f54548e
            com.ss.android.ugc.aweme.y.a r5 = com.ss.android.ugc.aweme.y.a.a()
            java.lang.String r5 = r5.c()
            r4.setText(r5)
            return
        L_0x00da:
            android.widget.TextView r4 = r3.f54548e
            r4.setText(r5)
            return
        L_0x00e0:
            com.ss.android.ugc.aweme.setting.AbTestManager r4 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Integer r4 = r4.H()
            int r4 = r4.intValue()
            if (r4 != r0) goto L_0x00f4
            android.widget.TextView r4 = r3.f54548e
            r4.setText(r5)
            return
        L_0x00f4:
            android.widget.TextView r4 = r3.f54548e
            r5 = 2131561139(0x7f0d0ab3, float:1.874767E38)
            r4.setText(r5)
            return
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.main.base.tab.m.<init>(android.content.Context, java.lang.String):void");
    }
}
