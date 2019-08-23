package com.ss.android.ugc.aweme.shortvideo.widget.baseadapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.a;

public class HeaderAndFooterWrapper extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71409a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArrayCompat<View> f71410b = new SparseArrayCompat<>();

    /* renamed from: c  reason: collision with root package name */
    public SparseArrayCompat<View> f71411c = new SparseArrayCompat<>();

    /* renamed from: d  reason: collision with root package name */
    private RecyclerView.Adapter f71412d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView.AdapterDataObserver f71413e = new RecyclerView.AdapterDataObserver() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71416a;

        public void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f71416a, false, 81528, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f71416a, false, 81528, new Class[0], Void.TYPE);
                return;
            }
            HeaderAndFooterWrapper.this.notifyDataSetChanged();
        }

        public void onItemRangeChanged(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71416a, false, 81529, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71416a, false, 81529, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            HeaderAndFooterWrapper.this.notifyItemRangeChanged(HeaderAndFooterWrapper.this.a() + i, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71416a, false, 81531, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71416a, false, 81531, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            HeaderAndFooterWrapper.this.notifyItemRangeInserted(HeaderAndFooterWrapper.this.a() + i, i2);
        }

        public void onItemRangeRemoved(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71416a, false, 81532, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71416a, false, 81532, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            HeaderAndFooterWrapper.this.notifyItemRangeRemoved(HeaderAndFooterWrapper.this.a() + i, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71416a, false, 81533, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f71416a, false, 81533, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            HeaderAndFooterWrapper.this.notifyItemMoved(HeaderAndFooterWrapper.this.a() + i, HeaderAndFooterWrapper.this.a() + i2);
        }

        public void onItemRangeChanged(int i, int i2, @Nullable Object obj) {
            Object obj2 = obj;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f71416a, false, 81530, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), obj2}, this, f71416a, false, 81530, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            int i3 = i2;
            HeaderAndFooterWrapper.this.notifyItemRangeChanged(HeaderAndFooterWrapper.this.a() + i, i2, obj2);
        }
    };

    private int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f71409a, false, 81513, new Class[0], Integer.TYPE)) {
            return this.f71412d.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71409a, false, 81513, new Class[0], Integer.TYPE)).intValue();
    }

    private int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f71409a, false, 81526, new Class[0], Integer.TYPE)) {
            return this.f71411c.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71409a, false, 81526, new Class[0], Integer.TYPE)).intValue();
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f71409a, false, 81525, new Class[0], Integer.TYPE)) {
            return this.f71410b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71409a, false, 81525, new Class[0], Integer.TYPE)).intValue();
    }

    public int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f71409a, false, 81515, new Class[0], Integer.TYPE)) {
            return a() + c() + b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f71409a, false, 81515, new Class[0], Integer.TYPE)).intValue();
    }

    public HeaderAndFooterWrapper(RecyclerView.Adapter adapter) {
        this.f71412d = adapter;
    }

    public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver}, this, f71409a, false, 81517, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver}, this, f71409a, false, 81517, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f71412d.registerAdapterDataObserver(this.f71413e);
    }

    public void unregisterAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver}, this, f71409a, false, 81518, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver}, this, f71409a, false, 81518, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f71412d.unregisterAdapterDataObserver(this.f71413e);
    }

    private boolean a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71409a, false, 81520, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71409a, false, 81520, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i < a()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71409a, false, 81521, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71409a, false, 81521, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (i >= a() + b()) {
            return true;
        } else {
            return false;
        }
    }

    public int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71409a, false, 81512, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71409a, false, 81512, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (a(i)) {
            return this.f71410b.keyAt(i);
        } else {
            if (b(i)) {
                return this.f71411c.keyAt((i - a()) - b());
            }
            return this.f71412d.getItemViewType(i - a());
        }
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f71409a, false, 81523, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f71409a, false, 81523, new Class[]{View.class}, Void.TYPE);
            return;
        }
        this.f71411c.put(this.f71411c.size() + 200000, view);
        notifyItemRangeChanged(getItemCount() - c(), c());
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f71409a, false, 81516, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f71409a, false, 81516, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        RecyclerView.Adapter adapter = this.f71412d;
        AnonymousClass1 r1 = new a.C0743a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f71414a;

            public final int a(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup, int i) {
                GridLayoutManager.SpanSizeLookup spanSizeLookup2 = spanSizeLookup;
                int i2 = i;
                if (PatchProxy.isSupport(new Object[]{gridLayoutManager, spanSizeLookup2, Integer.valueOf(i)}, this, f71414a, false, 81527, new Class[]{GridLayoutManager.class, GridLayoutManager.SpanSizeLookup.class, Integer.TYPE}, Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[]{gridLayoutManager, spanSizeLookup2, Integer.valueOf(i)}, this, f71414a, false, 81527, new Class[]{GridLayoutManager.class, GridLayoutManager.SpanSizeLookup.class, Integer.TYPE}, Integer.TYPE)).intValue();
                }
                int itemViewType = HeaderAndFooterWrapper.this.getItemViewType(i2);
                if (HeaderAndFooterWrapper.this.f71410b.get(itemViewType) != null) {
                    return gridLayoutManager.getSpanCount();
                }
                if (HeaderAndFooterWrapper.this.f71411c.get(itemViewType) != null) {
                    return gridLayoutManager.getSpanCount();
                }
                if (spanSizeLookup2 != null) {
                    return spanSizeLookup2.getSpanSize(i2 - HeaderAndFooterWrapper.this.a());
                }
                return 1;
            }
        };
        if (PatchProxy.isSupport(new Object[]{adapter, recyclerView2, r1}, null, a.f71426a, true, 81560, new Class[]{RecyclerView.Adapter.class, RecyclerView.class, a.C0743a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter, recyclerView2, r1}, null, a.f71426a, true, 81560, new Class[]{RecyclerView.Adapter.class, RecyclerView.class, a.C0743a.class}, Void.TYPE);
            return;
        }
        adapter.onAttachedToRecyclerView(recyclerView2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new WrapperUtils$1(r1, gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
            gridLayoutManager.setSpanCount(gridLayoutManager.getSpanCount());
        }
    }

    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f71409a, false, 81519, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f71409a, false, 81519, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        this.f71412d.onViewAttachedToWindow(viewHolder2);
        int layoutPosition = viewHolder.getLayoutPosition();
        if (a(layoutPosition) || b(layoutPosition)) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2}, null, a.f71426a, true, 81561, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2}, null, a.f71426a, true, 81561, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                return;
            }
            ViewGroup.LayoutParams layoutParams = viewHolder2.itemView.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
            }
        }
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f71409a, false, 81514, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f71409a, false, 81514, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (!a(i) && !b(i)) {
            this.f71412d.onBindViewHolder(viewHolder, i - a());
        }
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f71409a, false, 81511, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f71409a, false, 81511, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (this.f71410b.get(i) != null) {
            ViewHolder a2 = ViewHolder.a(viewGroup.getContext(), (View) this.f71410b.get(i));
            a2.setIsRecyclable(false);
            return a2;
        } else if (this.f71411c.get(i) == null) {
            return this.f71412d.onCreateViewHolder(viewGroup, i);
        } else {
            ViewHolder a3 = ViewHolder.a(viewGroup.getContext(), (View) this.f71411c.get(i));
            a3.setIsRecyclable(false);
            return a3;
        }
    }
}
