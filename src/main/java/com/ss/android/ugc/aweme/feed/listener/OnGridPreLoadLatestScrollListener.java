package com.ss.android.ugc.aweme.feed.listener;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class OnGridPreLoadLatestScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45606a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45607b;

    /* renamed from: c  reason: collision with root package name */
    private l f45608c;

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f45606a, false, 41364, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f45606a, false, 41364, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45606a, false, 41363, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f45606a, false, 41363, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.f45607b && this.f45608c != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            if (gridLayoutManager.findFirstVisibleItemPosition() == 2) {
                gridLayoutManager.findFirstCompletelyVisibleItemPosition();
            }
        }
    }
}
