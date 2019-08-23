package com.ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;

public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33161a;

    /* renamed from: b  reason: collision with root package name */
    RecyclerView.Adapter f33162b;

    private IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (PatchProxy.isSupport(new Object[]{indexOutOfBoundsException}, this, f33161a, false, 21509, new Class[]{IndexOutOfBoundsException.class}, IndexOutOfBoundsException.class)) {
            return (IndexOutOfBoundsException) PatchProxy.accessDispatch(new Object[]{indexOutOfBoundsException}, this, f33161a, false, 21509, new Class[]{IndexOutOfBoundsException.class}, IndexOutOfBoundsException.class);
        }
        if (this.f33162b != null) {
            indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f33162b.getClass().getName());
            indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        } else {
            indexOutOfBoundsException2 = indexOutOfBoundsException;
        }
        return indexOutOfBoundsException2;
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        RecyclerView.Adapter adapter3 = adapter2;
        if (PatchProxy.isSupport(new Object[]{adapter, adapter3}, this, f33161a, false, 21504, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter, adapter3}, this, f33161a, false, 21504, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE);
            return;
        }
        super.onAdapterChanged(adapter, adapter2);
        this.f33162b = adapter3;
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IllegalArgumentException illegalArgumentException;
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f33161a, false, 21505, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f33161a, false, 21505, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f33162b != null) {
                a.a(this.f33162b.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
        } catch (IllegalArgumentException e3) {
            IllegalArgumentException illegalArgumentException2 = e3;
            if (this.f33162b != null) {
                String name = this.f33162b.getClass().getName();
                if (PatchProxy.isSupport(new Object[]{illegalArgumentException2}, this, f33161a, false, 21510, new Class[]{IllegalArgumentException.class}, IllegalArgumentException.class)) {
                    illegalArgumentException = (IllegalArgumentException) PatchProxy.accessDispatch(new Object[]{illegalArgumentException2}, this, f33161a, false, 21510, new Class[]{IllegalArgumentException.class}, IllegalArgumentException.class);
                } else if (this.f33162b != null) {
                    illegalArgumentException = new IllegalArgumentException(this.f33162b.getClass().getName(), illegalArgumentException2);
                } else {
                    illegalArgumentException = illegalArgumentException2;
                }
                a.a(name, (Exception) illegalArgumentException);
            }
        }
    }

    public WrapLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 1, false);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f33161a, false, 21507, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f33161a, false, 21507, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollHorizontallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f33162b != null) {
                a.a(this.f33162b.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
            return 0;
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f33161a, false, 21506, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f33161a, false, 21506, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f33162b != null) {
                a.a(this.f33162b.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), recycler, state}, this, f33161a, false, 21508, new Class[]{View.class, Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), recycler, state}, this, f33161a, false, 21508, new Class[]{View.class, Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, View.class);
        }
        try {
            return super.onFocusSearchFailed(view, i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f33162b != null) {
                a.a(this.f33162b.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
            return null;
        }
    }
}
