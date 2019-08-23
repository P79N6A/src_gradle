package com.ss.android.ugc.aweme.friends.recommendlist.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/ugc/aweme/friends/recommendlist/widget/RecommendHorizontalHeaderViewHolder$1$1", "Landroid/support/v7/widget/GridLayoutManager;", "canScrollHorizontally", "", "canScrollVertically", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class RecommendHorizontalHeaderViewHolder$1$1 extends GridLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RecyclerView f49080a;

    public final boolean canScrollHorizontally() {
        return false;
    }

    public final boolean canScrollVertically() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecommendHorizontalHeaderViewHolder$1$1(RecyclerView recyclerView, Context context, int i) {
        super(context, 4);
        this.f49080a = recyclerView;
    }
}
