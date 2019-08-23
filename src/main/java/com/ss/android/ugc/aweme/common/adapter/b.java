package com.ss.android.ugc.aweme.common.adapter;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Collections;
import java.util.List;

public class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40186a;

    /* renamed from: d  reason: collision with root package name */
    private static final List<Object> f40187d = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    protected SparseArrayCompat<a<T>> f40188b = new SparseArrayCompat<>();

    /* renamed from: c  reason: collision with root package name */
    public a<T> f40189c;

    public final void a(@NonNull T t, int i, @NonNull RecyclerView.ViewHolder viewHolder, List list) {
        List list2;
        T t2 = t;
        int i2 = i;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{t2, Integer.valueOf(i), viewHolder2, list}, this, f40186a, false, 33338, new Class[]{Object.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE)) {
            Object[] objArr = {t2, Integer.valueOf(i), viewHolder2, list};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f40186a, false, 33338, new Class[]{Object.class, Integer.TYPE, RecyclerView.ViewHolder.class, List.class}, Void.TYPE);
            return;
        }
        a a2 = a(viewHolder.getItemViewType());
        if (a2 != null) {
            if (list != null) {
                list2 = list;
            } else {
                list2 = f40187d;
            }
            a2.a(t2, i2, viewHolder2, list2);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i2 + " for viewType = " + viewHolder.getItemViewType());
    }

    public final void a(@NonNull T t, int i, @NonNull RecyclerView.ViewHolder viewHolder) {
        T t2 = t;
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{t2, Integer.valueOf(i), viewHolder2}, this, f40186a, false, 33339, new Class[]{Object.class, Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2, Integer.valueOf(i), viewHolder2}, this, f40186a, false, 33339, new Class[]{Object.class, Integer.TYPE, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        a(t2, i, viewHolder2, f40187d);
    }

    public final void a(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f40186a, false, 33340, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f40186a, false, 33340, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        if (a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder2 + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    public final void a(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f40186a, false, 33346, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f40186a, false, 33346, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (this.f40188b != null) {
            for (int i = 0; i < this.f40188b.size(); i++) {
                if (this.f40188b.valueAt(i) != null) {
                    ((a) this.f40188b.valueAt(i)).a(recyclerView);
                }
            }
        }
    }

    public final b<T> b(@Nullable a<T> aVar) {
        this.f40189c = aVar;
        return this;
    }

    @Nullable
    private a<T> a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f40186a, false, 33345, new Class[]{Integer.TYPE}, a.class)) {
            return (a) this.f40188b.get(i, this.f40189c);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f40186a, false, 33345, new Class[]{Integer.TYPE}, a.class);
    }

    public final void b(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f40186a, false, 33347, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f40186a, false, 33347, new Class[]{RecyclerView.class}, Void.TYPE);
        } else if (this.f40188b != null) {
            for (int i = 0; i < this.f40188b.size(); i++) {
                if (this.f40188b.valueAt(i) != null) {
                    ((a) this.f40188b.valueAt(i)).b(recyclerView);
                }
            }
        }
    }

    public final void c(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f40186a, false, 33342, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f40186a, false, 33342, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        a a2 = a(viewHolder.getItemViewType());
        if (a2 != null) {
            a2.a(viewHolder2);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder2 + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public final void d(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f40186a, false, 33343, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f40186a, false, 33343, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        a a2 = a(viewHolder.getItemViewType());
        if (a2 != null) {
            a2.b(viewHolder2);
            return;
        }
        throw new NullPointerException("No delegate found for " + viewHolder2 + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public final boolean b(@NonNull RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2}, this, f40186a, false, 33341, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{viewHolder2}, this, f40186a, false, 33341, new Class[]{RecyclerView.ViewHolder.class}, Boolean.TYPE)).booleanValue();
        }
        if (a(viewHolder.getItemViewType()) != null) {
            return false;
        }
        throw new NullPointerException("No delegate found for " + viewHolder2 + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    public final b<T> a(@NonNull a<T> aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f40186a, false, 33331, new Class[]{a.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{aVar}, this, f40186a, false, 33331, new Class[]{a.class}, b.class);
        }
        int size = this.f40188b.size();
        while (this.f40188b.get(size) != null) {
            size++;
            if (size == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        return a(size, false, aVar);
    }

    public final int a(@NonNull T t, int i) {
        if (PatchProxy.isSupport(new Object[]{t, Integer.valueOf(i)}, this, f40186a, false, 33336, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{t, Integer.valueOf(i)}, this, f40186a, false, 33336, new Class[]{Object.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (t != null) {
            int size = this.f40188b.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((a) this.f40188b.valueAt(i2)).a(t, i)) {
                    return this.f40188b.keyAt(i2);
                }
            }
            if (this.f40189c != null) {
                return 2147483646;
            }
            throw new NullPointerException("No AdapterDelegate added that matches position=" + i + " delegates=" + this.f40188b + " items=" + t);
        } else {
            throw new NullPointerException("Items datasource is null!");
        }
    }

    @NonNull
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f40186a, false, 33337, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f40186a, false, 33337, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        a a2 = a(i2);
        if (a2 != null) {
            RecyclerView.ViewHolder a3 = a2.a(viewGroup2);
            if (a3 != null) {
                return a3;
            }
            throw new NullPointerException("ViewHolder returned from AdapterDelegate " + a2 + " for ViewType =" + i2 + " is null!");
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType " + i2);
    }

    public final b<T> a(int i, boolean z, @NonNull a<T> aVar) {
        int i2 = i;
        a<T> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), (byte) 0, aVar2}, this, f40186a, false, 33333, new Class[]{Integer.TYPE, Boolean.TYPE, a.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), (byte) 0, aVar2}, this, f40186a, false, 33333, new Class[]{Integer.TYPE, Boolean.TYPE, a.class}, b.class);
        } else if (aVar2 == null) {
            throw new NullPointerException("AdapterDelegate is null!");
        } else if (i2 == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f40188b.get(i) == null) {
            this.f40188b.put(i, aVar2);
            return this;
        } else {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + i + ". Already registered AdapterDelegate is " + this.f40188b.get(i));
        }
    }
}
