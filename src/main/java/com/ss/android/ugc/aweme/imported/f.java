package com.ss.android.ugc.aweme.imported;

import android.support.v4.util.Pair;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52916a;

    public static Pair<Integer, Integer> a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, null, f52916a, true, 54463, new Class[]{RecyclerView.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{recyclerView}, null, f52916a, true, 54463, new Class[]{RecyclerView.class}, Pair.class);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new Pair<>(Integer.valueOf(linearLayoutManager.findFirstVisibleItemPosition()), Integer.valueOf(linearLayoutManager.findLastVisibleItemPosition()));
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            return new Pair<>(Integer.valueOf(gridLayoutManager.findFirstVisibleItemPosition()), Integer.valueOf(gridLayoutManager.findLastVisibleItemPosition()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.getSpanCount()];
            staggeredGridLayoutManager.findLastVisibleItemPositions(iArr);
            int i = iArr[0];
            for (int i2 : iArr) {
                if (i2 > i) {
                    i = i2;
                }
            }
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            int i3 = iArr[0];
            for (int i4 : iArr) {
                if (i4 < i3) {
                    i3 = i4;
                }
            }
            return new Pair<>(Integer.valueOf(i3), Integer.valueOf(i));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }
}
