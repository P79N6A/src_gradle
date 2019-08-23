package com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

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
public class TabLayout extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70350a;
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
    private boolean M;
    private int N;
    private boolean O;
    private final Pools.Pool<f> P;

    /* renamed from: b  reason: collision with root package name */
    public d f70351b;

    /* renamed from: c  reason: collision with root package name */
    int f70352c;

    /* renamed from: d  reason: collision with root package name */
    int f70353d;

    /* renamed from: e  reason: collision with root package name */
    int f70354e;

    /* renamed from: f  reason: collision with root package name */
    int f70355f;
    int g;
    ColorStateList h;
    float i;
    float j;
    final int k;
    int l;
    int m;
    int n;
    boolean o;
    ViewPager p;
    TabLayoutOnPageChangeListener q;
    public boolean r;
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
        public static ChangeQuickRedirect f70358a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f70359b;

        AdapterChangeListener() {
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            ViewPager viewPager2 = viewPager;
            PagerAdapter pagerAdapter3 = pagerAdapter2;
            if (PatchProxy.isSupport(new Object[]{viewPager2, pagerAdapter, pagerAdapter3}, this, f70358a, false, 80047, new Class[]{ViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewPager2, pagerAdapter, pagerAdapter3}, this, f70358a, false, 80047, new Class[]{ViewPager.class, PagerAdapter.class, PagerAdapter.class}, Void.TYPE);
                return;
            }
            if (TabLayout.this.p == viewPager2) {
                TabLayout.this.a(pagerAdapter3, this.f70359b);
            }
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70361a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<TabLayout> f70362b;

        /* renamed from: c  reason: collision with root package name */
        private int f70363c;

        /* renamed from: d  reason: collision with root package name */
        private int f70364d;

        /* renamed from: e  reason: collision with root package name */
        private int f70365e;

        /* renamed from: f  reason: collision with root package name */
        private int f70366f;
        private ArgbEvaluator g = new ArgbEvaluator();
        private AccelerateInterpolator h = new AccelerateInterpolator();
        private DecelerateInterpolator i = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f70364d = 0;
            this.f70363c = 0;
        }

        public void onPageScrollStateChanged(int i2) {
            this.f70363c = this.f70364d;
            this.f70364d = i2;
        }

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f70362b = new WeakReference<>(tabLayout);
            this.f70366f = tabLayout.getTabTextColors().getColorForState(TabLayout.SELECTED_STATE_SET, 0);
            this.f70365e = tabLayout.getTabTextColors().getDefaultColor();
        }

        public void onPageSelected(int i2) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70361a, false, 80075, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70361a, false, 80075, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            TabLayout tabLayout = (TabLayout) this.f70362b.get();
            if (!(tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount())) {
                if (!(this.f70364d == 0 || (this.f70364d == 2 && this.f70363c == 0))) {
                    z = false;
                }
                tabLayout.b(tabLayout.a(i2), z);
            }
        }

        private void a(@Nullable ImageView imageView, @Nullable TextView textView, @ColorInt int i2) {
            ImageView imageView2 = imageView;
            if (PatchProxy.isSupport(new Object[]{imageView2, textView, Integer.valueOf(i2)}, this, f70361a, false, 80074, new Class[]{ImageView.class, TextView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{imageView2, textView, Integer.valueOf(i2)}, this, f70361a, false, 80074, new Class[]{ImageView.class, TextView.class, Integer.TYPE}, Void.TYPE);
            } else if (imageView2 != null && textView != null) {
                textView.setTextColor(i2);
                imageView2.setImageAlpha(Color.alpha(i2));
            }
        }

        public void onPageScrolled(int i2, float f2, int i3) {
            boolean z;
            boolean z2;
            float f3 = f2;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f70361a, false, 80073, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f70361a, false, 80073, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            TabLayout tabLayout = (TabLayout) this.f70362b.get();
            if (tabLayout != null) {
                if (this.f70364d != 2 || this.f70363c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f70364d == 2 && this.f70363c == 0) {
                    int i4 = i2;
                    z2 = false;
                } else {
                    int i5 = i2;
                    z2 = true;
                }
                tabLayout.a(i2, f3, z, z2);
                if (this.f70364d == 2 && this.f70363c == 0) {
                    tabLayout.f70351b.f70386f = false;
                } else {
                    tabLayout.f70351b.f70386f = true;
                    View childAt = tabLayout.f70351b.getChildAt(tabLayout.f70351b.f70382b);
                    View childAt2 = tabLayout.f70351b.getChildAt(tabLayout.f70351b.f70382b + 1);
                    if (!(childAt == null || childAt2 == null)) {
                        View findViewById = childAt.findViewById(C0906R.id.ba7);
                        View findViewById2 = childAt2.findViewById(C0906R.id.ba7);
                        if (!(findViewById == null || findViewById2 == null)) {
                            float left = (float) (childAt.getLeft() + ((childAt.getWidth() - findViewById.getWidth()) / 2));
                            float width = ((float) findViewById.getWidth()) + left;
                            float left2 = (float) (childAt2.getLeft() + ((childAt2.getWidth() - findViewById2.getWidth()) / 2));
                            float width2 = ((float) findViewById2.getWidth()) + left2;
                            a((ImageView) findViewById.findViewById(C0906R.id.cyw), (TextView) findViewById.findViewById(C0906R.id.cyx), ((Integer) this.g.evaluate(f3, Integer.valueOf(this.f70366f), Integer.valueOf(this.f70365e))).intValue());
                            a((ImageView) findViewById2.findViewById(C0906R.id.cyw), (TextView) findViewById2.findViewById(C0906R.id.cyx), ((Integer) this.g.evaluate(f3, Integer.valueOf(this.f70365e), Integer.valueOf(this.f70366f))).intValue());
                            tabLayout.f70351b.f70384d = left + ((left2 - left) * this.h.getInterpolation(f3));
                            tabLayout.f70351b.f70385e = width + ((width2 - width) * this.h.getInterpolation(f3));
                        }
                    }
                }
                ViewCompat.postInvalidateOnAnimation(tabLayout.f70351b);
            }
        }
    }

    public static class TabLayoutOnPageChangeListenerIndependent implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70367a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f70368b;

        /* renamed from: c  reason: collision with root package name */
        private final WeakReference<TabLayout> f70369c;

        /* renamed from: d  reason: collision with root package name */
        private int f70370d;

        /* renamed from: e  reason: collision with root package name */
        private int f70371e;

        /* renamed from: f  reason: collision with root package name */
        private int f70372f;

        public void onPageScrollStateChanged(int i) {
            this.f70370d = this.f70371e;
            this.f70371e = i;
        }

        public TabLayoutOnPageChangeListenerIndependent(TabLayout tabLayout) {
            this.f70369c = new WeakReference<>(tabLayout);
            this.f70368b = ViewCompat.getLayoutDirection(tabLayout) != 1 ? false : true;
        }

        public void onPageSelected(int i) {
            boolean z = true;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f70367a, false, 80077, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f70367a, false, 80077, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            TabLayout tabLayout = (TabLayout) this.f70369c.get();
            if (!(tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount())) {
                if (!(this.f70371e == 0 || (this.f70371e == 2 && this.f70370d == 0))) {
                    z = false;
                }
                tabLayout.b(tabLayout.a(i), z);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            boolean z;
            int i3 = i;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f70367a, false, 80076, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f70367a, false, 80076, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            TabLayout tabLayout = (TabLayout) this.f70369c.get();
            if (!(this.f70372f == i3 || tabLayout == null)) {
                if (this.f70371e != 2 || this.f70370d == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(this.f70371e == 2 && this.f70370d == 0)) {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i4 = i;
                c cVar = new c(this, this.f70372f, i4, tabLayout, z, z2);
                duration.addUpdateListener(cVar);
                this.f70372f = i3;
                final TabLayout tabLayout2 = tabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                AnonymousClass1 r0 = new Animator.AnimatorListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70373a;

                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f70373a, false, 80080, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f70373a, false, 80080, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        tabLayout2.a(i4, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (PatchProxy.isSupport(new Object[]{animator}, this, f70373a, false, 80079, new Class[]{Animator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{animator}, this, f70373a, false, 80079, new Class[]{Animator.class}, Void.TYPE);
                            return;
                        }
                        tabLayout2.a(i4, 0.0f, z3, z4);
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
        public static ChangeQuickRedirect f70379a;

        public final void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f70379a, false, 80048, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70379a, false, 80048, new Class[0], Void.TYPE);
                return;
            }
            TabLayout.this.c();
        }

        public final void onInvalidated() {
            if (PatchProxy.isSupport(new Object[0], this, f70379a, false, 80049, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70379a, false, 80049, new Class[0], Void.TYPE);
                return;
            }
            TabLayout.this.c();
        }

        c() {
        }
    }

    class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70381a;

        /* renamed from: b  reason: collision with root package name */
        int f70382b = -1;

        /* renamed from: c  reason: collision with root package name */
        float f70383c;

        /* renamed from: d  reason: collision with root package name */
        public float f70384d;

        /* renamed from: e  reason: collision with root package name */
        public float f70385e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f70386f;
        private int h;
        private final Paint i;
        private int j = -1;
        private int k = -1;
        private int l = -1;
        private ValueAnimator m;
        private int n = TabLayout.this.b(27);
        private int o = Integer.MAX_VALUE;

        /* access modifiers changed from: package-private */
        public final float getIndicatorPosition() {
            return ((float) this.f70382b) + this.f70383c;
        }

        private void b() {
            int i2;
            int i3;
            if (PatchProxy.isSupport(new Object[0], this, f70381a, false, 80057, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70381a, false, 80057, new Class[0], Void.TYPE);
                return;
            }
            View childAt = getChildAt(this.f70382b);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i3 = -1;
            } else {
                i2 = childAt.getLeft();
                i3 = childAt.getRight();
                if (this.f70383c > 0.0f && this.f70382b < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f70382b + 1);
                    i2 = (int) ((this.f70383c * ((float) childAt2.getLeft())) + ((1.0f - this.f70383c) * ((float) i2)));
                    i3 = (int) ((this.f70383c * ((float) childAt2.getRight())) + ((1.0f - this.f70383c) * ((float) i3)));
                }
            }
            a(i2, i3);
        }

        /* access modifiers changed from: package-private */
        public final boolean a() {
            if (PatchProxy.isSupport(new Object[0], this, f70381a, false, 80052, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70381a, false, 80052, new Class[0], Boolean.TYPE)).booleanValue();
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
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70381a, false, 80054, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70381a, false, 80054, new Class[]{Integer.TYPE}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70381a, false, 80050, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70381a, false, 80050, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.i.getColor() != i2) {
                this.i.setColor(i2);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void setSelectedIndicatorHeight(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70381a, false, 80051, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70381a, false, 80051, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            if (this.h != i2) {
                this.h = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void draw(Canvas canvas) {
            if (PatchProxy.isSupport(new Object[]{canvas}, this, f70381a, false, 80060, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas}, this, f70381a, false, 80060, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            super.draw(canvas);
            if (this.k >= 0 && this.l > this.k && !TabLayout.this.r) {
                View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(C0906R.id.ba7);
                    if (findViewById != null) {
                        if (TabLayout.this.p == null || !this.f70386f) {
                            this.f70384d = (float) (this.k + (((this.l - this.k) - findViewById.getWidth()) / 2));
                            this.f70385e = this.f70384d + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f70384d, (float) (getHeight() - this.h), this.f70385e, (float) getHeight(), this.i);
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
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f70381a, false, 80053, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f70381a, false, 80053, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            if (this.m != null && this.m.isRunning()) {
                this.m.cancel();
            }
            this.f70382b = i2;
            this.f70383c = f2;
            b();
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70381a, false, 80058, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70381a, false, 80058, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70381a, false, 80059, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70381a, false, 80059, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
            if (Math.abs(i2 - this.f70382b) <= 1) {
                i5 = this.k;
                i4 = this.l;
            } else {
                int b2 = TabLayout.this.b(24);
                if (i2 < this.f70382b) {
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
                valueAnimator.setInterpolator(a.f70411c);
                valueAnimator.setDuration((long) i3);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                AnonymousClass1 r0 = new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f70387a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f70387a, false, 80061, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f70387a, false, 80061, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        d.this.a(a.a(i5, left, animatedFraction), a.a(i4, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r0);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        d.this.f70382b = i2;
                        d.this.f70383c = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        public final void onMeasure(int i2, int i3) {
            boolean z;
            boolean z2;
            int i4 = 0;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70381a, false, 80055, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70381a, false, 80055, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
                if (TabLayout.this.n == 1 && TabLayout.this.m == 1) {
                    if (i5 > 0) {
                        if (i5 * childCount <= getMeasuredWidth() - (TabLayout.this.b(16) * 2)) {
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
                            TabLayout.this.m = 0;
                            TabLayout.this.a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i2, i3);
                        }
                    }
                } else if (TabLayout.this.n == 0 && TabLayout.this.o && TabLayout.this.t == getResources().getConfiguration().orientation && i5 > 0) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getVisibility() != 8) {
                            i7 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i7 > 0 && i7 < TabLayout.this.getMeasuredWidth()) {
                        int i9 = i5 * childCount;
                        if (i9 < TabLayout.this.getMeasuredWidth()) {
                            int measuredWidth = (TabLayout.this.getMeasuredWidth() - i9) / (childCount * 2);
                            z = false;
                            while (i4 < childCount) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                if (layoutParams2.width != i5 || layoutParams2.weight != 0.0f || layoutParams2.leftMargin != measuredWidth || layoutParams2.rightMargin != measuredWidth) {
                                    layoutParams2.width = i5;
                                    layoutParams2.weight = 0.0f;
                                    layoutParams2.leftMargin = measuredWidth;
                                    layoutParams2.rightMargin = measuredWidth;
                                    z = true;
                                }
                                i4++;
                            }
                        } else {
                            int measuredWidth2 = (TabLayout.this.getMeasuredWidth() - i7) / (childCount * 2);
                            boolean z3 = false;
                            while (i4 < childCount) {
                                if (getChildAt(i4).getVisibility() != 8) {
                                    LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                                    layoutParams3.leftMargin = measuredWidth2;
                                    layoutParams3.rightMargin = measuredWidth2;
                                    z3 = true;
                                }
                                i4++;
                            }
                            z = z3;
                        }
                        if (z) {
                            super.onMeasure(i2, i3);
                        }
                    }
                }
            }
        }

        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f70381a, false, 80056, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f70381a, false, 80056, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onLayout(z, i2, i3, i4, i5);
            if (this.m == null || !this.m.isRunning()) {
                b();
                return;
            }
            this.m.cancel();
            b(this.f70382b, Math.round((1.0f - this.m.getAnimatedFraction()) * ((float) this.m.getDuration())));
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70395a;

        /* renamed from: b  reason: collision with root package name */
        public Object f70396b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f70397c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f70398d;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f70399e;

        /* renamed from: f  reason: collision with root package name */
        public int f70400f = -1;
        public View g;
        TabLayout h;
        public f i;

        e() {
        }

        /* access modifiers changed from: package-private */
        public final void d() {
            this.h = null;
            this.i = null;
            this.f70396b = null;
            this.f70397c = null;
            this.f70398d = null;
            this.f70399e = null;
            this.f70400f = -1;
            this.g = null;
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f70395a, false, 80072, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70395a, false, 80072, new Class[0], Void.TYPE);
                return;
            }
            if (this.i != null) {
                this.i.b();
            }
        }

        public final boolean b() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f70395a, false, 80069, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70395a, false, 80069, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (this.h != null) {
                if (this.h.getSelectedTabPosition() == this.f70400f) {
                    z = true;
                }
                return z;
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f70395a, false, 80068, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70395a, false, 80068, new Class[0], Void.TYPE);
            } else if (this.h != null) {
                this.h.b(this);
            } else {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
        }

        @NonNull
        public final e a(@Nullable View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f70395a, false, 80062, new Class[]{View.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{view}, this, f70395a, false, 80062, new Class[]{View.class}, e.class);
            }
            this.g = view;
            c();
            return this;
        }

        @NonNull
        public final e a(@Nullable CharSequence charSequence) {
            if (PatchProxy.isSupport(new Object[]{charSequence}, this, f70395a, false, 80066, new Class[]{CharSequence.class}, e.class)) {
                return (e) PatchProxy.accessDispatch(new Object[]{charSequence}, this, f70395a, false, 80066, new Class[]{CharSequence.class}, e.class);
            }
            this.f70398d = charSequence;
            c();
            return this;
        }
    }

    public class f extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70401a;

        /* renamed from: c  reason: collision with root package name */
        private e f70403c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f70404d;

        /* renamed from: e  reason: collision with root package name */
        private ImageView f70405e;

        /* renamed from: f  reason: collision with root package name */
        private View f70406f;
        private TextView g;
        private ImageView h;
        private int i = 2;

        public e getTab() {
            return this.f70403c;
        }

        public TextView getTextView() {
            return this.f70404d;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f70401a, false, 80087, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70401a, false, 80087, new Class[0], Void.TYPE);
                return;
            }
            setTab(null);
            setSelected(false);
        }

        public boolean performClick() {
            if (PatchProxy.isSupport(new Object[0], this, f70401a, false, 80081, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70401a, false, 80081, new Class[0], Boolean.TYPE)).booleanValue();
            }
            boolean performClick = super.performClick();
            if (this.f70403c == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (TabLayout.this.s != null) {
                TabLayout.this.s.a(this.f70403c);
            } else {
                this.f70403c.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            View view;
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f70401a, false, 80088, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70401a, false, 80088, new Class[0], Void.TYPE);
                return;
            }
            e eVar = this.f70403c;
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
                this.f70406f = view;
                if (this.f70404d != null) {
                    this.f70404d.setVisibility(8);
                }
                if (this.f70405e != null) {
                    this.f70405e.setVisibility(8);
                    this.f70405e.setImageDrawable(null);
                }
                this.g = (TextView) view.findViewById(16908308);
                if (this.g != null) {
                    this.i = TextViewCompat.getMaxLines(this.g);
                }
                this.h = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f70406f != null) {
                    removeView(this.f70406f);
                    this.f70406f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (eVar != null && eVar.b()) {
                z = true;
            }
            setSelected(z);
        }

        /* access modifiers changed from: package-private */
        public void setTab(@Nullable e eVar) {
            if (PatchProxy.isSupport(new Object[]{eVar}, this, f70401a, false, 80086, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar}, this, f70401a, false, 80086, new Class[]{e.class}, Void.TYPE);
                return;
            }
            if (eVar != this.f70403c) {
                this.f70403c = eVar;
                b();
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            AccessibilityEvent accessibilityEvent2 = accessibilityEvent;
            if (PatchProxy.isSupport(new Object[]{accessibilityEvent2}, this, f70401a, false, 80083, new Class[]{AccessibilityEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{accessibilityEvent2}, this, f70401a, false, 80083, new Class[]{AccessibilityEvent.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent2.setClassName(ActionBar.Tab.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            if (PatchProxy.isSupport(new Object[]{accessibilityNodeInfo2}, this, f70401a, false, 80084, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{accessibilityNodeInfo2}, this, f70401a, false, 80084, new Class[]{AccessibilityNodeInfo.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo2.setClassName(ActionBar.Tab.class.getName());
        }

        public void setSelected(boolean z) {
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f70401a, false, 80082, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f70401a, false, 80082, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (isSelected() == z) {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f70404d != null) {
                this.f70404d.setSelected(z);
            }
            if (this.f70405e != null) {
                this.f70405e.setSelected(z);
            }
            if (this.f70406f != null) {
                this.f70406f.setSelected(z);
            }
        }

        public f(Context context) {
            super(context);
            if (TabLayout.this.k != 0) {
                ViewCompat.setBackground(this, AppCompatResources.getDrawable(context, TabLayout.this.k));
            }
            ViewCompat.setPaddingRelative(this, TabLayout.this.f70352c, TabLayout.this.f70353d, TabLayout.this.f70354e, TabLayout.this.f70355f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR));
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
                com.meituan.robust.ChangeQuickRedirect r2 = f70401a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 80085(0x138d5, float:1.12223E-40)
                r1 = r17
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0055
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r0[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f70401a
                r3 = 0
                r4 = 80085(0x138d5, float:1.12223E-40)
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
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r2 = com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.this
                int r2 = r2.getTabMaxWidth()
                if (r2 <= 0) goto L_0x0075
                if (r1 == 0) goto L_0x0069
                if (r0 <= r2) goto L_0x0075
            L_0x0069:
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r0 = com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.this
                int r0 = r0.l
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
                r12 = r0
                goto L_0x0077
            L_0x0075:
                r12 = r18
            L_0x0077:
                super.onMeasure(r12, r8)
                android.widget.TextView r0 = r7.f70404d
                if (r0 == 0) goto L_0x0174
                r17.getResources()
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r0 = com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.this
                float r0 = r0.i
                int r1 = r7.i
                android.widget.ImageView r2 = r7.f70405e
                if (r2 == 0) goto L_0x0096
                android.widget.ImageView r2 = r7.f70405e
                int r2 = r2.getVisibility()
                if (r2 != 0) goto L_0x0096
                r13 = r0
                r14 = 1
                goto L_0x00a8
            L_0x0096:
                android.widget.TextView r2 = r7.f70404d
                if (r2 == 0) goto L_0x00a6
                android.widget.TextView r2 = r7.f70404d
                int r2 = r2.getLineCount()
                if (r2 <= r11) goto L_0x00a6
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r0 = com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.this
                float r0 = r0.j
            L_0x00a6:
                r13 = r0
                r14 = r1
            L_0x00a8:
                android.widget.TextView r0 = r7.f70404d
                float r0 = r0.getTextSize()
                android.widget.TextView r1 = r7.f70404d
                int r1 = r1.getLineCount()
                android.widget.TextView r2 = r7.f70404d
                int r2 = android.support.v4.widget.TextViewCompat.getMaxLines(r2)
                int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r3 != 0) goto L_0x00c2
                if (r2 < 0) goto L_0x0174
                if (r14 == r2) goto L_0x0174
            L_0x00c2:
                com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout r2 = com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.this
                int r2 = r2.n
                if (r2 != r11) goto L_0x0165
                int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
                if (r0 <= 0) goto L_0x0165
                if (r1 != r11) goto L_0x0165
                android.widget.TextView r0 = r7.f70404d
                android.text.Layout r15 = r0.getLayout()
                if (r15 == 0) goto L_0x0164
                r6 = 3
                java.lang.Object[] r0 = new java.lang.Object[r6]
                r0[r10] = r15
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0[r11] = r1
                java.lang.Float r1 = java.lang.Float.valueOf(r13)
                r0[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f70401a
                r3 = 0
                r4 = 80090(0x138da, float:1.1223E-40)
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
                com.meituan.robust.ChangeQuickRedirect r3 = f70401a
                r4 = 0
                r5 = 80090(0x138da, float:1.1223E-40)
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
                android.widget.TextView r0 = r7.f70404d
                r0.setTextSize(r10, r13)
                android.widget.TextView r0 = r7.f70404d
                r0.setMaxLines(r14)
                super.onMeasure(r12, r8)
            L_0x0174:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.f.onMeasure(int, int):void");
        }
    }

    public static class g implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f70407a;

        /* renamed from: b  reason: collision with root package name */
        private final ViewPager f70408b;

        public final void b(e eVar) {
        }

        public final void c(e eVar) {
        }

        public g(ViewPager viewPager) {
            this.f70408b = viewPager;
        }

        public final void a(e eVar) {
            e eVar2 = eVar;
            if (PatchProxy.isSupport(new Object[]{eVar2}, this, f70407a, false, 80091, new Class[]{e.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2}, this, f70407a, false, 80091, new Class[]{e.class}, Void.TYPE);
                return;
            }
            this.f70408b.setCurrentItem(eVar2.f70400f);
        }
    }

    public e getCurSelectedTab() {
        return this.w;
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

    public final void a(int i2, float f2, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(0.0f), (byte) 1}, this, f70350a, false, 79985, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(0.0f), (byte) 1}, this, f70350a, false, 79985, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(i2, 0.0f, true, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int i3 = i2;
        float f3 = f2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f70350a, false, 79986, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Byte.valueOf(z2), Byte.valueOf(z3)}, this, f70350a, false, 79986, new Class[]{Integer.TYPE, Float.TYPE, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        int round = Math.round(((float) i3) + f3);
        if (round >= 0 && round < this.f70351b.getChildCount()) {
            if (z3) {
                this.f70351b.a(i3, f3);
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

    public final void a(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f70350a, false, 79988, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f70350a, false, 79988, new Class[]{e.class}, Void.TYPE);
            return;
        }
        a(eVar, this.v.isEmpty());
    }

    public final void a(@NonNull e eVar, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70350a, false, 79990, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z2)}, this, f70350a, false, 79990, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(eVar, this.v.size(), z2);
    }

    private void a(@NonNull b bVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f70350a, false, 79992, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f70350a, false, 79992, new Class[]{b.class}, Void.TYPE);
            return;
        }
        e a2 = a();
        if (bVar2.f70415a != null) {
            a2.a(bVar2.f70415a);
        }
        if (bVar2.f70416b != null) {
            Drawable drawable = bVar2.f70416b;
            if (PatchProxy.isSupport(new Object[]{drawable}, a2, e.f70395a, false, 80064, new Class[]{Drawable.class}, e.class)) {
                e eVar = a2;
                e eVar2 = (e) PatchProxy.accessDispatch(new Object[]{drawable}, eVar, e.f70395a, false, 80064, new Class[]{Drawable.class}, e.class);
            } else {
                a2.f70397c = drawable;
                a2.c();
            }
        }
        if (bVar2.f70417c != 0) {
            int i2 = bVar2.f70417c;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, a2, e.f70395a, false, 80063, new Class[]{Integer.TYPE}, e.class)) {
                e eVar3 = a2;
                e eVar4 = (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, eVar3, e.f70395a, false, 80063, new Class[]{Integer.TYPE}, e.class);
            } else {
                a2.a(LayoutInflater.from(a2.i.getContext()).inflate(i2, a2.i, false));
            }
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            CharSequence contentDescription = bVar.getContentDescription();
            if (PatchProxy.isSupport(new Object[]{contentDescription}, a2, e.f70395a, false, 80071, new Class[]{CharSequence.class}, e.class)) {
                e eVar5 = (e) PatchProxy.accessDispatch(new Object[]{contentDescription}, a2, e.f70395a, false, 80071, new Class[]{CharSequence.class}, e.class);
            } else {
                a2.f70399e = contentDescription;
                a2.c();
            }
        }
        a(a2);
    }

    public void a(@NonNull b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f70350a, false, 79993, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f70350a, false, 79993, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (!this.D.contains(bVar)) {
            this.D.add(bVar);
        }
    }

    @NonNull
    public final e a() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 79996, new Class[0], e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 79996, new Class[0], e.class);
        }
        e eVar = (e) u.acquire();
        if (eVar == null) {
            eVar = new e();
        }
        eVar.h = this;
        eVar.i = c(eVar);
        return eVar;
    }

    @Nullable
    public final e a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79998, new Class[]{Integer.TYPE}, e.class)) {
            return (e) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79998, new Class[]{Integer.TYPE}, e.class);
        } else if (i3 >= 0 && i3 < getTabCount()) {
            return this.v.get(i3);
        } else {
            return null;
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70350a, false, 80005, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f70350a, false, 80005, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        setTabTextColors(b(i2, i3));
    }

    /* access modifiers changed from: package-private */
    public final void a(@Nullable PagerAdapter pagerAdapter, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{pagerAdapter, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70350a, false, 80013, new Class[]{PagerAdapter.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagerAdapter, Byte.valueOf(z2)}, this, f70350a, false, 80013, new Class[]{PagerAdapter.class, Boolean.TYPE}, Void.TYPE);
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
        c();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70350a, false, 80040, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f70350a, false, 80040, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < this.f70351b.getChildCount(); i2++) {
            View childAt = this.f70351b.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    public int getSelectedTabPosition() {
        if (this.w != null) {
            return this.w.f70400f;
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

    private LinearLayout.LayoutParams f() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80025, new Class[0], LinearLayout.LayoutParams.class)) {
            return (LinearLayout.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80025, new Class[0], LinearLayout.LayoutParams.class);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    private float getScrollPosition() {
        if (!PatchProxy.isSupport(new Object[0], this, f70350a, false, 79987, new Class[0], Float.TYPE)) {
            return this.f70351b.getIndicatorPosition();
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 79987, new Class[0], Float.TYPE)).floatValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80045, new Class[0], Void.TYPE);
        } else if (this.w != null) {
            this.f70351b.a(-1, 0.0f);
            f(this.w);
            this.w = null;
        }
    }

    public int getTabCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f70350a, false, 79997, new Class[0], Integer.TYPE)) {
            return this.v.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 79997, new Class[0], Integer.TYPE)).intValue();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80010, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80010, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.p == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80011, new Class[0], Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80009, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80009, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (getTabScrollRange() > 0) {
            z2 = true;
        }
        return z2;
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80030, new Class[0], Void.TYPE);
            return;
        }
        if (this.F == null) {
            this.F = new ValueAnimator();
            this.F.setInterpolator(a.f70411c);
            this.F.setDuration(300);
            this.F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f70356a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f70356a, false, 80046, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f70356a, false, 80046, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80042, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80042, new Class[0], Integer.TYPE)).intValue();
        }
        int size = this.v.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            e eVar = this.v.get(i2);
            if (eVar != null && eVar.f70397c != null && !TextUtils.isEmpty(eVar.f70398d)) {
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
        if (!PatchProxy.isSupport(new Object[0], this, f70350a, false, 80012, new Class[0], Integer.TYPE)) {
            return Math.max(0, ((this.f70351b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80012, new Class[0], Integer.TYPE)).intValue();
    }

    private void h() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80039, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80039, new Class[0], Void.TYPE);
            return;
        }
        if (this.n == 0) {
            i2 = Math.max(0, this.B - this.f70352c);
        } else {
            i2 = 0;
        }
        ViewCompat.setPaddingRelative(this.f70351b, i2, 0, 0, 0);
        switch (this.n) {
            case 0:
                this.f70351b.setGravity(8388611);
                break;
            case 1:
                this.f70351b.setGravity(1);
                break;
        }
        a(true);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80001, new Class[0], Void.TYPE);
            return;
        }
        for (int childCount = this.f70351b.getChildCount() - 1; childCount >= 0; childCount--) {
            c(childCount);
        }
        Iterator<e> it2 = this.v.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            it2.remove();
            next.d();
            u.release(next);
        }
        this.w = null;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80014, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80014, new Class[0], Void.TYPE);
        } else if (this.O) {
            b();
            if (this.G != null) {
                int count = this.G.getCount();
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(count)}, this, f70350a, false, 80015, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(count)}, this, f70350a, false, 80015, new Class[]{Integer.TYPE}, Void.TYPE);
                } else if (this.M) {
                    if (count > this.N) {
                        setTabMode(0);
                    } else {
                        setTabMode(1);
                    }
                }
                for (int i2 = 0; i2 < count; i2++) {
                    a(a().a(this.G.getPageTitle(i2)), false);
                }
                if (this.p != null && count > 0) {
                    int currentItem = this.p.getCurrentItem();
                    if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                        b(a(currentItem));
                    }
                }
            }
        }
    }

    public void setAutoFillWhenScrollable(boolean z2) {
        this.o = z2;
    }

    public void setDefaultAddTab(boolean z2) {
        this.O = z2;
    }

    public void setHideIndicatorView(boolean z2) {
        this.r = z2;
    }

    public void setOnTabClickListener(a aVar) {
        this.s = aVar;
    }

    public TabLayout(Context context) {
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
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f70350a, false, 79994, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f70350a, false, 79994, new Class[]{b.class}, Void.TYPE);
            return;
        }
        this.D.remove(bVar2);
    }

    public void addView(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f70350a, false, 80020, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f70350a, false, 80020, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (!PatchProxy.isSupport(new Object[]{attributeSet}, this, f70350a, false, 80043, new Class[]{AttributeSet.class}, FrameLayout.LayoutParams.class)) {
            return generateDefaultLayoutParams();
        }
        return (FrameLayout.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f70350a, false, 80043, new Class[]{AttributeSet.class}, FrameLayout.LayoutParams.class);
    }

    private void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f70350a, false, 80024, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f70350a, false, 80024, new Class[]{View.class}, Void.TYPE);
        } else if (view2 instanceof b) {
            a((b) view2);
        } else {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
    }

    private f c(@NonNull e eVar) {
        f fVar;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f70350a, false, 80017, new Class[]{e.class}, f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[]{eVar}, this, f70350a, false, 80017, new Class[]{e.class}, f.class);
        }
        if (this.P != null) {
            fVar = (f) this.P.acquire();
        } else {
            fVar = null;
        }
        if (fVar == null) {
            fVar = new f(getContext());
        }
        fVar.setTab(eVar);
        fVar.setFocusable(true);
        fVar.setMinimumWidth(getTabMinWidth());
        return fVar;
    }

    private void d(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80029, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80029, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 != -1) {
            if (getWindowToken() == null || !ViewCompat.isLaidOut(this) || this.f70351b.a()) {
                a(i2, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a2 = a(i2, 0.0f);
            if (scrollX != a2) {
                g();
                this.F.setIntValues(new int[]{scrollX, a2});
                this.F.start();
            }
            this.f70351b.b(i2, com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f);
        }
    }

    private void e(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f70350a, false, 80035, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f70350a, false, 80035, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).a(eVar);
        }
    }

    private void f(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f70350a, false, 80036, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f70350a, false, 80036, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).b(eVar);
        }
    }

    private void setSelectedTabView(int i2) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80032, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80032, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = this.f70351b.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f70351b.getChildAt(i3);
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
        if (PatchProxy.isSupport(new Object[]{animatorListener2}, this, f70350a, false, 80031, new Class[]{Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatorListener2}, this, f70350a, false, 80031, new Class[]{Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        g();
        this.F.addListener(animatorListener2);
    }

    public void setSelectedTabIndicatorColor(@ColorInt int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79983, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79983, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70351b.setSelectedIndicatorColor(i2);
    }

    public void setSelectedTabIndicatorHeight(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79984, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79984, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f70351b.setSelectedIndicatorHeight(i2);
    }

    public void setTabGravity(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80003, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80003, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.m != i2) {
            this.m = i2;
            h();
        }
    }

    public void setTabMargin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79981, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79981, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = b(i2);
        for (int i3 = 0; i3 < getTabCount(); i3++) {
            View childAt = this.f70351b.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = b(i2);
            marginLayoutParams.rightMargin = b(i2);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    public void setTabMode(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80002, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80002, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != this.n) {
            this.n = i2;
            h();
        }
    }

    public void setTabStripLeftMargin(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79982, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 79982, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f70351b.getLayoutParams();
        layoutParams.leftMargin = i2;
        this.f70351b.setLayoutParams(layoutParams);
    }

    public void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (PatchProxy.isSupport(new Object[]{colorStateList}, this, f70350a, false, 80004, new Class[]{ColorStateList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{colorStateList}, this, f70350a, false, 80004, new Class[]{ColorStateList.class}, Void.TYPE);
            return;
        }
        if (this.h != colorStateList) {
            this.h = colorStateList;
            if (PatchProxy.isSupport(new Object[0], this, f70350a, false, 80016, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f70350a, false, 80016, new Class[0], Void.TYPE);
                return;
            }
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).c();
            }
        }
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80028, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80028, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        f fVar = (f) this.f70351b.getChildAt(i2);
        this.f70351b.removeViewAt(i2);
        if (fVar != null) {
            fVar.a();
            this.P.release(fVar);
        }
        requestLayout();
    }

    private void d(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f70350a, false, 80019, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f70350a, false, 80019, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f70351b.addView(eVar2.i, eVar2.f70400f, f());
    }

    private void g(@NonNull e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f70350a, false, 80037, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f70350a, false, 80037, new Class[]{e.class}, Void.TYPE);
            return;
        }
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).c(eVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80026, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f70350a, false, 80026, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        ViewPager viewPager2 = viewPager;
        if (PatchProxy.isSupport(new Object[]{viewPager2}, this, f70350a, false, 80006, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2}, this, f70350a, false, 80006, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{viewPager2, (byte) 1}, this, f70350a, false, 80007, new Class[]{ViewPager.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, (byte) 1}, this, f70350a, false, 80007, new Class[]{ViewPager.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(viewPager2, true, false);
    }

    public final void b(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, this, f70350a, false, 80033, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2}, this, f70350a, false, 80033, new Class[]{e.class}, Void.TYPE);
            return;
        }
        b(eVar2, true);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static ColorStateList b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f70350a, true, 80041, new Class[]{Integer.TYPE, Integer.TYPE}, ColorStateList.class)) {
            return (ColorStateList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, null, f70350a, true, 80041, new Class[]{Integer.TYPE, Integer.TYPE}, ColorStateList.class);
        }
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    public void addView(View view, int i2) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f70350a, false, 80021, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f70350a, false, 80021, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(view);
    }

    private int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f70350a, false, 80038, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2)}, this, f70350a, false, 80038, new Class[]{Integer.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.n != 0) {
            return 0;
        } else {
            View childAt = this.f70351b.getChildAt(i2);
            int i5 = i2 + 1;
            if (i5 < this.f70351b.getChildCount()) {
                view = this.f70351b.getChildAt(i5);
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
            com.meituan.robust.ChangeQuickRedirect r2 = f70350a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 80027(0x1389b, float:1.12142E-40)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f70350a
            r3 = 0
            r4 = 80027(0x1389b, float:1.12142E-40)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.onMeasure(int, int):void");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.isSupport(new Object[]{view, layoutParams}, this, f70350a, false, 80022, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, layoutParams}, this, f70350a, false, 80022, new Class[]{View.class, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        a(view);
    }

    private void a(e eVar, int i2) {
        if (PatchProxy.isSupport(new Object[]{eVar, Integer.valueOf(i2)}, this, f70350a, false, 80018, new Class[]{e.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Integer.valueOf(i2)}, this, f70350a, false, 80018, new Class[]{e.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        eVar.f70400f = i2;
        this.v.add(i2, eVar);
        int size = this.v.size();
        for (int i3 = i2 + 1; i3 < size; i3++) {
            this.v.get(i3).f70400f = i3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(e eVar, boolean z2) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{eVar, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70350a, false, 80034, new Class[]{e.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, Byte.valueOf(z2)}, this, f70350a, false, 80034, new Class[]{e.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        e eVar2 = this.w;
        if (eVar2 != eVar) {
            if (eVar != null) {
                i2 = eVar.f70400f;
            } else {
                i2 = -1;
            }
            if (z2) {
                if ((eVar2 == null || eVar2.f70400f == -1) && i2 != -1) {
                    a(i2, 0.0f, true);
                } else {
                    d(i2);
                }
                if (i2 != -1) {
                    setSelectedTabView(i2);
                }
            }
            if (eVar2 != null) {
                f(eVar2);
            }
            this.w = eVar;
            if (eVar != null) {
                e(eVar);
            }
        } else if (eVar2 != null) {
            g(eVar);
            d(eVar.f70400f);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2), layoutParams}, this, f70350a, false, 80023, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2), layoutParams}, this, f70350a, false, 80023, new Class[]{View.class, Integer.TYPE, ViewGroup.LayoutParams.class}, Void.TYPE);
            return;
        }
        a(view);
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.v = new ArrayList<>();
        this.l = Integer.MAX_VALUE;
        this.D = new ArrayList<>();
        this.O = true;
        this.P = new Pools.SimplePool(12);
        if (PatchProxy.isSupport(new Object[]{context}, null, d.f70424a, true, 80092, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, null, d.f70424a, true, 80092, new Class[]{Context.class}, Void.TYPE);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d.f70425b);
            boolean z2 = !obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            if (z2) {
                throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
            }
        }
        setHorizontalScrollBarEnabled(false);
        this.f70351b = new d(context);
        super.addView(this.f70351b, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i2, C0906R.style.p4);
        this.f70351b.setSelectedIndicatorHeight(obtainStyledAttributes2.getDimensionPixelSize(10, 0));
        this.f70351b.setSelectedIndicatorColor(obtainStyledAttributes2.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(15, 0);
        this.f70355f = dimensionPixelSize;
        this.f70354e = dimensionPixelSize;
        this.f70353d = dimensionPixelSize;
        this.f70352c = dimensionPixelSize;
        this.f70352c = obtainStyledAttributes2.getDimensionPixelSize(18, this.f70352c);
        this.f70353d = obtainStyledAttributes2.getDimensionPixelSize(19, this.f70353d);
        this.f70354e = obtainStyledAttributes2.getDimensionPixelSize(17, this.f70354e);
        this.f70355f = obtainStyledAttributes2.getDimensionPixelSize(16, this.f70355f);
        this.g = obtainStyledAttributes2.getResourceId(22, C0906R.style.jy);
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(this.g, android.support.v7.appcompat.R$styleable.TextAppearance);
        try {
            this.i = (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0);
            this.h = obtainStyledAttributes3.getColorStateList(3);
            obtainStyledAttributes3.recycle();
            if (obtainStyledAttributes2.hasValue(23)) {
                this.h = obtainStyledAttributes2.getColorStateList(23);
            }
            if (obtainStyledAttributes2.hasValue(21)) {
                this.h = b(this.h.getDefaultColor(), obtainStyledAttributes2.getColor(21, 0));
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
            h();
        } catch (Throwable th) {
            obtainStyledAttributes3.recycle();
            throw th;
        }
    }

    private void a(@Nullable ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = viewPager;
        boolean z4 = z2;
        if (PatchProxy.isSupport(new Object[]{viewPager2, Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f70350a, false, 80008, new Class[]{ViewPager.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager2, Byte.valueOf(z2), Byte.valueOf(z3)}, this, f70350a, false, 80008, new Class[]{ViewPager.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.p != null) {
            if (this.q != null) {
                this.p.removeOnPageChangeListener(this.q);
            }
            if (this.I != null) {
                this.p.removeOnAdapterChangeListener(this.I);
            }
        }
        if (this.E != null) {
            b(this.E);
            this.E = null;
        }
        if (viewPager2 != null) {
            this.p = viewPager2;
            if (this.q == null) {
                this.q = new TabLayoutOnPageChangeListener(this);
            }
            this.q.a();
            viewPager.addOnPageChangeListener(this.q);
            this.E = new g(viewPager);
            a(this.E);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z4);
            }
            if (this.I == null) {
                this.I = new AdapterChangeListener();
            }
            this.I.f70359b = z4;
            viewPager.addOnAdapterChangeListener(this.I);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.p = null;
            a((PagerAdapter) null, false);
        }
        this.J = z3;
    }

    private void a(@NonNull e eVar, int i2, boolean z2) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70350a, false, 79991, new Class[]{e.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i2), Byte.valueOf(z2)}, this, f70350a, false, 79991, new Class[]{e.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (eVar2.h == this) {
            a(eVar, i2);
            d(eVar);
            if (z2) {
                eVar.a();
            }
        } else {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
    }

    public boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f70350a, false, 80044, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return super.overScrollBy(i2, i3, i4, i5, i6, i7, 80, i9, z2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Byte.valueOf(z2)}, this, f70350a, false, 80044, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
    }
}
