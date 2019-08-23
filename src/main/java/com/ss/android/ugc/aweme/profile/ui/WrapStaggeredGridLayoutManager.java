package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.views.j;

public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62440a;

    public WrapStaggeredGridLayoutManager(int i, int i2) {
        super(2, 1);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f62440a, false, 69314, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f62440a, false, 69314, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f62440a, false, 69315, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f62440a, false, 69315, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
