package com.bytedance.android.livesdk.chatroom.ui;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class SmoothLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11787a;

    /* renamed from: b  reason: collision with root package name */
    public float f11788b = 25.0f;

    public SmoothLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 1, false);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f11787a, false, 6441, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f11787a, false, 6441, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i < 0) {
            i2 = 0;
        } else {
            i2 = i;
        }
        AnonymousClass1 r1 = new LinearSmoothScroller(recyclerView.getContext()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f11789a;

            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return SmoothLinearLayoutManager.this.f11788b / ((float) displayMetrics.densityDpi);
            }

            public PointF computeScrollVectorForPosition(int i) {
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f11789a, false, 6442, new Class[]{Integer.TYPE}, PointF.class)) {
                    return SmoothLinearLayoutManager.this.computeScrollVectorForPosition(i);
                }
                return (PointF) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f11789a, false, 6442, new Class[]{Integer.TYPE}, PointF.class);
            }
        };
        r1.setTargetPosition(i2);
        startSmoothScroll(r1);
    }

    public SmoothLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
