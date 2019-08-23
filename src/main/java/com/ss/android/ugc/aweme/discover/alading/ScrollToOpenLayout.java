package com.ss.android.ugc.aweme.discover.alading;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.NestedScrollingChild2;
import android.support.v4.view.NestedScrollingParent2;
import android.support.v4.view.NestedScrollingParentHelper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0011\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002@AB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u0019\u001a\u00020\nH\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\u001dH\u0002J\b\u0010#\u001a\u00020\u001dH\u0014J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0014J(\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\rH\u0016J \u0010-\u001a\u00020\r2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 H\u0016J0\u0010.\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u0010/\u001a\u00020\n2\u0006\u00100\u001a\u00020\n2\u0006\u0010,\u001a\u0002012\u0006\u00102\u001a\u00020\nH\u0016J8\u00103\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020\n2\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0016J(\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0016J(\u0010;\u001a\u00020\r2\u0006\u00109\u001a\u00020)2\u0006\u0010(\u001a\u00020)2\u0006\u0010:\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0016J\u0018\u0010<\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020)2\u0006\u00102\u001a\u00020\nH\u0016J\u0010\u0010=\u001a\u00020\u001d2\b\u0010>\u001a\u0004\u0018\u00010\u0016J\b\u0010?\u001a\u00020\u001dH\u0002R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout;", "Landroid/widget/LinearLayout;", "Landroid/support/v4/view/NestedScrollingParent2;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "enable", "", "getEnable", "()Z", "setEnable", "(Z)V", "mFlingAllX", "mNestedScrollingParentHelper", "Landroid/support/v4/view/NestedScrollingParentHelper;", "mOnScrollToEndListener", "Lcom/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout$OnScrollToEndListener;", "mRecyclerConsumedFlingX", "scrollRange", "computeHorizontalScrollRange", "dampingFactor", "", "end", "", "flingAnimation", "fraction", "", "getNestedScrollAxes", "init", "onFinishInflate", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onNestedFling", "target", "Landroid/view/View;", "velocityX", "velocityY", "consumed", "onNestedPreFling", "onNestedPreScroll", "dx", "dy", "", "type", "onNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "onNestedScrollAccepted", "child", "axes", "onStartNestedScroll", "onStopNestedScroll", "setOnScrollToEndListener", "listener", "tryDispatchOnScrollToEnd", "Companion", "OnScrollToEndListener", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ScrollToOpenLayout extends LinearLayout implements NestedScrollingParent2 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42046a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f42047b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private boolean f42048c;

    /* renamed from: d  reason: collision with root package name */
    private final NestedScrollingParentHelper f42049d;

    /* renamed from: e  reason: collision with root package name */
    private int f42050e;

    /* renamed from: f  reason: collision with root package name */
    private int f42051f;
    private int g;
    private b h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout$OnScrollToEndListener;", "", "onScrollToEnd", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface b {
        void a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout$Companion;", "", "()V", "FLING_MAX_RANGE_THRESHOLD_VALUE", "", "SCROLL_TO_END_THRESHOLD_VALUE", "TAG", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout$end$1$1"}, k = 3, mv = {1, 1, 15})
    static final class c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42052a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScrollToOpenLayout f42053b;

        c(ScrollToOpenLayout scrollToOpenLayout) {
            this.f42053b = scrollToOpenLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f42052a, false, 36014, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f42052a, false, 36014, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            ScrollToOpenLayout scrollToOpenLayout = this.f42053b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate", "com/ss/android/ugc/aweme/discover/alading/ScrollToOpenLayout$flingAnimation$1$1"}, k = 3, mv = {1, 1, 15})
    static final class d implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42054a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScrollToOpenLayout f42055b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ float f42056c;

        d(ScrollToOpenLayout scrollToOpenLayout, float f2) {
            this.f42055b = scrollToOpenLayout;
            this.f42056c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ValueAnimator valueAnimator2 = valueAnimator;
            if (PatchProxy.isSupport(new Object[]{valueAnimator2}, this, f42054a, false, 36015, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator2}, this, f42054a, false, 36015, new Class[]{ValueAnimator.class}, Void.TYPE);
                return;
            }
            ScrollToOpenLayout scrollToOpenLayout = this.f42055b;
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator2, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                scrollToOpenLayout.scrollTo(((Integer) animatedValue).intValue(), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public final boolean onNestedFling(@NotNull View view, float f2, float f3, boolean z) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f42046a, false, 36010, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3), Byte.valueOf(z)}, this, f42046a, false, 36010, new Class[]{View.class, Float.TYPE, Float.TYPE, Boolean.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        return false;
    }

    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42046a, false, 35999, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42046a, false, 35999, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        return i == 1;
    }

    public final boolean getEnable() {
        return this.f42048c;
    }

    public final int getNestedScrollAxes() {
        if (!PatchProxy.isSupport(new Object[0], this, f42046a, false, 36008, new Class[0], Integer.TYPE)) {
            return this.f42049d.getNestedScrollAxes();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 36008, new Class[0], Integer.TYPE)).intValue();
    }

    private final double a() {
        if (PatchProxy.isSupport(new Object[0], this, f42046a, false, 36004, new Class[0], Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 36004, new Class[0], Double.TYPE)).doubleValue();
        }
        double scrollX = (double) getScrollX();
        double d2 = (double) this.f42050e;
        Double.isNaN(scrollX);
        Double.isNaN(d2);
        return Math.max(0.05d, 1.0d - Math.pow(scrollX / d2, 0.9d));
    }

    public final int computeHorizontalScrollRange() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f42046a, false, 36011, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 36011, new Class[0], Integer.TYPE)).intValue();
        } else if (!this.f42048c) {
            return super.computeHorizontalScrollRange();
        } else {
            int childCount = getChildCount();
            if (childCount >= 0) {
                int i2 = 0;
                while (true) {
                    View childAt = getChildAt(i2);
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "getChildAt(i)");
                    i += childAt.getWidth();
                    if (i2 == childCount) {
                        break;
                    }
                    i2++;
                }
            }
            return i;
        }
    }

    public final void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f42046a, false, 35996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 35996, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        if (getChildCount() != 2) {
            throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
        } else if (getChildAt(0) instanceof NestedScrollingChild2) {
            View childAt = getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "child");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            layoutParams.width = -1;
            childAt.setLayoutParams(layoutParams);
        } else {
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
    }

    public final void setEnable(boolean z) {
        this.f42048c = z;
    }

    public final void setOnScrollToEndListener(@Nullable b bVar) {
        this.h = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42046a, false, 35997, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f42046a, false, 35997, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        View childAt = getChildAt(1);
        Intrinsics.checkExpressionValueIsNotNull(childAt, "secondChild");
        this.f42050e = childAt.getMeasuredWidth();
    }

    public final void onStopNestedScroll(@NotNull View view, int i) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f42046a, false, 36005, new Class[]{View.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f42046a, false, 36005, new Class[]{View.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "target");
        this.f42049d.onStopNestedScroll(view, i);
        if (i == 0) {
            if (PatchProxy.isSupport(new Object[0], this, f42046a, false, 36006, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 36006, new Class[0], Void.TYPE);
            } else if (getScrollX() > 0) {
                double d2 = (double) this.f42050e;
                Double.isNaN(d2);
                if (((double) getScrollX()) > d2 * 0.88d) {
                    if (PatchProxy.isSupport(new Object[0], this, f42046a, false, 36003, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 36003, new Class[0], Void.TYPE);
                    } else {
                        b bVar = this.h;
                        if (bVar != null) {
                            bVar.a();
                        }
                    }
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{getScrollX(), 0});
                double scrollX = (double) getScrollX();
                double d3 = (double) this.f42050e;
                Double.isNaN(scrollX);
                Double.isNaN(d3);
                ofInt.setDuration((long) ((scrollX / d3) * 200.0d));
                ofInt.addUpdateListener(new c(this));
                ofInt.start();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollToOpenLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f42048c = true;
        this.f42049d = new NestedScrollingParentHelper(this);
        if (PatchProxy.isSupport(new Object[0], this, f42046a, false, 35998, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42046a, false, 35998, new Class[0], Void.TYPE);
            return;
        }
        setOrientation(0);
    }

    public final boolean onNestedPreFling(@NotNull View view, float f2, float f3) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f42046a, false, 36009, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), Float.valueOf(f3)}, this, f42046a, false, 36009, new Class[]{View.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        if (!this.f42048c) {
            return false;
        }
        OverScroller overScroller = new OverScroller(view.getContext());
        overScroller.fling(0, 0, (int) f2, (int) f3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        this.f42051f = overScroller.getFinalX();
        this.g = 0;
        return false;
    }

    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i, int i2) {
        View view3 = view;
        View view4 = view2;
        if (PatchProxy.isSupport(new Object[]{view3, view4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42046a, false, 36007, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view3, view4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f42046a, false, 36007, new Class[]{View.class, View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view3, "child");
        Intrinsics.checkParameterIsNotNull(view4, "target");
        this.f42049d.onNestedScrollAccepted(view3, view4, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(@org.jetbrains.annotations.NotNull android.view.View r18, int r19, int r20, @org.jetbrains.annotations.NotNull int[] r21, int r22) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            r11 = 5
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r12 = 0
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r13 = 1
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r14 = 2
            r0[r14] = r1
            r15 = 3
            r0[r15] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r16 = 4
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42046a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 36000(0x8ca0, float:5.0447E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0089
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            r0[r14] = r1
            r0[r15] = r10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f42046a
            r3 = 0
            r4 = 36000(0x8ca0, float:5.0447E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0089:
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            java.lang.String r0 = "consumed"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            boolean r0 = r7.f42048c
            if (r0 != 0) goto L_0x0098
            return
        L_0x0098:
            if (r22 != 0) goto L_0x00bb
            if (r9 >= 0) goto L_0x00bb
            int r0 = r17.getScrollX()
            if (r0 <= 0) goto L_0x00bb
            double r0 = r17.a()
            double r2 = (double) r9
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r0
            int r0 = (int) r2
            int r1 = r17.getScrollX()
            int r1 = -r1
            int r0 = java.lang.Math.max(r0, r1)
            r7.scrollBy(r0, r12)
            r10[r12] = r9
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.alading.ScrollToOpenLayout.onNestedPreScroll(android.view.View, int, int, int[], int):void");
    }

    public final void onNestedScroll(@NotNull View view, int i, int i2, int i3, int i4, int i5) {
        View view2 = view;
        int i6 = i3;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f42046a, false, 36001, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f42046a, false, 36001, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "target");
        if (this.f42048c) {
            if (i5 == 0) {
                if (i6 > 0) {
                    requestDisallowInterceptTouchEvent(true);
                    double a2 = a();
                    double d2 = (double) i6;
                    Double.isNaN(d2);
                    scrollBy(Math.min((int) (d2 * a2), this.f42050e - getScrollX()), 0);
                }
            } else if (i > 0) {
                this.g += i;
                if (i6 > 0) {
                    int i7 = this.f42051f - this.g;
                    Context context = getContext();
                    Intrinsics.checkExpressionValueIsNotNull(context, "context");
                    Resources resources = context.getResources();
                    Intrinsics.checkExpressionValueIsNotNull(resources, "context.resources");
                    float applyDimension = TypedValue.applyDimension(1, 800.0f, resources.getDisplayMetrics());
                    float min = Math.min((float) i7, applyDimension) / applyDimension;
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(min)}, this, f42046a, false, 36002, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(min)}, this, f42046a, false, 36002, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    double d3 = (double) this.f42050e;
                    Double.isNaN(d3);
                    double d4 = (double) min;
                    Double.isNaN(d4);
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, (int) (d3 * 0.66d * d4), 0});
                    ofInt.setDuration((long) (600.0f * min));
                    ofInt.setInterpolator(new LinearInterpolator());
                    ofInt.addUpdateListener(new d(this, min));
                    ofInt.start();
                }
            }
        }
    }
}
