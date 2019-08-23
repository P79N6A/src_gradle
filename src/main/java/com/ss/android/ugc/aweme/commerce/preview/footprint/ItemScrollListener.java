package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ItemScrollListener;", "Landroid/support/v7/widget/RecyclerView$OnScrollListener;", "()V", "helper", "", "getHelper", "()I", "setHelper", "(I)V", "width", "getWidth", "setWidth", "animate", "", "view", "Landroid/view/View;", "onScrolled", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "dx", "dy", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ItemScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37411a;

    /* renamed from: b  reason: collision with root package name */
    public int f37412b;

    /* renamed from: c  reason: collision with root package name */
    public int f37413c;

    private final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f37411a, false, 28950, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f37411a, false, 28950, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int abs = Math.abs(((view.getLeft() + view.getRight()) / 2) - (this.f37412b / 2));
        if (abs <= this.f37413c) {
            a.a(((float) abs) / ((float) this.f37413c), view);
        } else {
            a.a(view);
        }
    }

    public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37411a, false, 28949, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f37411a, false, 28949, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (recyclerView.getChildCount() > 0) {
            if (this.f37412b == 0 || this.f37413c == 0) {
                this.f37412b = recyclerView.getWidth();
                this.f37413c = this.f37412b / 2;
            }
            View childAt = recyclerView.getChildAt(0);
            Intrinsics.checkExpressionValueIsNotNull(childAt, "recyclerView.getChildAt(0)");
            a(childAt);
            if (recyclerView.getChildCount() > 1) {
                View childAt2 = recyclerView.getChildAt(1);
                Intrinsics.checkExpressionValueIsNotNull(childAt2, "recyclerView.getChildAt(1)");
                a(childAt2);
                if (recyclerView.getChildCount() == 3) {
                    View childAt3 = recyclerView.getChildAt(2);
                    Intrinsics.checkExpressionValueIsNotNull(childAt3, "recyclerView.getChildAt(2)");
                    a(childAt3);
                }
            }
        }
    }
}
