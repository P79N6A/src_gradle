package com.ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PoiLabelsLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61043a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f61044b;

    public PoiLabelsLayout(Context context) {
        super(context);
    }

    public void setChildsToHideInSequence(int... iArr) {
        this.f61044b = iArr;
    }

    public PoiLabelsLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61043a, false, 67059, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f61043a, false, 67059, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (this.f61044b != null && this.f61044b.length != 0) {
            int childCount = getChildCount();
            if (childCount > 1) {
                int measuredWidth = getMeasuredWidth();
                if (measuredWidth != 0) {
                    SparseIntArray sparseIntArray = new SparseIntArray();
                    int i4 = childCount;
                    int i5 = 0;
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt = getChildAt(i7);
                        if (childAt.getVisibility() == 8) {
                            i4--;
                            int i8 = i;
                            int i9 = i2;
                        } else {
                            measureChild(childAt, i, i2);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                            int measuredWidth2 = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                            i6 = Math.max(i6, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                            i5 += measuredWidth2;
                            sparseIntArray.put(i7, measuredWidth2);
                        }
                    }
                    int i10 = i;
                    int i11 = i2;
                    if (i5 > measuredWidth) {
                        for (int i12 : this.f61044b) {
                            View childAt2 = getChildAt(i12);
                            if (childAt2.getVisibility() != 8) {
                                i5 -= sparseIntArray.get(i12);
                                childAt2.setVisibility(8);
                                i4--;
                                if (i5 <= measuredWidth) {
                                    break;
                                }
                            }
                        }
                    }
                    if (i4 == 1) {
                        while (true) {
                            if (i3 >= childCount) {
                                break;
                            }
                            View childAt3 = getChildAt(i3);
                            if (childAt3.getVisibility() == 8) {
                                i3++;
                            } else if (childAt3 instanceof TextView) {
                                TextView textView = (TextView) childAt3;
                                textView.setMaxLines(1);
                                textView.setEllipsize(TextUtils.TruncateAt.END);
                            }
                        }
                    }
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public PoiLabelsLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(0);
    }
}
