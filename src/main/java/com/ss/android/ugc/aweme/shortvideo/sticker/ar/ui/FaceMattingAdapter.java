package com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FaceMattingAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f69437a;

    /* renamed from: b  reason: collision with root package name */
    private FaceMattingLoadAdapter f69438b;

    /* renamed from: c  reason: collision with root package name */
    private FaceMattingNormalAdapter f69439c;

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f69437a, false, 79012, new Class[0], Integer.TYPE)) {
            return this.f69439c.getItemCount() + this.f69438b.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f69437a, false, 79012, new Class[0], Integer.TYPE)).intValue();
    }

    public long getItemId(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69437a, false, 79007, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69437a, false, 79007, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        } else if (i < this.f69439c.getItemCount()) {
            return this.f69439c.getItemId(i);
        } else {
            return super.getItemId(i);
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f69437a, false, 79002, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f69437a, false, 79002, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i < this.f69439c.getItemCount()) {
            return 0;
        } else {
            return 1;
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f69437a, false, 79003, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f69437a, false, 79003, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f69439c.onAttachedToRecyclerView(recyclerView2);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f69437a, false, 79004, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f69437a, false, 79004, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onDetachedFromRecyclerView(recyclerView);
        this.f69439c.onDetachedFromRecyclerView(recyclerView2);
    }

    public boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f69437a, false, 79009, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f69437a, false, 79009, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (viewHolder2 instanceof FaceMattingLoadingViewHolder) {
            return super.onFailedToRecycleView(viewHolder);
        } else {
            return this.f69439c.onFailedToRecycleView((FaceMattingNormalViewHolder) viewHolder2);
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f69437a, false, 79010, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f69437a, false, 79010, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof FaceMattingLoadingViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f69439c.onViewAttachedToWindow((FaceMattingNormalViewHolder) viewHolder2);
        }
    }

    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f69437a, false, 79011, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f69437a, false, 79011, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof FaceMattingLoadingViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f69439c.onViewDetachedFromWindow((FaceMattingNormalViewHolder) viewHolder2);
        }
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f69437a, false, 79008, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f69437a, false, 79008, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof FaceMattingLoadingViewHolder) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f69439c.onViewRecycled((FaceMattingNormalViewHolder) viewHolder2);
        }
    }

    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f69437a, false, 79005, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f69437a, false, 79005, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f69439c.registerAdapterDataObserver(adapterDataObserver2);
    }

    public void setHasStableIds(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f69437a, false, 79006, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f69437a, false, 79006, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f69439c.setHasStableIds(z);
    }

    public FaceMattingAdapter(@NonNull FaceMattingLoadAdapter faceMattingLoadAdapter, @NonNull FaceMattingNormalAdapter faceMattingNormalAdapter) {
        this.f69438b = faceMattingLoadAdapter;
        this.f69439c = faceMattingNormalAdapter;
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69437a, false, 79001, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f69437a, false, 79001, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (viewHolder instanceof FaceMattingNormalViewHolder) {
            this.f69439c.onBindViewHolder((FaceMattingNormalViewHolder) viewHolder, i);
        } else {
            if (viewHolder instanceof FaceMattingLoadingViewHolder) {
                FaceMattingLoadingViewHolder faceMattingLoadingViewHolder = (FaceMattingLoadingViewHolder) viewHolder;
                faceMattingLoadingViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f69440a;

                    public final void onClick(View view) {
                        if (PatchProxy.isSupport(new Object[]{view}, this, f69440a, false, 79014, new Class[]{View.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{view}, this, f69440a, false, 79014, new Class[]{View.class}, Void.TYPE);
                            return;
                        }
                        ClickInstrumentation.onClick(view);
                    }
                });
                this.f69438b.onBindViewHolder(faceMattingLoadingViewHolder, i);
            }
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69437a, false, 79000, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f69437a, false, 79000, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 1) {
            return this.f69438b.onCreateViewHolder(viewGroup, i);
        } else {
            return this.f69439c.onCreateViewHolder(viewGroup, i);
        }
    }
}
