package com.ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FixedLinearlayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58130a;

    public FixedLinearlayoutManager(Context context) {
        super(context);
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f58130a, false, 63287, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f58130a, false, 63287, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception unused) {
        }
    }

    public FixedLinearlayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
