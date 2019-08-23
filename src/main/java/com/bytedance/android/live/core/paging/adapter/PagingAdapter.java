package com.bytedance.android.live.core.paging.adapter;

import android.arch.lifecycle.Observer;
import android.arch.paging.PagedList;
import android.arch.paging.PagedListAdapter;
import android.database.Observable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.g;
import com.bytedance.android.live.core.network.d;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public abstract class PagingAdapter<T> extends PagedListAdapter<T, RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f7898b;

    /* renamed from: a  reason: collision with root package name */
    private final Observer<PagedList<T>> f7899a = new a(this);

    /* renamed from: c  reason: collision with root package name */
    public PagingViewModel<T> f7900c;

    /* renamed from: d  reason: collision with root package name */
    public d.a f7901d = null;

    /* renamed from: e  reason: collision with root package name */
    public d.a f7902e = null;

    /* renamed from: f  reason: collision with root package name */
    boolean f7903f;
    public boolean g;
    public boolean h;
    public boolean i = true;
    public boolean j = true;
    public boolean k = true;
    public final a l = new a<>();
    private final Observer<d> m = new b(this);
    private final Observer<d> n = new Observer<d>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7904a;

        public final /* synthetic */ void onChanged(@Nullable Object obj) {
            d dVar = (d) obj;
            if (PatchProxy.isSupport(new Object[]{dVar}, this, f7904a, false, 497, new Class[]{d.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar}, this, f7904a, false, 497, new Class[]{d.class}, Void.TYPE);
                return;
            }
            if (dVar != null) {
                PagingAdapter.this.f7902e = dVar.f7863b;
                PagingAdapter.this.a(PagingAdapter.this.f7901d);
            }
        }
    };
    private final Observer<Boolean> o = new c(this);
    private final Observer<Boolean> p = new d(this);
    private final Observer<Integer> q = new e(this);
    private boolean r = false;
    private final DataObservable s = new DataObservable<>();

    class DataObservable extends RecyclerView.AdapterDataObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7906a;

        public void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f7906a, false, 505, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f7906a, false, 505, new Class[0], Void.TYPE);
                return;
            }
            PagingAdapter.this.l.a();
        }

        DataObservable() {
        }

        public void onItemRangeInserted(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7906a, false, 507, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7906a, false, 507, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            PagingAdapter.this.l.a(i, i2);
        }

        public void onItemRangeRemoved(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7906a, false, 508, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7906a, false, 508, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            PagingAdapter.this.l.b(i, i2);
        }

        public void onItemRangeChanged(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7906a, false, 506, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7906a, false, 506, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            a aVar = PagingAdapter.this.l;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, aVar, a.f7912a, false, 500, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                a aVar2 = aVar;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, aVar2, a.f7912a, false, 500, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            aVar.a(i, i2, null);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f7906a, false, 509, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f7906a, false, 509, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            PagingAdapter.this.l.c(i, i2);
        }
    }

    public static class EndViewHolder extends RecyclerView.ViewHolder {
        public EndViewHolder(View view) {
            super(view);
        }
    }

    public static class ErrorViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7908a;

        /* renamed from: b  reason: collision with root package name */
        PagingViewModel f7909b;

        /* renamed from: c  reason: collision with root package name */
        View f7910c;

        /* renamed from: d  reason: collision with root package name */
        TextView f7911d;

        public ErrorViewHolder(View view, PagingViewModel pagingViewModel) {
            super(view);
            this.f7909b = pagingViewModel;
            this.f7910c = view.findViewById(C0906R.id.a_u);
            this.f7911d = (TextView) view.findViewById(C0906R.id.a_v);
        }
    }

    static class LoadingViewHolder extends RecyclerView.ViewHolder {
        LoadingViewHolder(View view) {
            super(view);
        }
    }

    class a extends Observable<RecyclerView.AdapterDataObserver> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7912a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f7912a, false, 499, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f7912a, false, 499, new Class[0], Void.TYPE);
                return;
            }
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onChanged();
            }
        }

        a() {
        }

        private int a(int i) {
            if (PagingAdapter.this.g) {
                return i + 1;
            }
            return i;
        }

        public final void a(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7912a, false, 502, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7912a, false, 502, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int a2 = a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeInserted(a2, i2);
            }
        }

        public final void b(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7912a, false, 503, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7912a, false, 503, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int a2 = a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeRemoved(a2, i2);
            }
        }

        public final void c(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7912a, false, 504, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f7912a, false, 504, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            int a2 = a(i);
            int a3 = a(i2);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeMoved(a2, a3, 1);
            }
        }

        public final void a(int i, int i2, @Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), null}, this, f7912a, false, 501, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), null}, this, f7912a, false, 501, new Class[]{Integer.TYPE, Integer.TYPE, Object.class}, Void.TYPE);
                return;
            }
            int a2 = a(i);
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                int i3 = i2;
                ((RecyclerView.AdapterDataObserver) this.mObservers.get(size)).onItemRangeChanged(a2, i2, null);
            }
        }
    }

    public int a() {
        return C0906R.layout.af1;
    }

    public abstract int a(int i2, T t);

    public abstract RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2);

    private boolean b() {
        if (!this.h || !this.i || this.g) {
            return false;
        }
        return true;
    }

    private boolean d() {
        if (this.h || !this.f7903f || !this.k) {
            return false;
        }
        return true;
    }

    private boolean e() {
        if (this.f7901d == d.a.RUNNING) {
            return true;
        }
        return false;
    }

    private boolean f() {
        if (this.f7901d == d.a.FAILED) {
            return true;
        }
        return false;
    }

    private int c() {
        if (!PatchProxy.isSupport(new Object[0], this, f7898b, false, 483, new Class[0], Integer.TYPE)) {
            return super.getItemCount();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7898b, false, 483, new Class[0], Integer.TYPE)).intValue();
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f7898b, false, 490, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f7898b, false, 490, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (d() || !this.j || this.f7902e == null) {
            return false;
        } else {
            if (this.f7902e == d.a.SUCCESS) {
                if (e() || f()) {
                    return true;
                }
                return false;
            } else if (this.f7902e == d.a.FAILED) {
                return f();
            } else {
                return false;
            }
        }
    }

    public final int getItemCount() {
        if (PatchProxy.isSupport(new Object[0], this, f7898b, false, 482, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f7898b, false, 482, new Class[0], Integer.TYPE)).intValue();
        }
        boolean z = this.g;
        boolean d2 = d();
        boolean b2 = b();
        boolean g2 = g();
        return (z ? 1 : 0) + c() + (d2 ? 1 : 0) + (g2 ? 1 : 0) + (b2 ? 1 : 0);
    }

    public final int a(int i2) {
        return i2 - (this.g ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(d dVar) {
        if (dVar != null) {
            a(dVar.f7863b);
        }
    }

    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f7898b, false, 475, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f7898b, false, 475, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof BaseViewHolder) {
            ((BaseViewHolder) viewHolder2).a();
        }
    }

    public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f7898b, false, 488, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f7898b, false, 488, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        this.l.registerObserver(adapterDataObserver2);
    }

    public void unregisterAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver adapterDataObserver) {
        RecyclerView.AdapterDataObserver adapterDataObserver2 = adapterDataObserver;
        if (PatchProxy.isSupport(new Object[]{adapterDataObserver2}, this, f7898b, false, 489, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapterDataObserver2}, this, f7898b, false, 489, new Class[]{RecyclerView.AdapterDataObserver.class}, Void.TYPE);
            return;
        }
        this.l.unregisterObserver(adapterDataObserver2);
    }

    public PagingAdapter(@NonNull DiffUtil.ItemCallback<T> itemCallback) {
        super(itemCallback);
        super.registerAdapterDataObserver(this.s);
    }

    private T b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f7898b, false, 477, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f7898b, false, 477, new Class[]{Integer.TYPE}, Object.class);
        } else if (i3 < 0 || i3 >= c()) {
            return null;
        } else {
            return super.getItem(i2);
        }
    }

    public void a(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f7898b, false, 470, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f7898b, false, 470, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewHolder2.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    @Nullable
    public T getItem(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f7898b, false, 476, new Class[]{Integer.TYPE}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f7898b, false, 476, new Class[]{Integer.TYPE}, Object.class);
        }
        int c2 = c() + (this.g ? 1 : 0);
        if (this.g && i2 == 0) {
            return null;
        }
        if (g() && i2 == c2) {
            return null;
        }
        if (d() && i2 == c2) {
            return null;
        }
        if (!b() || i2 != c2) {
            return b(a(i2));
        }
        return null;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f7898b, false, 473, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f7898b, false, 473, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder2 instanceof BaseViewHolder) {
            ((BaseViewHolder) viewHolder2).c();
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f7898b, false, 474, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f7898b, false, 474, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder2 instanceof BaseViewHolder) {
            ((BaseViewHolder) viewHolder2).d();
        }
    }

    public final int getItemViewType(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f7898b, false, 478, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f7898b, false, 478, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int itemCount = getItemCount() - 1;
        if (b() && i2 == 0) {
            return -1091641683;
        }
        if (this.g && i2 == 0) {
            return -559038738;
        }
        if (!g() || i2 != itemCount) {
            if (d() && i2 == itemCount) {
                return -559038737;
            }
            int a2 = a(i2);
            if (a2 >= c()) {
                return -8888;
            }
            return a(a2, (T) b(a2));
        } else if (f()) {
            return -1091576149;
        } else {
            return -1091576148;
        }
    }

    public final void a(d.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f7898b, false, 487, new Class[]{d.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f7898b, false, 487, new Class[]{d.a.class}, Void.TYPE);
            return;
        }
        boolean z = this.r;
        this.f7901d = aVar;
        boolean g2 = g();
        int c2 = c();
        if (!z && g2) {
            notifyItemInserted(c2);
        } else if (z && !g2) {
            notifyItemRemoved(getItemCount());
        } else if (z && g2) {
            notifyItemRemoved(c2);
            notifyItemInserted(c2);
        }
        this.r = g2;
    }

    public final void a(@NonNull PagingViewModel<T> pagingViewModel) {
        if (PatchProxy.isSupport(new Object[]{pagingViewModel}, this, f7898b, false, 491, new Class[]{PagingViewModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{pagingViewModel}, this, f7898b, false, 491, new Class[]{PagingViewModel.class}, Void.TYPE);
            return;
        }
        if (this.f7900c != null) {
            this.f7900c.h.removeObserver(this.f7899a);
            this.f7900c.f7974c.removeObserver(this.m);
            this.f7900c.f7975d.removeObserver(this.n);
            this.f7900c.f7977f.removeObserver(this.o);
            this.f7900c.f7976e.removeObserver(this.p);
            this.f7900c.g.removeObserver(this.q);
        }
        this.f7900c = pagingViewModel;
        if (pagingViewModel != null) {
            pagingViewModel.h.observeForever(this.f7899a);
            pagingViewModel.f7974c.observeForever(this.m);
            pagingViewModel.f7975d.observeForever(this.n);
            pagingViewModel.f7977f.observeForever(this.o);
            pagingViewModel.f7976e.observeForever(this.p);
            pagingViewModel.g.observeForever(this.q);
        }
    }

    public RecyclerView.ViewHolder c(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 464, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return new EndViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.af2, viewGroup2, false));
        }
        return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 464, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
    }

    public void a(RecyclerView.ViewHolder viewHolder, int i2) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 467, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 467, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (viewHolder2 instanceof BaseViewHolder) {
            Object item = getItem(i3);
            if (item instanceof g) {
                ((BaseViewHolder) viewHolder2).a(BaseViewHolder.a(((g) item).f7715a), i3);
            } else {
                ((BaseViewHolder) viewHolder2).a(item, i3);
            }
            if (((BaseViewHolder) viewHolder2).b()) {
                a(viewHolder);
            }
        }
    }

    public RecyclerView.ViewHolder b(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 463, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 463, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i3 == -1091576148) {
            return new LoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.af4, viewGroup2, false));
        } else {
            if (i3 == -1091576149) {
                return new ErrorViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.af3, viewGroup2, false), this.f7900c);
            }
            throw new RuntimeException("unknown footer type");
        }
    }

    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        ViewGroup viewGroup2 = viewGroup;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 460, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 460, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        } else if (i3 == -559038738) {
            if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 461, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 461, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
            }
            throw new RuntimeException("create your header view holder");
        } else if (i3 == -559038737) {
            return c(viewGroup, i2);
        } else {
            if (i3 == -1091576148 || i3 == -1091576149) {
                return b(viewGroup, i2);
            }
            if (i3 != -1091641683) {
                return a(viewGroup, i2);
            }
            if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 465, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
                return new EndViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(a(), viewGroup2, false));
            }
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i2)}, this, f7898b, false, 465, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
    }

    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        byte b2;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 466, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 466, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int itemViewType = getItemViewType(i2);
        if (itemViewType == -559038738) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 469, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 469, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else {
                a(viewHolder);
            }
        } else if (itemViewType == -559038737) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 471, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 471, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else {
                a(viewHolder);
            }
        } else if (itemViewType == -1091576148 || itemViewType == -1091576149) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 472, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 472, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else {
                a(viewHolder);
                if (!(viewHolder2 instanceof LoadingViewHolder) && (viewHolder2 instanceof ErrorViewHolder)) {
                    ErrorViewHolder errorViewHolder = (ErrorViewHolder) viewHolder2;
                    if (this.h || c() == 0) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    if (PatchProxy.isSupport(new Object[]{Byte.valueOf(b2)}, errorViewHolder, ErrorViewHolder.f7908a, false, 510, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                        ErrorViewHolder errorViewHolder2 = errorViewHolder;
                        PatchProxy.accessDispatch(new Object[]{Byte.valueOf(b2)}, errorViewHolder2, ErrorViewHolder.f7908a, false, 510, new Class[]{Boolean.TYPE}, Void.TYPE);
                    } else {
                        d dVar = (d) errorViewHolder.f7909b.f7975d.getValue();
                        View findViewById = errorViewHolder.itemView.findViewById(C0906R.id.cv6);
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (dVar == null || !dVar.b() || b2 == 0) {
                            layoutParams.height = -2;
                            errorViewHolder.f7910c.setVisibility(8);
                            errorViewHolder.f7911d.setTextColor(errorViewHolder.f7911d.getResources().getColor(C0906R.color.aad));
                            errorViewHolder.f7911d.setText(C0906R.string.cs4);
                        } else {
                            layoutParams.height = -1;
                            errorViewHolder.f7910c.setVisibility(0);
                            errorViewHolder.f7911d.setTextColor(errorViewHolder.f7911d.getResources().getColor(C0906R.color.aag));
                            errorViewHolder.f7911d.setText(C0906R.string.cs_);
                        }
                        findViewById.setLayoutParams(layoutParams);
                        errorViewHolder.itemView.setOnClickListener(new f(errorViewHolder));
                    }
                }
            }
        } else if (itemViewType == -1091641683) {
            if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 468, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i2)}, this, f7898b, false, 468, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            } else {
                a(viewHolder);
            }
        } else {
            a(viewHolder, i2);
        }
    }
}
