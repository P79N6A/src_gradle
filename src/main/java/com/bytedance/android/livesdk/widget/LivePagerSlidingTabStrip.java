package com.bytedance.android.livesdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Locale;
import org.aspectj.lang.a;

public class LivePagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18241a;
    private static final int[] j = {16842901, 16842904};
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private int E;
    private int F;
    private Locale G;
    private int H;
    private int I;
    private int J;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager.OnPageChangeListener f18242b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f18243c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPager f18244d;

    /* renamed from: e  reason: collision with root package name */
    public int f18245e;

    /* renamed from: f  reason: collision with root package name */
    public float f18246f;
    public boolean g;
    public Typeface h;
    public int i;
    private LinearLayout.LayoutParams k;
    private LinearLayout.LayoutParams l;
    private final PageListener m;
    private int n;
    private Paint o;
    private Paint p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private int z;

    class PageListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18253a;

        private PageListener() {
        }

        public void onPageScrollStateChanged(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18253a, false, 14493, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18253a, false, 14493, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (i == 0) {
                LivePagerSlidingTabStrip.this.b(LivePagerSlidingTabStrip.this.f18244d.getCurrentItem(), 0);
            }
            if (LivePagerSlidingTabStrip.this.f18242b != null) {
                LivePagerSlidingTabStrip.this.f18242b.onPageScrollStateChanged(i);
            }
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18253a, false, 14494, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18253a, false, 14494, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (LivePagerSlidingTabStrip.this.f18242b != null) {
                LivePagerSlidingTabStrip.this.f18242b.onPageSelected(i);
            }
        }

        /* synthetic */ PageListener(LivePagerSlidingTabStrip livePagerSlidingTabStrip, byte b2) {
            this();
        }

        public void onPageScrolled(int i, float f2, int i2) {
            int i3 = i;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f18253a, false, 14492, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f18253a, false, 14492, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (LivePagerSlidingTabStrip.this.f18245e != i3) {
                LivePagerSlidingTabStrip.this.a(LivePagerSlidingTabStrip.this.f18245e, false);
                LivePagerSlidingTabStrip.this.a(i, true);
            }
            LivePagerSlidingTabStrip.this.f18245e = i3;
            LivePagerSlidingTabStrip.this.f18246f = f3;
            LivePagerSlidingTabStrip.this.b(i, (int) (((float) LivePagerSlidingTabStrip.this.f18243c.getChildAt(i).getWidth()) * f3));
            LivePagerSlidingTabStrip.this.invalidate();
            if (LivePagerSlidingTabStrip.this.f18242b != null) {
                LivePagerSlidingTabStrip.this.f18242b.onPageScrolled(i, f3, i2);
            }
        }
    }

    public interface a {
        @NonNull
        View a();
    }

    public interface b {
        int a();
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        TextView f18255a;

        /* renamed from: b  reason: collision with root package name */
        View f18256b;

        c() {
        }
    }

    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18259a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new d[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f18259a, false, 14496, new Class[]{Parcel.class}, d.class)) {
                    return new d(parcel2, (byte) 0);
                }
                return (d) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f18259a, false, 14496, new Class[]{Parcel.class}, d.class);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18257a;

        /* renamed from: b  reason: collision with root package name */
        int f18258b;

        d(Parcelable parcelable) {
            super(parcelable);
        }

        private d(Parcel parcel) {
            super(parcel);
            this.f18258b = parcel.readInt();
        }

        /* synthetic */ d(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            Parcel parcel2 = parcel;
            if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, f18257a, false, 14495, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, f18257a, false, 14495, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel2.writeInt(this.f18258b);
        }
    }

    public int getDividerColor() {
        return this.u;
    }

    public int getDividerPadding() {
        return this.z;
    }

    public int getIndicatorColor() {
        return this.s;
    }

    public int getIndicatorHeight() {
        return this.x;
    }

    public int getIndicatorWidth() {
        return this.q;
    }

    public int getScrollOffset() {
        return this.w;
    }

    public boolean getShouldExpand() {
        return this.v;
    }

    public int getTabBackground() {
        return this.F;
    }

    public int getTabPaddingLeftRight() {
        return this.A;
    }

    public ColorStateList getTextColor() {
        return this.D;
    }

    public int getTextSize() {
        return this.C;
    }

    public int getUnderlineColor() {
        return this.t;
    }

    public int getUnderlineHeight() {
        return this.y;
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f18241a, false, 14488, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f18241a, false, 14488, new Class[0], Parcelable.class);
        }
        d dVar = new d(super.onSaveInstanceState());
        dVar.f18258b = this.f18245e;
        return dVar;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18241a, false, 14463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18241a, false, 14463, new Class[0], Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < this.n; i2++) {
            View childAt = this.f18243c.getChildAt(i2);
            childAt.setBackgroundResource(this.F);
            Object tag = childAt.getTag();
            if (tag instanceof c) {
                c cVar = (c) tag;
                cVar.f18255a.setTextSize(0, (float) this.C);
                cVar.f18255a.setTypeface(this.h, this.i);
                cVar.f18255a.setTextColor(this.D);
                if (this.g) {
                    if (Build.VERSION.SDK_INT >= 14) {
                        cVar.f18255a.setAllCaps(true);
                    } else {
                        cVar.f18255a.setText(cVar.f18255a.getText().toString().toUpperCase(this.G));
                    }
                }
            }
        }
    }

    private void b() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, f18241a, false, 14459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18241a, false, 14459, new Class[0], Void.TYPE);
            return;
        }
        this.f18243c.removeAllViews();
        this.n = this.f18244d.getAdapter().getCount();
        for (int i2 = 0; i2 < this.n; i2++) {
            if (this.f18244d.getAdapter() instanceof a) {
                getContext();
                a(i2, ((a) this.f18244d.getAdapter()).a());
            } else if (this.f18244d.getAdapter() instanceof b) {
                int a2 = ((b) this.f18244d.getAdapter()).a();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(a2)}, this, f18241a, false, 14461, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(a2)}, this, f18241a, false, 14461, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else {
                    ImageButton imageButton = new ImageButton(getContext());
                    imageButton.setImageResource(a2);
                    a(i2, (View) imageButton);
                }
            } else {
                CharSequence pageTitle = this.f18244d.getAdapter().getPageTitle(i2);
                if (pageTitle != null) {
                    String charSequence = pageTitle.toString();
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), charSequence}, this, f18241a, false, 14460, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), charSequence}, this, f18241a, false, 14460, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                    } else {
                        c cVar = new c();
                        if (this.H <= 0 || this.I <= 0) {
                            view = LayoutInflater.from(getContext()).inflate(C0906R.layout.ajv, null, false);
                            cVar.f18255a = (TextView) view.findViewById(C0906R.id.text);
                            cVar.f18256b = view.findViewById(C0906R.id.a6a);
                            cVar.f18256b.setVisibility(8);
                        } else {
                            view = LayoutInflater.from(getContext()).inflate(this.H, null, false);
                            cVar.f18255a = (TextView) view.findViewById(this.I);
                        }
                        cVar.f18255a.setText(charSequence);
                        cVar.f18255a.setGravity(17);
                        cVar.f18255a.setSingleLine();
                        view.setTag(cVar);
                        a(i2, view);
                    }
                }
            }
        }
        a();
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18247a;

            @SuppressLint({"NewApi"})
            public final void onGlobalLayout() {
                if (PatchProxy.isSupport(new Object[0], this, f18247a, false, 14489, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f18247a, false, 14489, new Class[0], Void.TYPE);
                    return;
                }
                if (Build.VERSION.SDK_INT < 16) {
                    LivePagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    LivePagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                LivePagerSlidingTabStrip.this.f18245e = LivePagerSlidingTabStrip.this.f18244d.getCurrentItem();
                LivePagerSlidingTabStrip.this.a(LivePagerSlidingTabStrip.this.f18245e, true);
                LivePagerSlidingTabStrip.this.b(LivePagerSlidingTabStrip.this.f18245e, 0);
            }
        });
    }

    public void setAllCaps(boolean z2) {
        this.g = z2;
    }

    public void setIndicatorBottomMargin(int i2) {
        this.J = i2;
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f18242b = onPageChangeListener;
    }

    public void setTabBackground(int i2) {
        this.F = i2;
    }

    public LivePagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14479, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14479, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f18243c.getChildCount() > i2) {
            Object tag = this.f18243c.getChildAt(i2).getTag();
            if (tag instanceof c) {
                ((c) tag).f18256b.setVisibility(8);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f18241a, false, 14487, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f18241a, false, 14487, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f18245e = dVar.f18258b;
        requestLayout();
    }

    public void setDividerColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14472, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14472, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.u = i2;
        invalidate();
    }

    public void setDividerColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14473, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14473, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.u = getResources().getColor(i2);
        invalidate();
    }

    public void setDividerPadding(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14475, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14475, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.z = i2;
        invalidate();
    }

    public void setIndicatorColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14467, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14467, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = i2;
        invalidate();
    }

    public void setIndicatorColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14468, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14468, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.s = getResources().getColor(i2);
        invalidate();
    }

    public void setIndicatorHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14469, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14469, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        invalidate();
    }

    public void setIndicatorRadius(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14486, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14486, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.r = i2;
        a();
    }

    public void setIndicatorWidth(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14485, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14485, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.q = i2;
        a();
    }

    public void setScrollOffset(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14476, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14476, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.w = i2;
        invalidate();
    }

    public void setShouldExpand(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18241a, false, 14477, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f18241a, false, 14477, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.v = z2;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14484, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14484, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.A = i2;
        a();
    }

    public void setTextColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14481, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14481, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = ColorStateList.valueOf(i2);
        a();
    }

    public void setTextColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14482, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14482, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.D = getResources().getColorStateList(i2);
        a();
    }

    public void setTextSize(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14480, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14480, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.C = i2;
        a();
    }

    public void setUnderlineColor(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14470, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14470, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.t = i2;
        invalidate();
    }

    public void setUnderlineColorResource(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14471, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14471, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.t = getResources().getColor(i2);
        invalidate();
    }

    public void setUnderlineHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14474, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14474, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.y = i2;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f18241a, false, 14458, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f18241a, false, 14458, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        this.f18244d = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.m);
            b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter INSTANCE.");
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14478, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f18241a, false, 14478, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f18243c.getChildCount() > i2) {
            Object tag = this.f18243c.getChildAt(i2).getTag();
            if (tag instanceof c) {
                ((c) tag).f18256b.setVisibility(0);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f18241a, false, 14465, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f18241a, false, 14465, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
        if (!isInEditMode() && this.n != 0) {
            int height = getHeight();
            this.o.setColor(this.s);
            View childAt = this.f18243c.getChildAt(this.f18245e);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f18246f > 0.0f && this.f18245e < this.n - 1) {
                View childAt2 = this.f18243c.getChildAt(this.f18245e + 1);
                left = (this.f18246f * ((float) childAt2.getLeft())) + ((1.0f - this.f18246f) * left);
                right = (this.f18246f * ((float) childAt2.getRight())) + ((1.0f - this.f18246f) * right);
            }
            if (this.q != 0) {
                float f2 = ((right - left) - ((float) this.q)) / 2.0f;
                left += f2;
                right -= f2;
            }
            float f3 = right;
            if (this.r <= 0 || Build.VERSION.SDK_INT <= 21) {
                canvas.drawRect(left, (float) ((height - this.x) - this.J), f3, (float) (height - this.J), this.o);
            } else {
                canvas.drawRoundRect(left, (float) ((height - this.x) - this.J), f3, (float) (height - this.J), (float) this.r, (float) this.r, this.o);
            }
            this.o.setColor(this.t);
            canvas.drawRect(0.0f, (float) (height - this.y), (float) this.f18243c.getWidth(), (float) height, this.o);
            this.p.setColor(this.u);
            for (int i2 = 0; i2 < this.n - 1; i2++) {
                View childAt3 = this.f18243c.getChildAt(i2);
                canvas.drawLine((float) childAt3.getRight(), (float) this.z, (float) childAt3.getRight(), (float) (height - this.z), this.p);
            }
        }
    }

    public LivePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(int i2, int i3) {
        this.H = C0906R.layout.al4;
        this.I = C0906R.id.cz7;
    }

    private void a(final int i2, View view) {
        LinearLayout.LayoutParams layoutParams;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), view}, this, f18241a, false, 14462, new Class[]{Integer.TYPE, View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), view}, this, f18241a, false, 14462, new Class[]{Integer.TYPE, View.class}, Void.TYPE);
            return;
        }
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18249a;

            /* renamed from: d  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f18250d;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f18249a, true, 14491, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f18249a, true, 14491, new Class[0], Void.TYPE);
                    return;
                }
                org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("LivePagerSlidingTabStrip.java", AnonymousClass2.class);
                f18250d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 291);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f18249a, false, 14490, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f18249a, false, 14490, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f18250d, this, this, view));
                LivePagerSlidingTabStrip.this.f18244d.setCurrentItem(i2);
            }
        });
        view.setPadding(this.A, 0, this.A, 0);
        if (Build.VERSION.SDK_INT >= 17 && com.bytedance.android.live.uikit.d.c.a(getContext())) {
            view.setPaddingRelative(this.A, 0, this.A, 0);
        }
        LinearLayout linearLayout = this.f18243c;
        if (this.v) {
            layoutParams = this.l;
        } else {
            layoutParams = this.k;
        }
        linearLayout.addView(view, i2, layoutParams);
    }

    public final void b(int i2, int i3) {
        int i4;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18241a, false, 14464, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18241a, false, 14464, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.n != 0) {
            if (com.bytedance.android.live.uikit.d.c.a(getContext())) {
                i4 = this.f18243c.getChildAt(i2).getLeft() - i3;
            } else {
                i4 = this.f18243c.getChildAt(i2).getLeft() + i3;
            }
            if (i2 > 0 || i3 > 0) {
                i4 -= this.w;
            }
            if (i4 != this.E) {
                this.E = i4;
                scrollTo(i4, 0);
            }
        }
    }

    public final void a(int i2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f18241a, false, 14466, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2)}, this, f18241a, false, 14466, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int childCount = this.f18243c.getChildCount();
        if (childCount != 0 && i2 >= 0 && i2 < childCount) {
            this.f18243c.getChildAt(i2).setSelected(z2);
        }
    }

    public LivePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.m = new PageListener(this, (byte) 0);
        this.f18245e = 0;
        this.f18246f = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 16737894;
        this.t = 436207616;
        this.u = 436207616;
        this.v = false;
        this.g = true;
        this.w = 52;
        this.x = 8;
        this.y = 2;
        this.z = 12;
        this.A = 24;
        this.B = 1;
        this.C = 12;
        this.D = ColorStateList.valueOf(16737894);
        this.h = null;
        this.i = 1;
        this.E = 0;
        this.F = 2130840631;
        this.J = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f18243c = new LinearLayout(context);
        this.f18243c.setOrientation(0);
        this.f18243c.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f18243c);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.w = (int) TypedValue.applyDimension(1, (float) this.w, displayMetrics);
        this.x = (int) TypedValue.applyDimension(1, (float) this.x, displayMetrics);
        this.y = (int) TypedValue.applyDimension(1, (float) this.y, displayMetrics);
        this.z = (int) TypedValue.applyDimension(1, (float) this.z, displayMetrics);
        this.A = (int) TypedValue.applyDimension(1, (float) this.A, displayMetrics);
        this.B = (int) TypedValue.applyDimension(1, (float) this.B, displayMetrics);
        this.C = (int) TypedValue.applyDimension(2, (float) this.C, displayMetrics);
        this.q = (int) TypedValue.applyDimension(1, (float) this.q, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j);
        this.C = obtainStyledAttributes.getDimensionPixelSize(0, this.C);
        this.D = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.LivePagerSlidingTabStrip);
        this.s = obtainStyledAttributes2.getColor(3, this.s);
        this.t = obtainStyledAttributes2.getColor(14, this.t);
        this.u = obtainStyledAttributes2.getColor(1, this.u);
        this.x = obtainStyledAttributes2.getDimensionPixelSize(4, this.x);
        this.y = obtainStyledAttributes2.getDimensionPixelSize(15, this.y);
        this.z = obtainStyledAttributes2.getDimensionPixelSize(2, this.z);
        this.A = obtainStyledAttributes2.getDimensionPixelSize(7, this.A);
        this.F = obtainStyledAttributes2.getResourceId(0, this.F);
        this.v = obtainStyledAttributes2.getBoolean(9, this.v);
        this.w = obtainStyledAttributes2.getDimensionPixelSize(8, this.w);
        this.g = obtainStyledAttributes2.getBoolean(10, this.g);
        this.C = obtainStyledAttributes2.getDimensionPixelSize(12, this.C);
        this.D = obtainStyledAttributes2.getColorStateList(11);
        this.q = obtainStyledAttributes2.getDimensionPixelSize(6, this.q);
        this.r = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        this.i = obtainStyledAttributes2.getInt(13, 1);
        obtainStyledAttributes2.recycle();
        this.o = new Paint();
        this.o.setAntiAlias(true);
        this.o.setStyle(Paint.Style.FILL);
        this.p = new Paint();
        this.p.setAntiAlias(true);
        this.p.setStrokeWidth((float) this.B);
        this.k = new LinearLayout.LayoutParams(-2, -1);
        this.l = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.G == null) {
            this.G = getResources().getConfiguration().locale;
        }
        if (this.D == null) {
            this.D = ColorStateList.valueOf(16737894);
        }
    }
}
