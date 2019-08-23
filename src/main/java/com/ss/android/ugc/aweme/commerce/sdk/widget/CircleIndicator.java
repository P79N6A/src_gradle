package com.ss.android.ugc.aweme.commerce.sdk.widget;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u0013\u001a\u00020\nH\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\nH\u0016J \u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\nH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\nH\u0016J\b\u0010 \u001a\u00020\u0012H\u0002J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/widget/CircleIndicator;", "Landroid/widget/LinearLayout;", "Landroid/support/v4/view/ViewPager$OnPageChangeListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "circleBgResId", "", "currentPosition", "indicatorMargin", "indicatorSize", "onPageChangeListener", "viewPager", "Landroid/support/v4/view/ViewPager;", "addIndicator", "", "backgroundDrawableId", "createIndicators", "dip2px", "dpValue", "", "init", "onPageScrollStateChanged", "state", "onPageScrolled", "position", "positionOffset", "positionOffsetPixels", "onPageSelected", "setData", "setOnPageChangeListener", "setViewPager", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class CircleIndicator extends LinearLayout implements ViewPager.OnPageChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37950a;

    /* renamed from: b  reason: collision with root package name */
    private ViewPager f37951b;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager.OnPageChangeListener f37952c;

    /* renamed from: d  reason: collision with root package name */
    private int f37953d;

    /* renamed from: e  reason: collision with root package name */
    private int f37954e;

    /* renamed from: f  reason: collision with root package name */
    private int f37955f;
    private int g;

    public final void onPageScrollStateChanged(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37950a, false, 29628, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37950a, false, 29628, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f37952c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(i);
        }
    }

    public final void onPageSelected(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37950a, false, 29627, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37950a, false, 29627, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f37952c != null) {
            ViewPager.OnPageChangeListener onPageChangeListener = this.f37952c;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageSelected(i);
            }
        }
        View childAt = getChildAt(this.f37953d);
        if (childAt != null) {
            childAt.setSelected(false);
        }
        View childAt2 = getChildAt(i);
        if (childAt2 != null) {
            childAt2.setSelected(true);
        }
        this.f37953d = i;
    }

    public final void setOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener onPageChangeListener) {
        if (PatchProxy.isSupport(new Object[]{onPageChangeListener}, this, f37950a, false, 29625, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onPageChangeListener}, this, f37950a, false, 29625, new Class[]{ViewPager.OnPageChangeListener.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(onPageChangeListener, "onPageChangeListener");
        this.f37952c = onPageChangeListener;
        ViewPager viewPager = this.f37951b;
        if (viewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        viewPager.addOnPageChangeListener(this);
    }

    public final void setViewPager(@NotNull ViewPager viewPager) {
        int i;
        if (PatchProxy.isSupport(new Object[]{viewPager}, this, f37950a, false, 29623, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager}, this, f37950a, false, 29623, new Class[]{ViewPager.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(viewPager, "viewPager");
        this.f37951b = viewPager;
        if (PatchProxy.isSupport(new Object[0], this, f37950a, false, 29624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37950a, false, 29624, new Class[0], Void.TYPE);
            return;
        }
        ViewPager viewPager2 = this.f37951b;
        if (viewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        this.f37953d = viewPager2.getCurrentItem();
        ViewPager viewPager3 = this.f37951b;
        if (viewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        if (PatchProxy.isSupport(new Object[]{viewPager3}, this, f37950a, false, 29630, new Class[]{ViewPager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewPager3}, this, f37950a, false, 29630, new Class[]{ViewPager.class}, Void.TYPE);
        } else {
            removeAllViews();
            PagerAdapter adapter = viewPager3.getAdapter();
            if (adapter != null) {
                i = adapter.getCount();
            } else {
                i = 0;
            }
            if (i > 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = this.f37954e;
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i3)}, this, f37950a, false, 29631, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i3)}, this, f37950a, false, 29631, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        View view = new View(getContext());
                        view.setBackgroundResource(i3);
                        addView(view, this.g, this.g);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams != null) {
                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                            layoutParams2.leftMargin = this.f37955f;
                            layoutParams2.rightMargin = this.f37955f;
                            view.setLayoutParams(layoutParams2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        }
                    }
                }
            }
        }
        ViewPager viewPager4 = this.f37951b;
        if (viewPager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewPager");
        }
        viewPager4.addOnPageChangeListener(this);
        onPageSelected(this.f37953d);
    }

    public final void onPageScrolled(int i, float f2, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f37950a, false, 29626, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Integer.valueOf(i2)}, this, f37950a, false, 29626, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f37952c != null) {
            ViewPager.OnPageChangeListener onPageChangeListener = this.f37952c;
            if (onPageChangeListener != null) {
                onPageChangeListener.onPageScrolled(i, f2, i2);
            }
        }
    }
}
