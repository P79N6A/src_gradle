package com.ss.android.ugc.aweme.commercialize.ad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0014J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H\u0014J\u0019\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0002\u0010\u0019R\u000e\u0010\t\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/ad/AdTagGroup;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "divide", "onLayout", "", "changed", "", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setTagList", "list", "", "", "([Ljava/lang/String;)V", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AdTagGroup extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38463a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38464b;

    @JvmOverloads
    public AdTagGroup(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public AdTagGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTagList(@org.jetbrains.annotations.NotNull java.lang.String[] r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f38463a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 30381(0x76ad, float:4.2573E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f38463a
            r13 = 0
            r14 = 30381(0x76ad, float:4.2573E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            java.lang.String r2 = "list"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            r17.removeAllViews()
            int r2 = r0.length
        L_0x003d:
            if (r9 >= r2) goto L_0x00af
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r4 = r17.getContext()
            r3.<init>(r4)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r3.setLayoutParams(r4)
            r4 = 4616189618054758400(0x4010000000000000, double:4.0)
            int r6 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r10 = com.ss.android.ugc.aweme.base.utils.u.a((double) r7)
            int r4 = com.ss.android.ugc.aweme.base.utils.u.a((double) r4)
            int r5 = com.ss.android.ugc.aweme.base.utils.u.a((double) r7)
            r3.setPadding(r6, r10, r4, r5)
            android.content.Context r4 = r17.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2130837805(0x7f02012d, float:1.7280574E38)
            android.graphics.drawable.Drawable r4 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r4, (int) r5)
            r3.setBackground(r4)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r17.getContext()
            r4.<init>(r5)
            r5 = r0[r9]
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r4.setText(r5)
            r4.setLines(r1)
            java.lang.String r5 = "#57ffffff"
            int r5 = android.graphics.Color.parseColor(r5)
            r4.setTextColor(r5)
            r5 = 1094713344(0x41400000, float:12.0)
            r4.setTextSize(r5)
            android.view.View r4 = (android.view.View) r4
            r3.addView(r4)
            android.view.View r3 = (android.view.View) r3
            r4 = r17
            r4.addView(r3)
            int r9 = r9 + 1
            goto L_0x003d
        L_0x00af:
            r4 = r17
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup.setTagList(java.lang.String[]):void");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38463a, false, 30380, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38463a, false, 30380, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        measureChildren(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            int size = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            int i6 = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if (i7 != 0) {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                    if (childAt.getMeasuredWidth() + i6 + this.f38464b >= size) {
                        break;
                    }
                    childAt.layout(this.f38464b + i6, 0, childAt.getMeasuredWidth() + i6 + this.f38464b, childAt.getMeasuredHeight());
                    i6 += this.f38464b;
                    i4 = childAt.getMeasuredWidth();
                } else {
                    Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                    if (childAt.getMeasuredWidth() >= size) {
                        break;
                    }
                    childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                    i4 = childAt.getMeasuredWidth();
                }
                i6 += i4;
            }
            i3 = i6;
        } else if (mode == 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            int childCount2 = getChildCount();
            int i8 = 0;
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt2 = getChildAt(0);
                Intrinsics.checkExpressionValueIsNotNull(childAt2, "getChildAt(0)");
                i8 = Math.max(i8, childAt2.getMeasuredHeight());
            }
            i5 = i8;
        } else if (mode2 == 0) {
            i5 = View.MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i5 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AdTagGroup(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f38464b = u.a(4.0d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AdTagGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f38463a, false, 30379, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f38463a, false, 30379, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= childCount) {
                i6 = getChildCount() - 1;
                break;
            }
            View childAt = getChildAt(i6);
            if (i6 != 0) {
                Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                if (childAt.getMeasuredWidth() + i7 + this.f38464b >= i5) {
                    break;
                }
                childAt.layout(this.f38464b + i7, 0, childAt.getMeasuredWidth() + i7 + this.f38464b, childAt.getMeasuredHeight());
                i7 += this.f38464b;
            } else {
                Intrinsics.checkExpressionValueIsNotNull(childAt, "view");
                if (childAt.getMeasuredWidth() >= i5) {
                    break;
                }
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
            i7 += childAt.getMeasuredWidth();
            i6++;
        }
        removeViewsInLayout(i6 + 1, (getChildCount() - i6) - 1);
    }
}
