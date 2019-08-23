package com.ss.android.ugc.aweme.commerce.sdk.live.skupanel.view;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001#B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J0\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0014J\u000e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\tJ\u0010\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u0010\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000eH\u0002J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0010R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuCouponItemLayout;", "Landroid/widget/RelativeLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "couponMetaId", "", "itemVisible", "", "onVisibleStateChangeListener", "Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuCouponItemLayout$IOnVisibleStateChangeListener;", "init", "", "onLayout", "changed", "l", "t", "r", "b", "onParentScroll", "scrollViewMeasure", "refreshItemVisibleState", "scrollViewMeasureHeight", "setCouponMetaId", "couponId", "setItemVisible", "visible", "setOnVisibleChangeListener", "listener", "IOnVisibleStateChangeListener", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
public final class SkuCouponItemLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37873a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37874b;

    /* renamed from: c  reason: collision with root package name */
    private a f37875c;

    /* renamed from: d  reason: collision with root package name */
    private String f37876d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/sdk/live/skupanel/view/SkuCouponItemLayout$IOnVisibleStateChangeListener;", "", "onCouponVisibleChanged", "", "view", "Landroid/view/View;", "visible", "", "couponId", "", "commerce.commerce_release"}, k = 1, mv = {1, 1, 15})
    public interface a {
        void a(@NotNull View view, boolean z, @Nullable String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37877a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SkuCouponItemLayout f37878b;

        b(SkuCouponItemLayout skuCouponItemLayout) {
            this.f37878b = skuCouponItemLayout;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37877a, false, 29466, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37877a, false, 29466, new Class[0], Void.TYPE);
                return;
            }
            if (this.f37878b.getParent() != null) {
                ViewParent parent = this.f37878b.getParent();
                Intrinsics.checkExpressionValueIsNotNull(parent, "parent");
                if (parent.getParent() != null) {
                    ViewParent parent2 = this.f37878b.getParent();
                    Intrinsics.checkExpressionValueIsNotNull(parent2, "parent");
                    if (parent2.getParent() instanceof NestedScrollView) {
                        ViewParent parent3 = this.f37878b.getParent();
                        Intrinsics.checkExpressionValueIsNotNull(parent3, "parent");
                        ViewParent parent4 = parent3.getParent();
                        if (parent4 != null) {
                            this.f37878b.a(((View) parent4).getMeasuredHeight());
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                        }
                    }
                }
            }
        }
    }

    public final void setCouponMetaId(@Nullable String str) {
        this.f37876d = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuCouponItemLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setOnVisibleChangeListener(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f37873a, false, 29459, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f37873a, false, 29459, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "listener");
        this.f37875c = aVar2;
    }

    private final void setItemVisible(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37873a, false, 29460, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37873a, false, 29460, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f37874b != z) {
            a aVar = this.f37875c;
            if (aVar != null) {
                aVar.a(this, z, this.f37876d);
            }
            this.f37874b = z;
        }
    }

    public final void a(int i) {
        int i2 = i;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37873a, false, 29463, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37873a, false, 29463, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if ((getTop() - getScrollY() <= 0 || getTop() - getScrollY() >= i2) && ((getTop() + getMeasuredHeight()) - getScrollY() <= 0 || (getTop() + getMeasuredHeight()) - getScrollY() >= i2)) {
            z = false;
        }
        setItemVisible(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuCouponItemLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SkuCouponItemLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f37873a, false, 29461, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, f37873a, false, 29461, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        post(new b(this));
    }
}
