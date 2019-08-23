package com.ss.android.ugc.effectmanager.common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public final class d<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<K, Collection<V>> f77310a = new HashMap<>();

    public final Collection<V> a() {
        Collection<Collection<V>> values = this.f77310a.values();
        ArrayList arrayList = new ArrayList();
        for (Collection<V> addAll : values) {
            arrayList.addAll(addAll);
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final void a(K k, V v) {
        Collection collection = this.f77310a.get(k);
        if (collection == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(v);
            this.f77310a.put(k, arrayList);
            return;
        }
        collection.add(v);
    }
}
