package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SSGridLayoutManager extends GridLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11774a;

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f11774a, false, 6415, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f11774a, false, 6415, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception unused) {
        }
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f11774a, false, 6416, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f11774a, false, 6416, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollHorizontallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f11774a, false, 6417, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f11774a, false, 6417, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public SSGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
    }

    public SSGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
