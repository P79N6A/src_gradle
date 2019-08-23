package com.ss.android.ugc.aweme.poi.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultiTextViewLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61010a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f61011b = new ArrayList();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f61013a;

        /* renamed from: b  reason: collision with root package name */
        int f61014b;

        a(int i, int i2) {
            this.f61013a = i;
            this.f61014b = i2;
        }
    }

    public MultiTextViewLayout(Context context) {
        super(context);
        setOrientation(0);
    }

    public MultiTextViewLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    @SuppressLint({"CI_DrawAllocation"})
    public void onMeasure(int i, int i2) {
        int i3 = i2;
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61010a, false, 67002, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61010a, false, 67002, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingTop();
        int childCount = getChildCount();
        this.f61011b.clear();
        int i5 = childCount;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                this.f61011b.add(new a(i9, 0));
                i5--;
                int i10 = i;
            } else {
                measureChild(childAt, i, i3);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                i6 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i8 = Math.max(measuredHeight, i8);
                this.f61011b.add(new a(i9, measuredWidth2));
                i7 += measuredWidth2;
            }
        }
        Collections.sort(this.f61011b, new Comparator<a>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar.f61014b > aVar2.f61014b) {
                    return 1;
                }
                if (aVar.f61014b < aVar2.f61014b) {
                    return -1;
                }
                return 0;
            }
        });
        int i11 = measuredWidth - i6;
        if (i7 > i11 && i5 > 1) {
            int i12 = i11 / i5;
            for (a next : this.f61011b) {
                int i13 = next.f61013a;
                int i14 = next.f61014b;
                View childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() == 8) {
                    i4++;
                } else {
                    if (i4 == childCount - 1) {
                        if (i14 > i11) {
                            measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i3);
                        }
                    } else if (i14 > i12) {
                        measureChild(childAt2, View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i3);
                        i11 -= i12;
                    } else {
                        i11 -= i14;
                    }
                    i4++;
                }
            }
        }
    }

    public MultiTextViewLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
