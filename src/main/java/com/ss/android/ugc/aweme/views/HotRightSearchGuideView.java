package com.ss.android.ugc.aweme.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class HotRightSearchGuideView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76339a;

    /* renamed from: b  reason: collision with root package name */
    public a f76340b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f76341c;

    /* renamed from: d  reason: collision with root package name */
    public int f76342d;

    /* renamed from: e  reason: collision with root package name */
    public View f76343e;

    /* renamed from: f  reason: collision with root package name */
    public View f76344f;
    public TextView g;
    public ImageView h;
    public ImageView i;
    com.ss.android.ugc.aweme.p.a j = new com.ss.android.ugc.aweme.p.a();
    ValueAnimator k;
    ValueAnimator l;
    public View m;
    private int n;
    private int o;
    private String p;

    public interface a {
        void a(View view);

        void b(View view);
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f76339a, false, 89521, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76339a, false, 89521, new Class[0], Void.TYPE);
            return;
        }
        setVisibility(0);
        getLayoutParams().width = this.n;
        getLayoutParams().height = this.n;
        requestLayout();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76339a, false, 89514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76339a, false, 89514, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null && this.k.isRunning()) {
            this.k.cancel();
        }
        if (this.l != null && this.l.isRunning()) {
            this.l.cancel();
        }
        c(false);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f76339a, false, 89522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76339a, false, 89522, new Class[0], Void.TYPE);
            return;
        }
        LayoutInflater.from(getContext()).inflate(C0906R.layout.a7y, this, true);
        setGravity(16);
        setOrientation(0);
        this.n = (int) UIUtils.dip2Px(getContext(), 32.0f);
        this.g = (TextView) findViewById(C0906R.id.di5);
        this.h = (ImageView) findViewById(C0906R.id.b4u);
        this.i = (ImageView) findViewById(C0906R.id.azd);
        this.g.getPaint().setFakeBoldText(true);
        this.g.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76362a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f76362a, false, 89531, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f76362a, false, 89531, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (HotRightSearchGuideView.this.f76340b != null) {
                    HotRightSearchGuideView.this.f76340b.b(view);
                }
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76364a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f76364a, false, 89532, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f76364a, false, 89532, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (HotRightSearchGuideView.this.f76340b != null) {
                    HotRightSearchGuideView.this.f76340b.a(view);
                }
            }
        });
    }

    public void setOnClickGuideLisenter(a aVar) {
        this.f76340b = aVar;
    }

    public HotRightSearchGuideView(Context context) {
        super(context);
        c();
    }

    public final void b(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76339a, false, 89516, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76339a, false, 89516, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            b();
            setScaleX(0.0f);
            setScaleY(0.0f);
            animate().scaleX(1.0f).scaleY(1.0f).setDuration(300).start();
        } else {
            animate().scaleX(0.0f).scaleY(0.0f).setDuration(300).start();
        }
        this.g.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76350a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f76350a, false, 89526, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76350a, false, 89526, new Class[0], Void.TYPE);
                } else if (z) {
                    HotRightSearchGuideView.this.h.setVisibility(0);
                    HotRightSearchGuideView.this.g.setVisibility(0);
                    HotRightSearchGuideView.this.c(true);
                } else {
                    HotRightSearchGuideView.this.a(false);
                }
            }
        }, 300);
    }

    public final void a(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76339a, false, 89515, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76339a, false, 89515, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            setVisibility(0);
            setBackgroundResource(2130838021);
            this.f76343e.animate().alpha(0.0f).setDuration(300).start();
            this.i.postDelayed(new i(this), 300);
        } else {
            this.i.animate().scaleX(1.0f).setDuration(250).start();
            this.i.animate().scaleY(1.0f).setDuration(250).start();
            this.i.postDelayed(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76345a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f76345a, false, 89524, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f76345a, false, 89524, new Class[0], Void.TYPE);
                        return;
                    }
                    HotRightSearchGuideView.this.setVisibility(8);
                }
            }, 250);
        }
        if (z) {
            b(true);
        } else {
            this.f76341c = false;
        }
        this.f76343e.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76347a;

            public final void run() {
                float f2;
                float f3;
                if (PatchProxy.isSupport(new Object[0], this, f76347a, false, 89525, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f76347a, false, 89525, new Class[0], Void.TYPE);
                    return;
                }
                HotRightSearchGuideView hotRightSearchGuideView = HotRightSearchGuideView.this;
                boolean z = z;
                float f4 = 0.0f;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, hotRightSearchGuideView, HotRightSearchGuideView.f76339a, false, 89518, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    f2 = 1.0f;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, hotRightSearchGuideView, HotRightSearchGuideView.f76339a, false, 89518, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    f2 = 1.0f;
                    ViewPropertyAnimator animate = hotRightSearchGuideView.f76344f.animate();
                    if (z) {
                        f3 = 0.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    animate.alpha(f3).setDuration(200).start();
                }
                HotRightSearchGuideView hotRightSearchGuideView2 = HotRightSearchGuideView.this;
                boolean z2 = z;
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, hotRightSearchGuideView2, HotRightSearchGuideView.f76339a, false, 89519, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    HotRightSearchGuideView hotRightSearchGuideView3 = hotRightSearchGuideView2;
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, hotRightSearchGuideView3, HotRightSearchGuideView.f76339a, false, 89519, new Class[]{Boolean.TYPE}, Void.TYPE);
                } else {
                    ViewPropertyAnimator animate2 = hotRightSearchGuideView2.m.animate();
                    if (!z2) {
                        f4 = 1.0f;
                    }
                    animate2.alpha(f4).setDuration(200).start();
                }
                if (!z) {
                    HotRightSearchGuideView.this.f76343e.animate().alpha(f2).setDuration(200).start();
                }
            }
        }, 100);
    }

    public void setHotSearchKey(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76339a, false, 89510, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f76339a, false, 89510, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f76341c) {
            this.p = str;
            this.g.setText(this.p);
            double measureText = (double) this.g.getPaint().measureText(str);
            Double.isNaN(measureText);
            int i2 = (int) (measureText + 0.5d);
            this.g.getLayoutParams().width = i2;
            this.g.requestLayout();
            measure(View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870912, Integer.MIN_VALUE));
            this.o = getMeasuredWidth();
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f76339a, false, 89511, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f76339a, false, 89511, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                int screenWidth = UIUtils.getScreenWidth(getContext());
                int i3 = ((ViewGroup.MarginLayoutParams) getLayoutParams()).rightMargin;
                if (this.o + i3 + this.f76342d > screenWidth) {
                    this.g.getLayoutParams().width = ((screenWidth - (this.o - i2)) - i3) - this.f76342d;
                    this.g.requestLayout();
                    this.o = (screenWidth - i3) - this.f76342d;
                }
            }
            this.g.setVisibility(4);
        }
    }

    public final void c(final boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f76339a, false, 89517, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f76339a, false, 89517, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.g.setVisibility(0);
            this.k = ValueAnimator.ofInt(new int[]{this.n, this.o});
            this.k.setDuration(400);
        } else {
            this.k = ValueAnimator.ofInt(new int[]{getLayoutParams().width, this.n});
            this.k.setDuration(400);
        }
        this.k.setInterpolator(this.j);
        this.k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76353a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f76353a, false, 89527, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f76353a, false, 89527, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                HotRightSearchGuideView.this.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                HotRightSearchGuideView.this.requestLayout();
            }
        });
        this.k.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76355a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f76355a, false, 89528, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f76355a, false, 89528, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                if (!z) {
                    HotRightSearchGuideView.this.g.setVisibility(4);
                    HotRightSearchGuideView.this.b(false);
                    return;
                }
                HotRightSearchGuideView hotRightSearchGuideView = HotRightSearchGuideView.this;
                if (PatchProxy.isSupport(new Object[0], hotRightSearchGuideView, HotRightSearchGuideView.f76339a, false, 89520, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], hotRightSearchGuideView, HotRightSearchGuideView.f76339a, false, 89520, new Class[0], Void.TYPE);
                    return;
                }
                hotRightSearchGuideView.l = ValueAnimator.ofFloat(new float[]{0.6f, 0.8f, 0.6f});
                hotRightSearchGuideView.l.setRepeatCount(4);
                hotRightSearchGuideView.l.setDuration(1200);
                hotRightSearchGuideView.l.setInterpolator(new LinearInterpolator());
                hotRightSearchGuideView.l.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76358a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f76358a, false, 89529, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f76358a, false, 89529, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        HotRightSearchGuideView.this.i.setScaleX(floatValue);
                        HotRightSearchGuideView.this.i.setScaleY(floatValue);
                    }
                });
                hotRightSearchGuideView.l.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f76360a;

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f76360a, false, 89530, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f76360a, false, 89530, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        super.onAnimationEnd(animator);
                        HotRightSearchGuideView.this.c(false);
                    }
                });
                hotRightSearchGuideView.l.start();
            }
        });
        this.k.start();
    }

    public HotRightSearchGuideView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public HotRightSearchGuideView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }
}
