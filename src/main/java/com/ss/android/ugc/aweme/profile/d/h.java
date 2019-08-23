package com.ss.android.ugc.aweme.profile.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.profile.k;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.ey;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61406a;

    /* renamed from: b  reason: collision with root package name */
    public float f61407b;

    /* renamed from: c  reason: collision with root package name */
    public float f61408c;

    /* renamed from: d  reason: collision with root package name */
    public int f61409d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Context f61410e;

    /* renamed from: f  reason: collision with root package name */
    public Button f61411f;
    public View g;
    public DmtTextView h;
    private float i;
    private float j;
    private float k;
    private int l;
    private TextView m;
    private RemoteImageView n;
    private Button o;
    private ImageView p;
    private FrameLayout q;
    private ValueAnimator r;
    private ValueAnimator s;
    private boolean t;
    private boolean u;

    public static class a extends ImageSpan {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61420a;

        /* renamed from: b  reason: collision with root package name */
        public int f61421b;

        public a(Context context, @DrawableRes int i, int i2) {
            super(context, i, 1);
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
            Canvas canvas2 = canvas;
            if (PatchProxy.isSupport(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint}, this, f61420a, false, 69925, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2, charSequence, Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), paint}, this, f61420a, false, 69925, new Class[]{Canvas.class, CharSequence.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Paint.class}, Void.TYPE);
                return;
            }
            Drawable drawable = getDrawable();
            canvas.save();
            canvas2.translate(f2 + ((float) this.f61421b), (float) ((i5 - drawable.getBounds().bottom) / 2));
            drawable.draw(canvas2);
            canvas.restore();
        }
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69906, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69906, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.setVisibility(8);
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69920, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69920, new Class[0], Void.TYPE);
            return;
        }
        if (!b.b()) {
            this.g.setVisibility(8);
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69905, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69905, new Class[0], Void.TYPE);
            return;
        }
        this.f61411f.setVisibility(8);
        g();
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69907, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69907, new Class[0], Void.TYPE);
            return;
        }
        if (this.f61409d == 2) {
            if (com.ss.android.g.a.b()) {
                this.h.setText(C0906R.string.a6u);
            } else {
                a(this.h, 2130840444, C0906R.string.a6u);
            }
        } else if (this.f61409d == 1) {
            this.h.setText(C0906R.string.afw);
        } else if (this.f61409d == 4) {
            this.h.setText(C0906R.string.agl);
        }
        this.h.getLayoutParams().width = (int) this.f61408c;
        this.h.setVisibility(0);
        this.h.requestLayout();
    }

    private void h() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69917, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69917, new Class[0], Void.TYPE);
            return;
        }
        i();
        if (this.u) {
            this.f61411f.setVisibility(0);
            this.h.setVisibility(8);
            return;
        }
        this.s = ValueAnimator.ofInt(new int[]{(int) this.f61408c, (int) this.f61407b});
        this.s.setInterpolator(new LinearInterpolator());
        this.s.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61412a;

            /* renamed from: c  reason: collision with root package name */
            private IntEvaluator f61414c = new IntEvaluator();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61412a, false, 69922, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61412a, false, 69922, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float animatedFraction = valueAnimator.getAnimatedFraction();
                h.this.h.getLayoutParams().width = this.f61414c.evaluate(animatedFraction, Integer.valueOf((int) h.this.f61408c), Integer.valueOf((int) h.this.f61407b)).intValue();
                ((LinearLayout.LayoutParams) h.this.h.getLayoutParams()).rightMargin = this.f61414c.evaluate(animatedFraction, Integer.valueOf((int) UIUtils.dip2Px(h.this.f61410e, 4.0f)), 0).intValue();
                h.this.a((TextView) h.this.h, h.this.h.getLayoutParams().width);
                h.this.h.requestLayout();
                h.this.g.getLayoutParams().width = this.f61414c.evaluate(animatedFraction, Integer.valueOf((int) UIUtils.dip2Px(h.this.f61410e, 40.0f)), 0).intValue();
                h.this.g.requestLayout();
            }
        });
        this.s.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61415a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f61415a, false, 69923, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f61415a, false, 69923, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                h.this.h.setVisibility(8);
                h.this.g.setVisibility(8);
                h.this.f61411f.setVisibility(0);
                h.this.h.setBackground(ContextCompat.getDrawable(h.this.f61410e, 2130837983));
                h.this.h.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                h.this.h.setPadding(0, 0, 0, 0);
                h.this.h.setText(C0906R.string.afw);
            }
        });
        this.s.setDuration(300).start();
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69919, new Class[0], Void.TYPE);
            return;
        }
        if (this.r != null) {
            this.r.cancel();
            this.r.setupEndValues();
        }
        if (this.s != null) {
            this.s.cancel();
            this.s.setupEndValues();
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69908, new Class[0], Void.TYPE);
            return;
        }
        this.g.setVisibility(8);
        this.o.setVisibility(8);
        this.n.setVisibility(8);
        this.h.setVisibility(8);
        if (this.p != null) {
            this.p.setVisibility(0);
            this.p.getLayoutParams().width = (int) this.j;
            this.p.requestLayout();
        }
        this.f61411f.getLayoutParams().width = (int) this.f61407b;
        this.f61411f.getLayoutParams().height = (int) this.i;
        a((TextView) this.f61411f, (int) this.f61407b);
        this.f61411f.setVisibility(0);
        this.f61411f.requestLayout();
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69909, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69909, new Class[0], Void.TYPE);
            return;
        }
        this.f61411f.setVisibility(8);
        this.g.setVisibility(8);
        this.n.setVisibility(8);
        this.h.setVisibility(8);
        this.o.getLayoutParams().width = (int) this.k;
        this.o.setVisibility(0);
        this.o.requestLayout();
    }

    public void d() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69910, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69910, new Class[0], Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.c()) {
            if (this.q != null) {
                this.q.setVisibility(0);
            }
        } else if (!com.ss.android.g.a.a() && k.a() && this.q != null) {
            if (this.u || !d.a().isLogin() || !AbTestManager.a().i()) {
                i2 = 8;
            }
            if (this.q.getVisibility() != i2) {
                this.q.setVisibility(i2);
            }
        }
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f61406a, false, 69911, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61406a, false, 69911, new Class[0], Void.TYPE);
        } else if (!this.u) {
            this.g.getLayoutParams().width = (int) UIUtils.dip2Px(this.f61410e, 40.0f);
            this.g.setVisibility(0);
            ((LinearLayout.LayoutParams) this.h.getLayoutParams()).rightMargin = (int) UIUtils.dip2Px(this.f61410e, 4.0f);
            j();
        } else {
            if (!com.ss.android.g.a.a() && this.p != null) {
                this.p.setVisibility(0);
            }
        }
    }

    public float a(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69914, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return (float) (((((i2 - (u.a(16.0d) * 2)) - u.a(94.0d)) - u.a(20.0d)) - u.a(40.0d)) - u.a(4.0d));
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69914, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69918, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69918, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        i();
        if (this.u) {
            this.f61411f.setVisibility(8);
            this.h.setVisibility(0);
            return;
        }
        this.o.setVisibility(8);
        this.f61411f.setVisibility(8);
        this.h.getLayoutParams().width = (int) this.f61407b;
        this.h.setVisibility(0);
        this.g.setVisibility(0);
        if (i2 == 1) {
            this.h.setText(C0906R.string.afw);
        } else if (i2 == 2) {
            if (com.ss.android.g.a.b()) {
                this.h.setText(C0906R.string.a6u);
            } else {
                a(this.h, 2130840444, C0906R.string.a6u);
            }
        }
        j();
        this.r = ValueAnimator.ofInt(new int[]{(int) this.f61407b, (int) this.f61408c});
        this.r.setInterpolator(new LinearInterpolator());
        this.r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61417a;

            /* renamed from: c  reason: collision with root package name */
            private IntEvaluator f61419c = new IntEvaluator();

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f61417a, false, 69924, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f61417a, false, 69924, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                float animatedFraction = valueAnimator.getAnimatedFraction();
                h.this.h.getLayoutParams().width = this.f61419c.evaluate(animatedFraction, Integer.valueOf((int) h.this.f61407b), Integer.valueOf((int) h.this.f61408c)).intValue();
                ((LinearLayout.LayoutParams) h.this.h.getLayoutParams()).rightMargin = this.f61419c.evaluate(animatedFraction, 0, Integer.valueOf((int) UIUtils.dip2Px(h.this.f61410e, 4.0f))).intValue();
                h.this.h.requestLayout();
                h.this.g.getLayoutParams().width = this.f61419c.evaluate(animatedFraction, 0, Integer.valueOf((int) UIUtils.dip2Px(h.this.f61410e, 40.0f))).intValue();
                h.this.g.requestLayout();
            }
        });
        this.r.setDuration(300).start();
    }

    public float b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69915, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69915, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        } else if (this.u) {
            return (float) (((((i2 - (u.a(16.0d) * 2)) - u.a(94.0d)) - u.a(40.0d)) - u.a(4.0d)) - u.a(20.0d));
        } else {
            return (float) (((((i2 - (u.a(16.0d) * 2)) - (u.a(40.0d) * 2)) - u.a(94.0d)) - (u.a(4.0d) * 2)) - u.a(20.0d));
        }
    }

    public void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69916, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f61406a, false, 69916, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.m != null) {
            this.m.setVisibility(0);
            Resources resources = this.m.getContext().getResources();
            if (i2 == 0) {
                this.m.setBackgroundResource(2130837968);
                this.m.setTextColor(resources.getColor(C0906R.color.a09));
                this.m.setText(resources.getText(C0906R.string.afp));
                return;
            }
            if (i2 == 1 || i2 == 2) {
                this.m.setTextColor(resources.getColor(C0906R.color.a0b));
                this.m.setBackgroundResource(2130837983);
                int i3 = C0906R.string.agr;
                if (i2 == 2) {
                    i3 = C0906R.string.a6u;
                }
                this.m.setText(i3);
            }
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61406a, false, 69901, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f61406a, false, 69901, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f61409d != i2) {
            this.f61409d = i2;
            this.l = i3;
            if (i2 == 0) {
                h();
                f();
                d();
            } else if (i2 == 1) {
                d(i2);
                d();
            } else if (i2 == 2) {
                d(i2);
                d();
            } else if (i2 == 4) {
                c();
                d();
            }
            c(i2);
        }
    }

    public final void a(TextView textView, int i2) {
        if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i2)}, this, f61406a, false, 69912, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i2)}, this, f61406a, false, 69912, new Class[]{TextView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Rect rect = new Rect();
        textView.getPaint().getTextBounds(this.f61410e.getString(C0906R.string.afp), 0, this.f61410e.getString(C0906R.string.afp).length(), rect);
        int dip2Px = (int) ((((((float) i2) - UIUtils.dip2Px(this.f61410e, 16.0f)) - ((float) rect.width())) - UIUtils.dip2Px(this.f61410e, 4.0f)) / 2.0f);
        int dip2Px2 = (int) ((UIUtils.dip2Px(this.f61410e, 40.0f) - UIUtils.dip2Px(this.f61410e, 21.0f)) / 2.0f);
        textView.setPadding(dip2Px, dip2Px2, dip2Px, dip2Px2);
        textView.setBackground(ContextCompat.getDrawable(this.f61410e, 2130838155));
        Drawable drawable = ContextCompat.getDrawable(this.f61410e, 2130839732);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        textView.setCompoundDrawables(drawable, null, null, null);
        textView.setText(this.f61410e.getString(C0906R.string.afp));
    }

    private static void a(TextView textView, @DrawableRes int i2, @StringRes int i3) {
        int i4;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2, 2130840444, Integer.valueOf(C0906R.string.a6u)}, null, f61406a, true, 69921, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2, 2130840444, Integer.valueOf(C0906R.string.a6u)}, null, f61406a, true, 69921, new Class[]{TextView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (textView2 != null) {
            a aVar = new a(textView.getContext(), 2130840444, 1);
            if (ey.a(textView.getContext())) {
                i4 = -4;
            } else {
                i4 = 4;
            }
            aVar.f61421b = (int) UIUtils.dip2Px(textView.getContext(), (float) i4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("#  " + textView.getResources().getString(C0906R.string.a6u));
            spannableStringBuilder.setSpan(aVar, 0, 1, 18);
            textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
    }

    public h(Context context, Button button, TextView textView, View view, RemoteImageView remoteImageView, DmtTextView dmtTextView, Button button2, @Nullable ImageView imageView, boolean z, boolean z2, FrameLayout frameLayout) {
        Context context2 = context;
        this.f61411f = button;
        this.m = textView;
        this.g = view;
        this.n = remoteImageView;
        this.h = dmtTextView;
        this.o = button2;
        this.f61410e = context2;
        this.t = z;
        this.p = imageView;
        this.u = z2;
        this.q = frameLayout;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f61406a, false, 69913, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f61406a, false, 69913, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (this.f61407b == 0.0f) {
            this.f61407b = a(UIUtils.getScreenWidth(context));
        }
        if (this.i == 0.0f) {
            this.i = UIUtils.dip2Px(context, 40.0f);
        }
        if (this.j == 0.0f) {
            this.j = UIUtils.dip2Px(context, 40.0f);
        }
        if (this.k == 0.0f) {
            this.k = ((((((float) UIUtils.getScreenWidth(context)) - UIUtils.dip2Px(context, 94.0f)) - (UIUtils.dip2Px(context, 16.0f) * 2.0f)) - UIUtils.dip2Px(context, 40.0f)) - UIUtils.dip2Px(context, 4.0f)) - UIUtils.dip2Px(context, 20.0f);
        }
        if (this.f61408c == 0.0f) {
            this.f61408c = b(UIUtils.getScreenWidth(context));
        }
    }
}
