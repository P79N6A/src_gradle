package com.bytedance.android.live.core.paging.adapter;

import android.support.annotation.NonNull;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.android.live.core.viewholder.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public abstract class SimplePagingAdapter<T> extends PagingAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7914a;
    public Map<Integer, a> m;
    public Object[] n;

    public static class ItemComparator extends DiffUtil.ItemCallback {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7915a;

        public boolean areItemsTheSame(@NonNull Object obj, @NonNull Object obj2) {
            return obj == obj2;
        }

        public boolean areContentsTheSame(@NonNull Object obj, @NonNull Object obj2) {
            if (!PatchProxy.isSupport(new Object[]{obj, obj2}, this, f7915a, false, 514, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                return obj.equals(obj2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj, obj2}, this, f7915a, false, 514, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
        }
    }

    public int a(int i, T t) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), t}, this, f7914a, false, 513, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)) {
            return -8888;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), t}, this, f7914a, false, 513, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)).intValue();
    }

    public SimplePagingAdapter(@NonNull DiffUtil.ItemCallback<T> itemCallback, @NonNull Map<Integer, a> map) {
        super(itemCallback);
        this.m = map;
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f7914a, false, 512, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f7914a, false, 512, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        a aVar = this.m.get(Integer.valueOf(i));
        if (aVar == null) {
            return new InvalidItemViewHolder(viewGroup);
        }
        return aVar.a(viewGroup, this.n);
    }
}
