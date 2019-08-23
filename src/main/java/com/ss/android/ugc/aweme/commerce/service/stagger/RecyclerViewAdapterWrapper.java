package com.ss.android.ugc.aweme.commerce.service.stagger;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class RecyclerViewAdapterWrapper extends RecyclerView.Adapter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38248a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.Adapter f38249b;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f38248a, false, 29922, new Class[0], Integer.TYPE)) {
            return this.f38249b.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f38248a, false, 29922, new Class[0], Integer.TYPE)).intValue();
    }

    RecyclerViewAdapterWrapper(RecyclerView.Adapter adapter) {
        this.f38249b = adapter;
        this.f38249b.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38250a;

            public void onChanged() {
                if (PatchProxy.isSupport(new Object[0], this, f38250a, false, 29934, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f38250a, false, 29934, new Class[0], Void.TYPE);
                    return;
                }
                RecyclerViewAdapterWrapper.this.notifyDataSetChanged();
            }

            public void onItemRangeChanged(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38250a, false, 29935, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38250a, false, 29935, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                RecyclerViewAdapterWrapper.this.notifyItemRangeChanged(i, i2);
            }

            public void onItemRangeInserted(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38250a, false, 29936, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38250a, false, 29936, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                RecyclerViewAdapterWrapper.this.notifyItemRangeInserted(i, i2);
            }

            public void onItemRangeRemoved(int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38250a, false, 29937, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f38250a, false, 29937, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                RecyclerViewAdapterWrapper.this.notifyItemRangeRemoved(i, i2);
            }

            public void onItemRangeMoved(int i, int i2, int i3) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f38250a, false, 29938, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f38250a, false, 29938, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                RecyclerViewAdapterWrapper.this.notifyItemMoved(i, i2);
            }
        });
    }

    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f38248a, false, 29932, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f38248a, false, 29932, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        this.f38249b.onAttachedToRecyclerView(recyclerView2);
    }

    public void onDetachedFromRecyclerView(@NonNull RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f38248a, false, 29933, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f38248a, false, 29933, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        this.f38249b.onDetachedFromRecyclerView(recyclerView2);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f38248a, false, 29928, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f38248a, false, 29928, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        this.f38249b.onViewAttachedToWindow(viewHolder2);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f38248a, false, 29929, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f38248a, false, 29929, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        this.f38249b.onViewDetachedFromWindow(viewHolder2);
    }

    public void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f38248a, false, 29926, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f38248a, false, 29926, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        this.f38249b.onViewRecycled(viewHolder2);
    }

    public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f38248a, false, 29930, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f38248a, false, 29930, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        this.f38249b.registerAdapterDataObserver(adapterDataObserver2);
    }

    public void unregisterAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f38248a, false, 29931, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f38248a, false, 29931, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        this.f38249b.unregisterAdapterDataObserver(adapterDataObserver2);
    }

    public long getItemId(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38248a, false, 29925, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return this.f38249b.getItemId(i);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38248a, false, 29925, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
    }

    public int getItemViewType(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f38248a, false, 29923, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f38249b.getItemViewType(i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f38248a, false, 29923, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public boolean onFailedToRecycleView(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (!PatchProxy.isSupport(new Object[]{viewHolder2}, this, f38248a, false, 29927, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return this.f38249b.onFailedToRecycleView(viewHolder2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f38248a, false, 29927, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
    }

    public void setHasStableIds(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38248a, false, 29924, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38248a, false, 29924, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f38249b.setHasStableIds(z);
    }

    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f38248a, false, 29921, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f38248a, false, 29921, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f38249b.onBindViewHolder(viewHolder2, i);
    }

    @NonNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f38248a, false, 29920, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return this.f38249b.onCreateViewHolder(viewGroup2, i);
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f38248a, false, 29920, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }
}
