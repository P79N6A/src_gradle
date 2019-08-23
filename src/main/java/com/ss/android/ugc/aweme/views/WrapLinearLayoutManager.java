package com.ss.android.ugc.aweme.views;

import a.i;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.concurrent.Callable;

public class WrapLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76438b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView.Adapter f76439c;

    public WrapLinearLayoutManager(Context context) {
        super(context);
    }

    private IndexOutOfBoundsException a(IndexOutOfBoundsException indexOutOfBoundsException) {
        IndexOutOfBoundsException indexOutOfBoundsException2;
        if (PatchProxy.isSupport(new Object[]{indexOutOfBoundsException}, this, f76438b, false, 89700, new Class[]{IndexOutOfBoundsException.class}, IndexOutOfBoundsException.class)) {
            return (IndexOutOfBoundsException) PatchProxy.accessDispatch(new Object[]{indexOutOfBoundsException}, this, f76438b, false, 89700, new Class[]{IndexOutOfBoundsException.class}, IndexOutOfBoundsException.class);
        }
        if (this.f76439c != null) {
            indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.f76439c.getClass().getName());
            indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
        } else {
            indexOutOfBoundsException2 = indexOutOfBoundsException;
        }
        return indexOutOfBoundsException2;
    }

    public static void a(RecyclerView.Adapter adapter) {
        final RecyclerView.Adapter adapter2 = adapter;
        if (PatchProxy.isSupport(new Object[]{adapter2}, null, f76438b, true, 89702, new Class[]{RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter2}, null, f76438b, true, 89702, new Class[]{RecyclerView.Adapter.class}, Void.TYPE);
        } else if (adapter2 != null) {
            i.a((Callable<TResult>) new Callable<Void>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f76440a;

                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() {
                    if (PatchProxy.isSupport(new Object[0], this, f76440a, false, 89703, new Class[0], Void.class)) {
                        return (Void) PatchProxy.accessDispatch(new Object[0], this, f76440a, false, 89703, new Class[0], Void.class);
                    }
                    try {
                        adapter2.notifyDataSetChanged();
                    } catch (Exception e2) {
                        a.a(adapter2.getClass().getName(), e2);
                    }
                    return null;
                }
            }, i.f1052b);
        }
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        RecyclerView.Adapter adapter3 = adapter2;
        if (PatchProxy.isSupport(new Object[]{adapter, adapter3}, this, f76438b, false, 89695, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter, adapter3}, this, f76438b, false, 89695, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE);
            return;
        }
        super.onAdapterChanged(adapter, adapter2);
        this.f76439c = adapter3;
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IllegalArgumentException illegalArgumentException;
        if (PatchProxy.isSupport(new Object[]{recycler, state}, this, f76438b, false, 89696, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler, state}, this, f76438b, false, 89696, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f76439c != null) {
                a.a(this.f76439c.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
        } catch (IllegalArgumentException e3) {
            IllegalArgumentException illegalArgumentException2 = e3;
            if (this.f76439c != null) {
                String name = this.f76439c.getClass().getName();
                if (PatchProxy.isSupport(new Object[]{illegalArgumentException2}, this, f76438b, false, 89701, new Class[]{IllegalArgumentException.class}, IllegalArgumentException.class)) {
                    illegalArgumentException = (IllegalArgumentException) PatchProxy.accessDispatch(new Object[]{illegalArgumentException2}, this, f76438b, false, 89701, new Class[]{IllegalArgumentException.class}, IllegalArgumentException.class);
                } else if (this.f76439c != null) {
                    illegalArgumentException = new IllegalArgumentException(this.f76439c.getClass().getName(), illegalArgumentException2);
                } else {
                    illegalArgumentException = illegalArgumentException2;
                }
                a.a(name, (Exception) illegalArgumentException);
            }
        } catch (NullPointerException e4) {
            NullPointerException nullPointerException = e4;
            if (this.f76439c != null) {
                a.a(this.f76439c.getClass().getName(), (Exception) nullPointerException);
                a(this.f76439c);
            }
        }
    }

    public WrapLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public int scrollHorizontallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f76438b, false, 89698, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f76438b, false, 89698, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollHorizontallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f76439c != null) {
                a.a(this.f76439c.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
            return 0;
        }
    }

    public int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), recycler, state}, this, f76438b, false, 89697, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), recycler, state}, this, f76438b, false, 89697, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        try {
            return super.scrollVerticallyBy(i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f76439c != null) {
                a.a(this.f76439c.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
            return 0;
        } catch (NullPointerException e3) {
            NullPointerException nullPointerException = e3;
            if (this.f76439c != null) {
                a.a(this.f76439c.getClass().getName(), (Exception) nullPointerException);
                a(this.f76439c);
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public View onFocusSearchFailed(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), recycler, state}, this, f76438b, false, 89699, new Class[]{View.class, Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), recycler, state}, this, f76438b, false, 89699, new Class[]{View.class, Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, View.class);
        }
        try {
            return super.onFocusSearchFailed(view, i, recycler, state);
        } catch (IndexOutOfBoundsException e2) {
            IndexOutOfBoundsException indexOutOfBoundsException = e2;
            if (this.f76439c != null) {
                a.a(this.f76439c.getClass().getName(), (Exception) a(indexOutOfBoundsException));
            }
            return null;
        }
    }
}
