package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.R$styleable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;

public class WrapLineFlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8563a;

    /* renamed from: b  reason: collision with root package name */
    protected int f8564b;

    /* renamed from: c  reason: collision with root package name */
    protected int f8565c;

    /* renamed from: d  reason: collision with root package name */
    protected final boolean f8566d;

    /* renamed from: e  reason: collision with root package name */
    final ArrayList<a> f8567e;

    public static class a extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f8568a;

        /* renamed from: b  reason: collision with root package name */
        public int f8569b;

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f8563a, false, 1949, new Class[0], a.class)) {
            return new a(-2, -2);
        }
        return (a) PatchProxy.accessDispatch(new Object[0], this, f8563a, false, 1949, new Class[0], a.class);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public WrapLineFlowLayout(Context context) {
        this(context, null, 0);
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f8563a, false, 1950, new Class[]{AttributeSet.class}, a.class)) {
            return new a(getContext(), attributeSet2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f8563a, false, 1950, new Class[]{AttributeSet.class}, a.class);
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!PatchProxy.isSupport(new Object[]{layoutParams2}, this, f8563a, false, 1951, new Class[]{ViewGroup.LayoutParams.class}, a.class)) {
            return new a(layoutParams2.width, layoutParams2.height);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f8563a, false, 1951, new Class[]{ViewGroup.LayoutParams.class}, a.class);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8563a, false, 1947, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8563a, false, 1947, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        if (mode == 0) {
            size = 0;
        }
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f8567e.clear();
        int i8 = paddingLeft2;
        int i9 = paddingTop;
        int i10 = paddingLeft;
        int i11 = 0;
        int i12 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            a aVar = (a) childAt.getLayoutParams();
            if (paddingLeft2 <= 0) {
                i4 = paddingLeft;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i7, 1073741824), View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
                aVar.f8568a = i10;
                aVar.f8569b = i9;
                i3 = paddingLeft2;
            } else {
                i4 = paddingLeft;
                if (aVar.width == -2) {
                    i5 = View.MeasureSpec.makeMeasureSpec(paddingLeft2, Integer.MIN_VALUE);
                } else if (aVar.width == -1) {
                    i5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    i5 = View.MeasureSpec.makeMeasureSpec(aVar.width, 1073741824);
                }
                if (aVar.height == -2) {
                    i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
                    i3 = paddingLeft2;
                } else {
                    i3 = paddingLeft2;
                    if (aVar.height == -1) {
                        i6 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                    } else {
                        i6 = View.MeasureSpec.makeMeasureSpec(aVar.height, 1073741824);
                    }
                }
                childAt.measure(i5, i6);
                if (childAt.getMeasuredWidth() > i8) {
                    if (i12 > 0) {
                        i9 += i12 + this.f8565c;
                    }
                    if (this.f8566d && i8 > 1 && !this.f8567e.isEmpty()) {
                        int i13 = i8 / 2;
                        Iterator<a> it2 = this.f8567e.iterator();
                        while (it2.hasNext()) {
                            it2.next().f8568a += i13;
                        }
                    }
                    this.f8567e.clear();
                    i10 = i4;
                    i8 = i3;
                    i12 = 0;
                }
                aVar.f8568a = i10;
                aVar.f8569b = i9;
                if (this.f8566d) {
                    this.f8567e.add(aVar);
                }
                int measuredWidth = childAt.getMeasuredWidth() + this.f8564b;
                i10 += measuredWidth;
                i8 -= measuredWidth;
                if (childAt.getMeasuredHeight() > i12) {
                    i12 = childAt.getMeasuredHeight();
                }
            }
            i11++;
            paddingLeft = i4;
            paddingLeft2 = i3;
            i7 = 0;
        }
        if (this.f8566d && i8 > 1 && !this.f8567e.isEmpty()) {
            int i14 = i8 / 2;
            Iterator<a> it3 = this.f8567e.iterator();
            while (it3.hasNext()) {
                it3.next().f8568a += i14;
            }
        }
        if (i12 > 0) {
            i9 += i12;
        }
        if (mode2 == 0) {
            size2 = i9 + getPaddingBottom();
        } else if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i9 + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8567e = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WrapLineFlowLayout, i, 0);
        this.f8564b = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f8565c = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f8566d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (this.f8564b < 0) {
            this.f8564b = 0;
        }
        if (this.f8565c < 0) {
            this.f8565c = 0;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f8563a, false, 1948, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f8563a, false, 1948, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            a aVar = (a) childAt.getLayoutParams();
            childAt.layout(aVar.f8568a, aVar.f8569b, aVar.f8568a + childAt.getMeasuredWidth(), aVar.f8569b + childAt.getMeasuredHeight());
        }
    }
}
