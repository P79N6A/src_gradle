package com.ss.android.ugc.aweme.discover.adapter;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public final class LoadMoreAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41675a;

    /* renamed from: b  reason: collision with root package name */
    public int f41676b = 1;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView.Adapter<VH> f41677c;

    /* renamed from: d  reason: collision with root package name */
    final r f41678d;

    /* renamed from: e  reason: collision with root package name */
    final b f41679e;

    /* renamed from: f  reason: collision with root package name */
    RecyclerView f41680f;
    LoadMoreGridSpanSizeLookup g;
    RecyclerView.OnScrollListener h;

    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    static class BottomReachedDetector extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41681a;

        /* renamed from: b  reason: collision with root package name */
        b f41682b;

        BottomReachedDetector(b bVar) {
            this.f41682b = bVar;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f41681a, false, 35680, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f41681a, false, 35680, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerView recyclerView2 = recyclerView;
            if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f41681a, false, 35681, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f41681a, false, 35681, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            recyclerView2.canScrollVertically(1);
        }
    }

    static class DefaultLoadMoreViewHolder extends LoadMoreViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41683a;

        /* renamed from: b  reason: collision with root package name */
        q f41684b;

        DefaultLoadMoreViewHolder(View view) {
            super(view);
            this.f41684b = (q) view;
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41683a, false, 35683, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41683a, false, 35683, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f41684b.setState(i);
        }
    }

    static class LoadMoreGridSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41685a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f41686b;

        /* renamed from: c  reason: collision with root package name */
        GridLayoutManager f41687c;

        /* renamed from: d  reason: collision with root package name */
        GridLayoutManager.SpanSizeLookup f41688d;

        LoadMoreGridSpanSizeLookup() {
        }

        public int getSpanSize(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41685a, false, 35685, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41685a, false, 35685, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
            } else if (i < this.f41686b.getAdapter().getItemCount() - 1) {
                return this.f41688d.getSpanSize(i);
            } else {
                return this.f41687c.getSpanCount();
            }
        }
    }

    static class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41689a;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final LoadMoreViewHolder a(ViewGroup viewGroup) {
            if (!PatchProxy.isSupport(new Object[]{viewGroup}, this, f41689a, false, 35682, new Class[]{ViewGroup.class}, LoadMoreViewHolder.class)) {
                return new DefaultLoadMoreViewHolder(new q(viewGroup.getContext()));
            }
            return (LoadMoreViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup}, this, f41689a, false, 35682, new Class[]{ViewGroup.class}, LoadMoreViewHolder.class);
        }
    }

    public interface b {
    }

    public final int getItemCount() {
        if (!PatchProxy.isSupport(new Object[0], this, f41675a, false, 35665, new Class[0], Integer.TYPE)) {
            return this.f41677c.getItemCount() + 1;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f41675a, false, 35665, new Class[0], Integer.TYPE)).intValue();
    }

    public static <VH extends RecyclerView.ViewHolder> LoadMoreAdapter<VH> a(RecyclerView.Adapter<VH> adapter) {
        RecyclerView.Adapter<VH> adapter2 = adapter;
        if (!PatchProxy.isSupport(new Object[]{adapter2}, null, f41675a, true, 35660, new Class[]{RecyclerView.Adapter.class}, LoadMoreAdapter.class)) {
            return a(adapter2, (r) null);
        }
        return (LoadMoreAdapter) PatchProxy.accessDispatch(new Object[]{adapter2}, null, f41675a, true, 35660, new Class[]{RecyclerView.Adapter.class}, LoadMoreAdapter.class);
    }

    public final long getItemId(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41675a, false, 35669, new Class[]{Integer.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41675a, false, 35669, new Class[]{Integer.TYPE}, Long.TYPE)).longValue();
        } else if (i < this.f41677c.getItemCount()) {
            return this.f41677c.getItemId(i);
        } else {
            return super.getItemId(i);
        }
    }

    public final int getItemViewType(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41675a, false, 35666, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41675a, false, 35666, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i < this.f41677c.getItemCount()) {
            return this.f41677c.getItemViewType(i);
        } else {
            return 65298;
        }
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f41675a, false, 35677, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f41675a, false, 35677, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        this.f41677c.onDetachedFromRecyclerView(recyclerView);
        if (this.g != null) {
            this.g = null;
        }
        if (this.h != null) {
            this.f41680f.removeOnScrollListener(this.h);
        }
        this.f41680f = null;
        super.onDetachedFromRecyclerView(recyclerView);
    }

    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f41675a, false, 35671, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f41675a, false, 35671, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        } else if (viewHolder2 instanceof LoadMoreViewHolder) {
            return super.onFailedToRecycleView(viewHolder);
        } else {
            return this.f41677c.onFailedToRecycleView(viewHolder2);
        }
    }

    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f41675a, false, 35672, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f41675a, false, 35672, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof LoadMoreViewHolder) {
            super.onViewAttachedToWindow(viewHolder);
        } else {
            this.f41677c.onViewAttachedToWindow(viewHolder2);
        }
    }

    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f41675a, false, 35673, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f41675a, false, 35673, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof LoadMoreViewHolder) {
            super.onViewDetachedFromWindow(viewHolder);
        } else {
            this.f41677c.onViewDetachedFromWindow(viewHolder2);
        }
    }

    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f41675a, false, 35670, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f41675a, false, 35670, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
        } else if (viewHolder2 instanceof LoadMoreViewHolder) {
            super.onViewRecycled(viewHolder);
        } else {
            this.f41677c.onViewRecycled(viewHolder2);
        }
    }

    public final void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f41675a, false, 35674, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f41675a, false, 35674, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f41677c.registerAdapterDataObserver(adapterDataObserver2);
    }

    public final void setHasStableIds(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f41675a, false, 35668, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f41675a, false, 35668, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f41677c.setHasStableIds(z);
    }

    public final void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f41675a, false, 35675, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f41675a, false, 35675, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f41677c.unregisterAdapterDataObserver(adapterDataObserver2);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2}, this, f41675a, false, 35676, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2}, this, f41675a, false, 35676, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.f41680f = recyclerView2;
        if (this.g == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            this.g = new LoadMoreGridSpanSizeLookup();
            LoadMoreGridSpanSizeLookup loadMoreGridSpanSizeLookup = this.g;
            if (PatchProxy.isSupport(new Object[]{recyclerView2}, loadMoreGridSpanSizeLookup, LoadMoreGridSpanSizeLookup.f41685a, false, 35684, new Class[]{RecyclerView.class}, Void.TYPE)) {
                LoadMoreGridSpanSizeLookup loadMoreGridSpanSizeLookup2 = loadMoreGridSpanSizeLookup;
                PatchProxy.accessDispatch(new Object[]{recyclerView2}, loadMoreGridSpanSizeLookup2, LoadMoreGridSpanSizeLookup.f41685a, false, 35684, new Class[]{RecyclerView.class}, Void.TYPE);
            } else {
                loadMoreGridSpanSizeLookup.f41686b = recyclerView2;
                loadMoreGridSpanSizeLookup.f41687c = (GridLayoutManager) recyclerView.getLayoutManager();
                loadMoreGridSpanSizeLookup.f41688d = loadMoreGridSpanSizeLookup.f41687c.getSpanSizeLookup();
                loadMoreGridSpanSizeLookup.f41687c.setSpanSizeLookup(loadMoreGridSpanSizeLookup);
            }
        }
        if (this.h == null && this.f41679e != null) {
            this.h = new BottomReachedDetector(this.f41679e);
        }
        if (this.h != null) {
            this.f41680f.addOnScrollListener(this.h);
        }
        this.f41677c.onAttachedToRecyclerView(recyclerView2);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f41675a, false, 35678, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f41675a, false, 35678, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i == 0 || i == 1 || i == 3 || i == 2) {
            int i2 = this.f41676b;
            if (i2 != i) {
                this.f41676b = i;
                a(i2, i);
            }
        } else {
            throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
        }
    }

    private static <VH extends RecyclerView.ViewHolder> LoadMoreAdapter<VH> a(RecyclerView.Adapter<VH> adapter, r rVar) {
        RecyclerView.Adapter<VH> adapter2 = adapter;
        if (!PatchProxy.isSupport(new Object[]{adapter2, null}, null, f41675a, true, 35661, new Class[]{RecyclerView.Adapter.class, r.class}, LoadMoreAdapter.class)) {
            return a(adapter2, null, null);
        }
        return (LoadMoreAdapter) PatchProxy.accessDispatch(new Object[]{adapter2, null}, null, f41675a, true, 35661, new Class[]{RecyclerView.Adapter.class, r.class}, LoadMoreAdapter.class);
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (PatchProxy.isSupport(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41675a, false, 35664, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder, Integer.valueOf(i)}, this, f41675a, false, 35664, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
        } else if (i < this.f41677c.getItemCount()) {
            this.f41677c.onBindViewHolder(viewHolder, i);
        } else {
            ((LoadMoreViewHolder) viewHolder).a(this.f41676b);
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f41675a, false, 35663, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f41675a, false, 35663, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i == 65298) {
            return this.f41678d.a(viewGroup);
        } else {
            return this.f41677c.onCreateViewHolder(viewGroup, i);
        }
    }

    private void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f41675a, false, 35679, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f41675a, false, 35679, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        notifyItemChanged(getItemCount() - 1);
    }

    private LoadMoreAdapter(RecyclerView.Adapter<VH> adapter, r rVar, b bVar) {
        this.f41677c = adapter;
        this.f41678d = rVar;
        this.f41679e = bVar;
    }

    private static <VH extends RecyclerView.ViewHolder> LoadMoreAdapter<VH> a(RecyclerView.Adapter<VH> adapter, r rVar, b bVar) {
        r rVar2;
        RecyclerView.Adapter<VH> adapter2 = adapter;
        if (PatchProxy.isSupport(new Object[]{adapter2, rVar, null}, null, f41675a, true, 35662, new Class[]{RecyclerView.Adapter.class, r.class, b.class}, LoadMoreAdapter.class)) {
            return (LoadMoreAdapter) PatchProxy.accessDispatch(new Object[]{adapter2, rVar, null}, null, f41675a, true, 35662, new Class[]{RecyclerView.Adapter.class, r.class, b.class}, LoadMoreAdapter.class);
        } else if (adapter2 == null) {
            throw new NullPointerException();
        } else if (!(adapter2 instanceof LoadMoreAdapter)) {
            if (rVar == null) {
                rVar2 = new a((byte) 0);
            } else {
                rVar2 = rVar;
            }
            return new LoadMoreAdapter<>(adapter2, rVar2, null);
        } else {
            throw new IllegalArgumentException("LoadMoreAdapter can't wrap itself.");
        }
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        List<Object> list2 = list;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i), list2}, this, f41675a, false, 35667, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i), list2}, this, f41675a, false, 35667, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE, List.class}, Void.TYPE);
        } else if (i2 < this.f41677c.getItemCount()) {
            this.f41677c.onBindViewHolder(viewHolder2, i2, list2);
        } else {
            super.onBindViewHolder(viewHolder, i, list);
        }
    }
}
