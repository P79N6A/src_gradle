package com.ss.android.ugc.aweme.feed.ui.stickyrecyclerview.d;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46929a;

    private void a(RecyclerView.LayoutManager layoutManager) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (PatchProxy.isSupport(new Object[]{layoutManager2}, this, f46929a, false, 43576, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutManager2}, this, f46929a, false, 43576, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE);
        } else if (!(layoutManager2 instanceof LinearLayoutManager)) {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }

    public final boolean b(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f46929a, false, 43575, new Class[]{RecyclerView.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f46929a, false, 43575, new Class[]{RecyclerView.class}, Boolean.TYPE)).booleanValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getReverseLayout();
    }

    public final int a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f46929a, false, 43574, new Class[]{RecyclerView.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f46929a, false, 43574, new Class[]{RecyclerView.class}, Integer.TYPE)).intValue();
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getOrientation();
    }
}
