package com.ss.android.ugc.aweme.common.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.ViewPager;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Locale;

public final class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40440a;
    private static final int[] k = {16842901, 16842904};
    private int A;
    private int B;
    private int C;
    private Typeface D;
    private int E;
    private int F;
    private int G;
    private Locale H;
    private int I;
    private int J;
    private int K;
    private boolean L;

    /* renamed from: b  reason: collision with root package name */
    public b f40441b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f40442c;

    /* renamed from: d  reason: collision with root package name */
    public LinearLayout f40443d;

    /* renamed from: e  reason: collision with root package name */
    public ViewPager f40444e;

    /* renamed from: f  reason: collision with root package name */
    public int f40445f;
    public int g;
    public float h;
    public boolean i;
    public boolean j;
    private LinearLayout.LayoutParams l;
    private LinearLayout.LayoutParams m;
    private final PageListener n;
    private Paint o;
    private Paint p;
    private int q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    class PageListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PagerSlidingTabStrip f40452b;

        public void onPageScrollStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40451a, false, 33743, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40451a, false, 33743, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0) {
                this.f40452b.a(this.f40452b.f40444e.getCurrentItem(), 0);
            }
            if (this.f40452b.f40442c != null) {
                this.f40452b.f40442c.onPageScrollStateChanged(i);
            }
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40451a, false, 33744, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40451a, false, 33744, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.f40452b.j) {
                this.f40452b.a();
            }
            if (this.f40452b.f40442c != null) {
                this.f40452b.f40442c.onPageSelected(i);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            int i3 = i;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f40451a, false, 33742, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f40451a, false, 33742, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f40452b.g = i3;
            this.f40452b.h = f3;
            this.f40452b.a(i, (int) (((float) this.f40452b.f40443d.getChildAt(i).getWidth()) * f3));
            this.f40452b.invalidate();
            if (this.f40452b.f40442c != null) {
                this.f40452b.f40442c.onPageScrolled(i, f3, i2);
            }
        }
    }

    public interface a {
        int a();
    }

    public interface b {
        boolean a();
    }

    static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40455a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f40455a, false, 33746, new Class[]{Parcel.class}, c.class)) {
                    return new c(parcel2, (byte) 0);
                }
                return (c) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f40455a, false, 33746, new Class[]{Parcel.class}, c.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40453a;

        /* renamed from: b  reason: collision with root package name */
        int f40454b;

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private c(Parcel parcel) {
            super(parcel);
            this.f40454b = parcel.readInt();
        }

        /* synthetic */ c(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f40453a, false, 33745, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f40453a, false, 33745, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f40454b);
        }
    }

    public interface d {
        View a();

        TextView b();
    }

    public final int getDividerColor() {
        return this.s;
    }

    public final int getDividerPadding() {
        return this.y;
    }

    public final boolean getHighlightTitle() {
        return this.j;
    }

    public final int getIndicatorColor() {
        return this.q;
    }

    public final int getIndicatorHeight() {
        return this.w;
    }

    public final int getScrollOffset() {
        return this.v;
    }

    public final boolean getShouldExpand() {
        return this.t;
    }

    public final int getTabBackground() {
        return this.G;
    }

    public final int getTabPaddingLeftRight() {
        return this.z;
    }

    public final int getTextColor() {
        return this.C;
    }

    public final int getTextSize() {
        return this.B;
    }

    public final int getUnderlineColor() {
        return this.r;
    }

    public final int getUnderlineHeight() {
        return this.x;
    }

    public final Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f40440a, false, 33739, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f40440a, false, 33739, new Class[0], Parcelable.class);
        }
        c cVar = new c(super.onSaveInstanceState());
        cVar.f40454b = this.g;
        return cVar;
    }

    private void c() {
        TextView textView;
        if (PatchProxy.isSupport(new Object[0], this, f40440a, false, 33716, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40440a, false, 33716, new Class[0], Void.TYPE);
            return;
        }
        int currentItem = this.f40444e.getCurrentItem();
        for (int i2 = 0; i2 < this.f40445f; i2++) {
            View childAt = this.f40443d.getChildAt(i2);
            childAt.setBackgroundResource(this.G);
            if (this.f40444e.getAdapter() instanceof d) {
                textView = ((d) this.f40444e.getAdapter()).b();
            } else {
                textView = null;
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.B);
                textView.setTypeface(this.D, this.E);
                if (currentItem != i2 || !this.j) {
                    textView.setTextColor(this.C);
                    textView.setTypeface(null, 0);
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, getContext().getResources().getColor(C0906R.color.a0i));
                } else {
                    textView.setTextColor(this.q);
                    textView.setTypeface(null, 1);
                    textView.setShadowLayer(2.0f, 0.0f, 2.0f, getContext().getResources().getColor(C0906R.color.a0i));
                }
                if (this.i) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.H));
                    }
                }
            }
        }
    }

    public final void a() {
        TextView textView;
        if (PatchProxy.isSupport(new Object[0], this, f40440a, false, 33717, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40440a, false, 33717, new Class[0], Void.TYPE);
            return;
        }
        int currentItem = this.f40444e.getCurrentItem();
        for (int i2 = 0; i2 < this.f40445f; i2++) {
            View childAt = this.f40443d.getChildAt(i2);
            childAt.setBackgroundColor(getContext().getResources().getColor(C0906R.color.ano));
            childAt.setBackgroundColor(getContext().getResources().getColor(C0906R.color.ano));
            int dip2Px = (int) UIUtils.dip2Px(getContext(), 0.0f);
            childAt.setPadding(dip2Px, (int) UIUtils.dip2Px(getContext(), 7.0f), dip2Px, 0);
            if (this.f40444e.getAdapter() instanceof d) {
                textView = ((d) this.f40444e.getAdapter()).b();
            } else {
                textView = null;
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i2 || !this.j) {
                    textView.setTextColor(this.C);
                    textView.setTypeface(null, 0);
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, getContext().getResources().getColor(C0906R.color.a0i));
                } else {
                    textView.setTextColor(this.q);
                    textView.setTypeface(null, 1);
                    textView.setShadowLayer(2.0f, 0.0f, 2.0f, getContext().getResources().getColor(C0906R.color.a0i));
                }
            }
        }
    }

    private void b() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, f40440a, false, 33712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40440a, false, 33712, new Class[0], Void.TYPE);
            return;
        }
        this.f40443d.removeAllViews();
        this.f40445f = this.f40444e.getAdapter().getCount();
        for (int i2 = 0; i2 < this.f40445f; i2++) {
            if (this.f40444e.getAdapter() instanceof a) {
                int a2 = ((a) this.f40444e.getAdapter()).a();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(a2)}, this, f40440a, false, 33714, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(a2)}, this, f40440a, false, 33714, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    ImageButton imageButton = new ImageButton(getContext());
                    imageButton.setImageResource(a2);
                    a(i2, (View) imageButton);
                }
            } else {
                String charSequence = this.f40444e.getAdapter().getPageTitle(i2).toString();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), charSequence}, this, f40440a, false, 33713, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), charSequence}, this, f40440a, false, 33713, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    TextView textView = null;
                    if (this.f40444e.getAdapter() instanceof d) {
                        d dVar = (d) this.f40444e.getAdapter();
                        view = dVar.a();
                        if (view != null) {
                            textView = dVar.b();
                        }
                    } else {
                        view = null;
                    }
                    if (textView == null) {
                        textView = new DmtTextView(getContext());
                        textView.setLayoutParams(new LinearLayout.LayoutParams(this.A, -1));
                        view = textView;
                    }
                    textView.setText(charSequence);
                    textView.setGravity(1);
                    textView.setSingleLine();
                    textView.setBackgroundColor(0);
                    a(i2, view);
                }
            }
        }
        c();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40446a;

            @SuppressLint({"NewApi"})
            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f40446a, false, 33740, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40446a, false, 33740, new Class[0], Void.TYPE);
                    return;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip.this.g = Math.max(0, Math.min(PagerSlidingTabStrip.this.f40445f - 1, PagerSlidingTabStrip.this.f40444e.getCurrentItem()));
                PagerSlidingTabStrip.this.a(PagerSlidingTabStrip.this.g, 0);
            }
        });
    }

    public final void setAllCaps(boolean z2) {
        this.i = z2;
    }

    public final void setHighlightTitle(boolean z2) {
        this.j = z2;
    }

    public final void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f40442c = onPageChangeListener;
    }

    public final void setOnTabTriggerOnListener(b bVar) {
        this.f40441b = bVar;
    }

    public final void setOverlayIndicator(boolean z2) {
        this.u = z2;
    }

    public final void setTabBackground(int i2) {
        this.G = i2;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f40440a, false, 33738, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f40440a, false, 33738, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.g = cVar.f40454b;
        requestLayout();
    }

    public final void setDividerColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33727, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33727, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = i2;
        invalidate();
    }

    public final void setDividerColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33728, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33728, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = getResources().getColor(i2);
        invalidate();
    }

    public final void setDividerPadding(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33730, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33730, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = i2;
        invalidate();
    }

    public final void setIndicatorColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33722, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33722, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q = i2;
        invalidate();
    }

    public final void setIndicatorColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33723, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33723, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q = getResources().getColor(i2);
        invalidate();
    }

    public final void setIndicatorHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33724, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33724, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.w = i2;
        invalidate();
    }

    public final void setScrollOffset(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33731, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33731, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.v = i2;
        invalidate();
    }

    public final void setShouldExpand(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40440a, false, 33732, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40440a, false, 33732, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.t = z2;
        requestLayout();
    }

    public final void setShowDot(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40440a, false, 33710, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40440a, false, 33710, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.L != z2) {
            this.L = z2;
            invalidate();
        }
    }

    public final void setTabPaddingLeftRight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33737, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33737, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.z = i2;
        c();
    }

    public final void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33734, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33734, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.C = i2;
        c();
    }

    public final void setTextColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33735, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33735, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.C = getResources().getColor(i2);
        c();
    }

    public final void setTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33733, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33733, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.B = i2;
        c();
    }

    public final void setUnderlineColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33725, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33725, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = i2;
        invalidate();
    }

    public final void setUnderlineColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33726, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33726, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = getResources().getColor(i2);
        invalidate();
    }

    public final void setUnderlineHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33729, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40440a, false, 33729, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        invalidate();
    }

    public final void setViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f40440a, false, 33711, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f40440a, false, 33711, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.f40444e = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.n);
            b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    public final void onDraw(Canvas canvas) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f40440a, false, 33720, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f40440a, false, 33720, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!isInEditMode() && this.f40445f != 0) {
            int height = getHeight();
            if (this.u) {
                this.o.setColor(this.r);
                canvas.drawRect(0.0f, 0.0f, (float) this.f40443d.getWidth(), (float) this.x, this.o);
            }
            if (this.L) {
                this.o.setColor(this.J);
                View childAt = getChildAt(0);
                if (!(childAt == null || childAt.getWidth() == 0)) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getChildCount() > 0) {
                        if (this.K < 0) {
                            Rect rect = new Rect();
                            TextView textView = (TextView) linearLayout.getChildAt(0);
                            TextPaint paint = textView.getPaint();
                            String charSequence = textView.getText().toString();
                            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                            this.K = (textView.getWidth() + rect.width()) / 2;
                        }
                        canvas.drawCircle((float) (this.K + this.I), (float) (((int) UIUtils.dip2Px(getContext(), 7.0f)) + this.I), (float) (this.I / 2), this.o);
                    }
                }
            }
            this.o.setColor(this.q);
            View childAt2 = this.f40443d.getChildAt(this.g);
            float left = (float) childAt2.getLeft();
            float right = (float) childAt2.getRight();
            if (this.h <= 0.0f || this.g >= this.f40445f - 1) {
                f2 = right;
            } else {
                View childAt3 = this.f40443d.getChildAt(this.g + 1);
                float left2 = (this.h * ((float) childAt3.getLeft())) + ((1.0f - this.h) * left);
                f2 = (this.h * ((float) childAt3.getRight())) + ((1.0f - this.h) * right);
                left = left2;
            }
            canvas.drawRect(left, 0.0f, f2, (float) this.w, this.o);
            if (!this.u) {
                this.o.setColor(this.r);
                canvas.drawRect(0.0f, 0.0f, (float) this.f40443d.getWidth(), (float) this.x, this.o);
            }
            this.p.setColor(this.s);
            for (int i2 = 0; i2 < this.f40445f - 1; i2++) {
                View childAt4 = this.f40443d.getChildAt(i2);
                canvas.drawLine((float) childAt4.getRight(), (float) this.y, (float) childAt4.getRight(), (float) (height - this.y), this.p);
            }
        }
    }

    private void a(final int i2, View view) {
        LinearLayout.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view}, this, f40440a, false, 33715, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view}, this, f40440a, false, 33715, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
            return;
        }
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40448a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f40448a, false, 33741, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f40448a, false, 33741, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if ((PagerSlidingTabStrip.this.f40444e.getAdapter() instanceof d) && PagerSlidingTabStrip.this.f40444e.getCurrentItem() == i2) {
                    PagerSlidingTabStrip.this.f40444e.getAdapter();
                } else if (PagerSlidingTabStrip.this.f40441b == null || !PagerSlidingTabStrip.this.f40441b.a()) {
                    PagerSlidingTabStrip.this.f40444e.setCurrentItem(i2);
                }
            }
        });
        view.setPadding(this.z, 0, this.z, 0);
        LinearLayout linearLayout = this.f40443d;
        if (this.t) {
            layoutParams = this.m;
        } else {
            layoutParams = this.l;
        }
        linearLayout.addView(view, i2, layoutParams);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40440a, false, 33718, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40440a, false, 33718, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f40445f != 0) {
            int left = this.f40443d.getChildAt(i2).getLeft() + i3;
            if (i2 > 0 || i3 > 0) {
                left -= this.v;
            }
            if (left != this.F) {
                this.F = left;
                scrollTo(left, 0);
            }
        }
    }

    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40440a, false, 33719, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40440a, false, 33719, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z2, i2, i3, i4, i5);
        if (!isInEditMode()) {
            if (this.f40445f != 0) {
                a();
            }
        }
    }
}
