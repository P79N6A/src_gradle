package com.ss.android.ugc.aweme.story.feed.view.profile.trans;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.feed.view.profile.ProfileViewHolder;

class AlphaDelegate$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72789a;

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
    }

    AlphaDelegate$1() {
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72789a, false, 84080, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72789a, false, 84080, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
        if (findViewHolderForAdapterPosition instanceof ProfileViewHolder) {
            findViewHolderForAdapterPosition.itemView.setAlpha(1.0f - ((((float) Math.abs(findViewHolderForAdapterPosition.itemView.getTop())) * 1.0f) / ((float) findViewHolderForAdapterPosition.itemView.getHeight())));
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
        if (findViewHolderForAdapterPosition2 instanceof ProfileViewHolder) {
            findViewHolderForAdapterPosition2.itemView.setAlpha(1.0f - ((((float) Math.abs(findViewHolderForAdapterPosition2.itemView.getBottom() - recyclerView.getHeight())) * 1.0f) / ((float) findViewHolderForAdapterPosition2.itemView.getHeight())));
        }
        for (int i3 = findFirstVisibleItemPosition + 1; i3 < findLastVisibleItemPosition; i3++) {
            recyclerView2.findViewHolderForAdapterPosition(i3).itemView.setAlpha(1.0f);
        }
    }
}
