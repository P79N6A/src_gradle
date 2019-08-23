package com.bytedance.android.livesdk.feed;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FixEmptyItemInStaggeredLayoutScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13930a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f13931b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f13932c;

    /* renamed from: d  reason: collision with root package name */
    private int f13933d;

    public FixEmptyItemInStaggeredLayoutScrollListener(int i) {
        this.f13931b = new int[i];
        this.f13932c = new int[i];
        this.f13933d = i;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13930a, false, 8427, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13930a, false, 8427, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        try {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                staggeredGridLayoutManager.findFirstVisibleItemPositions(this.f13931b);
                if (this.f13931b[0] < this.f13933d) {
                    staggeredGridLayoutManager.invalidateSpanAssignments();
                }
                staggeredGridLayoutManager.findLastVisibleItemPositions(this.f13932c);
                if (this.f13932c[0] >= staggeredGridLayoutManager.getItemCount() - this.f13933d) {
                    staggeredGridLayoutManager.invalidateSpanAssignments();
                }
            }
        } catch (Exception unused) {
        }
    }
}
