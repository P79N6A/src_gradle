package com.ss.android.ugc.aweme.commerce.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J0\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\tH\u0014¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/widget/CouponGroupLayout;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bindData", "", "ruleList", "", "", "createCouponTextView", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "rule", "onLayout", "changed", "", "l", "t", "r", "b", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CouponGroupLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38337a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponGroupLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setOrientation(0);
        setGravity(16);
    }

    public final void a(@NotNull List<String> list) {
        DmtTextView dmtTextView;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f38337a, false, 30140, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f38337a, false, 30140, new Class[]{List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(list2, "ruleList");
        for (String next : list) {
            if (PatchProxy.isSupport(new Object[]{next}, this, f38337a, false, 30141, new Class[]{String.class}, DmtTextView.class)) {
                dmtTextView = (DmtTextView) PatchProxy.accessDispatch(new Object[]{next}, this, f38337a, false, 30141, new Class[]{String.class}, DmtTextView.class);
            } else {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) UIUtils.dip2Px(getContext(), 17.0f));
                layoutParams.leftMargin = (int) UIUtils.dip2Px(getContext(), 8.0f);
                DmtTextView dmtTextView2 = new DmtTextView(getContext());
                dmtTextView2.setText(next);
                dmtTextView2.setTextSize(11.0f);
                dmtTextView2.setLayoutParams(layoutParams);
                dmtTextView2.setGravity(16);
                dmtTextView2.setTextColor(dmtTextView2.getResources().getColor(C0906R.color.a1z));
                dmtTextView2.setBackgroundResource(2130838416);
                dmtTextView2.setPadding((int) UIUtils.dip2Px(dmtTextView2.getContext(), 5.0f), 0, (int) UIUtils.dip2Px(dmtTextView2.getContext(), 8.0f), 0);
                dmtTextView = dmtTextView2;
            }
            addView(dmtTextView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponGroupLayout(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attributeSet");
        setOrientation(0);
        setGravity(16);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CouponGroupLayout(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(attributeSet, "attributeSet");
        setOrientation(0);
        setGravity(16);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f38337a, false, 30142, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f38337a, false, 30142, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "childView");
            if (childAt.getLeft() + childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                removeViewInLayout(childAt);
            }
        }
    }
}
