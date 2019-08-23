package com.ss.android.ugc.aweme.poi.nearby.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/poi/nearby/adapter/CardStaggeredGridItemDecoration;", "Lcom/ss/android/ugc/aweme/poi/nearby/adapter/StaggeredGridItemDecoration;", "sideMargin", "", "buttonMargin", "(II)V", "getButtonMargin", "()I", "setButtonMargin", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CardStaggeredGridItemDecoration extends StaggeredGridItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59952a;

    /* renamed from: b  reason: collision with root package name */
    public int f59953b = 4;

    public CardStaggeredGridItemDecoration(int i, int i2) {
        super(8);
    }

    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Rect rect2 = rect;
        View view2 = view;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.State state2 = state;
        if (PatchProxy.isSupport(new Object[]{rect2, view2, recyclerView2, state2}, this, f59952a, false, 65180, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE)) {
            Object[] objArr = {rect2, view2, recyclerView2, state2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f59952a, false, 65180, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(rect2, "outRect");
        Intrinsics.checkParameterIsNotNull(view2, "view");
        Intrinsics.checkParameterIsNotNull(recyclerView2, "parent");
        Intrinsics.checkParameterIsNotNull(state2, "state");
        super.getItemOffsets(rect, view, recyclerView, state);
        rect2.bottom = u.a((double) this.f59953b);
    }
}
