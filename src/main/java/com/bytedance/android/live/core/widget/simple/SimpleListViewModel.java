package com.bytedance.android.live.core.widget.simple;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.g;
import com.bytedance.android.live.core.a.o;
import com.bytedance.android.live.core.paging.adapter.DelegatePagingAdapter;
import com.bytedance.android.live.core.paging.adapter.InvalidItemViewHolder;
import com.bytedance.android.live.core.paging.b.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public abstract class SimpleListViewModel<T> extends PagingViewModel<T> implements DelegatePagingAdapter.a<T>, b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8361a;
    public SimpleDelegatePagingAdapter<T> l = new SimpleDelegatePagingAdapter<>(this);
    public com.bytedance.android.live.core.a.b<String, T> m = new o();
    private List<b<T>> n = new ArrayList();

    class SimpleDelegatePagingAdapter<T> extends DelegatePagingAdapter<T> {
        public static ChangeQuickRedirect m;

        public final void a(RecyclerView.ViewHolder viewHolder) {
            if (PatchProxy.isSupport(new Object[]{viewHolder}, this, m, false, 1521, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder}, this, m, false, 1521, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
                return;
            }
            super.a(viewHolder);
        }

        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            RecyclerView.ViewHolder viewHolder2 = viewHolder;
            if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, m, false, 1519, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, m, false, 1519, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            } else if (!(viewHolder2 instanceof BaseViewHolder)) {
                super.onViewRecycled(viewHolder);
            }
        }

        @Nullable
        public T getItem(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, m, false, 1520, new Class[]{Integer.TYPE}, Object.class)) {
                return super.getItem(i);
            }
            return PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, m, false, 1520, new Class[]{Integer.TYPE}, Object.class);
        }

        SimpleDelegatePagingAdapter(DelegatePagingAdapter.a<T> aVar) {
            super(aVar);
        }
    }

    public final boolean a(T t, T t2) {
        return t == t2;
    }

    public SimpleListViewModel() {
        this.l.a((PagingViewModel<T>) this);
    }

    public final SimpleListViewModel<T> a(b<T> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f8361a, false, 1510, new Class[]{b.class}, SimpleListViewModel.class)) {
            return (SimpleListViewModel) PatchProxy.accessDispatch(new Object[]{bVar}, this, f8361a, false, 1510, new Class[]{b.class}, SimpleListViewModel.class);
        }
        this.n.add(bVar);
        return this;
    }

    public final b<T> a(T t) {
        T t2 = t;
        if (PatchProxy.isSupport(new Object[]{t2}, this, f8361a, false, 1512, new Class[]{Object.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{t2}, this, f8361a, false, 1512, new Class[]{Object.class}, b.class);
        }
        for (b<T> next : this.n) {
            if (next.a(t2)) {
                return next;
            }
        }
        return null;
    }

    public final int a(int i, T t) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), t}, this, f8361a, false, 1513, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)) {
            return this.n.indexOf(a(t));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), t}, this, f8361a, false, 1513, new Class[]{Integer.TYPE, Object.class}, Integer.TYPE)).intValue();
    }

    public final boolean b(T t, T t2) {
        if (!PatchProxy.isSupport(new Object[]{t, t2}, this, f8361a, false, 1515, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
            return t.equals(t2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{t, t2}, this, f8361a, false, 1515, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
    }

    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8361a, false, 1511, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i)}, this, f8361a, false, 1511, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        try {
            final RecyclerView.ViewHolder a2 = this.n.get(i).a(viewGroup);
            a2.itemView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f8362a;

                public final void onViewAttachedToWindow(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8362a, false, 1518, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8362a, false, 1518, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (a2 instanceof BaseViewHolder) {
                        int adapterPosition = a2.getAdapterPosition();
                        if (adapterPosition >= 0) {
                            Object item = SimpleListViewModel.this.l.getItem(adapterPosition);
                            b a2 = SimpleListViewModel.this.a(item);
                            if ((a2 instanceof a) && (a2 instanceof SimpleViewHolder)) {
                                ((SimpleViewHolder) a2).b(item);
                                ((a) a2).a((SimpleViewHolder) a2, item, adapterPosition);
                            }
                            if (item instanceof g) {
                                ((BaseViewHolder) a2).a(BaseViewHolder.a(((g) item).f7715a), adapterPosition);
                            } else {
                                ((BaseViewHolder) a2).a(item, adapterPosition);
                            }
                            if (((BaseViewHolder) a2).b()) {
                                SimpleListViewModel.this.l.a(a2);
                            }
                        }
                    }
                }

                public final void onViewDetachedFromWindow(View view) {
                    Object obj;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f8362a, false, 1517, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f8362a, false, 1517, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    if (a2 instanceof BaseViewHolder) {
                        ((BaseViewHolder) a2).a();
                    }
                    if (a2 instanceof SimpleViewHolder) {
                        SimpleViewHolder simpleViewHolder = (SimpleViewHolder) a2;
                        if (PatchProxy.isSupport(new Object[0], simpleViewHolder, SimpleViewHolder.f8365a, false, 1535, new Class[0], Object.class)) {
                            obj = PatchProxy.accessDispatch(new Object[0], simpleViewHolder, SimpleViewHolder.f8365a, false, 1535, new Class[0], Object.class);
                        } else {
                            obj = simpleViewHolder.f8366d.get("__________");
                        }
                        b a2 = SimpleListViewModel.this.a(obj);
                        if (a2 instanceof a) {
                            ((a) a2).a((SimpleViewHolder) a2, obj);
                        }
                    }
                }
            });
            return a2;
        } catch (Exception unused) {
            return new InvalidItemViewHolder(viewGroup);
        }
    }
}
