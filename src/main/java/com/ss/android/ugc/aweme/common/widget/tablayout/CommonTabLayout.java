package com.ss.android.ugc.aweme.common.widget.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Pools;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.tools.services.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
public class CommonTabLayout extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40579a;
    private static final Pools.Pool<e> u = new Pools.SynchronizedPool(16);
    private final int A;
    private int B;
    private b C;
    private final ArrayList<b> D;
    private b E;
    private ValueAnimator F;
    private PagerAdapter G;
    private DataSetObserver H;
    private AdapterChangeListener I;
    private boolean J;
    private float K;
    private float L;
    private final Pools.Pool<f> M;

    /* renamed from: b  reason: collision with root package name */
    public final d f40580b;

    /* renamed from: c  reason: collision with root package name */
    int f40581c;

    /* renamed from: d  reason: collision with root package name */
    int f40582d;

    /* renamed from: e  reason: collision with root package name */
    int f40583e;

    /* renamed from: f  reason: collision with root package name */
    int f40584f;
    int g;
    ColorStateList h;
    float i;
    float j;
    final int k;
    int l;
    int m;
    int n;
    int o;
    boolean p;
    ViewPager q;
    TabLayoutOnPageChangeListener r;
    public a s;
    public int t;
    private final ArrayList<e> v;
    private e w;
    private int x;
    private final int y;
    private final int z;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface TabGravity {
    }

    class AdapterChangeListener implements ViewPager.OnAdapterChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40587a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f40588b;

        AdapterChangeListener() {
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            ViewPager viewPager2 = viewPager;
            PagerAdapter pagerAdapter3 = pagerAdapter2;
            if (PatchProxy.isSupport(new Object[]{viewPager2, pagerAdapter, pagerAdapter3}, this, f40587a, false, 34039, new Class[]{ViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewPager2, pagerAdapter, pagerAdapter3}, this, f40587a, false, 34039, new Class[]{ViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE);
                return;
            }
            if (CommonTabLayout.this.q == viewPager2) {
                CommonTabLayout.this.a(pagerAdapter3, this.f40588b);
            }
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40590a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<CommonTabLayout> f40591b;

        /* renamed from: c  reason: collision with root package name */
        private int f40592c;

        /* renamed from: d  reason: collision with root package name */
        private int f40593d;

        /* renamed from: e  reason: collision with root package name */
        private int f40594e;

        /* renamed from: f  reason: collision with root package name */
        private int f40595f;
        private ArgbEvaluator g = new ArgbEvaluator();
        private AccelerateInterpolator h = new AccelerateInterpolator();
        private DecelerateInterpolator i = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f40592c = 0;
            this.f40593d = 0;
        }

        public void onPageScrollStateChanged(int i2) {
            this.f40592c = this.f40593d;
            this.f40593d = i2;
        }

        public TabLayoutOnPageChangeListener(CommonTabLayout commonTabLayout) {
            this.f40591b = new WeakReference<>(commonTabLayout);
            this.f40595f = commonTabLayout.getTabTextColors().getColorForState(CommonTabLayout.SELECTED_STATE_SET, 0);
            this.f40594e = commonTabLayout.getTabTextColors().getDefaultColor();
        }

        public void onPageSelected(int i2) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40590a, false, 34067, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40590a, false, 34067, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f40591b.get();
            if (!(commonTabLayout == null || commonTabLayout.getSelectedTabPosition() == i2 || i2 >= commonTabLayout.getTabCount())) {
                if (!(this.f40593d == 0 || (this.f40593d == 2 && this.f40592c == 0))) {
                    z = false;
                }
                commonTabLayout.a(commonTabLayout.a(i2), z);
            }
        }

        private void a(@Nullable ImageView imageView, @Nullable TextView textView, @ColorInt int i2) {
            ImageView imageView2 = imageView;
            if (PatchProxy.isSupport(new Object[]{imageView2, textView, Integer.valueOf(i2)}, this, f40590a, false, 34066, new Class[]{ImageView.class, TextView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{imageView2, textView, Integer.valueOf(i2)}, this, f40590a, false, 34066, new Class[]{ImageView.class, TextView.class, Integer.TYPE}, Void.TYPE);
            } else if (imageView2 != null && textView != null) {
                textView.setTextColor(i2);
                imageView2.setImageAlpha(Color.alpha(i2));
            }
        }

        public void onPageScrolled(int i2, float f2, int i3) {
            boolean z;
            boolean z2;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f40590a, false, 34065, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f40590a, false, 34065, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f40591b.get();
            if (commonTabLayout != null) {
                if (this.f40593d != 2 || this.f40592c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f40593d == 2 && this.f40592c == 0) {
                    int i4 = i2;
                    z2 = false;
                } else {
                    int i5 = i2;
                    z2 = true;
                }
                commonTabLayout.a(i2, f3, z, z2);
                if (this.f40593d == 2 && this.f40592c == 0) {
                    commonTabLayout.f40580b.f40615f = false;
                } else {
                    commonTabLayout.f40580b.f40615f = true;
                    View childAt = commonTabLayout.f40580b.getChildAt(commonTabLayout.f40580b.f40611b);
                    View childAt2 = commonTabLayout.f40580b.getChildAt(commonTabLayout.f40580b.f40611b + 1);
                    if (!(childAt == null || childAt2 == null)) {
                        View findViewById = childAt.findViewById(C0906R.id.ba7);
                        View findViewById2 = childAt2.findViewById(C0906R.id.ba7);
                        if (!(findViewById == null || findViewById2 == null)) {
                            float left = (float) (childAt.getLeft() + ((childAt.getWidth() - findViewById.getWidth()) / 2));
                            float width = ((float) findViewById.getWidth()) + left;
                            float left2 = (float) (childAt2.getLeft() + ((childAt2.getWidth() - findViewById2.getWidth()) / 2));
                            float width2 = ((float) findViewById2.getWidth()) + left2;
                            a((ImageView) findViewById.findViewById(C0906R.id.cyw), (TextView) findViewById.findViewById(C0906R.id.cyx), ((Integer) this.g.evaluate(f3, Integer.valueOf(this.f40595f), Integer.valueOf(this.f40594e))).intValue());
                            a((ImageView) findViewById2.findViewById(C0906R.id.cyw), (TextView) findViewById2.findViewById(C0906R.id.cyx), ((Integer) this.g.evaluate(f3, Integer.valueOf(this.f40594e), Integer.valueOf(this.f40595f))).intValue());
                            commonTabLayout.f40580b.f40613d = left + ((left2 - left) * this.h.getInterpolation(f3));
                            commonTabLayout.f40580b.f40614e = width + ((width2 - width) * this.h.getInterpolation(f3));
                        }
                    }
                }
                ViewCompat.postInvalidateOnAnimation(commonTabLayout.f40580b);
            }
        }
    }

    public static class TabLayoutOnPageChangeListenerIndependent implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40596a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f40597b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<CommonTabLayout> f40598c;

        /* renamed from: d  reason: collision with root package name */
        private int f40599d;

        /* renamed from: e  reason: collision with root package name */
        private int f40600e;

        /* renamed from: f  reason: collision with root package name */
        private int f40601f;

        public void onPageScrollStateChanged(int i) {
            this.f40599d = this.f40600e;
            this.f40600e = i;
        }

        public void onPageSelected(int i) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40596a, false, 34069, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40596a, false, 34069, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f40598c.get();
            if (!(commonTabLayout == null || commonTabLayout.getSelectedTabPosition() == i || i >= commonTabLayout.getTabCount())) {
                if (!(this.f40600e == 0 || (this.f40600e == 2 && this.f40599d == 0))) {
                    z = false;
                }
                commonTabLayout.a(commonTabLayout.a(i), z);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            boolean z;
            int i3 = i;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f40596a, false, 34068, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f40596a, false, 34068, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f40598c.get();
            if (!(this.f40601f == i3 || commonTabLayout == null)) {
                if (this.f40600e != 2 || this.f40599d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(this.f40600e == 2 && this.f40599d == 0)) {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i4 = i;
                b bVar = new b(this, this.f40601f, i4, commonTabLayout, z, z2);
                duration.addUpdateListener(bVar);
                this.f40601f = i3;
                final CommonTabLayout commonTabLayout2 = commonTabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                AnonymousClass1 r0 = new Animator.AnimatorListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f40602a;

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f40602a, false, 34072, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f40602a, false, 34072, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        commonTabLayout2.a(i4, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f40602a, false, 34071, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f40602a, false, 34071, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        commonTabLayout2.a(i4, 0.0f, z3, z4);
                    }
                };
                duration.addListener(r0);
                duration.start();
            }
        }
    }

    public interface a {
        void a(e eVar);
    }

    public interface b {
        void a(e eVar);

        void b(e eVar);

        void c(e eVar);
    }

    class c extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40608a;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f40608a, false, 34040, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40608a, false, 34040, new Class[0], Void.TYPE);
                return;
            }
            CommonTabLayout.this.a();
        }

        public final void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f40608a, false, 34041, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40608a, false, 34041, new Class[0], Void.TYPE);
                return;
            }
            CommonTabLayout.this.a();
        }

        c() {
        }
    }

    class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40610a;

        /* renamed from: b  reason: collision with root package name */
        int f40611b = -1;

        /* renamed from: c  reason: collision with root package name */
        float f40612c;

        /* renamed from: d  reason: collision with root package name */
        public float f40613d;

        /* renamed from: e  reason: collision with root package name */
        public float f40614e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f40615f;
        private int h;
        private final Paint i;
        private int j = -1;
        private int k = -1;
        private int l = -1;
        private ValueAnimator m;
        private int n = CommonTabLayout.this.b(27);
        private int o = Integer.MAX_VALUE;

        /* access modifiers changed from: package-private */
        public final float getIndicatorPosition() {
            return ((float) this.f40611b) + this.f40612c;
        }

        private void b() {
            int i2;
            if (PatchProxy.isSupport(new Object[0], this, f40610a, false, 34049, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40610a, false, 34049, new Class[0], Void.TYPE);
                return;
            }
            View childAt = getChildAt(this.f40611b);
            int i3 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f40612c > 0.0f && this.f40611b < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f40611b + 1);
                    i3 = (int) ((this.f40612c * ((float) childAt2.getLeft())) + ((1.0f - this.f40612c) * ((float) i3)));
                    i2 = (int) ((this.f40612c * ((float) childAt2.getRight())) + ((1.0f - this.f40612c) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f40610a, false, 34044, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40610a, false, 34044, new Class[0], Boolean.TYPE)).booleanValue();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        public final void onRtlPropertiesChanged(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40610a, false, 34046, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40610a, false, 34046, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.j != i2) {
                requestLayout();
                this.j = i2;
            }
        }

        /* access modifiers changed from: package-private */
        public final void setSelectedIndicatorColor(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40610a, false, 34042, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40610a, false, 34042, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.i.getColor() != i2) {
                this.i.setColor(i2);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setSelectedIndicatorHeight(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40610a, false, 34043, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40610a, false, 34043, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.h != i2) {
                this.h = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void draw(Canvas canvas) {
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f40610a, false, 34052, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f40610a, false, 34052, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            super.draw(canvas);
            if (this.k >= 0 && this.l > this.k) {
                View childAt = getChildAt(CommonTabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(C0906R.id.ba7);
                    if (findViewById != null) {
                        if (CommonTabLayout.this.q == null || !this.f40615f) {
                            this.f40613d = (float) (this.k + (((this.l - this.k) - findViewById.getWidth()) / 2));
                            this.f40614e = this.f40613d + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f40613d, (float) (getHeight() - this.h), this.f40614e, (float) getHeight(), this.i);
                        return;
                    }
                }
                canvas.drawRect((float) this.k, (float) (getHeight() - this.h), (float) this.l, (float) getHeight(), this.i);
            }
        }

        d(Context context) {
            super(context);
            setWillNotDraw(false);
            this.i = new Paint();
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, float f2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f40610a, false, 34045, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f40610a, false, 34045, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (this.m != null && this.m.isRunning()) {
                this.m.cancel();
            }
            this.f40611b = i2;
            this.f40612c = f2;
            b();
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40610a, false, 34050, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40610a, false, 34050, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!(i2 == this.k && i3 == this.l)) {
                this.k = i2;
                this.l = i3;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(final int i2, int i3) {
            final int i4;
            final int i5;
            int i6;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40610a, false, 34051, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40610a, false, 34051, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.m != null && this.m.isRunning()) {
                this.m.cancel();
            }
            if (ViewCompat.getLayoutDirection(this) == 1) {
                z = true;
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                b();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i2 - this.f40611b) <= 1) {
                i5 = this.k;
                i4 = this.l;
            } else {
                int b2 = CommonTabLayout.this.b(24);
                if (i2 < this.f40611b) {
                    if (!z) {
                        i6 = b2 + right;
                    }
                    i6 = left - b2;
                } else {
                    if (z) {
                        i6 = b2 + right;
                    }
                    i6 = left - b2;
                }
                i5 = i6;
                i4 = i5;
            }
            if (!(i5 == left && i4 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.m = valueAnimator;
                valueAnimator.setInterpolator(a.f40640c);
                valueAnimator.setDuration((long) i3);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                AnonymousClass1 r0 = new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f40616a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f40616a, false, 34053, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f40616a, false, 34053, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        d.this.a(a.a(i5, left, animatedFraction), a.a(i4, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r0);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        d.this.f40611b = i2;
                        d.this.f40612c = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        public final void onMeasure(int i2, int i3) {
            boolean z;
            boolean z2;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40610a, false, 34047, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f40610a, false, 34047, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                int childCount = getChildCount();
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() == 0) {
                        i5 = Math.max(i5, childAt.getMeasuredWidth());
                        this.o = Math.min(this.o, childAt.getMeasuredWidth());
                    }
                }
                if (CommonTabLayout.this.n == 1 && CommonTabLayout.this.m == 1) {
                    if (i5 > 0) {
                        if (i5 * childCount <= getMeasuredWidth() - (CommonTabLayout.this.b(16) * 2)) {
                            z2 = false;
                            while (i4 < childCount) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                if (layoutParams.width != i5 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i5;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                                i4++;
                            }
                        } else {
                            CommonTabLayout.this.m = 0;
                            CommonTabLayout.this.a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i2, i3);
                        }
                    }
                } else if (CommonTabLayout.this.n == 0 && CommonTabLayout.this.p && CommonTabLayout.this.t == getResources().getConfiguration().orientation && i5 > 0) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getVisibility() != 8) {
                            i7 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i7 > 0) {
                        int measuredWidth = (CommonTabLayout.this.getMeasuredWidth() - CommonTabLayout.this.f40580b.getPaddingLeft()) - CommonTabLayout.this.f40580b.getPaddingRight();
                        if (i7 < measuredWidth) {
                            if (i5 * childCount < measuredWidth) {
                                z = false;
                                for (int i9 = 0; i9 < childCount; i9++) {
                                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i9).getLayoutParams();
                                    if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                                        layoutParams2.width = 0;
                                        layoutParams2.weight = 1.0f;
                                        z = true;
                                    }
                                }
                            } else {
                                int i10 = (measuredWidth - i7) / (childCount * 2);
                                z = false;
                                while (i4 < childCount) {
                                    if (getChildAt(i4).getVisibility() != 8) {
                                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                        layoutParams3.leftMargin = i10;
                                        layoutParams3.rightMargin = i10;
                                        z = true;
                                    }
                                    i4++;
                                }
                            }
                            if (z) {
                                super.onMeasure(i2, i3);
                            }
                        }
                    }
                }
            }
        }

        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40610a, false, 34048, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f40610a, false, 34048, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onLayout(z, i2, i3, i4, i5);
            if (this.m == null || !this.m.isRunning()) {
                b();
                return;
            }
            this.m.cancel();
            b(this.f40611b, Math.round((1.0f - this.m.getAnimatedFraction()) * ((float) this.m.getDuration())));
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40624a;

        /* renamed from: b  reason: collision with root package name */
        public Object f40625b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f40626c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f40627d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f40628e;

        /* renamed from: f  reason: collision with root package name */
        public int f40629f = -1;
        public View g;
        CommonTabLayout h;
        public f i;

        e() {
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f40624a, false, 34064, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40624a, false, 34064, new Class[0], Void.TYPE);
                return;
            }
            if (this.i != null) {
                this.i.a();
            }
        }

        public final boolean b() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f40624a, false, 34061, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40624a, false, 34061, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.h != null) {
                if (this.h.getSelectedTabPosition() == this.f40629f) {
                    z = true;
                }
                return z;
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f40624a, false, 34060, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40624a, false, 34060, new Class[0], Void.TYPE);
            } else if (this.h != null) {
                this.h.a(this);
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        public final e a(@Nullable Object obj) {
            this.f40625b = obj;
            return this;
        }

        @NonNull
        private e a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40624a, false, 34054, new Class[]{View.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{view}, this, f40624a, false, 34054, new Class[]{View.class}, e.class);
            }
            this.g = view;
            c();
            return this;
        }

        @NonNull
        public final e a(@LayoutRes int i2) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40624a, false, 34055, new Class[]{Integer.TYPE}, e.class)) {
                return a(LayoutInflater.from(this.i.getContext()).inflate(i2, this.i, false));
            }
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40624a, false, 34055, new Class[]{Integer.TYPE}, e.class);
        }

        @NonNull
        public final e a(@Nullable CharSequence charSequence) {
            if (PatchProxy.isSupport(new Object[]{charSequence}, this, f40624a, false, 34058, new Class[]{CharSequence.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{charSequence}, this, f40624a, false, 34058, new Class[]{CharSequence.class}, e.class);
            }
            this.f40627d = charSequence;
            c();
            return this;
        }
    }

    public class f extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40630a;

        /* renamed from: c  reason: collision with root package name */
        private e f40632c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f40633d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f40634e;

        /* renamed from: f  reason: collision with root package name */
        private View f40635f;
        private TextView g;
        private ImageView h;
        private int i = 2;

        public e getTab() {
            return this.f40632c;
        }

        public TextView getTextView() {
            return this.f40633d;
        }

        public boolean performClick() {
            if (PatchProxy.isSupport(new Object[0], this, f40630a, false, 34073, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40630a, false, 34073, new Class[0], Boolean.TYPE)).booleanValue();
            }
            boolean performClick = super.performClick();
            if (this.f40632c == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (CommonTabLayout.this.s != null) {
                CommonTabLayout.this.s.a(this.f40632c);
            } else {
                this.f40632c.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            View view;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f40630a, false, 34081, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40630a, false, 34081, new Class[0], Void.TYPE);
                return;
            }
            e eVar = this.f40632c;
            if (eVar != null) {
                view = eVar.g;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f40635f = view;
                if (this.f40633d != null) {
                    this.f40633d.setVisibility(8);
                }
                if (this.f40634e != null) {
                    this.f40634e.setVisibility(8);
                    this.f40634e.setImageDrawable(null);
                }
                this.g = (TextView) view.findViewById(16908308);
                if (this.g != null) {
                    this.i = TextViewCompat.getMaxLines(this.g);
                }
                this.h = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f40635f != null) {
                    removeView(this.f40635f);
                    this.f40635f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f40635f == null) {
                if (this.f40634e == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0906R.layout.i7, this, false);
                    addView(imageView, 0);
                    this.f40634e = imageView;
                }
                if (this.f40633d == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.i8, this, false);
                    addView(textView);
                    this.f40633d = textView;
                    this.i = TextViewCompat.getMaxLines(this.f40633d);
                }
                TextViewCompat.setTextAppearance(this.f40633d, CommonTabLayout.this.g);
                if (CommonTabLayout.this.h != null) {
                    this.f40633d.setTextColor(CommonTabLayout.this.h);
                }
                a(this.f40633d, this.f40634e);
            } else if (!(this.g == null && this.h == null)) {
                a(this.g, this.h);
            }
            if (eVar != null && eVar.b()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        public void setTab(@Nullable e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f40630a, false, 34078, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f40630a, false, 34078, new Class[]{e.class}, Void.TYPE);
                return;
            }
            if (eVar != this.f40632c) {
                this.f40632c = eVar;
                a();
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
            if (PatchProxy.isSupport(new Object[]{accessibilityEvent2}, this, f40630a, false, 34075, new Class[]{AccessibilityEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{accessibilityEvent2}, this, f40630a, false, 34075, new Class[]{AccessibilityEvent.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent2.setClassName(ActionBar.Tab.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            if (PatchProxy.isSupport(new Object[]{accessibilityNodeInfo2}, this, f40630a, false, 34076, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{accessibilityNodeInfo2}, this, f40630a, false, 34076, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo2.setClassName(ActionBar.Tab.class.getName());
        }

        public void setSelected(boolean z) {
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40630a, false, 34074, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40630a, false, 34074, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (isSelected() == z) {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f40633d != null) {
                this.f40633d.setSelected(z);
            }
            if (this.f40634e != null) {
                this.f40634e.setSelected(z);
            }
            if (this.f40635f != null) {
                this.f40635f.setSelected(z);
            }
        }

        public f(Context context) {
            super(context);
            if (CommonTabLayout.this.k != 0) {
                ViewCompat.setBackground(this, AppCompatResources.getDrawable(context, CommonTabLayout.this.k));
            }
            ViewCompat.setPaddingRelative(this, CommonTabLayout.this.f40581c, CommonTabLayout.this.f40582d, CommonTabLayout.this.f40583e, CommonTabLayout.this.f40584f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR));
        }

        /* access modifiers changed from: package-private */
        public final void a(@Nullable e eVar, boolean z) {
            if (PatchProxy.isSupport(new Object[]{eVar, (byte) 0}, this, f40630a, false, 34079, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, (byte) 0}, this, f40630a, false, 34079, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (eVar != this.f40632c) {
                this.f40632c = eVar;
            }
        }

        private void a(@Nullable TextView textView, @Nullable ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{textView, imageView}, this, f40630a, false, 34082, new Class[]{TextView.class, ImageView.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{textView, imageView}, this, f40630a, false, 34082, new Class[]{TextView.class, ImageView.class}, Void.TYPE);
                return;
            }
            CharSequence charSequence3 = null;
            if (this.f40632c != null) {
                drawable = this.f40632c.f40626c;
            } else {
                drawable = null;
            }
            if (this.f40632c != null) {
                charSequence = this.f40632c.f40627d;
            } else {
                charSequence = null;
            }
            if (this.f40632c != null) {
                charSequence2 = this.f40632c.f40628e;
            } else {
                charSequence2 = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i2 = CommonTabLayout.this.b(8);
                }
                if (i2 != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i2;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            TooltipCompat.setTooltipText(this, charSequence3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0162, code lost:
            if (r0 > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) goto L_0x0164;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r18, int r19) {
            /*
                r17 = this;
                r7 = r17
                r8 = r19
                r9 = 2
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r10 = 0
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r11 = 1
                r0[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f40630a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 34077(0x851d, float:4.7752E-41)
                r1 = r17
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0055
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r0[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f40630a
                r3 = 0
                r4 = 34077(0x851d, float:4.7752E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0055:
                int r0 = android.view.View.MeasureSpec.getSize(r18)
                int r1 = android.view.View.MeasureSpec.getMode(r18)
                com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r2 = com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x0075
                if (r1 == 0) goto L_0x0069
                if (r0 <= r2) goto L_0x0075
            L_0x0069:
                com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r0 = com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.this
                int r0 = r0.l
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                r12 = r0
                goto L_0x0077
            L_0x0075:
                r12 = r18
            L_0x0077:
                super.onMeasure(r12, r8)
                android.widget.TextView r0 = r7.f40633d
                if (r0 == 0) goto L_0x0174
                r17.getResources()
                com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r0 = com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.this
                float r0 = r0.i
                int r1 = r7.i
                android.widget.ImageView r2 = r7.f40634e
                if (r2 == 0) goto L_0x0096
                android.widget.ImageView r2 = r7.f40634e
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0096
                r13 = r0
                r14 = 1
                goto L_0x00a8
            L_0x0096:
                android.widget.TextView r2 = r7.f40633d
                if (r2 == 0) goto L_0x00a6
                android.widget.TextView r2 = r7.f40633d
                int r2 = r2.getLineCount()
                if (r2 <= r11) goto L_0x00a6
                com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r0 = com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.this
                float r0 = r0.j
            L_0x00a6:
                r13 = r0
                r14 = r1
            L_0x00a8:
                android.widget.TextView r0 = r7.f40633d
                float r0 = r0.getTextSize()
                android.widget.TextView r1 = r7.f40633d
                int r1 = r1.getLineCount()
                android.widget.TextView r2 = r7.f40633d
                int r2 = android.support.v4.widget.TextViewCompat.getMaxLines(r2)
                int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r3 != 0) goto L_0x00c2
                if (r2 < 0) goto L_0x0174
                if (r14 == r2) goto L_0x0174
            L_0x00c2:
                com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout r2 = com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.this
                int r2 = r2.n
                if (r2 != r11) goto L_0x0165
                int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0165
                if (r1 != r11) goto L_0x0165
                android.widget.TextView r0 = r7.f40633d
                android.text.Layout r15 = r0.getLayout()
                if (r15 == 0) goto L_0x0164
                r6 = 3
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r10] = r15
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0[r11] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r13)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f40630a
                r3 = 0
                r4 = 34083(0x8523, float:4.776E-41)
                java.lang.Class[] r5 = new java.lang.Class[r6]
                java.lang.Class<android.text.Layout> r1 = android.text.Layout.class
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r5[r9] = r1
                java.lang.Class r16 = java.lang.Float.TYPE
                r1 = r17
                r9 = 3
                r6 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0141
                java.lang.Object[] r0 = new java.lang.Object[r9]
                r0[r10] = r15
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0[r11] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r13)
                r2 = 2
                r0[r2] = r1
                com.meituan.robust.ChangeQuickRedirect r3 = f40630a
                r4 = 0
                r5 = 34083(0x8523, float:4.776E-41)
                java.lang.Class[] r6 = new java.lang.Class[r9]
                java.lang.Class<android.text.Layout> r1 = android.text.Layout.class
                r6[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r6[r11] = r1
                java.lang.Class r1 = java.lang.Float.TYPE
                r6[r2] = r1
                java.lang.Class r9 = java.lang.Float.TYPE
                r1 = r17
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r6
                r6 = r9
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.Float r0 = (java.lang.Float) r0
                float r0 = r0.floatValue()
                goto L_0x0151
            L_0x0141:
                float r0 = r15.getLineWidth(r10)
                android.text.TextPaint r1 = r15.getPaint()
                float r1 = r1.getTextSize()
                float r1 = r13 / r1
                float r0 = r0 * r1
            L_0x0151:
                int r1 = r17.getMeasuredWidth()
                int r2 = r17.getPaddingLeft()
                int r1 = r1 - r2
                int r2 = r17.getPaddingRight()
                int r1 = r1 - r2
                float r1 = (float) r1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 <= 0) goto L_0x0165
            L_0x0164:
                r11 = 0
            L_0x0165:
                if (r11 == 0) goto L_0x0174
                android.widget.TextView r0 = r7.f40633d
                r0.setTextSize(r10, r13)
                android.widget.TextView r0 = r7.f40633d
                r0.setMaxLines(r14)
                super.onMeasure(r12, r8)
            L_0x0174:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.f.onMeasure(int, int):void");
        }
    }

    public static class g implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40636a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager f40637b;

        public final void b(e eVar) {
        }

        public final void c(e eVar) {
        }

        public g(ViewPager viewPager) {
            this.f40637b = viewPager;
        }

        public final void a(e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f40636a, false, 34084, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f40636a, false, 34084, new Class[]{e.class}, Void.TYPE);
                return;
            }
            this.f40637b.setCurrentItem(eVar2.f40629f);
        }
    }

    public int getTabGravity() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public int getTabMaxWidth() {
        return this.l;
    }

    public int getTabMode() {
        return this.n;
    }

    @Nullable
    public ColorStateList getTabTextColors() {
        return this.h;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), 0, Integer.valueOf(i4), 0}, this, f40579a, false, 33976, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), 0, Integer.valueOf(i4), 0}, this, f40579a, false, 33976, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f40580b.setPadding(i2, 0, i4, 0);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int i3 = i2;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f40579a, false, 33980, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f40579a, false, 33980, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int round = Math.round(((float) i3) + f3);
        if (round >= 0 && round < this.f40580b.getChildCount()) {
            if (z3) {
                this.f40580b.a(i3, f3);
            }
            if (this.F != null && this.F.isRunning()) {
                this.F.cancel();
            }
            scrollTo(a(i2, f2), 0);
            if (z2) {
                setSelectedTabView(round);
            }
        }
    }

    private void a(@NonNull e eVar, int i2, boolean z2) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40579a, false, 33985, new Class[]{e.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i2), Byte.valueOf(z2)}, this, f40579a, false, 33985, new Class[]{e.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (eVar2.h == this) {
            a(eVar, i2);
            b(eVar);
            if (z2) {
                eVar.a();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
    }

    private void a(@NonNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f40579a, false, 33986, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f40579a, false, 33986, new Class[]{c.class}, Void.TYPE);
            return;
        }
        e c2 = c(0);
        if (cVar2.f40650a != null) {
            c2.a(cVar2.f40650a);
        }
        if (cVar2.f40651b != null) {
            Drawable drawable = cVar2.f40651b;
            if (PatchProxy.isSupport(new Object[]{drawable}, c2, e.f40624a, false, 34056, new Class[]{Drawable.class}, e.class)) {
                e eVar = c2;
                e eVar2 = (e) PatchProxy.accessDispatch(new Object[]{drawable}, eVar, e.f40624a, false, 34056, new Class[]{Drawable.class}, e.class);
            } else {
                c2.f40626c = drawable;
                c2.c();
            }
        }
        if (cVar2.f40652c != 0) {
            c2.a(cVar2.f40652c);
        }
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            CharSequence contentDescription = cVar.getContentDescription();
            if (PatchProxy.isSupport(new Object[]{contentDescription}, c2, e.f40624a, false, 34063, new Class[]{CharSequence.class}, e.class)) {
                e eVar3 = c2;
                e eVar4 = (e) PatchProxy.accessDispatch(new Object[]{contentDescription}, eVar3, e.f40624a, false, 34063, new Class[]{CharSequence.class}, e.class);
            } else {
                c2.f40628e = contentDescription;
                c2.c();
            }
        }
        e eVar5 = c2;
        if (PatchProxy.isSupport(new Object[]{c2}, this, f40579a, false, 33982, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar5}, this, f40579a, false, 33982, new Class[]{e.class}, Void.TYPE);
            return;
        }
        b(eVar5, this.v.isEmpty());
    }

    public final void a(@NonNull b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f40579a, false, 33987, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f40579a, false, 33987, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (!this.D.contains(bVar)) {
            this.D.add(bVar);
        }
    }

    @Nullable
    public final e a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33992, new Class[]{Integer.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33992, new Class[]{Integer.TYPE}, e.class);
        } else if (i3 >= 0 && i3 < getTabCount()) {
            return this.v.get(i3);
        } else {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@Nullable PagerAdapter pagerAdapter, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{pagerAdapter, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40579a, false, 34007, new Class[]{PagerAdapter.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter, Byte.valueOf(z2)}, this, f40579a, false, 34007, new Class[]{PagerAdapter.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (!(this.G == null || this.H == null)) {
            this.G.unregisterDataSetObserver(this.H);
        }
        this.G = pagerAdapter;
        if (z2 && pagerAdapter != null) {
            if (this.H == null) {
                this.H = new c();
            }
            pagerAdapter.registerDataSetObserver(this.H);
        }
        a();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34008, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34008, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 33995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 33995, new Class[0], Void.TYPE);
        } else {
            for (int childCount = this.f40580b.getChildCount() - 1; childCount >= 0; childCount--) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(childCount)}, this, f40579a, false, 34021, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(childCount)}, this, f40579a, false, 34021, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    f fVar = (f) this.f40580b.getChildAt(childCount);
                    this.f40580b.removeViewAt(childCount);
                    if (fVar != null) {
                        if (PatchProxy.isSupport(new Object[0], fVar, f.f40630a, false, 34080, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], fVar, f.f40630a, false, 34080, new Class[0], Void.TYPE);
                        } else {
                            fVar.setTab(null);
                            fVar.setSelected(false);
                        }
                        this.M.release(fVar);
                    }
                    requestLayout();
                }
            }
            Iterator<e> it2 = this.v.iterator();
            while (it2.hasNext()) {
                e next = it2.next();
                it2.remove();
                next.h = null;
                next.i = null;
                next.f40625b = null;
                next.f40626c = null;
                next.f40627d = null;
                next.f40628e = null;
                next.f40629f = -1;
                next.g = null;
                u.release(next);
            }
            this.w = null;
        }
        if (this.G != null) {
            int count = this.G.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                b(c(this.o).a(this.G.getPageTitle(i2)), false);
            }
            if (this.q != null && count > 0) {
                int currentItem = this.q.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    a(a(currentItem));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f40579a, false, 34026, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f40579a, false, 34026, new Class[]{e.class}, Void.TYPE);
            return;
        }
        a(eVar2, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(e eVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40579a, false, 34027, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z2)}, this, f40579a, false, 34027, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        e eVar2 = this.w;
        if (eVar2 != eVar) {
            int i2 = eVar != null ? eVar.f40629f : -1;
            if (z2) {
                if ((eVar2 == null || eVar2.f40629f == -1) && i2 != -1) {
                    a(i2, 0.0f, true);
                } else {
                    d(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (eVar2 != null) {
                d(eVar2);
            }
            this.w = eVar;
            if (eVar != null) {
                c(eVar);
            }
        } else if (eVar2 != null) {
            e(eVar);
            d(eVar.f40629f);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40579a, false, 34033, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f40579a, false, 34033, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < this.f40580b.getChildCount(); i2++) {
            View childAt = this.f40580b.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    public int getSelectedTabPosition() {
        if (this.w != null) {
            return this.w.f40629f;
        }
        return -1;
    }

    private int getTabMinWidth() {
        if (this.y != -1) {
            return this.y;
        }
        if (this.n == 0) {
            return this.A;
        }
        return 0;
    }

    private LinearLayout.LayoutParams d() {
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34018, new Class[0], LinearLayout.LayoutParams.class)) {
            return (LinearLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34018, new Class[0], LinearLayout.LayoutParams.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f40579a, false, 33981, new Class[0], Float.TYPE)) {
            return this.f40580b.getIndicatorPosition();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 33981, new Class[0], Float.TYPE)).floatValue();
    }

    public int getTabCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f40579a, false, 33991, new Class[0], Integer.TYPE)) {
            return this.v.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 33991, new Class[0], Integer.TYPE)).intValue();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34004, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34004, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34005, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34005, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        if (this.J) {
            setupWithViewPager(null);
            this.J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34003, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34003, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getTabScrollRange() > 0) {
            z2 = true;
        }
        return z2;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34023, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34023, new Class[0], Void.TYPE);
            return;
        }
        if (this.F == null) {
            this.F = new ValueAnimator();
            this.F.setInterpolator(a.f40640c);
            this.F.setDuration(300);
            this.F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40585a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f40585a, false, 34038, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f40585a, false, 34038, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    CommonTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private void f() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34032, new Class[0], Void.TYPE);
            return;
        }
        if (this.n == 0) {
            i2 = Math.max(0, this.B - this.f40581c);
        } else {
            i2 = 0;
        }
        ViewCompat.setPaddingRelative(this.f40580b, i2, 0, 0, 0);
        switch (this.n) {
            case 0:
                this.f40580b.setGravity(8388611);
                break;
            case 1:
                this.f40580b.setGravity(1);
                break;
        }
        a(true);
    }

    private int getDefaultHeight() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34035, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34035, new Class[0], Integer.TYPE)).intValue();
        }
        int size = this.v.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            e eVar = this.v.get(i2);
            if (eVar != null && eVar.f40626c != null && !TextUtils.isEmpty(eVar.f40627d)) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            return 72;
        }
        return 48;
    }

    private int getTabScrollRange() {
        if (!PatchProxy.isSupport(new Object[0], this, f40579a, false, 34006, new Class[0], Integer.TYPE)) {
            return Math.max(0, ((this.f40580b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34006, new Class[0], Integer.TYPE)).intValue();
    }

    private f c() {
        f fVar;
        if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34010, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34010, new Class[0], f.class);
        }
        if (this.M != null) {
            fVar = (f) this.M.acquire();
        } else {
            fVar = null;
        }
        if (fVar == null) {
            fVar = new f(getContext());
        }
        fVar.setFocusable(true);
        fVar.setMinimumWidth(getTabMinWidth());
        return fVar;
    }

    public void setAutoFillWhenScrollable(boolean z2) {
        this.p = z2;
    }

    public void setCustomTabViewResId(int i2) {
        this.o = i2;
    }

    public void setOnTabClickListener(a aVar) {
        this.s = aVar;
    }

    public CommonTabLayout(Context context) {
        this(context, null);
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    @Deprecated
    public void setOnTabSelectedListener(@Nullable b bVar) {
        if (this.C != null) {
            b(this.C);
        }
        this.C = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    private void a(LinearLayout.LayoutParams layoutParams) {
        if (this.n == 1 && this.m == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.x != 0) {
            layoutParams.leftMargin = this.x;
            layoutParams.rightMargin = this.x;
        }
    }

    private void b(@NonNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f40579a, false, 33988, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f40579a, false, 33988, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.D.remove(bVar2);
    }

    public void addView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f40579a, false, 34013, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40579a, false, 34013, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (!PatchProxy.isSupport(new Object[]{attributeSet}, this, f40579a, false, 34036, new Class[]{AttributeSet.class}, FrameLayout.LayoutParams.class)) {
            return generateDefaultLayoutParams();
        }
        return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f40579a, false, 34036, new Class[]{AttributeSet.class}, FrameLayout.LayoutParams.class);
    }

    private void b(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f40579a, false, 34012, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f40579a, false, 34012, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f40580b.addView(eVar2.i, eVar2.f40629f, d());
    }

    @NonNull
    private e c(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33990, new Class[]{Integer.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33990, new Class[]{Integer.TYPE}, e.class);
        }
        e eVar = (e) u.acquire();
        if (eVar == null) {
            eVar = new e();
        }
        e eVar2 = eVar;
        eVar2.h = this;
        eVar2.i = c();
        if (i3 > 0) {
            eVar2.i.a(eVar2, false);
            eVar2.a(i3);
        } else {
            eVar2.i.setTab(eVar2);
        }
        return eVar2;
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 34022, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 34022, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.f40580b.a()) {
                a(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a2 = a(i2, 0.0f);
            if (scrollX != a2) {
                e();
                this.F.setIntValues(new int[]{scrollX, a2});
                this.F.start();
            }
            this.f40580b.b(i2, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
        }
    }

    private void setSelectedTabView(int i2) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 34025, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 34025, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = this.f40580b.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f40580b.getChildAt(i3);
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        Animator.AnimatorListener animatorListener2 = animatorListener;
        if (PatchProxy.isSupport(new Object[]{animatorListener2}, this, f40579a, false, 34024, new Class[]{Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatorListener2}, this, f40579a, false, 34024, new Class[]{Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        e();
        this.F.addListener(animatorListener2);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33977, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33977, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f40580b.setSelectedIndicatorColor(i2);
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33978, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33978, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f40580b.setSelectedIndicatorHeight(i2);
    }

    public void setTabGravity(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33997, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33997, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m != i2) {
            this.m = i2;
            f();
        }
    }

    public void setTabMargin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33975, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33975, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = b(i2);
        for (int i3 = 0; i3 < getTabCount(); i3++) {
            View childAt = this.f40580b.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = b(i2);
            marginLayoutParams.rightMargin = b(i2);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMode(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33996, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 33996, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != this.n) {
            this.n = i2;
            f();
        }
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (PatchProxy.isSupport(new Object[]{colorStateList}, this, f40579a, false, 33998, new Class[]{ColorStateList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorStateList}, this, f40579a, false, 33998, new Class[]{ColorStateList.class}, Void.TYPE);
            return;
        }
        if (this.h != colorStateList) {
            this.h = colorStateList;
            if (PatchProxy.isSupport(new Object[0], this, f40579a, false, 34009, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40579a, false, 34009, new Class[0], Void.TYPE);
                return;
            }
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).c();
            }
        }
    }

    private void d(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f40579a, false, 34029, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f40579a, false, 34029, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).b(eVar);
        }
    }

    private void e(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f40579a, false, 34030, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f40579a, false, 34030, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).c(eVar);
        }
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f40579a, false, 34000, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f40579a, false, 34000, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{viewPager2, (byte) 1}, this, f40579a, false, 34001, new Class[]{ViewPager.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, (byte) 1}, this, f40579a, false, 34001, new Class[]{ViewPager.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(viewPager2, true, false);
    }

    private void c(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f40579a, false, 34028, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f40579a, false, 34028, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).a(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 34019, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40579a, false, 34019, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f40579a, false, 34017, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f40579a, false, 34017, new Class[]{View.class}, Void.TYPE);
        } else if (view2 instanceof c) {
            a((c) view2);
        } else {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void addView(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f40579a, false, 34014, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f40579a, false, 34014, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(view);
    }

    private int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f40579a, false, 34031, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f40579a, false, 34031, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.n != 0) {
            return 0;
        } else {
            View childAt = this.f40580b.getChildAt(i2);
            int i5 = i2 + 1;
            if (i5 < this.f40580b.getChildCount()) {
                view = this.f40580b.getChildAt(i5);
            } else {
                view = null;
            }
            if (childAt != null) {
                i3 = childAt.getWidth();
            } else {
                i3 = 0;
            }
            if (view != null) {
                i4 = view.getWidth();
            }
            int left = (childAt.getLeft() + (i3 / 2)) - (getWidth() / 2);
            int i6 = (int) (((float) (i3 + i4 + (this.x * 4))) * 0.5f * f2);
            if (ViewCompat.getLayoutDirection(this) == 0) {
                return left + i6;
            }
            return left - i6;
        }
    }

    private void b(@NonNull e eVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40579a, false, 33984, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z2)}, this, f40579a, false, 33984, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(eVar, this.v.size(), z2);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40579a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34020(0x84e4, float:4.7672E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f40579a
            r3 = 0
            r4 = 34020(0x84e4, float:4.7672E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            int r0 = r10.getDefaultHeight()
            int r0 = r10.b((int) r0)
            int r1 = r10.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r10.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r12)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0074
            if (r1 == 0) goto L_0x006f
            r0 = r12
            goto L_0x0080
        L_0x006f:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0080
        L_0x0074:
            int r1 = android.view.View.MeasureSpec.getSize(r12)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
        L_0x0080:
            int r1 = android.view.View.MeasureSpec.getSize(r11)
            int r2 = android.view.View.MeasureSpec.getMode(r11)
            if (r2 == 0) goto L_0x009a
            int r2 = r10.z
            if (r2 <= 0) goto L_0x0091
            int r1 = r10.z
            goto L_0x0098
        L_0x0091:
            r2 = 56
            int r2 = r10.b((int) r2)
            int r1 = r1 - r2
        L_0x0098:
            r10.l = r1
        L_0x009a:
            super.onMeasure(r11, r0)
            int r1 = r10.getChildCount()
            if (r1 != r9) goto L_0x00e4
            android.view.View r1 = r10.getChildAt(r8)
            int r2 = r10.n
            switch(r2) {
                case 0: goto L_0x00b9;
                case 1: goto L_0x00ad;
                default: goto L_0x00ac;
            }
        L_0x00ac:
            goto L_0x00c4
        L_0x00ad:
            int r2 = r1.getMeasuredWidth()
            int r4 = r10.getMeasuredWidth()
            if (r2 == r4) goto L_0x00c4
        L_0x00b7:
            r8 = 1
            goto L_0x00c4
        L_0x00b9:
            int r2 = r1.getMeasuredWidth()
            int r4 = r10.getMeasuredWidth()
            if (r2 >= r4) goto L_0x00c4
            goto L_0x00b7
        L_0x00c4:
            if (r8 == 0) goto L_0x00e4
            int r2 = r10.getPaddingTop()
            int r4 = r10.getPaddingBottom()
            int r2 = r2 + r4
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            int r4 = r4.height
            int r0 = getChildMeasureSpec(r0, r2, r4)
            int r2 = r10.getMeasuredWidth()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            r1.measure(r2, r0)
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.onMeasure(int, int):void");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.isSupport(new Object[]{view, layoutParams}, this, f40579a, false, 34015, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, layoutParams}, this, f40579a, false, 34015, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        a(view);
    }

    private void a(e eVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i2)}, this, f40579a, false, 34011, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i2)}, this, f40579a, false, 34011, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        eVar.f40629f = i2;
        this.v.add(i2, eVar);
        int size = this.v.size();
        for (int i3 = i2 + 1; i3 < size; i3++) {
            this.v.get(i3).f40629f = i3;
        }
    }

    private void a(int i2, float f2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(0.0f), (byte) 1}, this, f40579a, false, 33979, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(0.0f), (byte) 1}, this, f40579a, false, 33979, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, 0.0f, true, true);
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), layoutParams}, this, f40579a, false, 34016, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), layoutParams}, this, f40579a, false, 34016, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        a(view);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonTabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ColorStateList colorStateList;
        Context context2 = context;
        this.v = new ArrayList<>();
        this.l = Integer.MAX_VALUE;
        this.D = new ArrayList<>();
        this.M = new Pools.SimplePool(12);
        if (PatchProxy.isSupport(new Object[]{context2}, null, d.f40653a, true, 34085, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, d.f40653a, true, 34085, new Class[]{Context.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(d.f40654b);
            boolean z2 = !obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            if (z2) {
                throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
            }
        }
        setHorizontalScrollBarEnabled(false);
        this.f40580b = new d(context2);
        super.addView(this.f40580b, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i2, C0906R.style.p4);
        this.f40580b.setSelectedIndicatorHeight(obtainStyledAttributes2.getDimensionPixelSize(10, 0));
        this.f40580b.setSelectedIndicatorColor(obtainStyledAttributes2.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, 0);
        this.f40581c = dimensionPixelSize;
        this.f40582d = dimensionPixelSize;
        this.f40583e = dimensionPixelSize;
        this.f40584f = dimensionPixelSize;
        this.f40581c = obtainStyledAttributes2.getDimensionPixelSize(18, this.f40581c);
        this.f40582d = obtainStyledAttributes2.getDimensionPixelSize(19, this.f40582d);
        this.f40583e = obtainStyledAttributes2.getDimensionPixelSize(17, this.f40583e);
        this.f40584f = obtainStyledAttributes2.getDimensionPixelSize(16, this.f40584f);
        this.g = obtainStyledAttributes2.getResourceId(22, C0906R.style.jy);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(this.g, android.support.v7.appcompat.R$styleable.TextAppearance);
        try {
            this.i = (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0);
            this.h = obtainStyledAttributes3.getColorStateList(3);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes2.hasValue(23)) {
                this.h = obtainStyledAttributes2.getColorStateList(23);
            }
            if (obtainStyledAttributes2.hasValue(21)) {
                int color = obtainStyledAttributes2.getColor(21, 0);
                int defaultColor = this.h.getDefaultColor();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(defaultColor), Integer.valueOf(color)}, null, f40579a, true, 34034, new Class[]{Integer.TYPE, Integer.TYPE}, ColorStateList.class)) {
                    colorStateList = (ColorStateList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(defaultColor), Integer.valueOf(color)}, null, f40579a, true, 34034, new Class[]{Integer.TYPE, Integer.TYPE}, ColorStateList.class);
                } else {
                    colorStateList = new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{color, defaultColor});
                }
                this.h = colorStateList;
            }
            this.y = obtainStyledAttributes2.getDimensionPixelSize(13, -1);
            this.z = obtainStyledAttributes2.getDimensionPixelSize(12, -1);
            this.k = obtainStyledAttributes2.getResourceId(0, 0);
            this.B = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
            this.n = obtainStyledAttributes2.getInt(14, 1);
            this.m = obtainStyledAttributes2.getInt(2, 0);
            obtainStyledAttributes2.recycle();
            Resources resources = getResources();
            this.j = (float) resources.getDimensionPixelSize(C0906R.dimen.et);
            this.A = resources.getDimensionPixelSize(C0906R.dimen.er);
            this.K = UIUtils.dip2Px(getContext(), 1.5f);
            this.L = UIUtils.dip2Px(getContext(), 1.5f);
            this.t = getResources().getConfiguration().orientation;
            f();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    private void a(@Nullable ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = viewPager;
        boolean z4 = z2;
        if (PatchProxy.isSupport(new Object[]{viewPager2, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f40579a, false, 34002, new Class[]{ViewPager.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, Byte.valueOf(z2), Byte.valueOf(z3)}, this, f40579a, false, 34002, new Class[]{ViewPager.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.q != null) {
            if (this.r != null) {
                this.q.removeOnPageChangeListener(this.r);
            }
            if (this.I != null) {
                this.q.removeOnAdapterChangeListener(this.I);
            }
        }
        if (this.E != null) {
            b(this.E);
            this.E = null;
        }
        if (viewPager2 != null) {
            this.q = viewPager2;
            if (this.r == null) {
                this.r = new TabLayoutOnPageChangeListener(this);
            }
            this.r.a();
            viewPager.addOnPageChangeListener(this.r);
            this.E = new g(viewPager);
            a(this.E);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z4);
            }
            if (this.I == null) {
                this.I = new AdapterChangeListener();
            }
            this.I.f40588b = z4;
            viewPager.addOnAdapterChangeListener(this.I);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.q = null;
            a((PagerAdapter) null, false);
        }
        this.J = z3;
    }

    public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f40579a, false, 34037, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return super.overScrollBy(i2, i3, i4, i5, i6, i7, 80, i9, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Byte.valueOf(z2)}, this, f40579a, false, 34037, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
