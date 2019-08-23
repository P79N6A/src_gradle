package com.ss.android.ugc.aweme.notification.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.R$styleable;
import java.util.List;

public class PagerIndicator extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58136a;

    /* renamed from: b  reason: collision with root package name */
    public int f58137b;

    /* renamed from: c  reason: collision with root package name */
    public int f58138c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f58139d;

    /* renamed from: e  reason: collision with root package name */
    int f58140e;

    /* renamed from: f  reason: collision with root package name */
    public int f58141f;
    public ViewPager g;
    public a h;
    public IndicatorListener i;
    boolean j;
    private int k;
    private int l;
    private int m;
    private long n;
    private long o;
    private boolean p;
    private Paint q;
    private int r;
    private int s;

    public abstract class IndicatorListener implements ViewPager.OnPageChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f58149c;

        public abstract void a(int i);

        public abstract void a(int i, float f2);

        public IndicatorListener() {
        }

        public void onPageScrollStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58149c, false, 63331, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58149c, false, 63331, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (PagerIndicator.this.h != null) {
                PagerIndicator.this.h.a(i);
            }
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58149c, false, 63330, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58149c, false, 63330, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            a(i);
            if (PagerIndicator.this.h != null) {
                PagerIndicator.this.h.a(i, PagerIndicator.this.j);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f58149c, false, 63329, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f58149c, false, 63329, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            a(i, f2);
            if (f2 > 0.0f) {
                PagerIndicator.this.j = true;
            } else {
                PagerIndicator.this.j = false;
            }
        }
    }

    public interface a {
        void a(int i);

        void a(int i, boolean z);
    }

    private void b() {
        this.f58139d = true;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f58136a, false, 63321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58136a, false, 63321, new Class[0], Void.TYPE);
            return;
        }
        for (final int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TextView) {
                childAt.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f58146a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f58146a, false, 63328, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f58146a, false, 63328, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                        PagerIndicator.this.g.setCurrentItem(i2);
                    }
                });
            }
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f58136a, false, 63317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58136a, false, 63317, new Class[0], Void.TYPE);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.n);
        ofFloat.setStartDelay(this.o);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58142a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f58142a, false, 63325, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f58142a, false, 63325, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                int width = PagerIndicator.this.getWidth() / PagerIndicator.this.f58138c;
                PagerIndicator.this.f58141f = (int) ((((float) width) * (((Float) valueAnimator.getAnimatedValue()).floatValue() + 0.0f)) + ((float) (PagerIndicator.this.f58137b / 2)));
                PagerIndicator.this.invalidate();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                    PagerIndicator.this.f58139d = false;
                }
            }
        });
        ofFloat.start();
    }

    public void setSelectCallBack(a aVar) {
        this.h = aVar;
    }

    public PagerIndicator(Context context) {
        this(context, null);
    }

    public void setHighLightText(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58136a, false, 63323, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58136a, false, 63323, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if (childAt instanceof TextView) {
                if (i3 == i2) {
                    TextView textView = (TextView) childAt;
                    textView.setTextColor(this.r);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                } else {
                    TextView textView2 = (TextView) childAt;
                    textView2.setTextColor(this.s);
                    textView2.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f58136a, false, 63319, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f58136a, false, 63319, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.g != null) {
            try {
                int currentItem = this.g.getCurrentItem();
                int i3 = i2 - 1;
                if (currentItem != i3) {
                    b();
                }
                this.g.setCurrentItem(i3, false);
                if (currentItem != i3) {
                    a();
                }
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            }
        }
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f58136a, false, 63315, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f58136a, false, 63315, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (this.p) {
            canvas.save();
            if (PatchProxy.isSupport(new Object[0], this, f58136a, false, 63324, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58136a, false, 63324, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (Build.VERSION.SDK_INT < 17 || 1 != getLayoutDirection()) {
                z = false;
            }
            if (z) {
                int width = getWidth();
                canvas.drawLine((float) (width - this.f58141f), (float) getHeight(), (float) (width - (this.f58141f + ((getWidth() / this.f58138c) - this.f58137b))), (float) getHeight(), this.q);
            } else {
                canvas.drawLine((float) this.f58141f, (float) getHeight(), (float) (this.f58141f + ((getWidth() / this.f58138c) - this.f58137b)), (float) getHeight(), this.q);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public void setTabItems(List<String> list) {
        DmtTextView dmtTextView;
        if (PatchProxy.isSupport(new Object[]{list}, this, f58136a, false, 63318, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f58136a, false, 63318, new Class[]{List.class}, Void.TYPE);
        } else if (list != null) {
            removeAllViews();
            if (list.size() == 1) {
                this.p = false;
            } else {
                this.p = true;
            }
            for (String next : list) {
                if (PatchProxy.isSupport(new Object[]{next}, this, f58136a, false, 63322, new Class[]{String.class}, View.class)) {
                    dmtTextView = (View) PatchProxy.accessDispatch(new Object[]{next}, this, f58136a, false, 63322, new Class[]{String.class}, View.class);
                } else {
                    DmtTextView dmtTextView2 = new DmtTextView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                    layoutParams.width = this.l;
                    dmtTextView2.setGravity(17);
                    dmtTextView2.setText(next);
                    dmtTextView2.setTextColor(this.s);
                    dmtTextView2.setLayoutParams(layoutParams);
                    dmtTextView2.setTextSize(1, (float) this.m);
                    layoutParams.weight = 1.0f;
                    dmtTextView = dmtTextView2;
                }
                addView(dmtTextView);
            }
            this.f58138c = list.size();
            this.f58140e = getWidth() / this.f58138c;
            setHighLightText(list.size() - 1);
            c();
        }
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 12;
        this.f58137b = (int) UIUtils.dip2Px(getContext(), 30.0f);
        this.l = (int) UIUtils.dip2Px(getContext(), 110.0f);
        this.m = 17;
        this.f58138c = 1;
        this.n = 380;
        this.o = 250;
        this.f58139d = false;
        this.p = false;
        this.i = new IndicatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58144a;

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f58144a, false, 63327, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f58144a, false, 63327, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                PagerIndicator.this.setHighLightText(i);
            }

            public final void a(int i, float f2) {
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f58144a, false, 63326, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, this, f58144a, false, 63326, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
                    return;
                }
                PagerIndicator pagerIndicator = PagerIndicator.this;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, pagerIndicator, PagerIndicator.f58136a, false, 63316, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                    PagerIndicator pagerIndicator2 = pagerIndicator;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2)}, pagerIndicator2, PagerIndicator.f58136a, false, 63316, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
                    return;
                }
                if (!pagerIndicator.f58139d) {
                    pagerIndicator.f58141f = ((int) (((float) (pagerIndicator.getWidth() / pagerIndicator.f58138c)) * (((float) i2) + f2))) + (pagerIndicator.f58137b / 2);
                }
                if (i2 >= pagerIndicator.f58138c - 2 && f2 > 0.0f && pagerIndicator.getChildCount() > pagerIndicator.f58138c && i2 != pagerIndicator.getChildCount() - 2) {
                    if (pagerIndicator.f58138c != 1) {
                        pagerIndicator.scrollTo(((i2 - (pagerIndicator.f58138c - 2)) * pagerIndicator.f58140e) + ((int) (((float) pagerIndicator.f58140e) * f2)), 0);
                    } else {
                        pagerIndicator.scrollTo((i2 * pagerIndicator.f58140e) + ((int) (((float) pagerIndicator.f58140e) * f2)), 0);
                    }
                }
                pagerIndicator.invalidate();
            }
        };
        this.j = false;
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, f58136a, false, 63313, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, f58136a, false, 63313, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PagerIndicator);
            this.r = obtainStyledAttributes.getColor(1, context.getResources().getColor(C0906R.color.a08));
            this.s = obtainStyledAttributes.getColor(2, context.getResources().getColor(C0906R.color.akv));
            this.m = (int) obtainStyledAttributes.getDimension(3, (float) this.m);
            this.k = (int) obtainStyledAttributes.getDimension(0, (float) this.k);
            obtainStyledAttributes.recycle();
        }
        if (PatchProxy.isSupport(new Object[0], this, f58136a, false, 63314, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f58136a, false, 63314, new Class[0], Void.TYPE);
            return;
        }
        this.q = new Paint();
        this.q.setAntiAlias(true);
        this.q.setColor(getContext().getResources().getColor(C0906R.color.amm));
        this.q.setStyle(Paint.Style.FILL);
        this.q.setStrokeWidth((float) this.k);
    }
}
