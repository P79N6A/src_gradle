package com.bytedance.android.livesdk.feed.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FeedOwnerAdapter$2 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13937a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f13938b;

    public FeedOwnerAdapter$2(c cVar) {
        this.f13938b = cVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13937a, false, 8506, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13937a, false, 8506, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            this.f13938b.f13953b.b();
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int[] findFirstVisibleItemPositions = staggeredGridLayoutManager.findFirstVisibleItemPositions(null);
                if (findFirstVisibleItemPositions[0] >= 0 && findFirstVisibleItemPositions[0] < 3) {
                    staggeredGridLayoutManager.invalidateSpanAssignments();
                }
            }
            return;
        }
        this.f13938b.f13953b.c();
    }

    public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f13937a, false, 8507, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f13937a, false, 8507, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (i > 0 || i2 > 0) {
            this.f13938b.f13953b.c();
        }
    }
}
