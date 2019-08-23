package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MVLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66532a;

    /* renamed from: b  reason: collision with root package name */
    public float f66533b = 5.0f;

    class EPLinearSmoothScroller extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66534a;

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return MVLinearLayoutManager.this.f66533b / ((float) displayMetrics.densityDpi);
        }

        public PointF computeScrollVectorForPosition(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66534a, false, 75886, new Class[]{Integer.TYPE}, PointF.class)) {
                return MVLinearLayoutManager.this.computeScrollVectorForPosition(i);
            }
            return (PointF) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66534a, false, 75886, new Class[]{Integer.TYPE}, PointF.class);
        }

        public EPLinearSmoothScroller(Context context) {
            super(context);
        }
    }

    public MVLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f66532a, false, 75885, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f66532a, false, 75885, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        EPLinearSmoothScroller ePLinearSmoothScroller = new EPLinearSmoothScroller(recyclerView.getContext());
        int i2 = i;
        ePLinearSmoothScroller.setTargetPosition(i);
        startSmoothScroll(ePLinearSmoothScroller);
    }

    public MVLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
