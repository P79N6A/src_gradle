package com.bytedance.ies.dmt.ui.widget.tablayout;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.TooltipCompat;
import android.text.Layout;
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
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@ViewPager.DecorView
public final class DmtTabLayout extends HorizontalScrollView {
    private static final int[] L = {C0906R.attr.fq};

    /* renamed from: a  reason: collision with root package name */
    public static final Interpolator f20525a = new FastOutSlowInInterpolator();
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
    private final Pools.Pool<f> K;

    /* renamed from: b  reason: collision with root package name */
    public final d f20526b;

    /* renamed from: c  reason: collision with root package name */
    int f20527c;

    /* renamed from: d  reason: collision with root package name */
    int f20528d;

    /* renamed from: e  reason: collision with root package name */
    int f20529e;

    /* renamed from: f  reason: collision with root package name */
    int f20530f;
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
        public boolean f20532a;

        AdapterChangeListener() {
        }

        public void onAdapterChanged(@NonNull ViewPager viewPager, @Nullable PagerAdapter pagerAdapter, @Nullable PagerAdapter pagerAdapter2) {
            if (DmtTabLayout.this.q == viewPager) {
                DmtTabLayout.this.a(pagerAdapter2, this.f20532a);
            }
        }
    }

    public static class TabLayoutOnPageChangeListener implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<DmtTabLayout> f20534a;

        /* renamed from: b  reason: collision with root package name */
        private int f20535b;

        /* renamed from: c  reason: collision with root package name */
        private int f20536c;

        /* renamed from: d  reason: collision with root package name */
        private int f20537d;

        /* renamed from: e  reason: collision with root package name */
        private int f20538e;

        /* renamed from: f  reason: collision with root package name */
        private ArgbEvaluator f20539f = new ArgbEvaluator();
        private AccelerateInterpolator g = new AccelerateInterpolator();
        private DecelerateInterpolator h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f20535b = 0;
            this.f20536c = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f20535b = this.f20536c;
            this.f20536c = i;
        }

        public TabLayoutOnPageChangeListener(DmtTabLayout dmtTabLayout) {
            this.f20534a = new WeakReference<>(dmtTabLayout);
            this.f20538e = dmtTabLayout.getTabTextColors().getColorForState(DmtTabLayout.SELECTED_STATE_SET, 0);
            this.f20537d = dmtTabLayout.getTabTextColors().getDefaultColor();
        }

        public void onPageSelected(int i) {
            boolean z;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f20534a.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i && i < dmtTabLayout.getTabCount()) {
                if (this.f20536c == 0 || (this.f20536c == 2 && this.f20535b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.a(dmtTabLayout.a(i), z);
            }
        }

        private static void a(@Nullable ImageView imageView, @Nullable TextView textView, @ColorInt int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            boolean z;
            boolean z2;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f20534a.get();
            if (dmtTabLayout != null) {
                if (this.f20536c != 2 || this.f20535b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f20536c == 2 && this.f20535b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                dmtTabLayout.a(i, f2, z, z2);
                if (this.f20536c == 2 && this.f20535b == 0) {
                    dmtTabLayout.f20526b.f20555e = false;
                } else {
                    dmtTabLayout.f20526b.f20555e = true;
                    View childAt = dmtTabLayout.f20526b.getChildAt(dmtTabLayout.f20526b.f20551a);
                    View childAt2 = dmtTabLayout.f20526b.getChildAt(dmtTabLayout.f20526b.f20551a + 1);
                    if (!(childAt == null || childAt2 == null)) {
                        View findViewById = childAt.findViewById(C0906R.id.ba7);
                        View findViewById2 = childAt2.findViewById(C0906R.id.ba7);
                        if (!(findViewById == null || findViewById2 == null)) {
                            float left = (float) (childAt.getLeft() + ((childAt.getWidth() - findViewById.getWidth()) / 2));
                            float width = ((float) findViewById.getWidth()) + left;
                            float left2 = (float) (childAt2.getLeft() + ((childAt2.getWidth() - findViewById2.getWidth()) / 2));
                            float width2 = ((float) findViewById2.getWidth()) + left2;
                            a((ImageView) findViewById.findViewById(C0906R.id.cyw), (TextView) findViewById.findViewById(C0906R.id.cyx), ((Integer) this.f20539f.evaluate(f2, Integer.valueOf(this.f20538e), Integer.valueOf(this.f20537d))).intValue());
                            a((ImageView) findViewById2.findViewById(C0906R.id.cyw), (TextView) findViewById2.findViewById(C0906R.id.cyx), ((Integer) this.f20539f.evaluate(f2, Integer.valueOf(this.f20537d), Integer.valueOf(this.f20538e))).intValue());
                            dmtTabLayout.f20526b.f20553c = left + ((left2 - left) * this.g.getInterpolation(f2));
                            dmtTabLayout.f20526b.f20554d = width + ((width2 - width) * this.g.getInterpolation(f2));
                        }
                    }
                }
                ViewCompat.postInvalidateOnAnimation(dmtTabLayout.f20526b);
            }
        }
    }

    public static class TabLayoutOnPageChangeListenerIndependent implements ViewPager.OnPageChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final boolean f20540a;

        /* renamed from: b  reason: collision with root package name */
        private final WeakReference<DmtTabLayout> f20541b;

        /* renamed from: c  reason: collision with root package name */
        private int f20542c;

        /* renamed from: d  reason: collision with root package name */
        private int f20543d;

        /* renamed from: e  reason: collision with root package name */
        private int f20544e;

        public void onPageScrollStateChanged(int i) {
            this.f20542c = this.f20543d;
            this.f20543d = i;
        }

        public void onPageSelected(int i) {
            boolean z;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f20541b.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i && i < dmtTabLayout.getTabCount()) {
                if (this.f20543d == 0 || (this.f20543d == 2 && this.f20542c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.a(dmtTabLayout.a(i), z);
            }
        }

        public void onPageScrolled(int i, float f2, int i2) {
            boolean z;
            boolean z2;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f20541b.get();
            if (!(this.f20544e == i || dmtTabLayout == null)) {
                if (this.f20543d != 2 || this.f20542c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f20543d == 2 && this.f20542c == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i3 = i;
                b bVar = new b(this, this.f20544e, i3, dmtTabLayout, z, z2);
                duration.addUpdateListener(bVar);
                this.f20544e = i;
                final DmtTabLayout dmtTabLayout2 = dmtTabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                AnonymousClass1 r0 = new Animator.AnimatorListener() {
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        dmtTabLayout2.a(i3, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        dmtTabLayout2.a(i3, 0.0f, z3, z4);
                    }
                };
                duration.addListener(r0);
                duration.start();
            }
        }
    }

    public interface a {
    }

    public interface b {
        void a(e eVar);
    }

    class c extends DataSetObserver {
        public final void onChanged() {
            DmtTabLayout.this.a();
        }

        public final void onInvalidated() {
            DmtTabLayout.this.a();
        }

        c() {
        }
    }

    class d extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        int f20551a;

        /* renamed from: b  reason: collision with root package name */
        float f20552b;

        /* renamed from: c  reason: collision with root package name */
        public float f20553c;

        /* renamed from: d  reason: collision with root package name */
        public float f20554d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f20555e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ DmtTabLayout f20556f;
        private int g;
        private final Paint h;
        private int i;
        private int j;
        private int k;
        private ValueAnimator l;
        private int m;

        /* access modifiers changed from: package-private */
        public final float getIndicatorPosition() {
            return ((float) this.f20551a) + this.f20552b;
        }

        private void a() {
            int i2;
            View childAt = getChildAt(this.f20551a);
            int i3 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
            } else {
                i3 = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f20552b > 0.0f && this.f20551a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f20551a + 1);
                    i3 = (int) ((this.f20552b * ((float) childAt2.getLeft())) + ((1.0f - this.f20552b) * ((float) i3)));
                    i2 = (int) ((this.f20552b * ((float) childAt2.getRight())) + ((1.0f - this.f20552b) * ((float) i2)));
                }
            }
            a(i3, i2);
        }

        /* access modifiers changed from: package-private */
        public final void setSelectedIndicatorHeight(int i2) {
            if (this.g != i2) {
                this.g = i2;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
            if (Build.VERSION.SDK_INT < 23 && this.i != i2) {
                requestLayout();
                this.i = i2;
            }
        }

        /* access modifiers changed from: package-private */
        public final void setSelectedIndicatorColor(int i2) {
            if (this.h.getColor() != i2) {
                this.h.setColor(i2);
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.j >= 0 && this.k > this.j) {
                View childAt = getChildAt(this.f20556f.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(C0906R.id.ba7);
                    if (findViewById != null) {
                        if (this.f20556f.q == null || !this.f20555e) {
                            this.f20553c = (float) (this.j + (((this.k - this.j) - findViewById.getWidth()) / 2));
                            this.f20554d = this.f20553c + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f20553c, (float) (getHeight() - this.g), this.f20554d, (float) getHeight(), this.h);
                        return;
                    }
                }
                canvas.drawRect((float) this.j, (float) (getHeight() - this.g), (float) this.k, (float) getHeight(), this.h);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, float f2) {
            if (this.l != null && this.l.isRunning()) {
                this.l.cancel();
            }
            this.f20551a = i2;
            this.f20552b = f2;
            a();
        }

        /* access modifiers changed from: package-private */
        public final void a(int i2, int i3) {
            if (i2 != this.j || i3 != this.k) {
                this.j = i2;
                this.k = i3;
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(final int i2, int i3) {
            boolean z;
            final int i4;
            final int i5;
            int i6;
            if (this.l != null && this.l.isRunning()) {
                this.l.cancel();
            }
            if (ViewCompat.getLayoutDirection(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i2);
            if (childAt == null) {
                a();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i2 - this.f20551a) <= 1) {
                i5 = this.j;
                i4 = this.k;
            } else {
                int b2 = this.f20556f.b(24);
                if (i2 < this.f20551a) {
                    if (!z) {
                        i6 = b2 + right;
                    }
                    i5 = left - b2;
                    i4 = i5;
                } else {
                    if (z) {
                        i6 = b2 + right;
                    }
                    i5 = left - b2;
                    i4 = i5;
                }
                i5 = i6;
                i4 = i5;
            }
            if (!(i5 == left && i4 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.l = valueAnimator;
                valueAnimator.setInterpolator(DmtTabLayout.f20525a);
                valueAnimator.setDuration((long) i3);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                AnonymousClass1 r3 = new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        d.this.a(d.a(i5, left, animatedFraction), d.a(i4, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        d.this.f20551a = i2;
                        d.this.f20552b = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i2, int i3) {
            boolean z;
            boolean z2;
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                int childCount = getChildCount();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = getChildAt(i6);
                    if (childAt.getVisibility() == 0) {
                        i5 = Math.max(i5, childAt.getMeasuredWidth());
                        this.m = Math.min(this.m, childAt.getMeasuredWidth());
                    }
                }
                if (this.f20556f.n == 1 && this.f20556f.m == 1) {
                    if (i5 > 0) {
                        if (i5 * childCount <= getMeasuredWidth() - (this.f20556f.b(16) * 2)) {
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
                            this.f20556f.m = 0;
                            this.f20556f.a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i2, i3);
                        }
                    }
                } else if (this.f20556f.n == 0 && this.f20556f.p && this.f20556f.t == getResources().getConfiguration().orientation && i5 > 0) {
                    int i7 = 0;
                    for (int i8 = 0; i8 < childCount; i8++) {
                        View childAt2 = getChildAt(i8);
                        if (childAt2.getVisibility() != 8) {
                            i7 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i7 > 0) {
                        int measuredWidth = (this.f20556f.getMeasuredWidth() - this.f20556f.f20526b.getPaddingLeft()) - this.f20556f.f20526b.getPaddingRight();
                        if (i7 >= measuredWidth) {
                            z = false;
                        } else if (i5 * childCount < measuredWidth) {
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

        static int a(int i2, int i3, float f2) {
            return i2 + Math.round(f2 * ((float) (i3 - i2)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
            super.onLayout(z, i2, i3, i4, i5);
            if (this.l == null || !this.l.isRunning()) {
                a();
                return;
            }
            this.l.cancel();
            b(this.f20551a, Math.round((1.0f - this.l.getAnimatedFraction()) * ((float) this.l.getDuration())));
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public Object f20564a;

        /* renamed from: b  reason: collision with root package name */
        public Drawable f20565b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f20566c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f20567d;

        /* renamed from: e  reason: collision with root package name */
        public int f20568e = -1;

        /* renamed from: f  reason: collision with root package name */
        public View f20569f;
        DmtTabLayout g;
        public f h;

        e() {
        }

        /* access modifiers changed from: package-private */
        public final void c() {
            if (this.h != null) {
                this.h.a();
            }
        }

        public final boolean b() {
            if (this.g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.g.getSelectedTabPosition() == this.f20568e) {
                return true;
            } else {
                return false;
            }
        }

        public final void a() {
            if (this.g != null) {
                this.g.a(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @NonNull
        private e a(@Nullable View view) {
            this.f20569f = view;
            c();
            return this;
        }

        @NonNull
        public final e a(@Nullable CharSequence charSequence) {
            this.f20566c = charSequence;
            c();
            return this;
        }

        @NonNull
        public final e a(@LayoutRes int i) {
            return a(LayoutInflater.from(this.h.getContext()).inflate(i, this.h, false));
        }
    }

    public class f extends LinearLayout {

        /* renamed from: b  reason: collision with root package name */
        private e f20571b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f20572c;

        /* renamed from: d  reason: collision with root package name */
        private ImageView f20573d;

        /* renamed from: e  reason: collision with root package name */
        private View f20574e;

        /* renamed from: f  reason: collision with root package name */
        private TextView f20575f;
        private ImageView g;
        private int h = 2;

        public final e getTab() {
            return this.f20571b;
        }

        public final TextView getTextView() {
            return this.f20572c;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f20571b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (DmtTabLayout.this.s == null) {
                this.f20571b.a();
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            View view;
            e eVar = this.f20571b;
            if (eVar != null) {
                view = eVar.f20569f;
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
                this.f20574e = view;
                if (this.f20572c != null) {
                    this.f20572c.setVisibility(8);
                }
                if (this.f20573d != null) {
                    this.f20573d.setVisibility(8);
                    this.f20573d.setImageDrawable(null);
                }
                this.f20575f = (TextView) view.findViewById(16908308);
                if (this.f20575f != null) {
                    this.h = TextViewCompat.getMaxLines(this.f20575f);
                }
                this.g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f20574e != null) {
                    removeView(this.f20574e);
                    this.f20574e = null;
                }
                this.f20575f = null;
                this.g = null;
            }
            boolean z = false;
            if (this.f20574e == null) {
                if (this.f20573d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C0906R.layout.i7, this, false);
                    addView(imageView, 0);
                    this.f20573d = imageView;
                }
                if (this.f20572c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C0906R.layout.i8, this, false);
                    addView(textView);
                    this.f20572c = textView;
                    this.h = TextViewCompat.getMaxLines(this.f20572c);
                }
                TextViewCompat.setTextAppearance(this.f20572c, DmtTabLayout.this.g);
                if (DmtTabLayout.this.h != null) {
                    this.f20572c.setTextColor(DmtTabLayout.this.h);
                }
                a(this.f20572c, this.f20573d);
            } else if (!(this.f20575f == null && this.g == null)) {
                a(this.f20575f, this.g);
            }
            if (eVar != null && eVar.b()) {
                z = true;
            }
            setSelected(z);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.Tab.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(ActionBar.Tab.class.getName());
        }

        /* access modifiers changed from: package-private */
        public final void setTab(@Nullable e eVar) {
            if (eVar != this.f20571b) {
                this.f20571b = eVar;
                a();
            }
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && Build.VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f20572c != null) {
                this.f20572c.setSelected(z);
            }
            if (this.f20573d != null) {
                this.f20573d.setSelected(z);
            }
            if (this.f20574e != null) {
                this.f20574e.setSelected(z);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(@Nullable e eVar, boolean z) {
            if (eVar != this.f20571b) {
                this.f20571b = eVar;
            }
        }

        public f(Context context) {
            super(context);
            if (DmtTabLayout.this.k != 0) {
                ViewCompat.setBackground(this, AppCompatResources.getDrawable(context, DmtTabLayout.this.k));
            }
            ViewCompat.setPaddingRelative(this, DmtTabLayout.this.f20527c, DmtTabLayout.this.f20528d, DmtTabLayout.this.f20529e, DmtTabLayout.this.f20530f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            ViewCompat.setPointerIcon(this, PointerIconCompat.getSystemIcon(getContext(), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR));
        }

        private void a(@Nullable TextView textView, @Nullable ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3 = null;
            if (this.f20571b != null) {
                drawable = this.f20571b.f20565b;
            } else {
                drawable = null;
            }
            if (this.f20571b != null) {
                charSequence = this.f20571b.f20566c;
            } else {
                charSequence = null;
            }
            if (this.f20571b != null) {
                charSequence2 = this.f20571b.f20567d;
            } else {
                charSequence2 = null;
            }
            int i = 0;
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
                    i = DmtTabLayout.this.b(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            TooltipCompat.setTooltipText(this, charSequence3);
        }

        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = DmtTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(DmtTabLayout.this.l, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f20572c != null) {
                getResources();
                float f2 = DmtTabLayout.this.i;
                int i3 = this.h;
                boolean z = true;
                if (this.f20573d != null && this.f20573d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f20572c != null && this.f20572c.getLineCount() > 1) {
                    f2 = DmtTabLayout.this.j;
                }
                float textSize = this.f20572c.getTextSize();
                int lineCount = this.f20572c.getLineCount();
                int maxLines = TextViewCompat.getMaxLines(this.f20572c);
                if (f2 != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (DmtTabLayout.this.n == 1 && f2 > textSize && lineCount == 1) {
                        Layout layout = this.f20572c.getLayout();
                        if (layout == null || layout.getLineWidth(0) * (f2 / layout.getPaint().getTextSize()) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f20572c.setTextSize(0, f2);
                        this.f20572c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }
    }

    public static class g implements b {

        /* renamed from: a  reason: collision with root package name */
        private final ViewPager f20576a;

        public g(ViewPager viewPager) {
            this.f20576a = viewPager;
        }

        public final void a(e eVar) {
            this.f20576a.setCurrentItem(eVar.f20568e);
        }
    }

    public final int getTabGravity() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final int getTabMaxWidth() {
        return this.l;
    }

    public final int getTabMode() {
        return this.n;
    }

    @Nullable
    public final ColorStateList getTabTextColors() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, float f2, boolean z2, boolean z3) {
        int round = Math.round(((float) i2) + f2);
        if (round >= 0 && round < this.f20526b.getChildCount()) {
            if (z3) {
                this.f20526b.a(i2, f2);
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

    @Nullable
    public final e a(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.v.get(i2);
    }

    /* access modifiers changed from: package-private */
    public final void a(@Nullable PagerAdapter pagerAdapter, boolean z2) {
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
        c();
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
        a(eVar, true);
    }

    /* access modifiers changed from: package-private */
    public final void a(e eVar, boolean z2) {
        e eVar2 = this.w;
        if (eVar2 != eVar) {
            int i2 = eVar != null ? eVar.f20568e : -1;
            if (z2) {
                if ((eVar2 == null || eVar2.f20568e == -1) && i2 != -1) {
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
            d(eVar.f20568e);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2) {
        for (int i2 = 0; i2 < this.f20526b.getChildCount(); i2++) {
            View childAt = this.f20526b.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            a((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    private float getScrollPosition() {
        return this.f20526b.getIndicatorPosition();
    }

    public final int getTabCount() {
        return this.v.size();
    }

    public final int getTabStripLeftPadding() {
        return this.f20526b.getPaddingLeft();
    }

    public final int getTabStripRightPadding() {
        return this.f20526b.getPaddingRight();
    }

    private LinearLayout.LayoutParams e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        a(layoutParams);
        return layoutParams;
    }

    public final int getSelectedTabPosition() {
        if (this.w != null) {
            return this.w.f20568e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.J) {
            setupWithViewPager(null);
            this.J = false;
        }
    }

    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
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

    private int getTabScrollRange() {
        return Math.max(0, ((this.f20526b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                a((ViewPager) parent, true, true);
            }
        }
    }

    private f d() {
        f fVar;
        if (this.K != null) {
            fVar = (f) this.K.acquire();
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

    private void f() {
        if (this.F == null) {
            this.F = new ValueAnimator();
            this.F.setInterpolator(f20525a);
            this.F.setDuration(200);
            this.F.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DmtTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private void g() {
        int i2;
        if (this.n == 0) {
            i2 = Math.max(0, this.B - this.f20527c);
        } else {
            i2 = 0;
        }
        ViewCompat.setPaddingRelative(this.f20526b, i2, 0, 0, 0);
        switch (this.n) {
            case 0:
                this.f20526b.setGravity(8388611);
                break;
            case 1:
                this.f20526b.setGravity(1);
                break;
        }
        a(true);
    }

    private int getDefaultHeight() {
        int size = this.v.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            e eVar = this.v.get(i2);
            if (eVar != null && eVar.f20565b != null && !TextUtils.isEmpty(eVar.f20566c)) {
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

    private void c() {
        int childCount = this.f20526b.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            f fVar = (f) this.f20526b.getChildAt(childCount);
            this.f20526b.removeViewAt(childCount);
            if (fVar != null) {
                fVar.setTab(null);
                fVar.setSelected(false);
                this.K.release(fVar);
            }
            requestLayout();
        }
        Iterator<e> it2 = this.v.iterator();
        while (it2.hasNext()) {
            e next = it2.next();
            it2.remove();
            next.g = null;
            next.h = null;
            next.f20564a = null;
            next.f20565b = null;
            next.f20566c = null;
            next.f20567d = null;
            next.f20568e = -1;
            next.f20569f = null;
            u.release(next);
        }
        this.w = null;
    }

    public final void addView(View view) {
        a(view);
    }

    public final void setAutoFillWhenScrollable(boolean z2) {
        this.p = z2;
    }

    public final void setCustomTabViewResId(int i2) {
        this.o = i2;
    }

    public final void setOnTabClickListener(a aVar) {
        this.s = aVar;
    }

    private void b(@NonNull b bVar) {
        this.D.remove(bVar);
    }

    public final void setSelectedTabIndicatorColor(@ColorInt int i2) {
        this.f20526b.setSelectedIndicatorColor(i2);
    }

    public final void setSelectedTabIndicatorHeight(int i2) {
        this.f20526b.setSelectedIndicatorHeight(i2);
    }

    @Deprecated
    public final void setTabsFromPagerAdapter(@Nullable PagerAdapter pagerAdapter) {
        a(pagerAdapter, false);
    }

    public final void setupWithViewPager(@Nullable ViewPager viewPager) {
        a(viewPager, true, false);
    }

    private void a(@NonNull b bVar) {
        if (!this.D.contains(bVar)) {
            this.D.add(bVar);
        }
    }

    private void b(e eVar) {
        this.f20526b.addView(eVar.h, eVar.f20568e, e());
    }

    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: package-private */
    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.F.addListener(animatorListener);
    }

    public final void setTabGravity(int i2) {
        if (this.m != i2) {
            this.m = i2;
            g();
        }
    }

    public final void setTabMode(int i2) {
        if (i2 != this.n) {
            this.n = i2;
            g();
        }
    }

    private void a(View view) {
        if (view instanceof a) {
            a((a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void c(@NonNull e eVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).a(eVar);
        }
    }

    private void d(@NonNull e eVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size);
        }
    }

    private void e(@NonNull e eVar) {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size);
        }
    }

    private void setSelectedTabView(int i2) {
        boolean z2;
        int childCount = this.f20526b.getChildCount();
        if (i2 < childCount) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f20526b.getChildAt(i3);
                if (i3 == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                childAt.setSelected(z2);
            }
        }
    }

    @Deprecated
    public final void setOnTabSelectedListener(@Nullable b bVar) {
        if (this.C != null) {
            b(this.C);
        }
        this.C = bVar;
        if (bVar != null) {
            a(bVar);
        }
    }

    public final void setTabTextColors(@Nullable ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            int size = this.v.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.v.get(i2).c();
            }
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

    @NonNull
    private e c(int i2) {
        e eVar = (e) u.acquire();
        if (eVar == null) {
            eVar = new e();
        }
        eVar.g = this;
        eVar.h = d();
        if (i2 > 0) {
            eVar.h.a(eVar, false);
            eVar.a(i2);
        } else {
            eVar.h.setTab(eVar);
        }
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i2));
    }

    public final void setTabMargin(int i2) {
        this.x = b(i2);
        for (int i3 = 0; i3 < getTabCount(); i3++) {
            View childAt = this.f20526b.getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = b(i2);
            marginLayoutParams.rightMargin = b(i2);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    private void d(int i2) {
        boolean z2;
        if (i2 != -1) {
            if (getWindowToken() != null && ViewCompat.isLaidOut(this)) {
                d dVar = this.f20526b;
                int childCount = dVar.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        z2 = false;
                        break;
                    } else if (dVar.getChildAt(i3).getWidth() <= 0) {
                        z2 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z2) {
                    int scrollX = getScrollX();
                    int a2 = a(i2, 0.0f);
                    if (scrollX != a2) {
                        f();
                        this.F.setIntValues(new int[]{scrollX, a2});
                        this.F.start();
                    }
                    this.f20526b.b(i2, 200);
                    return;
                }
            }
            a(i2, 0.0f, true);
        }
    }

    private void a(@NonNull a aVar) {
        e c2 = c(0);
        if (aVar.f20577a != null) {
            c2.a(aVar.f20577a);
        }
        if (aVar.f20578b != null) {
            c2.f20565b = aVar.f20578b;
            c2.c();
        }
        if (aVar.f20579c != 0) {
            c2.a(aVar.f20579c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            c2.f20567d = aVar.getContentDescription();
            c2.c();
        }
        b(c2, this.v.isEmpty());
    }

    public final void addView(View view, int i2) {
        a(view);
    }

    private void b(@NonNull e eVar, boolean z2) {
        a(eVar, this.v.size(), z2);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private int a(int i2, float f2) {
        View view;
        int i3;
        int i4 = 0;
        if (this.n != 0) {
            return 0;
        }
        View childAt = this.f20526b.getChildAt(i2);
        int i5 = i2 + 1;
        if (i5 < this.f20526b.getChildCount()) {
            view = this.f20526b.getChildAt(i5);
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.b((int) r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0030
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L_0x0030:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L_0x004a
            int r1 = r5.z
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.z
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.b((int) r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.l = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.n
            switch(r2) {
                case 0: goto L_0x006b;
                case 1: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0076
        L_0x005f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L_0x0076
        L_0x0069:
            r6 = 1
            goto L_0x0076
        L_0x006b:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L_0x0076
            goto L_0x0069
        L_0x0076:
            if (r6 == 0) goto L_0x0096
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.onMeasure(int, int):void");
    }

    private void a(e eVar, int i2) {
        eVar.f20568e = i2;
        this.v.add(i2, eVar);
        int size = this.v.size();
        while (true) {
            i2++;
            if (i2 < size) {
                this.v.get(i2).f20568e = i2;
            } else {
                return;
            }
        }
    }

    private void a(int i2, float f2, boolean z2) {
        a(i2, 0.0f, true, true);
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    private void a(@Nullable ViewPager viewPager, boolean z2, boolean z3) {
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
        if (viewPager != null) {
            this.q = viewPager;
            if (this.r == null) {
                this.r = new TabLayoutOnPageChangeListener(this);
            }
            this.r.a();
            viewPager.addOnPageChangeListener(this.r);
            this.E = new g(viewPager);
            a(this.E);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                a(adapter, z2);
            }
            if (this.I == null) {
                this.I = new AdapterChangeListener();
            }
            this.I.f20532a = z2;
            viewPager.addOnAdapterChangeListener(this.I);
            a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.q = null;
            a((PagerAdapter) null, false);
        }
        this.J = z3;
    }

    private void a(@NonNull e eVar, int i2, boolean z2) {
        if (eVar.g == this) {
            a(eVar, i2);
            b(eVar);
            if (z2) {
                eVar.a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        return super.overScrollBy(i2, i3, i4, i5, i6, i7, 80, i9, z2);
    }
}
