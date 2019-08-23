package com.bytedance.android.live.uikit.scrollview;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Locale;

public final class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8667a;
    private static final int[] i = {16842901, 16842904};
    private int A;
    private Typeface B;
    private int C;
    private int D;
    private int E;
    private Locale F;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f8668b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f8669c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPager f8670d;

    /* renamed from: e  reason: collision with root package name */
    public int f8671e;

    /* renamed from: f  reason: collision with root package name */
    public float f8672f;
    public boolean g;
    public boolean h;
    private LinearLayout.LayoutParams j;
    private LinearLayout.LayoutParams k;
    private final PageListener l;
    private int m;
    private Paint n;
    private Paint o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    class PageListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8678a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PagerSlidingTabStrip f8679b;

        public void onPageScrollStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8678a, false, 2303, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8678a, false, 2303, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0) {
                this.f8679b.a(this.f8679b.f8670d.getCurrentItem(), 0);
            }
            if (this.f8679b.f8668b != null) {
                this.f8679b.f8668b.onPageScrollStateChanged(i);
            }
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8678a, false, 2304, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8678a, false, 2304, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f8679b.h) {
                this.f8679b.a();
            }
            if (this.f8679b.f8668b != null) {
                this.f8679b.f8668b.onPageSelected(i);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            int i3 = i;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f8678a, false, 2302, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f8678a, false, 2302, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f8679b.f8671e = i3;
            this.f8679b.f8672f = f3;
            this.f8679b.a(i, (int) (((float) this.f8679b.f8669c.getChildAt(i).getWidth()) * f3));
            this.f8679b.invalidate();
            if (this.f8679b.f8668b != null) {
                this.f8679b.f8668b.onPageScrolled(i, f3, i2);
            }
        }
    }

    public interface a {
        int a();
    }

    static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8682a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new b[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f8682a, false, 2306, new Class[]{Parcel.class}, b.class)) {
                    return new b(parcel2, (byte) 0);
                }
                return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f8682a, false, 2306, new Class[]{Parcel.class}, b.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8680a;

        /* renamed from: b  reason: collision with root package name */
        int f8681b;

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f8681b = parcel.readInt();
        }

        /* synthetic */ b(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f8680a, false, 2305, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f8680a, false, 2305, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f8681b);
        }
    }

    public interface c {
        View a();

        TextView b();
    }

    public final int getDividerColor() {
        return this.r;
    }

    public final int getDividerPadding() {
        return this.x;
    }

    public final boolean getHighlightTitle() {
        return this.h;
    }

    public final int getIndicatorColor() {
        return this.p;
    }

    public final int getIndicatorHeight() {
        return this.v;
    }

    public final int getScrollOffset() {
        return this.u;
    }

    public final boolean getShouldExpand() {
        return this.s;
    }

    public final int getTabBackground() {
        return this.E;
    }

    public final int getTabPaddingLeftRight() {
        return this.y;
    }

    public final int getTextColor() {
        return this.A;
    }

    public final int getTextSize() {
        return this.z;
    }

    public final int getUnderlineColor() {
        return this.q;
    }

    public final int getUnderlineHeight() {
        return this.w;
    }

    public final Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f8667a, false, 2299, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f8667a, false, 2299, new Class[0], Parcelable.class);
        }
        b bVar = new b(super.onSaveInstanceState());
        bVar.f8681b = this.f8671e;
        return bVar;
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f8667a, false, 2278, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8667a, false, 2278, new Class[0], Void.TYPE);
            return;
        }
        int currentItem = this.f8670d.getCurrentItem();
        for (int i2 = 0; i2 < this.m; i2++) {
            View childAt = this.f8669c.getChildAt(i2);
            childAt.setBackgroundResource(this.E);
            TextView textView = null;
            if (this.f8670d.getAdapter() instanceof c) {
                textView = ((c) this.f8670d.getAdapter()).b();
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.z);
                textView.setTypeface(this.B, this.C);
                if (currentItem != i2 || !this.h) {
                    textView.setTextColor(this.A);
                } else {
                    textView.setTextColor(this.p);
                }
                if (this.g) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.F));
                    }
                }
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f8667a, false, 2279, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8667a, false, 2279, new Class[0], Void.TYPE);
            return;
        }
        int currentItem = this.f8670d.getCurrentItem();
        for (int i2 = 0; i2 < this.m; i2++) {
            View childAt = this.f8669c.getChildAt(i2);
            TextView textView = null;
            if (this.f8670d.getAdapter() instanceof c) {
                textView = ((c) this.f8670d.getAdapter()).b();
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i2 || !this.h) {
                    textView.setTextColor(this.A);
                } else {
                    textView.setTextColor(this.p);
                }
            }
        }
    }

    private void b() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, f8667a, false, 2274, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8667a, false, 2274, new Class[0], Void.TYPE);
            return;
        }
        this.f8669c.removeAllViews();
        this.m = this.f8670d.getAdapter().getCount();
        for (int i2 = 0; i2 < this.m; i2++) {
            if (this.f8670d.getAdapter() instanceof a) {
                int a2 = ((a) this.f8670d.getAdapter()).a();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(a2)}, this, f8667a, false, 2276, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(a2)}, this, f8667a, false, 2276, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    ImageButton imageButton = new ImageButton(getContext());
                    imageButton.setImageResource(a2);
                    a(i2, (View) imageButton);
                }
            } else {
                String charSequence = this.f8670d.getAdapter().getPageTitle(i2).toString();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), charSequence}, this, f8667a, false, 2275, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), charSequence}, this, f8667a, false, 2275, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    TextView textView = null;
                    if (this.f8670d.getAdapter() instanceof c) {
                        c cVar = (c) this.f8670d.getAdapter();
                        view = cVar.a();
                        if (view != null) {
                            textView = cVar.b();
                        }
                    } else {
                        view = null;
                    }
                    if (textView == null) {
                        textView = new TextView(getContext());
                        view = textView;
                    }
                    textView.setText(charSequence);
                    textView.setGravity(17);
                    textView.setSingleLine();
                    a(i2, view);
                }
            }
        }
        c();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8673a;

            @SuppressLint({"NewApi"})
            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f8673a, false, PushConstants.DOWN_LOAD_LARGE_ICON_ERROR, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f8673a, false, PushConstants.DOWN_LOAD_LARGE_ICON_ERROR, new Class[0], Void.TYPE);
                    return;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip.this.f8671e = PagerSlidingTabStrip.this.f8670d.getCurrentItem();
                PagerSlidingTabStrip.this.a(PagerSlidingTabStrip.this.f8671e, 0);
            }
        });
    }

    public final void setAllCaps(boolean z2) {
        this.g = z2;
    }

    public final void setHighlightTitle(boolean z2) {
        this.h = z2;
    }

    public final void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f8668b = onPageChangeListener;
    }

    public final void setOverlayIndicator(boolean z2) {
        this.t = z2;
    }

    public final void setTabBackground(int i2) {
        this.E = i2;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f8667a, false, 2298, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f8667a, false, 2298, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        this.f8671e = bVar.f8681b;
        requestLayout();
    }

    public final void setDividerColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2287, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2287, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = i2;
        invalidate();
    }

    public final void setDividerColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2288, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2288, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = getResources().getColor(i2);
        invalidate();
    }

    public final void setDividerPadding(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2290, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2290, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        invalidate();
    }

    public final void setIndicatorColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2282, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2282, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.p = i2;
        invalidate();
    }

    public final void setIndicatorColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2283, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2283, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.p = getResources().getColor(i2);
        invalidate();
    }

    public final void setIndicatorHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2284, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2284, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = i2;
        invalidate();
    }

    public final void setScrollOffset(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2291, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2291, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.u = i2;
        invalidate();
    }

    public final void setShouldExpand(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f8667a, false, 2292, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f8667a, false, 2292, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.s = z2;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2297, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2297, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = i2;
        c();
    }

    public final void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2294, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2294, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A = i2;
        c();
    }

    public final void setTextColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2295, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2295, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A = getResources().getColor(i2);
        c();
    }

    public final void setTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2293, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2293, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.z = i2;
        c();
    }

    public final void setUnderlineColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2285, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2285, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q = i2;
        invalidate();
    }

    public final void setUnderlineColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2286, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2286, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q = getResources().getColor(i2);
        invalidate();
    }

    public final void setUnderlineHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2289, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f8667a, false, 2289, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.w = i2;
        invalidate();
    }

    public final void setViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f8667a, false, 2273, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f8667a, false, 2273, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.f8670d = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.l);
            b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public final void onDraw(Canvas canvas) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f8667a, false, 2281, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f8667a, false, 2281, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!isInEditMode() && this.m != 0) {
            int height = getHeight();
            if (this.t) {
                this.n.setColor(this.q);
                canvas.drawRect(0.0f, (float) (height - this.w), (float) this.f8669c.getWidth(), (float) height, this.n);
            }
            this.n.setColor(this.p);
            View childAt = this.f8669c.getChildAt(this.f8671e);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f8672f <= 0.0f || this.f8671e >= this.m - 1) {
                f2 = right;
            } else {
                View childAt2 = this.f8669c.getChildAt(this.f8671e + 1);
                float left2 = (this.f8672f * ((float) childAt2.getLeft())) + ((1.0f - this.f8672f) * left);
                f2 = (this.f8672f * ((float) childAt2.getRight())) + ((1.0f - this.f8672f) * right);
                left = left2;
            }
            float f3 = (float) height;
            canvas.drawRect(left, (float) (height - this.v), f2, f3, this.n);
            if (!this.t) {
                this.n.setColor(this.q);
                canvas.drawRect(0.0f, (float) (height - this.w), (float) this.f8669c.getWidth(), f3, this.n);
            }
            this.o.setColor(this.r);
            for (int i2 = 0; i2 < this.m - 1; i2++) {
                View childAt3 = this.f8669c.getChildAt(i2);
                canvas.drawLine((float) childAt3.getRight(), (float) this.x, (float) childAt3.getRight(), (float) (height - this.x), this.o);
            }
        }
    }

    private void a(final int i2, View view) {
        LinearLayout.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view}, this, f8667a, false, 2277, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view}, this, f8667a, false, 2277, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
            return;
        }
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f8675a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f8675a, false, PushConstants.DOWN_LOAD_LARGE_ICON_SUCCESS, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f8675a, false, PushConstants.DOWN_LOAD_LARGE_ICON_SUCCESS, new Class[]{View.class}, Void.TYPE);
                } else if (!(PagerSlidingTabStrip.this.f8670d.getAdapter() instanceof c) || PagerSlidingTabStrip.this.f8670d.getCurrentItem() != i2) {
                    PagerSlidingTabStrip.this.f8670d.setCurrentItem(i2);
                } else {
                    PagerSlidingTabStrip.this.f8670d.getAdapter();
                }
            }
        });
        view.setPadding(this.y, 0, this.y, 0);
        LinearLayout linearLayout = this.f8669c;
        if (this.s) {
            layoutParams = this.k;
        } else {
            layoutParams = this.j;
        }
        linearLayout.addView(view, i2, layoutParams);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8667a, false, 2280, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f8667a, false, 2280, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.m != 0) {
            int left = this.f8669c.getChildAt(i2).getLeft() + i3;
            if (i2 > 0 || i3 > 0) {
                left -= this.u;
            }
            if (left != this.D) {
                this.D = left;
                scrollTo(left, 0);
            }
        }
    }
}
