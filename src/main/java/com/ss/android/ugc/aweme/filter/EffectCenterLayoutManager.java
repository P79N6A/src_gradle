package com.ss.android.ugc.aweme.filter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;

public class EffectCenterLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47309a;

    /* renamed from: b  reason: collision with root package name */
    private RecyclerView.SmoothScroller f47310b;

    static class EffectCenterSmoothScroller extends LinearSmoothScroller {
        EffectCenterSmoothScroller(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 200.0f / ((float) displayMetrics.densityDpi);
        }

        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }
    }

    public void scrollToPosition(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f47309a, false, 44023, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f47309a, false, 44023, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        scrollToPositionWithOffset(i, (int) (((float) (getWidth() / 2)) - UIUtils.dip2Px(a.f61119b, 45.0f)));
    }

    public EffectCenterLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f47309a, false, 44022, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f47309a, false, 44022, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f47310b == null) {
            this.f47310b = new EffectCenterSmoothScroller(recyclerView.getContext());
        }
        int i2 = i;
        this.f47310b.setTargetPosition(i);
        startSmoothScroll(this.f47310b);
    }

    public EffectCenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
