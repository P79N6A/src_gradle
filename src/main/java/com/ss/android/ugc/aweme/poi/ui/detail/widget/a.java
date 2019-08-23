package com.ss.android.ugc.aweme.poi.ui.detail.widget;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Pools;
import android.support.v4.util.SimpleArrayMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60766a;

    /* renamed from: b  reason: collision with root package name */
    final Pools.Pool<ArrayList<T>> f60767b = new Pools.SimplePool(10);

    /* renamed from: c  reason: collision with root package name */
    final SimpleArrayMap<T, ArrayList<T>> f60768c = new SimpleArrayMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<T> f60769d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashSet<T> f60770e = new HashSet<>();

    @NonNull
    public final ArrayList<T> a() {
        if (PatchProxy.isSupport(new Object[0], this, f60766a, false, 66563, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f60766a, false, 66563, new Class[0], ArrayList.class);
        }
        this.f60769d.clear();
        this.f60770e.clear();
        int size = this.f60768c.size();
        for (int i = 0; i < size; i++) {
            a(this.f60768c.keyAt(i), this.f60769d, this.f60770e);
        }
        return this.f60769d;
    }

    @Nullable
    public final List b(@NonNull T t) {
        T t2 = t;
        if (!PatchProxy.isSupport(new Object[]{t2}, this, f60766a, false, 66559, new Class[]{Object.class}, List.class)) {
            return (List) this.f60768c.get(t2);
        }
        return (List) PatchProxy.accessDispatch(new Object[]{t2}, this, f60766a, false, 66559, new Class[]{Object.class}, List.class);
    }

    @Nullable
    public final List<T> c(@NonNull T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f60766a, false, 66560, new Class[]{Object.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{t}, this, f60766a, false, 66560, new Class[]{Object.class}, List.class);
        }
        ArrayList arrayList = null;
        int size = this.f60768c.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f60768c.valueAt(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f60768c.keyAt(i));
            }
        }
        return arrayList;
    }

    public final void a(@NonNull T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f60766a, false, 66556, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f60766a, false, 66556, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        if (!this.f60768c.containsKey(t)) {
            this.f60768c.put(t, null);
        }
    }

    private void a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        T t2 = t;
        ArrayList<T> arrayList2 = arrayList;
        HashSet<T> hashSet2 = hashSet;
        if (PatchProxy.isSupport(new Object[]{t2, arrayList2, hashSet2}, this, f60766a, false, 66564, new Class[]{Object.class, ArrayList.class, HashSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t2, arrayList2, hashSet2}, this, f60766a, false, 66564, new Class[]{Object.class, ArrayList.class, HashSet.class}, Void.TYPE);
        } else if (!arrayList2.contains(t2)) {
            if (!hashSet2.contains(t2)) {
                hashSet2.add(t2);
                ArrayList arrayList3 = (ArrayList) this.f60768c.get(t2);
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        a(arrayList3.get(i), arrayList2, hashSet2);
                    }
                }
                hashSet2.remove(t2);
                arrayList2.add(t2);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
