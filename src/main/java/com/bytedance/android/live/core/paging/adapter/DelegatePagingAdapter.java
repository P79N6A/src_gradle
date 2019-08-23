package com.bytedance.android.live.core.paging.adapter;

import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class DelegatePagingAdapter<T> extends PagingAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7893a;
    private a m;

    static class ItemCallback<T> extends DiffUtil.ItemCallback<T> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7894a;

        /* renamed from: b  reason: collision with root package name */
        private a<T> f7895b;

        ItemCallback(a<T> aVar) {
            this.f7895b = aVar;
        }

        public boolean areContentsTheSame(T t, T t2) {
            T t3 = t;
            T t4 = t2;
            if (!PatchProxy.isSupport(new Object[]{t3, t4}, this, f7894a, false, 458, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                return this.f7895b.b(t3, t4);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t3, t4}, this, f7894a, false, 458, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }

        public boolean areItemsTheSame(T t, T t2) {
            T t3 = t;
            T t4 = t2;
            if (!PatchProxy.isSupport(new Object[]{t3, t4}, this, f7894a, false, 457, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                return this.f7895b.a(t3, t4);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{t3, t4}, this, f7894a, false, 457, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
    }

    public interface a<V> {
        int a(int i, V v);

        RecyclerView.ViewHolder a(ViewGroup viewGroup, int i);

        boolean a(V v, V v2);

        boolean b(V v, V v2);
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f7893a, false, 455, new Class[0], Integer.TYPE)) {
            return super.a();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7893a, false, 455, new Class[0], Integer.TYPE)).intValue();
    }

    public DelegatePagingAdapter(a<T> aVar) {
        super(new ItemCallback(aVar));
        this.m = aVar;
    }

    public final int a(int i, T t) {
        T t2 = t;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), t2}, this, f7893a, false, 453, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)) {
            return this.m.a(i, t2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), t2}, this, f7893a, false, 453, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)).intValue();
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f7893a, false, 452, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return this.m.a(viewGroup2, i);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f7893a, false, 452, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f7893a, false, 454, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f7893a, false, 454, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        getItem(i);
    }
}
