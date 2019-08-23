package com.bytedance.jedi.ext.adapter.multitype;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/jedi/ext/adapter/multitype/LatestPositionMemento;", "", "()V", "myRecyclerView", "Landroid/support/v7/widget/RecyclerView;", "positionBeforeInserted", "", "beforeNotifyInsertion", "", "onAttachToRecyclerView", "recyclerView", "onDetachedFromRecyclerView", "scrollToLastPositionAfterInserted", "position", "ext_adapter_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f21497a;

    /* renamed from: b  reason: collision with root package name */
    private int f21498b = -241;

    public final void a() {
        RecyclerView recyclerView = this.f21497a;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.f21498b = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
                return;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                this.f21498b = staggeredGridLayoutManager.findFirstVisibleItemPositions(new int[staggeredGridLayoutManager.getSpanCount()])[0];
            }
        }
    }

    public final void a(int i) {
        RecyclerView recyclerView = this.f21497a;
        if (recyclerView != null && this.f21498b != -241 && this.f21498b >= i) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                layoutManager.scrollToPosition(this.f21498b);
                return;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                layoutManager.scrollToPosition(this.f21498b);
            }
        }
    }
}
