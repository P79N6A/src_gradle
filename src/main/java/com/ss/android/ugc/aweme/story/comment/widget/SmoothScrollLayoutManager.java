package com.ss.android.ugc.aweme.story.comment.widget;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SmoothScrollLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72336a;

    /* renamed from: b  reason: collision with root package name */
    Context f72337b;

    /* renamed from: c  reason: collision with root package name */
    public float f72338c = 500.0f;

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f72336a, false, 83086, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f72336a, false, 83086, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new LinearSmoothScroller(recyclerView.getContext()) {
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return SmoothScrollLayoutManager.this.f72338c / ((float) displayMetrics.densityDpi);
            }
        };
        int i2 = i;
        r0.setTargetPosition(i);
        startSmoothScroll(r0);
    }

    public SmoothScrollLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f72337b = context;
    }
}
