package com.bytedance.android.live.core.utils;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class ab {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8232a;

    public static void a(RecyclerView recyclerView, int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, null, f8232a, true, 1235, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, null, f8232a, true, 1235, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
        } else if (i2 >= 0) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).scrollToPositionWithOffset(i2, 0);
                return;
            }
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                ((StaggeredGridLayoutManager) layoutManager).scrollToPositionWithOffset(i2, 0);
            }
        }
    }
}
