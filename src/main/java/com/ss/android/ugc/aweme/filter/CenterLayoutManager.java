package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CenterLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47303a;

    static class CenterSmoothScroller extends LinearSmoothScroller {
        CenterSmoothScroller(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    public CenterLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f47303a, false, 43998, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f47303a, false, 43998, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(recyclerView.getContext());
        centerSmoothScroller.setTargetPosition(i);
        startSmoothScroll(centerSmoothScroller);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
