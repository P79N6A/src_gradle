package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.AttrRes;
import android.support.annotation.CallSuper;
import android.support.annotation.ColorInt;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.DmtRtlViewPager;
import android.support.v4.view.DmtViewPager;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;

public class ViewPagerIndicatorLayout extends LinearLayout implements DmtViewPager.OnAdapterChangeListener, ViewPager.OnAdapterChangeListener, ViewPager.OnPageChangeListener, VerticalViewPager.e {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f70718b;

    /* renamed from: a  reason: collision with root package name */
    private b[] f70719a;

    /* renamed from: c  reason: collision with root package name */
    public VerticalViewPager f70720c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPager f70721d;

    /* renamed from: e  reason: collision with root package name */
    public DmtRtlViewPager f70722e;

    /* renamed from: f  reason: collision with root package name */
    int f70723f;
    int g;
    int h;
    int i;
    int j;
    int k;
    DataSetObserver l;

    class a extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70724a;

        /* renamed from: b  reason: collision with root package name */
        PagerAdapter f70725b;

        /* renamed from: c  reason: collision with root package name */
        ViewPagerIndicatorLayout f70726c;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f70724a, false, 80754, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70724a, false, 80754, new Class[0], Void.TYPE);
                return;
            }
            if (ViewPagerIndicatorLayout.this.f70720c != null) {
                ViewPagerIndicatorLayout.this.f70720c.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f70721d != null) {
                ViewPagerIndicatorLayout.this.f70721d.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f70722e != null) {
                ViewPagerIndicatorLayout.this.f70722e.requestLayout();
            }
            this.f70726c.setUpViews(this.f70725b);
        }

        public final void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f70724a, false, 80755, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70724a, false, 80755, new Class[0], Void.TYPE);
                return;
            }
            if (ViewPagerIndicatorLayout.this.f70720c != null) {
                ViewPagerIndicatorLayout.this.f70720c.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f70721d != null) {
                ViewPagerIndicatorLayout.this.f70721d.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f70722e != null) {
                ViewPagerIndicatorLayout.this.f70722e.requestLayout();
            }
            this.f70726c.setUpViews(this.f70725b);
        }

        a(ViewPagerIndicatorLayout viewPagerIndicatorLayout, PagerAdapter pagerAdapter) {
            this.f70725b = pagerAdapter;
            this.f70726c = viewPagerIndicatorLayout;
        }
    }

    public static class b extends View {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70728a;

        /* renamed from: b  reason: collision with root package name */
        Paint f70729b = new Paint();

        /* renamed from: c  reason: collision with root package name */
        Paint f70730c;

        /* renamed from: d  reason: collision with root package name */
        int f70731d;

        /* renamed from: e  reason: collision with root package name */
        int f70732e;

        /* renamed from: f  reason: collision with root package name */
        int f70733f;

        public b(Context context) {
            super(context);
            this.f70729b.setAntiAlias(true);
            this.f70729b.setStyle(Paint.Style.FILL);
            this.f70730c = new Paint();
            this.f70730c.setAntiAlias(true);
            this.f70730c.setStyle(Paint.Style.STROKE);
        }

        public final void onDraw(Canvas canvas) {
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f70728a, false, 80756, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f70728a, false, 80756, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            int width = getWidth() / 2;
            this.f70729b.setAlpha(this.f70731d);
            float f2 = (float) width;
            canvas.drawCircle(f2, f2, f2, this.f70729b);
            this.f70730c.setAlpha(this.f70732e);
            canvas.drawCircle(f2, f2, (float) (width - (this.f70733f / 2)), this.f70730c);
        }

        public final void setFillAlpha(@IntRange(from = 0, to = 255) int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80759, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80759, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f70731d = i;
            invalidate();
        }

        public final void setSolidColor(@ColorInt int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80758, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80758, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f70729b.setColor(i);
            invalidate();
        }

        public final void setStrokeAlpha(@IntRange(from = 0, to = 255) int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80760, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80760, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f70732e = i;
            invalidate();
        }

        public final void setStrokeColor(@ColorInt int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80757, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80757, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f70730c.setColor(i);
            invalidate();
        }

        public final void setStrokeWidth(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80761, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70728a, false, 80761, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f70733f = i;
            this.f70730c.setStrokeWidth((float) i);
            invalidate();
        }
    }

    public void onPageScrollStateChanged(int i2) {
    }

    public void onPageSelected(int i2) {
    }

    public int getCount() {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[0], this, f70718b, false, 80748, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70718b, false, 80748, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f70720c != null) {
            PagerAdapter adapter = this.f70720c.getAdapter();
            if (adapter == null) {
                return 0;
            }
            if (adapter instanceof InfiniteLoopPagerAdapter) {
                i4 = ((InfiniteLoopPagerAdapter) adapter).c();
            } else {
                i4 = adapter.getCount();
            }
            return i4;
        } else if (this.f70721d != null) {
            PagerAdapter adapter2 = this.f70721d.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            if (adapter2 instanceof InfiniteLoopPagerAdapter) {
                i3 = ((InfiniteLoopPagerAdapter) adapter2).c();
            } else {
                i3 = adapter2.getCount();
            }
            return i3;
        } else if (this.f70722e == null) {
            return 0;
        } else {
            PagerAdapter adapter3 = this.f70722e.getAdapter();
            if (adapter3 == null) {
                return 0;
            }
            if (adapter3 instanceof InfiniteLoopPagerAdapter) {
                i2 = ((InfiniteLoopPagerAdapter) adapter3).c();
            } else {
                i2 = adapter3.getCount();
            }
            return i2;
        }
    }

    public ViewPagerIndicatorLayout(@NonNull Context context) {
        this(context, null);
    }

    private b a(int i2) {
        return this.f70719a[i2];
    }

    public void setOrientation(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70718b, false, 80744, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70718b, false, 80744, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        super.setOrientation(i2);
        if (i2 == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(DmtRtlViewPager dmtRtlViewPager) {
        if (PatchProxy.isSupport(new Object[]{dmtRtlViewPager}, this, f70718b, false, 80747, new Class[]{DmtRtlViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtRtlViewPager}, this, f70718b, false, 80747, new Class[]{DmtRtlViewPager.class}, Void.TYPE);
        } else if (dmtRtlViewPager != null) {
            if (this.f70722e != null) {
                dmtRtlViewPager.removeOnPageChangeListener(this);
                dmtRtlViewPager.removeOnAdapterChangeListener(this);
            }
            this.f70722e = dmtRtlViewPager;
            PagerAdapter adapter = dmtRtlViewPager.getAdapter();
            dmtRtlViewPager.addOnPageChangeListener(this);
            dmtRtlViewPager.addOnAdapterChangeListener(this);
            if (adapter != null) {
                if (this.l != null) {
                    adapter.unregisterDataSetObserver(this.l);
                }
                this.l = new a(this, adapter);
                adapter.registerDataSetObserver(this.l);
                setUpViews(adapter);
            }
        } else {
            throw new NullPointerException("viewPager == null.");
        }
    }

    public void setUpViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f70718b, false, 80746, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f70718b, false, 80746, new Class[]{ViewPager.class}, Void.TYPE);
        } else if (viewPager != null) {
            if (this.f70721d != null) {
                viewPager.removeOnPageChangeListener(this);
                viewPager.removeOnAdapterChangeListener(this);
            }
            this.f70721d = viewPager;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.addOnPageChangeListener(this);
            viewPager.addOnAdapterChangeListener(this);
            if (adapter != null) {
                if (this.l != null) {
                    adapter.unregisterDataSetObserver(this.l);
                }
                this.l = new a(this, adapter);
                adapter.registerDataSetObserver(this.l);
                setUpViews(adapter);
            }
        } else {
            throw new NullPointerException("viewPager == null.");
        }
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{pagerAdapter}, this, f70718b, false, 80749, new Class[]{PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter}, this, f70718b, false, 80749, new Class[]{PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (pagerAdapter instanceof InfiniteLoopPagerAdapter) {
            i2 = ((InfiniteLoopPagerAdapter) pagerAdapter).c();
        } else {
            i2 = pagerAdapter.getCount();
        }
        removeAllViews();
        this.f70719a = new b[i2];
        int i3 = this.j / 2;
        for (int i4 = 0; i4 < i2; i4++) {
            b bVar = new b(getContext());
            bVar.setSolidColor(this.g);
            bVar.setStrokeColor(this.h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f70723f, this.f70723f);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i3, 0, i3);
            } else {
                layoutParams.setMargins(i3, 0, i3, 0);
            }
            addView(bVar, layoutParams);
            this.f70719a[i4] = bVar;
        }
    }

    public void setUpViewPager(VerticalViewPager verticalViewPager) {
        if (PatchProxy.isSupport(new Object[]{verticalViewPager}, this, f70718b, false, 80745, new Class[]{VerticalViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{verticalViewPager}, this, f70718b, false, 80745, new Class[]{VerticalViewPager.class}, Void.TYPE);
        } else if (verticalViewPager != null) {
            if (this.f70720c != null) {
                if (PatchProxy.isSupport(new Object[]{this}, verticalViewPager, VerticalViewPager.f40481a, false, 33794, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
                    VerticalViewPager verticalViewPager2 = verticalViewPager;
                    PatchProxy.accessDispatch(new Object[]{this}, verticalViewPager2, VerticalViewPager.f40481a, false, 33794, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
                } else if (verticalViewPager.o != null) {
                    verticalViewPager.o.remove(this);
                }
                verticalViewPager.setOnAdapterChangeListener(null);
            }
            this.f70720c = verticalViewPager;
            PagerAdapter adapter = verticalViewPager.getAdapter();
            verticalViewPager.a((ViewPager.OnPageChangeListener) this);
            verticalViewPager.setOnAdapterChangeListener(this);
            if (adapter != null) {
                if (this.l != null) {
                    adapter.unregisterDataSetObserver(this.l);
                }
                this.l = new a(this, adapter);
                adapter.registerDataSetObserver(this.l);
                setUpViews(adapter);
            }
        } else {
            throw new NullPointerException("viewPager == null.");
        }
    }

    public ViewPagerIndicatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @CallSuper
    public final void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (PatchProxy.isSupport(new Object[]{pagerAdapter, pagerAdapter2}, this, f70718b, false, 80751, new Class[]{PagerAdapter.class, PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter, pagerAdapter2}, this, f70718b, false, 80751, new Class[]{PagerAdapter.class, PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (!(pagerAdapter == null || this.l == null)) {
            pagerAdapter.unregisterDataSetObserver(this.l);
        }
        if (pagerAdapter2 != null) {
            this.l = new a(this, pagerAdapter2);
            pagerAdapter2.registerDataSetObserver(this.l);
        }
    }

    public ViewPagerIndicatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i2) {
        super(context, attributeSet, i2);
        this.f70719a = new b[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewPagerIndicatorLayout, i2, 0);
        this.g = obtainStyledAttributes.getColor(1, -1);
        this.h = obtainStyledAttributes.getColor(3, -1);
        this.f70723f = obtainStyledAttributes.getDimensionPixelSize(0, (int) UIUtils.dip2Px(context, 4.0f));
        this.i = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        float f2 = 0.5f;
        float f3 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f3 > 0.0f && f3 <= 1.0f) {
            f2 = f3;
        }
        this.k = (int) (f2 * 255.0f);
        this.j = obtainStyledAttributes.getDimensionPixelSize(2, (int) UIUtils.dip2Px(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    @CallSuper
    public void onAdapterChanged(@NonNull DmtViewPager dmtViewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
        PagerAdapter pagerAdapter3 = pagerAdapter;
        PagerAdapter pagerAdapter4 = pagerAdapter2;
        if (PatchProxy.isSupport(new Object[]{dmtViewPager, pagerAdapter3, pagerAdapter4}, this, f70718b, false, 80753, new Class[]{DmtViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dmtViewPager, pagerAdapter3, pagerAdapter4}, this, f70718b, false, 80753, new Class[]{DmtViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (!(pagerAdapter3 == null || this.l == null)) {
            pagerAdapter3.unregisterDataSetObserver(this.l);
        }
        if (pagerAdapter4 != null) {
            this.l = new a(this, pagerAdapter4);
            pagerAdapter4.registerDataSetObserver(this.l);
        }
    }

    @CallSuper
    public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
        PagerAdapter pagerAdapter3 = pagerAdapter;
        PagerAdapter pagerAdapter4 = pagerAdapter2;
        if (PatchProxy.isSupport(new Object[]{viewPager, pagerAdapter3, pagerAdapter4}, this, f70718b, false, 80752, new Class[]{ViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager, pagerAdapter3, pagerAdapter4}, this, f70718b, false, 80752, new Class[]{ViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE);
            return;
        }
        if (!(pagerAdapter3 == null || this.l == null)) {
            pagerAdapter3.unregisterDataSetObserver(this.l);
        }
        if (pagerAdapter4 != null) {
            this.l = new a(this, pagerAdapter4);
            pagerAdapter4.registerDataSetObserver(this.l);
        }
    }

    public void onPageScrolled(int i2, float f2, int i3) {
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f70718b, false, 80750, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f70718b, false, 80750, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int count = getCount();
        if (count != 0) {
            if (count != this.f70719a.length) {
                if (this.f70720c != null) {
                    setUpViews(this.f70720c.getAdapter());
                }
                if (this.f70721d != null) {
                    setUpViews(this.f70721d.getAdapter());
                }
                if (this.f70722e != null) {
                    setUpViews(this.f70722e.getAdapter());
                }
            }
            int i4 = i2 % count;
            b a2 = a(i4);
            a2.setStrokeAlpha(0);
            double d2 = (double) (1.0f - f3);
            Double.isNaN(d2);
            double d3 = (double) this.k;
            Double.isNaN(d3);
            a2.setFillAlpha((int) (((Math.sin((d2 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + d3));
            int i5 = (i4 + 1) % count;
            b a3 = a(i5);
            a3.setStrokeAlpha(0);
            double d4 = (double) f3;
            Double.isNaN(d4);
            double d5 = (double) this.k;
            Double.isNaN(d5);
            a3.setFillAlpha((int) (((Math.sin((d4 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d) + d5));
            for (int i6 = 0; i6 < count; i6++) {
                if (!(i6 == i4 || i6 == i5)) {
                    b a4 = a(i6);
                    a4.setStrokeAlpha(0);
                    a4.setFillAlpha(this.k);
                }
            }
        }
    }
}
