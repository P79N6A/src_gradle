package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.feed.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RoundIndicatorView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14024a;

    /* renamed from: b  reason: collision with root package name */
    public int f14025b;

    /* renamed from: c  reason: collision with root package name */
    ViewPager f14026c;

    /* renamed from: d  reason: collision with root package name */
    private int f14027d;

    /* renamed from: e  reason: collision with root package name */
    private int f14028e;

    /* renamed from: f  reason: collision with root package name */
    private float f14029f;
    private float g;
    private float h;
    private Paint i;
    private float j;
    private float k;
    private int l;

    class PageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14030a;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f2, int i2) {
        }

        PageChangeListener() {
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14030a, false, 8549, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14030a, false, 8549, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (RoundIndicatorView.this.f14025b > 0) {
                int i2 = i % RoundIndicatorView.this.f14025b;
                if (i2 < RoundIndicatorView.this.f14025b) {
                    RoundIndicatorView.this.setLocation(i2);
                    return;
                }
                RoundIndicatorView.this.setLocation(0);
            }
        }
    }

    public RoundIndicatorView(Context context) {
        this(context, null);
    }

    public void setCount(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f14024a, false, 8543, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f14024a, false, 8543, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f14025b = i2;
        measure(0, 0);
        invalidate();
    }

    public void setLocation(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f14024a, false, 8542, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f14024a, false, 8542, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.l = i2;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f14024a, false, 8544, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f14024a, false, 8544, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.f14026c = viewPager;
        if (this.f14026c != null) {
            this.f14026c.addOnPageChangeListener(new PageChangeListener());
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f14024a, false, 8546, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f14024a, false, 8546, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f14024a, false, 8547, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f14024a, false, 8547, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        this.j = (float) getPaddingLeft();
        this.k = (float) getPaddingTop();
        this.i.setColor(this.f14028e);
        float f2 = this.j;
        for (int i2 = 0; i2 < this.f14025b; i2++) {
            if (this.l == i2) {
                this.i.setColor(this.f14027d);
            } else {
                this.i.setColor(this.f14028e);
            }
            canvas.drawCircle(this.h + f2, this.k + this.h, this.h, this.i);
            f2 += this.g + this.f14029f;
        }
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14024a, false, 8548, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f14024a, false, 8548, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            size = getPaddingLeft() + getPaddingRight();
            if (this.f14025b > 0) {
                size = (int) (((float) size) + (((float) this.f14025b) * this.g) + (((float) (this.f14025b - 1)) * this.f14029f));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            if (this.f14025b > 0) {
                paddingBottom += (int) this.g;
            }
            size2 = paddingBottom;
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoundIndicatorView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, f14024a, false, 8541, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2, Integer.valueOf(i2)}, this, f14024a, false, 8541, new Class[]{Context.class, AttributeSet.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, R$styleable.ttlive_RoundIndicatorView, i2, 0);
        this.f14029f = obtainStyledAttributes.getDimension(4, 0.0f);
        this.g = obtainStyledAttributes.getDimension(3, 0.0f);
        this.h = this.g / 2.0f;
        this.f14028e = obtainStyledAttributes.getColor(1, -1726079458);
        this.f14027d = obtainStyledAttributes.getColor(2, -10704);
        this.f14025b = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        this.i = new Paint();
        this.i.setAntiAlias(true);
        this.l = 0;
    }
}
