package com.ss.android.ugc.aweme.im.sdk.widget;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class WrapGridLayoutManager extends GridLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52824a;

    public WrapGridLayoutManager(Context context, int i) {
        super(context, 3);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f52824a, false, 54203, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f52824a, false, 54203, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
