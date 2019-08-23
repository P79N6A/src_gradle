package com.ss.android.ugc.aweme.commerce.preview.footprint;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/preview/footprint/ProductItemDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "()V", "scaleSpace", "", "scaleTop", "space", "", "getSpace", "()I", "setSpace", "(I)V", "top", "getTop", "setTop", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ProductItemDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37423a;

    /* renamed from: b  reason: collision with root package name */
    public int f37424b;

    /* renamed from: c  reason: collision with root package name */
    public int f37425c;

    /* renamed from: d  reason: collision with root package name */
    private final float f37426d = -0.021333333f;

    /* renamed from: e  reason: collision with root package name */
    private final float f37427e = 0.021333333f;

    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.State state2 = state;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f37423a, false, 28965, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{rect2, view2, recyclerView2, state2}, this, f37423a, false, 28965, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rect2, "outRect");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
        Intrinsics.checkParameterIsNotNull(state2, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f37424b == 0 || this.f37425c == 0) {
            this.f37424b = (int) (((float) recyclerView.getWidth()) * this.f37426d);
            this.f37425c = (int) (((float) recyclerView.getWidth()) * this.f37427e);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            int width = (recyclerView.getWidth() / 2) - this.f37424b;
            int i = this.f37424b / 2;
            int i2 = this.f37424b / 2;
            int childAdapterPosition = recyclerView2.getChildAdapterPosition(view2);
            if (childAdapterPosition == 0) {
                i += recyclerView.getWidth() / 4;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            if (adapter != null && childAdapterPosition == adapter.getItemCount() - 1) {
                i2 += recyclerView.getWidth() / 4;
            }
            layoutParams2.setMargins(i, this.f37425c, i2, 0);
            layoutParams2.height = width;
            layoutParams2.width = width;
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
    }
}
