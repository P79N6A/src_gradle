package com.ss.android.ugc.aweme.utils;

import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v4.util.Pair;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class di {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75752a;

    private static int a(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    private static int b(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    @Nullable
    public static Rect a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, null, f75752a, true, 88518, new Class[]{RecyclerView.ViewHolder.class}, Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[]{viewHolder2}, null, f75752a, true, 88518, new Class[]{RecyclerView.ViewHolder.class}, Rect.class);
        } else if (viewHolder2 == null || viewHolder2.itemView == null) {
            return null;
        } else {
            View view = viewHolder2.itemView;
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
            return rect;
        }
    }

    public static void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, null, f75752a, true, 88519, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, null, f75752a, true, 88519, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (recyclerView2 != null) {
            recyclerView2.setPadding(0, (int) UIUtils.dip2Px(recyclerView.getContext(), 6.0f), 0, 0);
            recyclerView2.setClipToPadding(false);
        }
    }

    public static Pair<Integer, Integer> a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, null, f75752a, true, 88517, new Class[]{RecyclerView.class}, Pair.class)) {
            return (Pair) PatchProxy.accessDispatch(new Object[]{recyclerView}, null, f75752a, true, 88517, new Class[]{RecyclerView.class}, Pair.class);
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
            int a2 = a(iArr);
            staggeredGridLayoutManager.findFirstVisibleItemPositions(iArr);
            return new Pair<>(Integer.valueOf(b(iArr)), Integer.valueOf(a2));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }
}
