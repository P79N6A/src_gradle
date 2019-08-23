package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;

public class WrapGridLayoutManager extends GridLayoutManager implements j {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76434b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.Adapter f76435c;

    public WrapGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        RecyclerView.Adapter adapter3 = adapter2;
        if (PatchProxy.isSupport(new Object[]{adapter, adapter3}, this, f76434b, false, 89689, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter, adapter3}, this, f76434b, false, 89689, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE);
            return;
        }
        super.onAdapterChanged(adapter, adapter2);
        this.f76435c = adapter3;
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f76434b, false, 89690, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f76434b, false, 89690, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e2) {
            NullPointerException nullPointerException = e2;
            if (this.f76435c != null) {
                a.a(this.f76435c.getClass().getName(), (Exception) nullPointerException);
                WrapLinearLayoutManager.a(this.f76435c);
            }
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f76434b, false, 89691, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f76434b, false, 89691, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e2) {
            NullPointerException nullPointerException = e2;
            if (this.f76435c != null) {
                a.a(this.f76435c.getClass().getName(), (Exception) nullPointerException);
                WrapLinearLayoutManager.a(this.f76435c);
            }
            return 0;
        }
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f76434b, false, 89692, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f76434b, false, 89692, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        AnonymousClass1 r0 = new LinearSmoothScroller(recyclerView.getContext()) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76436a;

            public int calculateTimeForScrolling(int i) {
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76436a, false, 89694, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                    return super.calculateTimeForScrolling(i) * 3;
                }
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76436a, false, 89694, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
            }

            public PointF computeScrollVectorForPosition(int i) {
                if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f76436a, false, 89693, new Class[]{Integer.TYPE}, PointF.class)) {
                    return WrapGridLayoutManager.this.computeScrollVectorForPosition(i);
                }
                return (PointF) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f76436a, false, 89693, new Class[]{Integer.TYPE}, PointF.class);
            }
        };
        int i2 = i;
        r0.setTargetPosition(i);
        startSmoothScroll(r0);
    }

    public WrapGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, 1, false);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
