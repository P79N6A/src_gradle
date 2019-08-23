package com.ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.text.TextUtilsCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class FlowLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76915a;

    /* renamed from: b  reason: collision with root package name */
    protected List<List<View>> f76916b;

    /* renamed from: c  reason: collision with root package name */
    protected List<Integer> f76917c;

    /* renamed from: d  reason: collision with root package name */
    protected List<Integer> f76918d;

    /* renamed from: e  reason: collision with root package name */
    private int f76919e;

    /* renamed from: f  reason: collision with root package name */
    private List<View> f76920f;
    private int g;
    private int h;
    private int i;

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f76915a, false, 90123, new Class[0], ViewGroup.LayoutParams.class)) {
            return new ViewGroup.MarginLayoutParams(-2, -2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f76915a, false, 90123, new Class[0], ViewGroup.LayoutParams.class);
    }

    public int getVisibleViewCount() {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f76915a, false, 90125, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f76915a, false, 90125, new Class[0], Integer.TYPE)).intValue();
        }
        for (List<View> size : this.f76916b) {
            i2 += size.size();
        }
        return i2;
    }

    public void setMaxLine(int i2) {
        this.i = i2;
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        if (!PatchProxy.isSupport(new Object[]{layoutParams2}, this, f76915a, false, 90124, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class)) {
            return new ViewGroup.MarginLayoutParams(layoutParams2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{layoutParams2}, this, f76915a, false, 90124, new Class[]{ViewGroup.LayoutParams.class}, ViewGroup.LayoutParams.class);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AttributeSet attributeSet2 = attributeSet;
        if (!PatchProxy.isSupport(new Object[]{attributeSet2}, this, f76915a, false, 90122, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class)) {
            return new ViewGroup.MarginLayoutParams(getContext(), attributeSet2);
        }
        return (ViewGroup.LayoutParams) PatchProxy.accessDispatch(new Object[]{attributeSet2}, this, f76915a, false, 90122, new Class[]{AttributeSet.class}, ViewGroup.LayoutParams.class);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76915a, false, 90120, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f76915a, false, 90120, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode = View.MeasureSpec.getMode(i3);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                if (i5 == childCount - 1) {
                    i7 = Math.max(i6, i7);
                    i8 += i9;
                }
                int i11 = i2;
                int i12 = i3;
            } else {
                measureChild(childAt, i2, i3);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i6 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    i7 = Math.max(i7, i6);
                    i4 = measuredWidth + this.h;
                    i8 += i9;
                    i10++;
                    if (this.i > 0 && i10 > this.i) {
                        i9 = measuredHeight;
                        break;
                    }
                } else {
                    i4 = i6 + measuredWidth + this.h;
                    measuredHeight = Math.max(i9, measuredHeight);
                }
                i6 = i4;
                if (i5 == childCount - 1) {
                    i7 = Math.max(i6, i7);
                    i8 += measuredHeight;
                }
                i9 = measuredHeight;
            }
            i5++;
        }
        if (i9 > 0) {
            i8 += ((i8 / i9) - 1) * this.g;
        }
        if (mode != 1073741824) {
            size2 = getPaddingBottom() + i8 + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f76916b = new ArrayList();
        this.f76917c = new ArrayList();
        this.f76918d = new ArrayList();
        this.f76920f = new ArrayList();
        this.g = 0;
        this.h = 0;
        this.i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagFlowLayout);
        this.f76919e = obtainStyledAttributes.getInt(1, -1);
        this.h = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.g = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.i = obtainStyledAttributes.getInteger(2, 0);
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            if (this.f76919e == -1) {
                this.f76919e = 1;
            } else {
                this.f76919e = -1;
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = 1;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f76915a, false, 90121, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f76915a, false, 90121, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f76916b.clear();
        this.f76917c.clear();
        this.f76918d.clear();
        this.f76920f.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i6 = 8;
            if (i8 >= childCount) {
                break;
            }
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = marginLayoutParams.bottomMargin + childAt.getMeasuredHeight() + marginLayoutParams.topMargin;
                if (measuredWidth + i9 > (width - getPaddingLeft()) - getPaddingRight()) {
                    i7++;
                    if (this.i > 0 && i7 > this.i) {
                        break;
                    }
                    this.f76917c.add(Integer.valueOf(i10));
                    this.f76916b.add(this.f76920f);
                    this.f76918d.add(Integer.valueOf(i9));
                    this.f76920f = new ArrayList();
                    i10 = measuredHeight;
                    i9 = 0;
                }
                i9 += measuredWidth + this.h;
                i10 = Math.max(i10, measuredHeight);
                this.f76920f.add(childAt);
            }
            i8++;
        }
        this.f76917c.add(Integer.valueOf(i10));
        this.f76918d.add(Integer.valueOf(i9));
        this.f76916b.add(this.f76920f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f76916b.size();
        int i11 = paddingTop;
        int i12 = paddingLeft;
        int i13 = 0;
        while (i13 < size) {
            this.f76920f = this.f76916b.get(i13);
            int size2 = this.f76920f.size();
            int intValue = this.f76917c.get(i13).intValue() + this.g;
            int intValue2 = this.f76918d.get(i13).intValue();
            switch (this.f76919e) {
                case -1:
                    i12 = getPaddingLeft();
                    break;
                case 0:
                    i12 = ((width - intValue2) / 2) + getPaddingLeft();
                    break;
                case 1:
                    i12 = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                    Collections.reverse(this.f76920f);
                    break;
            }
            int i14 = i12;
            int i15 = 0;
            while (i15 < size2) {
                View view = this.f76920f.get(i15);
                if (view.getVisibility() != i6) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int i16 = marginLayoutParams2.leftMargin + i14;
                    int i17 = marginLayoutParams2.topMargin + i11;
                    view.layout(i16, i17, i16 + view.getMeasuredWidth(), i17 + view.getMeasuredHeight());
                    i14 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.h;
                }
                i15++;
                i6 = 8;
            }
            i11 += intValue;
            i13++;
            i12 = i14;
            i6 = 8;
        }
    }
}
