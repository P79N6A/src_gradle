package com.ss.android.ugc.aweme.commerce.service.widgets;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/widgets/NoneSymmetryDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "leftPadding", "", "rightPadding", "exceptView", "Lkotlin/Function1;", "Landroid/view/View;", "", "(Landroid/content/Context;FFLkotlin/jvm/functions/Function1;)V", "edge", "", "middle", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class NoneSymmetryDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38270a;

    /* renamed from: b  reason: collision with root package name */
    private int f38271b;

    /* renamed from: c  reason: collision with root package name */
    private int f38272c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f38273d;

    /* renamed from: e  reason: collision with root package name */
    private final float f38274e = 8.0f;

    /* renamed from: f  reason: collision with root package name */
    private final float f38275f = 2.0f;
    private final Function1<View, Boolean> g;

    public NoneSymmetryDecoration(@NotNull Context context, float f2, float f3, @NotNull Function1<? super View, Boolean> function1) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(function1, "exceptView");
        this.f38273d = context;
        this.g = function1;
    }

    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.State state2 = state;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f38270a, false, 30064, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state2}, this, f38270a, false, 30064, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rect2, "outRect");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
        Intrinsics.checkParameterIsNotNull(state2, "state");
        this.f38271b = (int) UIUtils.dip2Px(this.f38273d, this.f38274e);
        this.f38272c = (int) UIUtils.dip2Px(this.f38273d, this.f38275f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
            if (!((Boolean) this.g.invoke(view2)).booleanValue()) {
                if (layoutParams2.getSpanIndex() % 2 == 0) {
                    rect2.left = this.f38271b;
                    rect2.right = this.f38272c;
                    return;
                }
                rect2.left = this.f38272c;
                rect2.right = this.f38271b;
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
    }
}
